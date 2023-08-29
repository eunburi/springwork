package aaa.controll;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import aaa.model.BoardDTO;
import aaa.model.PageData;
import aaa.service.BoardMapper;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Resource
	BoardMapper mapper;
	
	@RequestMapping("list")
	String list(Model mm, @RequestParam(defaultValue = "1") int page){ // 1페이지로 돌아간다.
		//현재 넣어야할거
		
		PageData pd = new PageData();
		
		pd.setTotal(mapper.totalCnt()); // 토탈
		pd.setPage(page); // 페이지 가져옴
		pd.calPaging();//계산가져옴
	    List<BoardDTO> data = mapper.list(pd);
	    
	    //BoardDTO boardDTO = new BoardDTO();
	    
	    
	    mm.addAttribute("mainData", data);
	    mm.addAttribute("pageData", pd);
	    

	    
	    return "board/list";
	}
	
	
	
	@RequestMapping("detail/{id}")
	String detail(Model mm, @PathVariable int id) {

		mm.addAttribute("dto", mapper.detail(id));
		return "board/detail";
	}
	
	
	@GetMapping("insert")
	String insert(BoardDTO dto) {

		return "board/insertForm";
	}
	
	@PostMapping("insert")
	String insertReg(BoardDTO dto, PageData pd) {
		
		mapper.insseerr(dto);
		pd.setMsg("작성되었습니다.");
		pd.setGoUrl("list");
		//System.out.println(dto);

		return "board/alert";
	}
	
	
	@GetMapping("delete/{id}")
	String delete(@PathVariable int id) {
		
		return "board/deleteForm";
	}
	
	@PostMapping("delete/{id}")
	String deleteReg(BoardDTO dto, PageData pd) {
		

		pd.setMsg("삭제실패");
		pd.setGoUrl("/board/delete/"+dto.getId());
		
		int cnt = mapper.delettt(dto);
		System.out.println("deleteReg:"+cnt);
		if(cnt>0) {
			pd.setMsg("삭제되었습니다.");
			pd.setGoUrl("/board/list");
		}

		return "board/alert";
	}
	
	@GetMapping("modify/{id}")
	String modify(Model mm, @PathVariable int id) {
		
		mm.addAttribute("dto", mapper.detail(id));
		
		return "board/modifyForm";
	}
	
	
	@PostMapping("modify/{id}")
	String modifyReg(BoardDTO dto, PageData pd) {
		

		pd.setMsg("수정실패");
		pd.setGoUrl("/board/modify/"+dto.getId());
		
		int cnt = mapper.modifffy(dto);
		System.out.println("modifyReg:"+cnt);
		if(cnt>0) {
			pd.setMsg("수정되었습니다.");
			pd.setGoUrl("/board/detail/"+dto.getId());
		}

		return "board/alert";
	}
	
	//사진올려보기 // 오류나서 일단 주석처리 // if안에 다 넣고 else해야함?
//	void fileSave2(MultipartFile mmff)) { // import했는데...?
//		//uploadData안쓰니까 ud는 > mmff로 해보면?
//		//ud.setMsg(null);
//		//파일 업로드 유무 확인
//		if(mmff.isEmpty()) {
//			return;
//		}
//		
//		//String path = request.getServletContext().getRealPath("up");
//		//사진 저장될 파일 경로		
//		String path = "C:\\green_project\\springworks\\stsMvcProj\\src\\main\\webapp\\up";
//		int dot = mmff.getOriginalFilename().lastIndexOf(".");
//		String fDomain =mmff.getOriginalFilename().substring(0, dot);
//		String ext = mmff.getOriginalFilename().substring(dot);
//		
//		//이미지인지 확인
//		if(!Pattern.matches("[.](bmp|jpg|gif|png|jpeg)", ext.toLowerCase())) {
//			
//			//ud.setMsg("이미지 파일이 아닙니당구리당");
//			return;
//		}
//		
//		
//		File ff = new File(path+"\\"+mmff.getFf2Name());
//		int cnt = 1;
//		while(ff.exists()) {
//			mmff. 
//			mmff.setFf2Name(fDomain+"_"+cnt+ext); 
//			ff = new File(path+"\\"+mmff.getName()());
//			cnt++;
//		}
//		
//		try {
//			FileOutputStream fos = new FileOutputStream(ff);
//			
//			fos.write(mmff.getBytes());
//			
//			fos.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
	

	
	
	
	
	
}
