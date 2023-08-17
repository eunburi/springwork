package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class ClaAwbAdvice {
	
	void ab(JoinPoint joinPoint,int aa, int bb , int cc) {
		
		System.out.println("일반:"+joinPoint.getSignature().toShortString());
	}
	
	void cd(JoinPoint joinPoint,int dd, int ee , int ff) {
		System.out.println("예체능:"+joinPoint.getSignature().toShortString());
	}
	
	void ef(JoinPoint joinPoint,int gg, int hh , int ii) {
		System.out.println("what:"+joinPoint.getSignature().toShortString());
	}
	
	
	
	/*
	 * void cr(JoinPoint joinPoint) {
	 * System.out.println("cr:"+joinPoint.getSignature().toShortString()); }
	 * 
	 * 
	 * void zx(JoinPoint joinPoint,int zz, int xx) {
	 * System.out.println("zx(int,int):"+joinPoint.getSignature().toShortString());
	 * }
	 */
	
	
}
