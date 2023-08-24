package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.service.MyProvider;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/provider")
public class ProviderController {
	
	@Resource // MyProvider 클래스 당겨옴
	MyProvider provider; // MyProvider 클래스를 통해 ApplicationContext를 가져온 후, ApplicationContext를 사용하여 다른 빈들을 검색하거나 호출할수있다
	
	@ModelAttribute("cam") //cam - 모델 속성에 데이터를 추가
	Object mm() { //Object -  어떤 종류의 객체든 반환할 수 있는 유연성 있음
		Object res = provider.getContext().getBean("camera"); //이름이 "camera"인 빈을 가져옴
		System.out.println("mm() 실행:"+res);
		return res;
	}
	
	
	

	@RequestMapping("list")
	String mapping1() {
		return "provider/view";
	}
	
	@RequestMapping("{bbb}")
	String mapping2(@PathVariable String bbb, Model mm) {
		
		mm.addAttribute("bat",provider.getContext().getBean(bbb));
		//addAttribute - 모델에 "bat"이라는 이름으로 데이터를 추가하는 역할
		return "provider/view";
	}
	
	@RequestMapping("bom")//quiz
	String bom1() {
		return "provider/bomview";
	}
	
	
}
