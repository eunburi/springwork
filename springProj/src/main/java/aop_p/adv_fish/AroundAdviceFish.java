package aop_p.adv_fish;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdviceFish {
	
	Object arTest1(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		//System.out.println(joinPoint.toString());
		System.out.println(" >> getArgs():"+Arrays.toString(joinPoint.getArgs()));
		System.out.println(" >> getTarget :"+joinPoint.getTarget());
		
		
		try {
			
			if(joinPoint.getArgs().length<=0) {
				joinPoint.getArgs()[1] = "풀어주자";
				System.out.println(" >>변경한 getArgs():"+Arrays.toString(joinPoint.getArgs()));
			}
						
			res = joinPoint.proceed();
			
			if(res.equals("0")) {
				res = "미끼를 넣으세용~";
			}
			
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" >> arTest 완료");
		
		
		
		return res;
		
		
		
	}

}
