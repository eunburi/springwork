package di_p.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CompareMain {


	
	
	
	public static void main(String[] args) {
		int [] arr = {66,33,66,88,77,22,33,44};
		
		ArrayList a1 = new ArrayList();
		HashSet s1 = new HashSet(); // 중복없고 순서 마구잡이
		LinkedHashSet s2 = new LinkedHashSet();
		TreeSet s3 = new TreeSet(); // 오름차순으로 정렬 어레이/링크드/역순으로 뽑을꺼임
		
		TreeSet ts1 = new TreeSet(
		
			new Comparator() {
				@Override
				public int compare(Object o1, Object o2) {
					
					return 0;
				}
				
			});
			
			TreeSet ts2 = new TreeSet(
			
			new Comparator() {
				@Override
				public int compare(Object o1, Object o2) {
					
					return 1;
				}
				
			});
			
			TreeSet ts3 = new TreeSet(
			
			new Comparator() {
				@Override
				public int compare(Object o1, Object o2) {
					
					if(o1 == o2) {
						return 0;
					}
					return 1;
				}
				
			});
			
			TreeSet ts4 = new TreeSet(
			
				new Comparator() {
				@Override
				public int compare(Object o1, Object o2) {
					int me = (int)o1;
					int you = (int)o2;
					
					System.out.println(me+":"+you);
					
					return you-me;
				}
				
			});
			
			
	
			
			
		
		for (int i : arr) {
			a1.add(i);
			s1.add(i);
			s2.add(i);
			s3.add(i);
			ts1.add(i); // 맨처음것만나옴 - 비교할대상이없으니까
			ts2.add(i);
			ts3.add(i); // s2랑 똑같음
			ts4.add(i); // 역순
			System.out.println(">>");
			
		}
		System.out.println("=================");
		System.out.println("arr:"+Arrays.toString(arr));
		System.out.println("a1:"+a1);
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("=================");
		System.out.println("ts1:"+ts1);
		System.out.println("ts2:"+ts2);
		System.out.println("ts3:"+ts3);
		System.out.println("ts4:"+ts4);
		
		
	}

}
