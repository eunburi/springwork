package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Coffee;
import di_p.CoffeeShop;
import di_p.MenuList;


public class Lookup_menu_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/menu.xml","di_xml/menuparts.xml");

		MenuList ml = context.getBean("ml",MenuList.class);
		
		System.out.println("아침드세용 : " + ml.order_am());
		System.out.println("점심드세용 : " + ml.order_an());
		System.out.println("저녁드세용 : " + ml.order_dn());
		
		//System.out.println("디저트 : "+ ml.desert());
		
		
		
		/*
		  
		 식단표의 식단을 xml 에서 지정하세요
		 
		 식단표
		 아침, 점심, 저녁
		 
		 xml에서 각 식단대로 메뉴를 리턴
		 
		 
		  
		  
		 **/
		
		
	}

}
