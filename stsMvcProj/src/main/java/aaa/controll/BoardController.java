package aaa.controll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.BoardDTO;
import aaa.model.UploadData;
import aaa.service.BoardMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//수업용
@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Resource//보드맵퍼가져옴 
	BoardMapper mapper;

	@RequestMapping("list/{page}")
	String list(Model mm,  BoardDTO dto) {
		
		
		dto.calc(mapper.listCnt());
		System.out.println(dto);
		List<BoardDTO>data = mapper.list(dto);
		
		mm.addAttribute("mainData", data);
		return "board/list";
	}
	
	
	@RequestMapping("detail/{page}/{id}")
	String detail(Model mm, @PathVariable int page, @PathVariable int id) {
		mapper.addCount(id);
		BoardDTO dto = mapper.detail(id);
		dto.setPage(page);
		mm.addAttribute("dto", dto);
		return "board/detail";
	}
	
	
	@GetMapping("insert/{page}")
	String insert(BoardDTO dto) {

		return "board/insertForm";
	}
	
	@PostMapping("insert/{page}")
	String insertReg(BoardDTO dto, HttpServletRequest request) {
		dto.setId(mapper.maxId()+1);
		fileSave(dto,request);
		mapper.insseerr(dto);
		dto.setMsg("작성되었습니다.");
		dto.setGoUrl("/board/list/1");
		//System.out.println(dto);

		return "board/alert";
	}
	
	
	@GetMapping("delete/{page}/{id}")
	String delete(BoardDTO dto) {
		
		return "board/deleteForm";
	}
	
	@PostMapping("delete/{page}/{id}")
	String deleteReg(BoardDTO dto, HttpServletRequest request) {
		

		dto.setMsg("삭제실패");
		dto.setGoUrl("/board/delete/"+dto.getPage()+"/"+dto.getId());
		
		BoardDTO delDTO = mapper.detail(dto.getId());
		
		int cnt = mapper.delettt(dto);
		System.out.println("deleteReg:"+cnt);
		if(cnt>0) {
			
			
			fileDeleteModule(delDTO, request);
			
			dto.setMsg("삭제되었습니다.");
			dto.setGoUrl("/board/list/1");
		}

		return "board/alert";
	}
	
	@GetMapping("modify/{page}/{id}")
	String modify(Model mm, @PathVariable int page, @PathVariable int id) {
		
		BoardDTO dto = mapper.detail(id);
		dto.setPage(page);
		mm.addAttribute("dto", dto);
		
		return "board/modifyForm";
	}
	
	
	@PostMapping("modify/{page}/{id}")
	String modifyReg(BoardDTO dto,  HttpServletRequest request) {
		

		dto.setMsg("수정실패");
		dto.setGoUrl("/board/modify/"+dto.getPage()+"/"+dto.getId());
		int cnt = mapper.idPwChk(dto);
		
		System.out.println("modifyReg:"+cnt);
		if(cnt>0) {
			if(dto.getUpfile()==null) {
				fileSave(dto,request);
			}
			mapper.modifffy(dto);
			dto.setMsg("수정되었습니다.");
			dto.setGoUrl("/board/detail/"+dto.getPage()+"/"+dto.getId());
		}

		return "board/alert";
	}
	
	
	
	
	@PostMapping("fileDelete")
	String fileDelete(BoardDTO dto,  HttpServletRequest request) {
		
		BoardDTO delDTO = mapper.detail(dto.getId());
		dto.setMsg("파일 삭제실패");
		dto.setGoUrl("/board/modify/"+dto.getPage()+"/"+dto.getId());
		
		int cnt = mapper.fileDelete(dto);
		System.out.println("modifyReg:"+cnt);
		if(cnt>0) {
			fileDeleteModule(delDTO, request);
			dto.setMsg("파일 삭제되었습니다.");
		}

		return "board/alert";
	}
	
	
	void fileSave(BoardDTO dto, HttpServletRequest request) {
		
		//파일 업로드 유무 확인
		if(dto.getMmff().isEmpty()) {
			
			return;
		}
		
		String path = request.getServletContext().getRealPath("up");
		path = "C:\\green_project\\springworks\\stsMvcProj\\src\\main\\webapp\\up";
		
		
		int dot = dto.getMmff().getOriginalFilename().lastIndexOf("."); // .의 위치를 찾음
		String fDomain = dto.getMmff().getOriginalFilename().substring(0, dot); //확장자를 제외한 부분을 추출
		String ext = dto.getMmff().getOriginalFilename().substring(dot); //확장자를 추출
		
		
		
		dto.setUpfile(fDomain+ext);  //새로운 이름을 설정
		File ff = new File(path+"\\"+dto.getUpfile()); // 전체파일 경로 설정
		int cnt = 1; //파일 이름의 중복을 피하기위해서
		while(ff.exists()) {
			 
			dto.setUpfile(fDomain+"_"+cnt+ext);
			ff = new File(path+"\\"+dto.getUpfile());
			cnt++;
		} //love.jpg 이미 중복이라면 - > love_2.jpg로 바꾼다는뜻
		
		try {
			FileOutputStream fos = new FileOutputStream(ff);
			
			fos.write(dto.getMmff().getBytes()); //dto.getMmff() - 파일데이터가져옴
												 //dto.getMmff() - 문자열을 바이트 배열로 변환
												//fos.write - 바이트 배열을 파일에 씁니다. 이 부분은 실제로 파일에 데이터를 쓰는 부분으로, 파일을 생성하고 파일에 데이터를 기록
			fos.close(); // 닫아줍니다.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@GetMapping("download/{ff}")
	void download(@PathVariable String ff, 
			HttpServletRequest request,
			HttpServletResponse response) {
		
		String path = request.getServletContext().getRealPath("up");
		path = "C:\\green_project\\springworks\\stsMvcProj\\src\\main\\webapp\\up";;
		
		
		try {
			FileInputStream fis = new FileInputStream(path+"\\"+ff);
			String encFName = URLEncoder.encode(ff,"utf-8");
			System.out.println(ff+"->"+encFName);
			response.setHeader("Content-Disposition", "attachment;filename="+encFName);
			
			ServletOutputStream sos = response.getOutputStream();
			
			byte [] buf = new byte[1024];
			
			//int cnt = 0;
			while(fis.available()>0) { //읽을 내용이 남아 있다면
				int len = fis.read(buf);  //읽어서 -> buf 에 넣음
											//len : 넣은 byte 길이
				
				sos.write(buf, 0, len); //보낸다 :  buf의 0부터 len 만큼
				
				//cnt ++;
				//System.out.println(cnt+":"+len);
			}
			
			sos.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//파일삭제요
	void fileDeleteModule(BoardDTO delDTO, HttpServletRequest request) {
		if(delDTO.getUpfile()!=null) {//파일이 있다면
			//시스템 경로를 문자열로 저장
			String path = request.getServletContext().getRealPath("up"); // 실제경로 * "up"라는 디렉토리에 대한 실제 파일 시스템 경로
			path = "C:\\green_project\\springworks\\stsMvcProj\\src\\main\\webapp\\up";
			
			new File(path+"\\"+delDTO.getUpfile()).delete();
			// new File - 새로운 파일 객체 생성
			// path -  파일이 저장된 디렉토리의 실제 파일 시스템 경로
			//delDTO.getUpfile(): delDTO 객체에서 파일 이름을 가져옴 - 실제로 삭제할 파일의 이름
			//.delete() -  파일 객체가 나타내는 파일을 삭제
		}
	}
	
	
}
