package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Component_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno_xml/component.xml");

		
		System.out.println("mouse : "+context.getBean("mouse"));  // 컴포넌트 추가 시 실행됨 / 마우스에 resource 넣어주니 생김
		System.out.println("noteBook : "+context.getBean("noteBook")); // 첫글자는 소문자로 대문자로바꿔줌, NoteBook은 못불러옴 - > 에러생김
		System.out.println("bbcc : "+context.getBean("bbcc"));
		System.out.println("DESKTop : "+context.getBean("DESKTop")); //dESKTop - >에러 대문자가 붙어서오면 DESKTop 대문자로쓰기
		
		context.close();
		
				
	}

}
