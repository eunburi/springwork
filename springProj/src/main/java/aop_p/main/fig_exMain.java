package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.Figure;
import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class fig_exMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/fig_exec.xml");
		 double PI= Math.PI;
		
		System.out.println("------퀴즈를 풀어보아요---------");
		Figure fig = context.getBean("figure",Figure.class);
		System.out.println("fig.circle:"+fig.circle(2, PI));
		
		
		context.close();
		
		
//		System.out.println("fig.rectangle:"+fig.rectangle(4, 3));
//		System.out.println("fig.trianlge:"+fig.triangle(6, 5));
		
		/*
		 * JoSuk jsk = context.getBean("joSuk",JoSuk.class); KangBada kbd =
		 * context.getBean("kbd",KangBada.class); KangSan kangSan =
		 * context.getBean("kangSan",KangSan.class);
		 * System.out.println("jsk.dog1:"+jsk.dog1(12,"아기상어"));
		 * System.out.println("---------------");
		 * System.out.println("jsk.wife:"+jsk.wife());
		 * System.out.println("---------------");
		 * System.out.println("jsk.papa:"+jsk.papa(44));
		 * System.out.println("---------------"); kbd.dogdo();
		 * System.out.println("---------------"); kangSan.yunFish();
		 * System.out.println("---------------"); kangSan.ra9yo();
		 * System.out.println("---------------");
		 */
		
		
		/*
		 * 도형 클래스를 구현하세요 
		 * PI = Math.PI
		 * r = 반지름
		 * 			넓이			둘레
		 * 원		r*r*PI		2*pi*r
		 * 직사각형	가로*세로		(가로 + 세로)*2
		 * 직각삼각형	가로*세로/2	가로+세로+빗변
		 * 
		 * 
		 * aop를 이용하여, 계산 할 때마다 각 도형의 넓이,둘레의 합계,평균을 계산하세요
		 * :return값으로 처리
		 * 클래스이름이 도형 / 메소드
		 * 
		 * */
		
		
		
		
		
	}

}
