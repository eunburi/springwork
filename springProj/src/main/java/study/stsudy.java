package study;

import java.util.Scanner;

public class stsudy {

	public static void main(String[] args) {
		// Hello World 세번써보세요
		
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		
//		System.out.println("\n 사용 : "+"Hello World\nHello World\nHello World");
//		
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("Hello World");
//			}
//		
//		//printf
//		//문제1
//		System.out.println("홍길동\n홍 길 동\n홍  길  동");
		
		
		
		//문제2
		
		/*
		 * String a = "홍길동"; int b = "123456" ; float c = 1234f;
		 * 
		 * System.out.printf("%s,%d,%f",a,b,c);
		 */
		
		//string도 됨
		
		
		
		/*
		 * System.out.print("신짱구\n"); System.out.printf(name+"\n"+adress);
		 * 
		 * System.out.print("010-1234-5678\n"); System.out.print("서울시 강서구 화곡동");
		 */
		
		
		//문제3
		//번지수만
		/*
		 * float d = 20 System.out.printf();
		 */
		
		/*
		 * int a = 123; int b = 456; System.out.printf("번지수는 %d-%d",a,b);
		 */
		
		//눈으로만 푸세요 각각의 출력결과는?
		//1.10+5+"a"
		//2. "a"+10+5
		
//		System.out.println(10+5+"a"); //15a
//		System.out.println("a"+10+5); //a105 // 스트링이객체자료형 @! int가 기본자료형이여서
//		//자료형 변환 발생
//		System.out.println('a'+10+5); //112
//		
		
		//String name = (String)request.getParameter(num);
		
		//Scanner sc = new Scanner(System.in);
		//String name = sc.nextLine();
		//int age = sc.nextInt();
		//System.out.println("이름은 "+name+"나이는"+age);
		//System.out.println("두 수를 입력하세요");
		
		/*
		 * int num1 = sc.nextInt(); int num2 = sc.nextInt(); int sum = num1+num2;
		 * 
		 * System.out.println("덧셈 : "+sum+"덧셈입니다.");
		 */
		
		//정답 :
		/*
		 * int a = sc.nextInt(); int b = sc.nextInt();
		 * System.out.println((a-b)+","+(a*b));
		 */
		
		//2번
		/*
		 * int num1 = sc.nextInt(); int num2 = sc.nextInt(); int num3 = sc.nextInt();
		 * 
		 * 
		 * System.out.println((num1*num2)+num3);
		 */
		//정답
		//System.out.println("숫자3개");
		// int num1 = sc.nextInt();
		// int num2 = sc.nextInt();
		// int num3 = sc.nextInt();
		//System.out.println(num1*num2+num3);
		//System.out.printf("%d*%d+%d="+((num1*num2)+num3),num1,num2,nu3);
		
		//3번 
		//제곱을 구하시오
		/*
		 * int q = sc.nextInt(); System.out.println(q*q);
		 */
		
		
		//5번 - 5,6,7
		/*
		 * System.out.println("====");
		 * 
		 * int num1 = sc.nextInt(); int num2 = sc.nextInt(); int num3 = sc.nextInt();
		 * 
		 * System.out.println((num1-num2)*(num2+num3)*(num3/num1));
		 */
		
		
		
		//array 01
		//1
		/*
		 * int num1 = sc.nextInt();
		 * 
		 * if(num1%2 == 0) { System.out.println("짝수입니다."); }else {
		 * System.out.println("홀수입니다."); }
		 * 
		 * 나머지가 1일때 / 
		 */
		
		//1-1나이를 입력받아 성인인지 미성년자인지 구분하시오
		
		/*
		 * int na = sc.nextInt();
		 * 
		 * if(na > 2005 ) { System.out.println("미성년자"); }else {
		 * System.out.println("성인"); }
		 */
		
		//1-2.숫자 배열 23, 45, 67 중 최대값을 구하시오 (for문 없이)
		int arr [] = {23,45,67}; 
		if(arr[0] > arr[1]) {
			if(arr[1]>arr[2]) {
				System.out.println(arr[0]);
			}else {
				System.out.println(arr[2]);
			}
		}else if(arr[0] > arr[1]) {
			if(arr[1]>arr[2]) {
				System.out.println(arr[1]);
				
			}else {
				System.out.println(arr[2]);
			}
			
		}  // 67
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
