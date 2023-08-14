package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeBean_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno_xml/coffeebean.xml");

		
		System.out.println(context.getBean("w1"));
		System.out.println(context.getBean("w2"));
		System.out.println(context.getBean("w3"));
		
		
		context.close();
		
				
	}

}
