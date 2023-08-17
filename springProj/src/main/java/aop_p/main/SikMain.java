package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.SikDang;

public class SikMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/sik.xml");
		
		SikDang sik = context.getBean("sikDang",SikDang.class);

		System.out.println("찌개의 금액은:"+sik.jjigae(1, 5000));
		System.out.println("---------------");
		
		System.out.println("덮밥의 주문한 금액은 : "+sik.dub(1, 6000));
		System.out.println("---------------");
		

		
		
		
		//System.out.println("총 금액은 : "+sik.total());
		
	}

}
