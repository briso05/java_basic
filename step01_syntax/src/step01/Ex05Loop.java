package step01;

public class Ex05Loop {
/* 반복문(Loop)
 * 1. for문 : 반복 횟수가 정확할 때
 * 		- 구조
 * 			for(변수 선언과 초기화; 조건식; 증감식){
 * 				수행 코드;
 * 				....
 * 			}
 *
 * 		- 종류
 * 			1. 기본 for문
 * 			2. for Each문
 * 				for(타입 변수 : 데이터 저장객체){
 * 					수행 코드;
 * 					...
 * 				}
 *
 * 2. while문 : 반복 횟수가 불명확 또는 무한
 * 		- 구조
 * 			초기식;
 * 			while(조건식){
 * 				수행 코드;
 * 				...
 * 				증감식;
 * 			}
 *
 * 3. do ~ while문 : 반복 조건 검증전 한번 실행후, while문 실행
 * 			초기식;
 * 			do {
 * 				실행 로직과 증감식;
 * 			}while(조건식);
 *
 */	
	public static void main(String[] args) {
		System.out.println("-- for 반복문 --");
		// 1 ~ 5 까지 출력
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
			
		System.out.println();
		
		// 1 ~ 200 까지 출력(짝수만 출력)
		for(int i = 1; i <= 200; i++) {
			if(i % 2 == 0)
				System.out.println(i);
		}
		
		System.out.println();

		// for문 2개를 사용해서 구구단 출력
		for(int i = 1; i <= 9; i++) {
			System.out.printf("---- %d 단 ----\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		System.out.println();
		
		// 5 ~ 1 까지 출력
		for(int j = 5; j >= 1; j--) {
			System.out.println(j);
		}
		
		System.out.println("-- while 반복문 --");
		// while 무한 루프
//		while(true) {
//			System.out.println("while 반복문");
//		}
		
		int i1 = 1;
		while(i1 <= 5) {
			System.out.println(i1);
			i1++;
		}
		
		
		System.out.println("-- do ~ while 반복문 --");
		//do ~ while : 1-5까지 출력
		int i2 = 1;
		do {
			System.out.println(i2);
			i2++;
		} while (i2 <= 5);
		
	} //end main
}
