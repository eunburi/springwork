package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/request")
public class ParamController {

	@RequestMapping("param1")
	String param1(HttpServletRequest request) {
		//param 이 없을 경우 null 로 처리
		String str = "param1:"+request.getParameter("id");
		str+= "," +request.getParameter("age");
		str+= "," +request.getParameter("marriage");
		System.out.println(str);
		return "req/param";
	}
	
	@RequestMapping("param2")
	String param2(String id, int age, boolean marriage) {
		// param 이 없을 경우 에러 발생
		System.out.println("param2:"+id+ ","+ age+ "," +marriage);
		return "req/param";
	}
	
	@RequestMapping("param3")
	String param3(
			@RequestParam("id")String pid, 
			@RequestParam("aaa")int age, 
			@RequestParam("mrg")boolean marriage) {
		// param 이 없을 경우 에러 발생
		System.out.println("param3:"+pid+ ","+ age+ "," +marriage);
		return "req/param";
	}
	
	@RequestMapping("param4")
	String param4(
			@RequestParam(value = "id", defaultValue = "qwer")String pid, 
			@RequestParam(value = "aaa", required = false, defaultValue = "15")int age, 
			@RequestParam(value = "mrg", defaultValue = "false")boolean marriage) {
		// param 이 없을 경우 에러 발생
		System.out.println("param4:"+pid+ ","+ age+ "," +marriage);
		return "req/param";
	}
	
	/*
	 * 커피 주문을 구현하세요
	 * 주문내용
	 * 커피종류: 필수
	 * 잔수 : 선택 --> 없을 경우, 1잔
	 * 아메리카노 : 2200
	 * 아프리카노 : 2300
	 * 아시아노 : 2500
	 * 
	 * 결과
	 * 커피이름,잔수,금액
	 * */
	
	/*
	 * @RequestMapping("coffee") String coffee(
	 * 
	 * @RequestParam(value = "type", defaultValue = "아프리카노")String type,
	 * 
	 * @RequestParam(value = "jan", required = false, defaultValue = "1")int jan,
	 * 
	 * @RequestParam(value = "price", defaultValue = "2300")int price) {
	 * 
	 * System.out.println("coffee:"+type+ ","+ jan+ "," +price+"원"); return
	 * "req/coffee"; }
	 */
	
	
	@RequestMapping("coffee")
	String coffee(
			@RequestParam(value = "kind", required = false,defaultValue = "아메리카노")String kind, 
			@RequestParam(value = "price", required = false, defaultValue = "2200")int price, 
			@RequestParam(value = "inventory", required = false,defaultValue = "1잔")String inventory) {
		// param 이 없을 경우 에러 발생
		System.out.println("coffe1:"+kind+ ","+ price+ "," +inventory);
		return "req/param";
	}
	
	@RequestMapping("coffee2")
	String coffee2(
			@RequestParam(value = "kind", required = false,defaultValue = "아프리카노")String kind, 
			@RequestParam(value = "price", required = false, defaultValue = "2300")int price, 
			@RequestParam(value = "inventory", required = false,defaultValue = "1잔")String inventory) {
		// param 이 없을 경우 에러 발생
		System.out.println("coffe2:"+kind+ ","+ price+ "," +inventory);
		return "req/param";
	}
	
	@RequestMapping("coffee3")
	String coffee3(
			@RequestParam(value = "kind", required = false,defaultValue = "아시리카노")String kind, 
			@RequestParam(value = "price", required = false, defaultValue = "2500")int price, 
			@RequestParam(value = "inventory", required = false,defaultValue = "1잔")String inventory) {
		// param 이 없을 경우 에러 발생
		System.out.println("coffe3:"+kind+ ","+ price+ "," +inventory);
		return "req/param";
	}
	
	
	
	
	
	
	
	
	
}
