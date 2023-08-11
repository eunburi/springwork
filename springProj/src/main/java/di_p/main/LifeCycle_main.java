package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/lifeCycle.xml");

		System.out.println(context.getBean("um1"));
		System.out.println(context.getBean("um2"));
		System.out.println(context.getBean("um3"));
		System.out.println(context.getBean("co1"));
		System.out.println(context.getBean("co2"));
		
		context.close(); // umbrella가 3개라 destroy도 3개임

	}

}
