package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class ExecAdvice1 {

	void retString(JoinPoint joinPoint) {
		System.out.println("retString:"+joinPoint.getSignature().toShortString());
		/*joinPoint로 전달된 메서드의 시그니처 정보를 출력하는 메서드입니다. 
		 * 메서드 실행 전에 public String 반환 타입을 가지는 메서드가 호출될 때마다 출력*/
	}
	
	void paramInt(JoinPoint joinPoint) {
		System.out.println("paramInt:"+joinPoint.getSignature().toShortString());
	}
	/*메서드 실행 전에 매개변수가 정수인 메서드가 호출될 때 출력됩니다. */
	
	void nameDog(JoinPoint joinPoint) {
		System.out.println("nameDog:"+joinPoint.getSignature().toShortString());
	}/*메서드 실행 전에 "dog"이라는 이름을 가진 메서드가 호출될 때 출력됩니다. 
	*/
	
	void claKang(JoinPoint joinPoint) {
		System.out.println("claKang:"+joinPoint.getSignature().toShortString());
	}/*
	메서드 실행 후에 Kang으로 시작하는 클래스의 메서드가 호출될 때 출력됩니다. 
	*/
	void endO(JoinPoint joinPoint) {
		System.out.println("endO:"+joinPoint.getSignature().toShortString());
	}/*endO: 메서드 실행 후에 이름이 "o"로 끝나는 메서드가 호출될 때 출력됩니다. */
	
	
	void oAndKang(JoinPoint joinPoint) {
		System.out.println("oAndKang:"+joinPoint.getSignature().toShortString());
	}/*메서드 실행 후에 이름이 "o"로 끝나는 메서드와 KangBada 클래스의 메서드가 호출될 때 출력됩니다. */
	
	void oOrJo(JoinPoint joinPoint) {
		System.out.println("oOrJo:"+joinPoint.getSignature().toShortString());
	}/*서드 실행 후에 이름이 "o"로 끝나는 메서드 또는 Jo로 시작하는 클래스의 메서드가 호출될 때 출력됩니다. */
	
	
}
