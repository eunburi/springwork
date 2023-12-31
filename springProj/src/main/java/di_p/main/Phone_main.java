package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone_main {

   public static void main(String[] args) {
      
      AbstractApplicationContext context = 
            new ClassPathXmlApplicationContext("di_xml/autowire_phone.xml");
      
      System.out.println("p1: " + context.getBean("p1"));

      System.out.println("p2: " + context.getBean("p2"));
      
   }

}