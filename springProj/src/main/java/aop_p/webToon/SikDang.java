package aop_p.webToon;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Aspect
//@Component//
	public class SikDang {
	
	
		/*
		 * int order = 0; int order2 = 0;
		 */
	
		/*
		 * String name, kind; int cnt;
		 * 
		 * 
		 * public void setName(String name) { this.name = name; }
		 * 
		 * 
		 * public void setKind(String kind) { this.kind = kind; }
		 * 
		 * 
		 * public void setCnt(int cnt) { this.cnt = cnt; }
		 * 
		 * 
		 * 
		 * 
		 * @Override public String toString() { return "SikDang [name=" + name +
		 * ", kind=" + kind + ", cnt=" + cnt + "]"; }
		 */


	public int jjigae(int count, int cnt) {
		System.out.println("찌개:"+count+cnt);
		int order = count * cnt;
	
		if (order < 10000) {
	        System.out.println("3,000원의 배달비가 추가됩니다."+(order+3000));
	    }else {
	        System.out.println("무료배달입니다.");
	    }
	    
	    return order; 
	}
	
	
	


	public int dub(int count2, int cnt2) {
		System.out.println("덮밥:"+count2+cnt2);
		int order2 = count2 * cnt2;
		
		if (order2 < 10000) {
	        System.out.println("3,000원의 배달비가 추가됩니다 ; "+(order2+3000));
	    }else {
	        System.out.println("무료배달입니다.");
	    }
	    
	    
		return order2;
		
	}
	
	/*
	 * public int total() {
	 * 
	 * 
	 * return order+order2; }
	 */


	

	
	
	
//	public String dog1(int aa, String bb) {
//		System.out.println("센세이션은 찢찢:"+aa+","+bb);
//		return "센세이션";
//	}
//	
//	public String wife() {
//		System.out.println("애봉파워");
//		return "애봉";
//	}
//	
//	public int papa(int c) {
//		System.out.println("조철왕:"+c);
//		return 4000;
//	}
//	
//	public int nums(int c) {
//		System.out.println("nums:"+c);
//		return 100/c;
//	}

	
}
