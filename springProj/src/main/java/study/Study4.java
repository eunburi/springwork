package study;

import java.util.Scanner;

public class Study4 {

	public static void main(String[] args) {


		//문제 2 - 참조변수를 선언해라
		//영단어입력받아 String 변수 중 하나를참조 참조변수에 저장된 영단어를역순으로 뒤집어서 String 객체 만들어참조
		//뒤집고나서 제대로 뒤집혔는지 확인위해 출력
		//ex - "Hello" - > olleH // 배열로 만들어서 출력을 거꾸로???
		
		//Scanner scan = new char[30];
		//char[] arr = new char[30];
		//arr = scan.nextLine().toCharArray();
		
//		for(int i= arr.length-1; i>=0; i--) {
//			System.out.println(arr[i]);
//		}System.out.println();
		
		//Strin[]tt = 
		
		//문제 3 www.google.com - > 구글을 뽑아라~ - 
		
		String goo = "www.google.com";
		String str = goo.substring(4, 10);
		System.out.println(str);
		String A = str.toUpperCase();
		System.out.println("대문자 변환" + A);
		
		int id = goo.indexOf("google",0); // 4
		System.out.println(id);
		
		
		//1)
		String g = "www.google.com".split("\\.")[1].toUpperCase(); // -> "[.]"
		System.out.println("g : "+g);
		
		//2)
		String str2 = "www.google.com";
		//String str3 = str.substring(str.indexOf("google")),str.index
		
		
		
		
		
		
		

	}

}
