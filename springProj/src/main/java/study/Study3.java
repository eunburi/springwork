package study;

import java.util.Scanner;

public class Study3 {
	
	public static void main(String[] args) {
	//08.21
	//문제2. 프로그램 사용자로부터하나의 영단어를 입력받아서 입력받은 영단어의 길이를 계산하여
	//출력하는 프로그램을 작성해보자
	//예를들어 " Array" - >5
	// 입력받을수 있는 영단어의 최대 글자수가 30까지
	
	//System.out.print("==영단어를 입력하세요 뚜둥!!==");
	
	//Scanner sc = new Scanner(System.in);
	//String word = sc.nextLine();
	
	
//	System.out.println(word.length());
//	
//	if(word.length()>30) {
//		System.out.println("다시 입력하세용");
//	}
	
	//System.out.println("input:");
	//승우짱 푼거 (사진 찍음)
	//String[] arr = new String[30];
	//arr = sc.nextLine().split("");
	
	
	
	
	//문제3.
	//사용자로부터 영단어를 입력받는다.
	//영단어를 구성하는 문자 중에서 아스키코드의 값이 가장 큰 문자를 찾아서 출력하는 프로그램을 작성
	//예를 들어서 입력된 영단어다 "LOVE"라면, 이 중 아스키 코드 값이 가장 큰 문자는 V이므로 V가 출력되어야한다.
	//원하는 글자가 바로나오게 -> LOVE - > V만 출력
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		char max = s.charAt(0);
		for(int i=1; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>max) {
				max=ch; // 모든 문자를 나열
			}
		}
		
		System.out.println(max);
		
		//System.out.println(wd.substring(2)); // ve
		//System.out.println(wd.charAt(2)); // v
		
		/*
		 * char a = 'a'; System.out.println(a); char b = 'b'; System.out.println(b);
		 * 
		 * int d = a+b; boolean g = a<b; System.out.println(d); System.out.println(g);
		 */
		
		
		/*
		 * char love = 0; int max = 0; for(int i=0; i<wd.length(); i++) {
		 * if(max<wd.length()) { max = wd.length(i); } }System.out.println(i);
		 */
		
		
		//------답
		
		

		
		
		
		
		

	
	}

}