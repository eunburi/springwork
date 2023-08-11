package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Grade_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/grade.xml");

		System.out.println(context.getBean("red1"));		
		System.out.println(context.getBean("red2"));
		System.out.println(context.getBean("red3"));
		System.out.println(context.getBean("red4"));
		
		
		System.out.println(context.getBean("blue1"));		
		System.out.println(context.getBean("blue2"));
		System.out.println(context.getBean("blue3"));
		System.out.println(context.getBean("blue4"));
		
		

		
		//context.close(); 

	}

}
