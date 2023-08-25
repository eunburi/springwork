package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.MemData;

@Controller
@RequestMapping("/mypage")
public class ProjectController {

	@RequestMapping("mypage")
	String mypage() {
		System.out.println("mypage() 실행");
		return "mypage/mypage";
	}
}

