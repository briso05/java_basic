package step01;

import java.util.Scanner;

public class Ex04Condition {
/* 조건문(Condition) : 주어진 조건이 참일 경우, 주어진 기능 수행
 * 1. if문
 * 		- 문법
 * 			if(조건식) {
 * 				수행 코드;
 * 				...
 * 			}else if(조건식) {
 * 				수행 코드;
 * 				...
 * 			}else {
 * 				수행 코드;
 * 			}
 * 		
 * 		- 종류
 * 			1. if : 조건이 하나인 경우
 * 			2. if -else : 조건은 하나, 조건이 거짓 -> else 블럭의 코드 실행
 * 			3. if -else if -else... : 조건이 여러개
 *
 * 2. switch/case문 : 변수 값에 따라 수행코드 결정
 * 		- 문법
 * 			switch(변수값) {
 * 				case 입력값1:
 * 					수행 코드;
 * 					break;
 * 				case 입력값2:
 * 					수행 코드;
 * 					break;
 * 				
 * 				...
 *
 * 				default:
 * 					수행 코드;
 * 			}
 * 		
 */
	public static void main(String[] args) {
		
		System.out.println("-- 기본 조건문 --");
		//step01
		if(1 < 2) {
			System.out.println("참일때 실행되는 구문");
		}
		
		//step02 
		String id = "admin";
		if(id.equals("admin")) {
			System.out.println("관리자로 로그인");
		} else if(id.equals("admin2")) {
			System.out.println("관리자로 로그인");
		}

		//step03 
		String id2 = "admin3";
		if(id2.equals("admin")) {
			System.out.println("관리자로 로그인");
		} else if(id2.equals("admin2")) {
			System.out.println("관리자로 로그인");
		} else {
			System.out.println("관리자로 로그인 실패");
		}
		
		
		System.out.println("-- 특수 조건문 --");
		int grade = 1;
		
		switch (grade) {
		case 1:
			System.out.println("금메달입니다.");
			break;
		case 2:
			System.out.println("은메달입니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("당신도 영웅입니다.");
			break;
		}
	}
}
