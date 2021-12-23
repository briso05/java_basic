package step01.api;

import java.util.Arrays;

public class Ex01LangPackage {
/* java.lang 패키지 내 클래스는 import 안해도 됨 */	
	public static void main(String[] args) {
		
		// Object 클래스
		// equals() : 동일 객체인지 비교결과 반환
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1); // java.lang.Object@2a139a55
		System.out.println(obj2); // java.lang.Object@15db9742
								  // => 주소값이 다르다 = 다른 객체!
		System.out.println(obj1.equals(obj2)); //false
		
		
		// hashCode() : 객체의 주소값 반환
		System.out.println(obj1.hashCode()); // java.lang.Object@{16진수} -> (10진수) 705927765
		System.out.println(obj2.hashCode()); // (10진수) 366712642
		
		// toString() : 문자열로 된 객체의 정보[toString()을 오버라이드하지 않을 경우, 주소값]를 반환
		// System.out.println(obj1); // 위 명령어는 obj1 뒤에 .toString()이 생략된 것이다.
		System.out.println(obj1.toString()); // java.lang.Object@2a139a55
		System.out.println(obj2.toString()); // java.lang.Object@2a139a55
		
		// System 클래스
        // getProperty() : 시스템 속성값 출력
		System.out.println(System.getProperties());
        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);
		
        String osName = System.getProperty("os.name");
        System.out.println(osName);
        
		// String 클래스
		// 비교 : ==, !=, equals()
        
        
        // 내부적으로 char 배열 상태!
		// charAt() : 지정 인덱스 위치 문자 반환(char)
		String str1 = "Java API";
		System.out.println(str1.charAt(0)); // 'J'
		System.out.println(str1.charAt(1)); // 'a'
		System.out.println(str1.charAt(4)); // ' '
//		System.out.println(str1.charAt(8)); // 에러 :  java.lang.StringIndexOutOfBoundsException
											// 문자열 길이 : 8 => 따라서, idx 범위 0 ~ 7
		// length() : 문자열의 길이 반환(int)
		System.out.println(str1.length()); // 8
		
		// 비교 : 
		// - 문자열의 길이 	: .length() ; method 이용
		// - 배열의 길이		: .length 	; 배열의 field값 이용
		
		// indexOf() : 찾고자 하는 문자의 위치를 반환(int)
		System.out.println(str1.indexOf("J")); // 0
		System.out.println(str1.indexOf("j")); // -1 : 찾지 못했을 때
		System.out.println(str1.indexOf("A")); // 5
		System.out.println(str1.indexOf("API")); // 문자열 전체 인식, 그러나 첫글자의 위치 반환 : 5
		System.out.println(str1.indexOf("Api")); // 										-1
		
		// substring() : 지정 위치에서 또 다른 지정위치까지 잘라낸 문자열 반환
		
		//.substring(int beginIdx) : beginIdx ~ 끝 idx까지에 해당하는 문자열
		System.out.println(str1.substring(0)); // Java API
		System.out.println(str1.substring(1)); // ava API
		
		//.substring(int beginInx, int endIdx) : beginIdx ~ (endIdx - 1) 까지에 해당하는 문자열
		System.out.println(str1.substring(0, 7)); // Java AP 
		System.out.println(str1.substring(0, 4)); // Java
		System.out.println(str1.substring(5, 8)); // API
		System.out.println(str1.substring(2, 4)); // va
		
		// toLowerCase() / toUpperCase()
		// : 알파벳 소문자 / 대문자로 변환한 문자열 반환
		System.out.println(str1.toLowerCase()); // java api
		System.out.println(str1.toUpperCase()); // JAVA API
		
		// replace() : 변경 대상 문자열을 지정 문자열로 변경한 결과를 반환
		// .replace(바꾸고자하는 타겟 문자[열], 변경 문자[열])
		System.out.println(str1.replace("Java", "자바")); // 자바 API
		System.out.println(str1.replace("java", "자바")); // 대소문자 가림 - java 못 찾음 -> Java API
		System.out.println(str1.replace('a', 'g')); // Jgvg API
		
		// trim() : 문자열 앞, 뒤 공백 제거한 문자열 반환
		String strTrim1 = "  Java API  ";
		System.out.println("-- before trim() --");
		System.out.println(strTrim1);			// "  Java API  "
		System.out.println(strTrim1.length());	// 12
		System.out.println("-- after trim() --"); 
		System.out.println(strTrim1.trim());			// "Java API"
		System.out.println(strTrim1.trim().length());	//8
		System.out.println("------------------");
		
		
		// split() : 특정 구분자를 기준으로 분리된 문자열 반환
		String strSplit1 = "Java API String Test";
		System.out.println(strSplit1);
		
		//.split(구분자) : 구분자로는 정규식 사용!
		System.out.println(strSplit1.split(" ")); // String[] 로 반환
		System.out.println(Arrays.toString(strSplit1.split(" "))); // [Java, API, String, Test]
		
		System.out.println(Arrays.toString(strSplit1.split(""))); // [J, a, v, a,  , A, P, I,  , S, t, r, i, n, g,  , T, e, s, t]
		
		/*
		 * 구분자로 정규식 사용한 경우
		 * 
		 * System.out.println(Arrays.toString("Java-/API/String--Test".split("[-/]"))); // Java-/API/String--Test => [Java, , API, String, , Test]
		 * Object[] arr = Arrays.stream("Java-/API/String--Test".split("[-/]")).filter(i -> i.length() != 0).toArray();
		 * System.out.println(Arrays.toString(arr)); 										// [Java, API, String, Test]
		 * System.out.println(Arrays.toString("Java-/API/String--Test".split("[-/]+")));	// [Java, API, String, Test]
		 * System.out.println(Arrays.toString("Java-/API/String--Test".split("[-/]{1,}")));	// [Java, API, String, Test]
		 * 
		 *  정규식 + : 한개 이상( {1, }와 동일 )
		 *  [-/]+ == [-/]{1,}
		 */
		
		//.split(구분자, 구분자로 잘라 만들 요소의 수) : 두번째 값이 무엇이냐에 따라 반환되는 String[]의 요소 개수가 다름 
		//.split(String regexp, int limit) : 구분자(regexp)로 (limit - 1)회 자름 : 즉 반환되는 요소 수 = limit
		System.out.println(Arrays.toString(strSplit1.split(" ", 3))); // String[] 로 반환 : ["Java", "API", "String Test"] 
		
		
		// String class의 static method
		// valueOf() : 기본타입 데이터 값을 문자열로 변경후 반환
		// String.valueOf(기본타입 데이터) => 반환 타입 : String
		int i = 1;
		System.out.println(i);  // 1 (int 타입)
		System.out.println(((Object)i).getClass().getSimpleName()); // Integer // primitive type인 경우 Object로 cast 한 후, 진행

		System.out.println(String.valueOf(i)); // "1" (String 타입)
		System.out.println(String.valueOf(i).getClass().getSimpleName()); // String
		
		// Wrapper 클래스 - 기본타입의 값을 갖는 객체 생성
		// : 기본타입의 첫 문자를 대문자
		Integer intgr1 = new Integer(1);
		System.out.println(intgr1.getClass());
		
		// 박싱, 언박싱
		// 박싱 : 기본타입을 Wrapper 클래스로 만들기
		Integer intgr2 = new Integer(2);
		System.out.println(intgr2.getClass()); // class java.lang.Integer
		
		// 언박싱 : Wrapper 클래스 타입을 기본 타입으로 만들기
		int intgr22 = intgr2.intValue();
		System.out.println(intgr22); // 기본 타입은 .getClass() 불가!
		
		Double d2 = new Double(2.0);
		double d22 = d2.doubleValue();
		System.out.println(d22);
		
		// 자동 박싱, 자동 언박싱
		Integer intgr3 = 3; // Wrapper 클래스 타입 변수에 기본타입 변수를 대입하면 자동 박싱
		System.out.println(intgr3.getClass()); // class java.lang.Integer
		
		int intgr33 = intgr3;
		System.out.println(intgr33/*.getClass()*/); // 기본 타입은 .getClass() 불가
		
		/* 중요 */
		// String.valueOf(기본타입) 			: 기본타입 -> String
		// Wrapper클래스.parse기본타입(문자열) 	: String -> 기본 타입
		
		// parse : 문자열을 기본타입으로 변환
		System.out.println(Integer.parseInt("3"));
