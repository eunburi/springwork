package di_p.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Student_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/student.xml");
		
		Student student = context.getBean("student", Student.class);
		
		student.abcd(); // 합계
		student.efg(); //평균
		System.out.println(student); 

		
       
  

        

        
	
		
	}

}
 