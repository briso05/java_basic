package step01;

public class ReviewPARKSOHYEON {

	public static void main(String[] args) {
		/*
		 * 변수의 종류 [primitive type]
		 * 
		 * 1. 정수 타입 : 자바의 기본 정수형 => int
		 *  - char(1byte) : 한자리 문자, ''(작은 따옴표 사용), 정수로도 대입 가능
		 *                  ex) 'A': 65, 'a': 97 [아스키코드]
		 *   
		 *  - byte(1 byte) : -128(-2^8) ~ 127(2^8 - 1) 내의 정수
		 *  - short(2 byte)  : (-2^16) ~ (2^16 - 1) 내의 정수
		 *  - int(4 byte)  : (-2^32) ~ (2^32 - 1) 내의 정수
		 *  - long(8 byte)  : (-2^64) ~ (2^64 - 1) 내의 정수
		 *  				** int 형 범위 밖의 정수를 사용할 경우 꼭  숫자 뒤에 L을 명시해줘야 함
		 *  
		 *  2. 실수 타입 : 자바의 기본 실수형 => double
		 *  - float(4 byte) : float 형 사용시 꼭 숫자 뒤에 F 명시해야 함
		 *  - double(8 byte)
		 *  
		 *  3. 논리 타입 
		 *  - boolean(1 byte) : true / false
		 *  
		 *  변수의 종류 [reference type]
		 *  1. 객체들. 
		 *   ex) Array, String.. 등
		 *   
		 *  2. 문자열 객체 : String
		 *  
		 */
		
		/*
		 * 메모리 구조
		 * 
		 * 스택 메모리 : 로컬변수를 저장함(변수가 가리키는 객체의 주소를 가짐)
		 * 힙 메모리 : 참조 타입(객체)을 저장함(생성된 객체를 저장)
		 */

		// 문자열 비교 
		// 1. 비교 연산자(==)를 이용한 비교 : String 객체의 주소를 비교  
		String str1 = "Hello"; //상수풀에 이미 존재하는 "Hello" String을  str1 변수가 가리킴
		String str2 = "Hello"; //상수풀에 이미 존재하는 "Hello" String을  str2 변수가 가리킴
		
		System.out.println(str1 == str2); // true
		// => str1 과 str2의 메모리상의 객체 주소가 같음
		
		String str3 = new String("Hello"); //내용은 같지만 힙 메모리에 새로 객체를 생성하고 
										   //이를 str3 변수가 가리킴(즉, 이미 존재하는 "Hello"와 주소가 다르다)
		
		System.out.println(str1 == str3); //false
		// => str1 과 str3의 메모리상의 객체 주소는 다름
		
		// 실제 객체 주소를 확인해보자
		System.out.println(System.identityHashCode(str1)); // str1 이 가리키고 있는 "Hello"객체 주소값 //705927765
		System.out.println(System.identityHashCode(str2)); // str2 이 가리키고 있는 "Hello"객체 주소값 //705927765
		System.out.println(System.identityHashCode(str3)); // str3 이 가리키고 있는 "Hello"객체 주소값 //366712642
		
		// 2. equals() 메소드를 이용한 비교 : String 객체의 내용을 비교
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3)); //true
		
		
	}

}
