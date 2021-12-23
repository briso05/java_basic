package step02.oop;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

class Parent2 extends Object{
	String name;
	int age;
	
	Parent2(){
		super();
//		System.out.println("부모클래스");
	}
	
	void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
	
}

public class Child2 extends Parent2{
String bucket;
	
	public Child2() {
		super();
//		System.out.println("자식클래스");
	}
	
	void printAll() {
		super.printAll();
		System.out.println(bucket);
	}
	
	//다형성 적용 메소드
	static Object toDo() {
		return "Study"; // String 객체 이지만 Object 타입으로 반환됨 !! -> 이 부분이 다형성 적용된 것!
	}
	
	static Object toDo2() {
		return "Study,Exercise,Cleaning,Sleeping";
	}
	
	public static void main(String[] args) {
		Parent2 p = new Child2();
		p.printAll();
		
		// 1. 문제 1
		// y만 출력하기 : toDo() 메소드 이용
		System.out.println(toDo().getClass());  // 반환 : Object 타입의 String 객체 
												// class java.lang.String

		Object obj = toDo();		// Object 타입의 String 객체 
//		obj.charAt(4);				// => String 클래스의 메소드 (.charAt(int idx))는 접근 불가
		
		String str = (String) obj;	// String 타입의 String 객체
//		str.charAt(4); 				// => String 클래스의 메소드 (.charAt(int idx))는 접근 가능
		System.out.println(str.charAt(4));
		
		// 2. 문제 2
		// Study 문자열을 char[] 배열로 저장하여 출력하기 개발
		/* 단계
		 * step1
		 * 	- toDo2() 반환값을 , 를 기준으로 String[] toDoLists 배열에 저장
		 * 	- 반환값 -> 변환(String) -> 배열로 변환
		 * 
		 * hint : charAt()/length()/split()
		 * 
		 * step2
		 * 	- toDoLists 첫번째 index에 저장된 Study이라는 문자열을 
		 * 	  새롭게 생성한 char[] cArray 배열에 저장 후 출력
		 */
		
		// step1
		/* step1의 결과값
		 *  
		 * Study
		   Exercise
		   Cleaning
		   Sleeping
		 * 
		 */
		System.out.println("=======step1 결과값=======");

		String[] toDoLists = ((String) toDo2()).split(",");
		
		for ( int i = 0; i < toDoLists.length; i++ ) {
			System.out.println(toDoLists[i]);
		}

		
		// step2
		/* step2의 결과값
		 * 
		 * S	
	     * t	
		 * u	
		 * d	
		 * y	
		 */
		System.out.println("=======step2 결과값=======");

		System.out.println("===String[]의 첫번째 데이터 값으로 char[]에 저장하기===");

		char[] cArray = new char[toDoLists[0].length()];

		for ( int i = 0; i < cArray.length; i++ ) {
			cArray[i] = toDoLists[0].charAt(i);
		}
		
		System.out.println(Arrays.toString(cArray));
			
		System.out.println("===저장된 char[] 데이터값 출력해 보기===");

		for ( int i = 0; i < cArray.length; i++ ) {
			System.out.println(cArray[i]);
		}
	}
}