//		System.out.println(Integer.parseInt("three")); //에러 : java.lang.NumberFormatException
		
		Double.parseDouble("3.14");
//		Double.parseDouble("pi");	//에러 : java.lang.NumberFormatException
		
		boolean bool = Boolean.parseBoolean("true");  // true  : 문자열 값이 대소문자 구분 없이 true/flase이면 가능
		System.out.println(bool);
		
		boolean bool1 = Boolean.parseBoolean("True");  // true
		System.out.println(bool1);
		
		boolean bool2 = Boolean.parseBoolean("TRue");  // true
		System.out.println(bool2);
		
		boolean bool3 = Boolean.parseBoolean("0");  // false
		System.out.println(bool3);
		
		// Math 클래스 : 수학적 계산을 위한 클래스
		// abs() : 절대값
		System.out.println(Math.abs(-3)); // 3 == |3| => 반환 타입 : int
		
		// ceil() : 올림값 / floor() : 내림값 / round() : 반올림값 
		System.out.println(Math.ceil(3.4)); // 4.0 => 반환 타입 : double
		System.out.println(Math.ceil(3.6)); // 4.0
		System.out.println(Math.floor(3.4)); // 3.0
		System.out.println(Math.floor(3.6)); // 3.0
		System.out.println(Math.round(3.4)); // 3 => 반환 타입 :	long
		System.out.println(Math.round(3.6)); // 4 => 			long
		
		// max() : 최대값 / min() : 최소값
		// 두 수 사이의 최대, 최소임!
		System.out.println(Math.max(3, 9));
		System.out.println(Math.min(-2.1, -2.5));
		
		// random() : 0.0 <= Math.random() < 1.0 난수
		// 0.0 ~ 1.0 미만 난수
		System.out.println(Math.random());
		
		// 0.0 ~ 1.0 * n 미만 난수
		// 이를 Math.ceil()하면 [1,2,...,n] 중 임의의 수를 생성 가능!
		int n = 4;
		double randomDouble = Math.random() * n;
		System.out.println(randomDouble); // 0.0~4.0 미만 난수
		System.out.println(Math.ceil(randomDouble)); // (1, 2,.., 4) 중 임의의 수
		
	}

}
