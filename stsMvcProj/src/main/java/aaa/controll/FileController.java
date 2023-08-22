package aaa.controll;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import aaa.model.UploadData;

@Controller
@RequestMapping("/file")
public class FileController {

	@RequestMapping(value="upload", method=RequestMethod.GET)
	String fileForm() {
		return "file/uploadForm";
	}
	
	@RequestMapping(value="upload", method=RequestMethod.POST)
	String fileReg(
			Model mm,
			@ModelAttribute("id")String id, 
			@ModelAttribute("age")int age,
			@ModelAttribute("ff1") MultipartFile ff1,
			MultipartFile ff2) {
		
		System.out.println("ff1:"+ff1); // ff1:org.springframework.web.multipart.support.StandardMultipartHttpServletRequest$StandardMultipartFile@19a54a1c
											//사진올린다고 저장이된다거나 그런거 아님
		System.out.println("ff2:"+ff2);
		System.out.println("getOriginalFilename:"+ff1.getOriginalFilename());
		System.out.println("getOriginalFilename:"+ff1.getName());
		System.out.println("getOriginalFilename:"+ff1.getContentType());
		System.out.println("getOriginalFilename:"+ff1.getSize());
		System.out.println("getOriginalFilename:"+ff1.isEmpty());
		
		mm.addAttribute("ff1",ff1.getOriginalFilename());
		return "file/uploadReg";
	}
	
	
	@RequestMapping(value="upload2")
	String fileReg2(
			Model mm,
			MultipartHttpServletRequest mr) {
		
		MultipartFile ff1 = mr.getFile("ff1");
		MultipartFile ff2 = mr.getFile("ff2");
		System.out.println("ff1"+ff1);
		
//		System.out.println("OriginalFilename():"+ff1.getOriginalFilename());
//		System.out.println("getName():"+ff1.getName());
//		System.out.println("getContentType():"+ff1.getContentType());
//		System.out.println("getSize():"+ff1.getSize());
//		System.out.println("isEmpty():"+ff1.isEmpty());
		
		mm.addAttribute("id", mr.getParameter("id"));
		mm.addAttribute("age", mr.getParameter("age"));
		mm.addAttribute("ff1", ff1.getOriginalFilename());
		return "file/uploadReg";
	}
	
	@RequestMapping(value="upload3")
	String fileReg3(UploadData ud) {
		
		
		System.out.println("ud:"+ud);
		
		System.out.println("OriginalFilename():"+ud.getFf1().getOriginalFilename());
		System.out.println("getName():"+ud.getFf1().getName());
		System.out.println("getContentType():"+ud.getFf1().getContentType());
		System.out.println("getSize():"+ud.getFf1().getSize());
		System.out.println("isEmpty():"+ud.getFf1().isEmpty());
		
		fileSave(ud.getFf1()); // 파일을 저장하겠다!
		
		return "file/uploadReg3";
	}
	
	
	void fileSave(MultipartFile mf) { //파일저장
		String path = "C:\\green_project\\springworks\\stsMvcProj\\src\\main\\webapp\\up";
		//ff = 저장경로에 파일 이름 부여
		File ff = new File(path+"\\"+mf.getOriginalFilename());
		
		
		try {
			FileOutputStream fos = new FileOutputStream(ff);
			
			
			fos.close(); // 닫아주기
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	//내가해본거
	void filesave2(MultipartFile mf) { // 1.파일의 존재유무?
		//사진 저장될 파일 경로		
		String path = "C:\\green_project\\springworks\\stsMvcProj\\src\\main\\webapp\\up";
		
		File ff = new File(path+"\\"+mf.getOriginalFilename());
		
		//존재
		if(ff.exists()) {
			//fos.write(mf.getBytes());
			System.out.println("파일있음"); //
			
		} else {
			System.out.println("파일없음"); 
		}
		
		//배열인데 []안쓰고 그냥 string이라고 해서  오류 생김 - 바보임
		//스플릿 기준으로 배열로 넣어주는거임!
		//파일의 원본 이름을 확장자 기준으로 분할!
		String f1 []= mf.getOriginalFilename().split("[.]"); // "."는 안됨! 
		
		//if(f1.length == "jpg"){
		//} else {
		//	System.out.println("파일 업로드 안된다요");
		//}
		
	
		
		
		
		
		
		if (mf.isEmpty()) {
	        try {
	            byte[] bytes = mf.getBytes();
	          
	        } catch (IOException e) {
	           
	            e.printStackTrace();
	        }
	    } else {
	       
	    }
	}
	
	
}
