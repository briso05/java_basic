package step01;

import java.util.Arrays;

public class Ex06Reference {
/* 참조 타입
 * 	- 기본 타입처럼 실제 데이터가 값이 아닌 '객체의 주소'를 참조하는 타입
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
		/* 
		 * 배열(Array) : 데이터 값 여러가지를 한 개의 변수에 대입
		 * - 구조 : 타입 [] 변수명 = {};
		 * - 특징 : 길이(사용가능 데이터 값의 수)가 고정
		 * - 초기화(실제 데이터 값을 대입) 할 때, 선언된 배열의 변수 -> new 연산자 사용
		 * - 종류 : 1차원, 다차원 배열
		 */
		System.out.println("-- 배열 --");
		int[] scores = {90, 86, 100, 0, 45};
		int[] arr1; // 선언만 먼저 가능
		//arr1 = {1, 2, 3}; // ** 주의 ** 배열을 만들고 난 다음에 넣으려고 하니까 에러! (크기가 안 정해진 상태로 선언만 했기 때문)
		arr1 = new int[3];  //요소 3개로 크기 지정!
		//arr1 = {1, 2, 3}; // ** 주의 ** 에러! - {데이터, .. } 이 형식은 배열 선언하면서 같이 초기화할 때만 사용 가능!
		
		// 배열을 선언 및 사용하기 위한 방법!
		//1. 선언하면서 요소들을 전체 다 넣어주기(초기화)
		int[] a1 = {22, 35, 55};
		
		//2. 요소를 나중에 넣고 싶으면, 선언하고 크기 지정해주기
		int[] a2 = new int[3];
		
		// ** 특징 : index 번호는 0 부터 시작
		System.out.println(scores[0]); // scores 배열의 첫번째 요소(idx = 0)
		System.out.println(scores[3]); // scores 배열의 네번째 요소(idx = 3)
		
		// 원하는 자리(인덱스)에 원하는 요소 넣기
		// - 인덱스로 접근 후 , 대입
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		System.out.println(arr1[2]); //3
//		System.out.println(arr1[3]); //**에러 발생** 
									 //java.lang.ArrayIndexOutOfBoundsException : 
									 // 배열의 길이를 넘어서는 idx에 해당하는 idx로 접근시(마이너스 값 인덱스도 같은 에러)
		
		// ArrayIndexOutOfBoundsException 을 피하기 위해서는 배열의 크기를 알아야 해!
		System.out.println(arr1.length); // 배열의 크기(길이) = 데이터의 개수
		
		//이렇게 출력하면 배열 내의 요소를 확인할 수 없고, 배열의 주소값만 확인 가능
		System.out.println(arr1); // 예상 : [1,2,3] => 실제 : [I@6d06d69c (주소값)
								  // 참조 타입 : 주소값을 참조하는 타입 ! 이라는 것을 확인 가능
		
		System.out.println("-- 배열의 데이터 출력 --");
		// step01 
		for (int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		} 
		
		System.out.println("---");
		
		// step02
		for (int i = 0; i < arr1.length; i++) { // 범위 값을 직접 지정하는 것이 아니라 배열의 크기를 이용해 지정!
			System.out.println(arr1[i]);
		}
		
		//step03
		// for each 문을 이용한 배열 내 요소 확인
		for(int num : arr1) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		System.out.println("-- 실습 --");
		// String arr - 배열의 길이 / 일반 for문 이용한 출력
		String[] strs = {"apple", "banana", "carrot", "drum", "elephant"};
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i] + " ");
		}
		
		System.out.println();
		
		//double arr - 향상된 for문 이용한 출력
		double[] ds = {1.2, 3.6, 34.55, 22.623, 23.6632, 111.22, 3.142};
		for (double d : ds) {
			System.out.print(d + " ");
		}
		
		System.out.println();

		System.out.println("-- 'Arrays 클래스'를 이용한 배열의 데이터 출력 --");
		// 배열 내 정보를 확인하려면! java.util.Arrays api 이용하자!
		System.out.println(Arrays.toString(arr1)); // [1, 2, 3]
		
	}
}

