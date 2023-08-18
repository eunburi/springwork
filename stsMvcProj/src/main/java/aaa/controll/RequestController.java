package aaa.controll;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Join;
import aaa.model.Person;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("request")
public class RequestController {

	@RequestMapping("attr1")
	ModelAndView attr1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("req/attr");
		mav.addObject("age", 29);
		mav.addObject("pname", "정우성");
		mav.addObject("jum", new int[] {78,89,34});
		mav.addObject("now", new Date());
		mav.addObject("per", new Person("장동건", "남", true));
		return mav;
	}
	
	
	@RequestMapping("attr2")
	String attr2(HttpServletRequest request) {
		
		request.setAttribute("age", 22);
		request.setAttribute("pname", "정좌성");
		request.setAttribute("jum", new int[] {11,22,33,44,55});
		request.setAttribute("now", new Date());
		request.setAttribute("per", new Person("장서건", "여", true));
		return "req/attr";
	}
	
	
	@RequestMapping("attr3")
	String attr3(Model mm) {
		
		mm.addAttribute("age", 17);
		mm.addAttribute("pname", "정북성");
		mm.addAttribute("jum", new int[] {99,77});
		mm.addAttribute("now", new Date());
		mm.addAttribute("per", new Person("북두신건", "it", false));
		return "req/attr";
	}
	
	@RequestMapping("attr4")
	String attr4(Model mm, 
			@ModelAttribute("age") int age,
			@ModelAttribute("nick") String nick,
			@ModelAttribute("jum") int [] jum) {
		
		System.out.println("age:"+age);
		System.out.println("nick:"+nick);
		System.out.println("jum:"+Arrays.toString(jum));
		mm.addAttribute("jum", jum);
		mm.addAttribute("now", new Date());
		mm.addAttribute("per", new Person("북두신건", "it", false));
		return "req/attr";
	}
	
	@RequestMapping("attrForm")
	String attrForm() {
		return "req/attrForm";
	}
	
	
	@RequestMapping("attrReg")
	String attrReg( 
			@ModelAttribute("age") int age,
			@ModelAttribute("pname") String pname,
			int [] jum,
			String gender, // 알아서 들어감  - request로 받아서 뿌리는거 연습함
			boolean mil,
			Person per) {
		
		System.out.println("age:"+age);
		System.out.println("pname:"+pname);
		System.out.println("jum:"+Arrays.toString(jum));
		System.out.println("gender:"+gender);
		System.out.println("mil:"+mil);
		System.out.println("per:"+per);
		return "req/attrReg";
	}
	
	@RequestMapping("joinForm")
	String joinForm() {
		return "req/joinForm";
	}
	
	
	@RequestMapping("joinReg")
	String joinReg( 
			@ModelAttribute("pname") String pname,
			@ModelAttribute("password") String password,
			@ModelAttribute("nickname") String nickname,
			@ModelAttribute("phone") int phone,
			String gender,
			//String password,
			String mail,
			Join join) {
		
		System.out.println("pname:"+pname);
		//System.out.println("password:"+password);
		System.out.println("gender:"+gender);
		System.out.println("mail:"+mail);
		System.out.println("nickname:"+nickname);
		System.out.println("phone:"+phone);

		return "req/joinReg";
	}
	 
	
}
