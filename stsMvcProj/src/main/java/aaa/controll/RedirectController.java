package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.OrderAddr;
import aaa.model.Person;

@Controller
@RequestMapping("/red")
public class RedirectController {

	@RequestMapping("from1")
	String from1() {
		System.out.println("from1() 진입");
		
		//redirect:주소   ---> 리다이렉팅 한다.
		return "redirect:to";
	}
	
	@RequestMapping("to")
	String to() {
		System.out.println("to() 실행");
		return "red/to";
	}
	
	@RequestMapping("from2")
	String from2(Model mm) {
		//Model 은 parameter 전달 못ㅎ마
		System.out.println("from2() 진입");
		
		//의미없음
		mm.addAttribute("id", "bbb");
		mm.addAttribute("age", 37);
		mm.addAttribute("marriage", true);
		return "redirect:to";
	}
	
	@RequestMapping("from3") // 넘어옴
	ModelAndView from3() {
		System.out.println("from3() 진입");
		
		//ModelAndView로 parameter 전달 가능
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:to");
		mav.addObject("id", "ccc");
		mav.addObject("age", 32);
		mav.addObject("marriage", true);
		
		//인스턴스는 parameter로 전달 불가
		OrderAddr addr = new OrderAddr(); // 안넘어옴 // 기본자려형,문자형만 가능함
		mav.addObject("addr", addr);
		
		return mav;
	}
	
	@RequestMapping("from4")
	String from4(String id, int age, boolean marriage) {
		System.out.println("from4() 진입:"+id+","+age+","+marriage);
		
		return "redirect:to";
	}
	
	@RequestMapping("from5")
	String from5(String id, int age, boolean marriage) {
		System.out.println("from5() 진입:"+id+","+age+","+marriage);
		
		return "redirect:to?id="+id+"&age="+age+"&marriage="+marriage;
	}
	
	@RequestMapping("from6")
	   ModelAndView from6(Person per) { // (Person per) 여기 건들이면 안됩니다. error가 잔뜩 나오죠~
	      
		ModelAndView mav = new ModelAndView("redirect:to");
		//mav.setViewName("redirect:to");
		////---->
		mav.addObject("id", per.getId());
		mav.addObject("age", per.getAge());
		mav.addObject("marriage", per.isMarriage());
		System.out.println("from6() 진입:"+per);
		////<----
		
		return mav;
	}
	
	
	
}
