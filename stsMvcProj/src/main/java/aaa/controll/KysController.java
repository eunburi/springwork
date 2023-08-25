package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.JoinData;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/kys")
public class KysController {

	@GetMapping("kys")
		String kys() {
		return "kys/kys";
	}
	
	
	@PostMapping("validation")
	String validReg(@Valid JoinData jd, BindingResult br) {
		
		System.out.println("validReg : "+br.hasErrors());
		
		if(br.hasErrors()) {//에러가 있다면
			return "form/validForm";
		}
		
		// 성적을 입력받아 처리하세요
		// 이름 - 한글만 2~5
		// 국어 - 숫자 0~100
		
		
		//에러가 없으면
		return "form/validReg";
	}
}
