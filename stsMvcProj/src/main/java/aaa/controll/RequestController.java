package aaa.controll;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Person;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("request") //이 클래스 내의 모든 메소드들은 "request" 라는 경로를 가지는 URL을 기반으로 클라이언트의 요청을 처리
public class RequestController {
	
	//@RequestMapping : 어떤 URL 경로에 대한 요청을 어떤 메소드가 처리할지를 지정하는 데 사용
	@RequestMapping("attr1")//request/attr1"
	ModelAndView attr1() {
		ModelAndView mav = new ModelAndView(); //객체를 생성, 객체는 뷰 이름과 모델 데이터를 관리하기 위한 용도로 사용
		mav.setViewName("req/attr");//객체의 뷰 이름을 "req/attr"로 설정 - 어떤 뷰 템플릿을 사용할지 결정하는 역
		mav.addObject("age", 29);//객체에 "age"라는 이름으로 29라는 값을 추가
		//addObject를 사용하여 데이터를 추가하면 컨트롤러와 뷰 간에 데이터를 효율적으로 전달
		mav.addObject("pname", "정우성");
		mav.addObject("jum", new int[] {78,89,34}); //jum이라는 배열에  int 배열 [78, 89, 34]를 추가
		mav.addObject("now", new Date()); //now라는 이름으로 현재 날짜와 시간을 추가
		mav.addObject("person", new Person("장동건", "남", true)); //Person 객체를 추가 
		//이름이 "장동건"이고 성별은 "남"이며, true 값(mil)을 가지는 Person 클래스의 인스턴스
		return mav; // mav를 반환
	}
	
	
	@RequestMapping("attr2")
	String attr2(HttpServletRequest request) { //attr2.html이 없어도 됨 - HttpServletRequest는 내장객체
		request.setAttribute("age", 22);
		request.setAttribute("pname", "정좌성");
		request.setAttribute("jum", new int[] {11,22,33,44,55});
		request.setAttribute("now", new Date());
		request.setAttribute("person", new Person("장서건", "여", true));
		return "req/attr";
	}
	
	
	@RequestMapping("attr3")
	String attr3(Model mm) { // Model - addAttribute
		
		mm.addAttribute("age", 17);
		mm.addAttribute("pname", "정북성");
		mm.addAttribute("jum", new int[] {99,77});
		mm.addAttribute("now", new Date());
		mm.addAttribute("person", new Person("북두신건", "it", false));
		return "req/attr";
	}
	
	@RequestMapping("attr4")
	String attr4(
			Model mm, 
			
			@ModelAttribute("age") int age, 
			//attribute 이름을 자료형으로 넣을수 없으므로 직접 넣어주어야 한다.
			
			//@ModelAttribute("pname") String nick,  이렇게하면 아예 nick을 가져오지 못한다.
			String nick,
			
			//@ModelAttribute("jum")int [] jum  이렇게 하면 jum 1개만 원소로 가져온다
			int [] jum,
			
			Person per) {
		
		System.out.println("age:"+age);
		System.out.println("nick:"+nick);
		System.out.println("jum:"+Arrays.toString(jum));
		mm.addAttribute("pname", nick); //따로 넣어야 nick -> pname 형태가 가능하다.
		mm.addAttribute("jum", jum);  //따로 넣어야 원소가 전부 들어간 형태가 된다.
		mm.addAttribute("now", new Date());
		per.setPname(nick);
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
			//@ModelAttribute("jum")int [] jum  이렇게 하면 jum 1개만 원소로 가져온다
			int [] jum,
			String gender,
			boolean mil,
			Person per) {
		
		System.out.println("age:"+age);
		System.out.println("pname:"+pname);
		System.out.println("jum:"+Arrays.toString(jum));
		System.out.println("gender:"+gender);
		System.out.println("mil:"+mil);
		System.out.println("per:"+per);
		return "req/attr";
	}
}