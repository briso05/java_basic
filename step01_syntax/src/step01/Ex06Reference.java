package step01;

import java.util.Arrays;

public class Ex06Reference {
/* 참조 타입
 * 	- 기본 타입처럼 실제 데이터가 값이 아닌 객체의 주소를 참조하는 타입
 * 	- 변수 스택(stack)영역, 객체는 힙(heap) 영역에서 생성
 * 	- 기본 값 : null
 * 		- 참조할 객체가 없을 경우, NullPointerExeption 발생
 *
 */	
	public static void main(String[] args) {
		//문자열(String)
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		
		// String 객체의 주소 비교
		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // false
		
		// 객체의 주소 출력!
		System.out.println(System.identityHashCode(str1)); // str1 이 가리키고 있는 "Java"객체 주소값
		System.out.println(System.identityHashCode(str2)); // str2 이 가리키고 있는 "Java"객체 주소값
		System.out.println(System.identityHashCode(str3)); // str3 이 가리키고 있는 "Java"객체 주소값
		
		// equals -> String 객체의 문자열(내용)이 같은지
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // true
		
		//스택 : 로컬변수
		//힙 : 참조 타입 
		//스택의 str1 이 힙에 존재하고 있는 "Java"를 가리키고 있음
		//스택의 str2 이 힙에 존재하고 있는 "Java"를 가리키고 있음
		//new 라는 키워드로 만들어진 객체는 힙에 새롭게 생성된다.
		//해당 객체를 str3라는 변수가 가리키게 만든다.
		//따라서 스택의 str3이 힙에서 가리키고 있는 "Java"는 이전에 있던 "Java"와 다름
		
		// 배열(Array) []
		// - 구조 : 타입[] 변수명 = {데이터1, 데이터2, 데이터3,... }
		// - 특징 : 크기가 고정
		// - 종류 : 1, 2, 3, ...
		System.out.println("-- 배열 --");
		int[] scores = {90, 86, 100, 0, 45};
		
		
	}
}

