package aop_p.webToon;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ClassRoom {

	ArrayList<Integer> list = new ArrayList<>();
	//정수값으로 받을꺼니까
	
	public String general2(int aa,int bb,int cc) {
		
		int sum1 = aa + bb + cc;	
		int avg = sum1 / 3 ;
		this.list.add(sum1);
		//System.out.println();
		return "일반 반의 평균 :"+sum1 +" 평균"+avg ;
		
	}
	
	
	public String sports(int dd,int ee, int ff) {
		int sum2 = dd + ee + ff;	
		int avg2 = sum2 / 3 ;
		this.list.add(sum2);
		return "예체능반의 평균 :" + sum2 +" 평균"+avg2 ;
	}
	
	public String what(int gg,int hh, int ii) {
		int sum3 = gg + hh + ii;	
		int avg3 = sum3 / 3 ;
		this.list.add(sum3);
		return "what반의 평균 :" + sum3 +" 평균"+avg3 ;
	}
	
	//평균의 평균을 구하시오
	/*
	 * public int total() {
	 * 
	 * int total = 0; // 초기화 for(int avg : list) { total+= }
	 * 
	 * }
	 */
	
		
	
//	public int general(int a) {
//		System.out.println("일반 반의 점수는 : "+a);
//		return a;
//	}
//	
//	
//	public int sports(int b) {
//		System.out.println("스포츠 반의 점수는 : "+b);
//		return b;
//	}
//	
//	public int what(int c) {
//		System.out.println("뭐라고하는 반의 점수는 : "+c);
//		return c;
//	}
//	
	
	
	
	
	
	
	

	
}
