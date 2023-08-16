package aop_p.adv;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	
	Object arTest(ProceedingJoinPoint joinPoint) {//ProceedingJoinPoint : AOP 관련 메서드 실행 정보를 가지고 있는 객체
		Object res = null;
		
		System.out.println(" >> arTest 진입 :"+joinPoint.toString());
		System.out.println(" >> toShortString  :"+joinPoint.toShortString());
		System.out.println(" >> getSignature  :"+joinPoint.getSignature());
		System.out.println(" >> getSignature + <get Name()> :"+joinPoint.getSignature().getName());
		System.out.println(" >> getSignature + <toShortString()> :"+joinPoint.getSignature().toShortString());
		System.out.println(" >> getArgs():"+Arrays.toString(joinPoint.getArgs())); // 12,아기상어
		System.out.println(" >> getTarget :"+joinPoint.getTarget());  // 주소값
		
		
		try {
			
			if(joinPoint.getArgs().length>=2) { // 매개변수가 2개 이상일때 
				joinPoint.getArgs()[1] = "엄마상어"; // 두번째 매개변수가 "엄마상어"라면
				System.out.println(" >>변경한 getArgs():"+Arrays.toString(joinPoint.getArgs()));
				//인자 배열의 문자열 표현을 함께 출력 - 이해안감...
			}
			
			res = joinPoint.proceed();
			
			if(res.equals("애봉")) { //애봉이일때
				res = "조준"; // 조준으로 바뀜
			}
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" >> arTest 완료");
		
		return res;
	}

}
