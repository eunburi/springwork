package study;

public class study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3의 배수 구하기
		/*
		 * for(int i=1; i<100; i++) { if(i%3==0) { System.out.println(i); } }
		 * 
		 * for(int i=1; i<101; i++) { System.out.println(i); }
		 * 
		 * for(int i=1; i<101; i++) { System.out.printf("%d",i); }
		 * 
		 * System.out.println("-----------------");
		 * 
		 * 
		 * for(int i=1; i<100; i++) { if(i%2==0) System.out.printf("%d",i); }
		 * 
		 * System.out.println("-----------------");
		 */
		
		
		
		//짝수합계 , 3의 배수, 5의 배수 , 공배수 
		
//		int tot = 0;
//		for(int i=0; i < 100; i++) {
//			if(i % 2 == 0){
//				tot = tot + i;
//			}
//		}
//		
//		int sum=0;
//		for(int i=0; i<100;i++) {
//			sum+=i+1;
//			System.out.println(i+1+" ");
//		}
//		
//		System.out.println("총합 : "+sum);
//		System.out.println(tot);
		
		// 1부터 100까지의 짝수중에서 40은 몇번째인지 출력하시오 - for/if문
		/*int count = 0;
		for(int i=0; i<100; i++) {
			if(i % 2 == 0){
				count++;
				//System.out.println(i);
			}if (count == 40){
				System.out.println("40번째"+i);
			}*/
				
			
			
			
		//문제1.	
//			길이가 5인 int형 배열을 선언해서 프로그램 사용자로부터 총 5개의 정수를 입력 받자.
//			그리고 입력이 끝나면 다음의 내용을 출력하도록 예제를 작성해보자.
//			  - 입력된 정수 중에서 최대값
//			  - 입력된 정수 중에서 최소값
//			  - 입력된 정수의 총 합
//
//			단, 반드시 입력을 완료한 상태에서 '최대값'과 '최소값' 그리고 '총합'을 계산해야 한다.
			//최대값
			int arr [] = {40,20,70,47,81};
			int max = arr[0]; // 초기값
			int min = arr[0]; // 초기값
			//int min = arr[i];
			
			for(int i= 0; i<arr.length; i++) {
				if(max<arr[i]) {
					max = arr[i];
				}else {
					//System.out.println("최소값"+min);
				}
			}System.out.println("최대값"+min);
			
			for(int i= 0; i<arr.length; i++) {
				if(min>arr[i]) {
					min = arr[i];
				}else {
					//System.out.println("최소값"+min);
				}
			}System.out.println("최소값"+min);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			 * int arr2 [] = {2,3,4,5,6}; int min = arr[0]; // 초기값 //int min = arr[i];
			 * for(int i= 0; i<arr.length; i++) { if(min<arr[i]) {
			 * 
			 * }System.out.println("최소값?"+min); } System.out.println("최소값?"+min);
			 */

			
			
			
			
			
				
			
		}
		
		
		
		
		
	}
