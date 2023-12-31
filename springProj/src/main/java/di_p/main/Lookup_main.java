package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Coffee;
import di_p.CoffeeShop;


public class Lookup_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/lookup.xml");

		CoffeeShop cs = context.getBean("cs",CoffeeShop.class);
		
		System.out.println("order_am : " + cs.order_am());
		
		cs.order_void();
		//System.out.println("order_void : " + cs.order_void()); void는 return 불가
		
		//리턴형이 다른 메소드는 lookup-method 불가
		System.out.println("order_tea : " + cs.order_tea());
		
		//System.out.println("order_private : " + cs.order_private()); private 접근 불가
		System.out.println("order_private2 : " + cs.order_private2());
		
		//final,static == > lookup-method 적용되지 않고 클래스에 정의된 메소드가 호출
		System.out.println("order_final 실행 : " + cs.order_final());
		
		System.out.println("order_static 실행 : " + cs.order_static());
		
		System.out.println("order_piano 실행 : " + cs.order_piano());
		
		//추상메소드를 lookup-method로 재정의하여 실행 가능 
		System.out.println("order_hunter 실행 : " + cs.order_hunter());
		
		
		
		//추상메소드를 재정의하지 않고 실행 시 에러발생
		//System.out.println("order_hunter 실행 : " + cs.order_latte());
		
		//Coffee co = context.getBean("co",Coffee.class); // 에러안나게 바꿔보기 -> 다른패키지안에 있는 클래스여서 오류 - > 자바파일로 따로 빼줘야함
		//System.out.println("co : " + co);
		
		/*
		  
		 식단표의 식단을 xml 에서 지정하세요
		 
		 식단표
		 아침, 점심, 저녁
		 
		 xml에서 각 식단대로 메뉴를 리턴
		 
		 
		  
		  
		  
		  
		  
		 **/
		
		
	}

}
