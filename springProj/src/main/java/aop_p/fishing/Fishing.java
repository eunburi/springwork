package aop_p.fishing;


import org.springframework.stereotype.Component;

@Component
public class Fishing {
	
	public String mikki1(int aa, String bb) {
		System.out.println("미끼"+aa+","+bb);		
		return "미끼1";
	}
	
	public String mikki2(int aa) {
		System.out.println("미끼2"+aa);		
		return "aa";
	}
	
	/*
	 * public String mikki2() { System.out.println("미끼2"); return "미끼2"; }
	 */
	
		
	

	
	
	
	
	
}
