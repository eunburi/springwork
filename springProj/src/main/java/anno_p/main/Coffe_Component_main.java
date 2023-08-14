package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Coffe_Component_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno_xml/coffe_component.xml");

		
		System.out.println("아메리카노 : "+context.getBean("americano")); 
		System.out.println("카페라떼 : "+context.getBean("cafeLatte")); 
		System.out.println("카라멜마끼아또 : "+context.getBean("caramelMacchiato")); 
		
		
		context.close();
		
				
	}

}
