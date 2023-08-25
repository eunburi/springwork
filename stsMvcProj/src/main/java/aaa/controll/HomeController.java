package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/") //URL로 들어오는 요청을 homeGo() 메소드로 매핑하도록
	//@ResponseBody
	String homeGo() {
		System.out.println("홈이다~");
		//return "homehome돼지";
		return "home"; // views/home.html을 열어라!
						//home.html")을 찾아서 렌더링하게 됩니다.
		
	}
/*
 * application.yaml 설정때문에 
 * 
 * server :
  port : 80
spring :
  thymeleaf:
    prefix: views/
    suffix: .html
    cache : false 

 * 		
 */
		
	@RequestMapping("/admin/{ser}")
	@ResponseBody
	String adminGo(@PathVariable String ser) {
		System.out.println("admin이다");
		
		return "admin : "+ ser + " 페이지";
	}	
}
