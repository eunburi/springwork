package di_p.main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	String name ;
	int [] subject;
	int sum;
	int avg;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getSubject() {
		return subject;
	}
	public void setSubject(int[] subject) {
		this.subject = subject;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	public void abcd() { // 합계
		for (int i = 0; i < subject.length; i++) {
			sum += subject[i];
        } 
	}
	
	public void efg() { // 평균-굳이 for문 돌릴필요 없음
		 avg = sum / subject.length;
	}
	
		
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + Arrays.toString(subject) + ", sum=" + sum + ", avg=" + avg
				+ "]";
	}
	
	
	
	
	
	

	

	
	

	
	
	
}
