package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.JoinData;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/form")
public class ValidController {
	
	

	@GetMapping("validation")
	String validForm(JoinData jd) {
		return "form/validForm";
	}
	
	
	@PostMapping("validation")
	String validReg(@Valid JoinData jd, BindingResult br) {
		//BindingResult 에러를일부러 유발시킴 -> 할수있는게 많아짐 - > db에 갔다옴 id가 중복 -> 형식은 맞지만 내용이 틀림
		//check를 안했을때(동의 안한것)
		System.out.println("validReg : "+br.hasErrors());
		
		if(br.hasErrors()) {//에러가 있다면
			return "form/validForm";
		}
		
		if(!jd.getPw1().equals(jd.getPw2())) { //암호가 일치하지 않으면
			br.rejectValue("pw2", null, "암호확인이 문제여");
			return "form/validForm";
		}
		
//		if(jd.getPid().equals(jd.getPid())) { // 아이디가 동일하다면
//			br.rejectValue("pid", null, "중복된 아이디가 있습니다.");
//			return "form/validForm";
//		}	
		
		//중복아이디 안되는거 내가만든거 -뭔가 아닌거같음ㅋㅋ
//		if ("aaa".equals(jd.getPid())) {
//		    br.rejectValue("pid", null, "중복된 아이디가 있습니다.");
//		    return "form/validForm";
//		}
//		
//		if ("bbb".equals(jd.getPid())) {
//		    br.rejectValue("pid", null, "중복된 아이디가 있습니다.");
//		    return "form/validForm";
//		}
//		
//		if ("ccc".equals(jd.getPid())) {
//		    br.rejectValue("pid", null, "중복된 아이디가 있습니다.");
//		    return "form/validForm";
//		}
//		
//		if ("ddd".equals(jd.getPid())) {
//		    br.rejectValue("pid", null, "중복된 아이디가 있습니다.");
//		    return "form/validForm";
//		}
		
		
		// 성적을 입력받아 처리하세요
		// 이름 - 한글만 2~5
		// 국영수 - 숫자 0~100
		
		///Q2 id가 aaaa , bbbb, cccc,dddd,eeee,하나라도 있으면 안됨
		
		//에러가 없으면
		return "form/validReg";
	}
}
