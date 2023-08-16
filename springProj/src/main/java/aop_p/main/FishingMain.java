package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.fishing.Fishing;
import aop_p.webToon.JoSuk;

public class FishingMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/fishing.xml");
		
		Fishing fs = context.getBean("fishing",Fishing.class);
		
		System.out.println("퀴즈타임");
		System.out.println("--------------");
		System.out.println("50cm물고기"+fs.mikki1(50,"떡밥"));
		System.out.println("--------------");
		//System.out.println("50cm물고기"+fs.mikki2(0));
		//System.out.println("fs.miiki2:"+fs.mikki2());
		
		

		
		
		
		
		
		
		
		/*
		 낚시를 구현하시오
		 
		 미끼를넣지 않고 낚시할 경우() : 미끼를 넣으세요 메시지  호출 후 자동 종료
		 미끼-매겨변수
		 낚시한 물고기가 20cm 이하인 경우 : 풀어주자 메시지 호출 및 리턴 물고기 null로 변경
		 return이 20이하면 res null 나가라
		  
		  */
		
		
		
	}

}
