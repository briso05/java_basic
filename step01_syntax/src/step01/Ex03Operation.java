package step01;

public class Ex03Operation {

	public static void main(String[] args) {
		System.out.println("-- 기본 연산 --");
		int v1 = 10;
		int v2 = 3;
		
		System.out.println(v1 + v2);
		System.out.println(v1 - v2);
		System.out.println(v1 * v2);
		System.out.println(v1 / v2); // 몫
		System.out.println(v1 % v2); // 나머지에 대한 결과값
		
		// v1 / v2 = 3.3333
		//형변환(casting)
		// 데이터 타입 메모리가 큰 쪽에서 작은 쪽으로 형변환시 자료 소실 일어날 수 있음 : double -> int 
		// 데이터 타입 메모리가 작은 쪽에서 큰 쪽으로 형변환시 자료 소실 없음
		System.out.println((double) v1 / v2);
		
		double result = (double) v1 / v2;
		System.out.println(result);
		
		
		System.out.println("-- 증감 연산 --");
		int v3 = 10;
		System.out.println(v3);   //10
		System.out.println(v3++); //10 후위 증감연산자 : 변수가 사용된 다음 1 증가[감소] 및 저장 됨
		System.out.println(v3);	  //11
		System.out.println(++v3); //12 전위 증감연산자 : 변수가 사용되기 전 1 증가[감소] 및 저장 후 사용됨
		System.out.println(v3);	  //12
		
		
		System.out.println("-- 논리 연산 --");
		boolean t = true;
		boolean f = false;
		
		// && : 둘다 참일 때만 참(and 연산)
		System.out.println(t && t);  //true
		System.out.println(t && f);  //false
		System.out.println(f && f);  //false
		
		// || : 둘 중 하나만 참이어도 참(or 연산)
		System.out.println(t || t);  //true
		System.out.println(t || f);  //true
		System.out.println(f || f);  //true
		
		// ! : 참/거짓을 반대로 바꿔줌 (not 연산)
		System.out.println(!t);  //false
		System.out.println(!f);  //true
		
		
		System.out.println("-- 비교 연산 --");
		// <, <=, >, >=, ==, !=
		System.out.println(1 == 1); //true
		System.out.println(1 != 2); //true
		System.out.println(1.0 == 1); //true
		
		System.out.println("-- 대입연산자 --"); // 복합 연산자
		// =, +=, -=, /=, *=,...
		int assign = 0;
		assign += 10; // assign = assign + 10;
		System.out.println(assign); //10
		
		assign /= 10; // assign = assign / 10;
		System.out.println(assign); //1
		
		// 문자열
		System.out.println("-- 문자열 연산 --");
		String str1 = "String 1";
		String str2 = "String 1";
		String str3 = new String("String 1");
		
		//문자열끼리의 +(덧셈연산) : 두 문자열을 이어주는 역할
		System.out.println(str1 + str2); //String 1String 1
		System.out.println(str1  + " " + str2); //String 1 String 1
		
		//문자열에 대한 곱셈은 불가
		//System.out.println(str1 * 3);
		
		System.out.println(str1 == str1); //true
		System.out.println(str1 == str2); //true
		System.out.println(str1 == str3); //false : == 는 객체의 주소값을 비교( 같은 객체이냐? ) 
		System.out.println(str1.equals(str3)); //true : .equals() 는 String 내부의 문자열 값이 같은가 비교 
		
	}

}
