package di_p;

import java.util.Arrays;
import java.util.List;


public class Stud implements Comparable<Stud>{ //Stud 클래스가 Comparable<Stud> 인터페이스를 구현하도록 선언된 부분

	String name;
	int [] jum;
	int tot, avg, rank;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setJum(int... jum) { //여러 개의 인자를 받을 수 있도록
		this.jum = jum;
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot / jum.length;
	}
	
	void rankCalc(List<Stud> studs) {
		rank = 1; // 초기 랭킹 1
		for (Stud you : studs) { //studs 리스트의 각 Stud 객체를 you 변수에 하나씩 할당하면서 순회
			if(avg < you.avg) {
				rank++;
			}
		}
	}
	@Override
	public String toString() { //"\t" : 공백
		return "" + name + "\t" + Arrays.toString(jum) + "\t" + tot + "\t" + avg + "\t"+rank;
	}
	@Override
	public int compareTo(Stud you) {
		
		int res = rank - you.rank;
		
		if(res == 0) {
			res = name.compareTo(you.name);
		}
		return res;
	}
	
	
}
