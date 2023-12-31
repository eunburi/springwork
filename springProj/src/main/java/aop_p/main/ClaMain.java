package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.ClassRoom;
import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class ClaMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/grade.xml");
		
		ClassRoom cr = context.getBean("classRoom",ClassRoom.class);
		
		System.out.println(cr.general2(30, 50, 60));
		System.out.println("------------------");
		System.out.println(cr.sports(50, 60, 70));
		System.out.println("------------------");
		System.out.println(cr.what(90, 80, 95));
		
		
		/*
		 * System.out.println(cr.general(50)); System.out.println("------------------");
		 * System.out.println(cr.sports(60)); System.out.println("------------------");
		 * System.out.println(cr.what(70));
		 */
		
		context.close();
		

		
		
		
		/*
		 * 
		 * 학생 성적을 계산하시오
		 * 과목 2 : 뭐라고하는 반
		 * 과목 3 : 일반
		 * 과목 4 : 예체능
		 * 
		 * =>aop를 이용하여 각 학생분류별 인원수와 평균합계,평균의 평균을 출력하시오
		 * 
		 * */
		
	}

}
