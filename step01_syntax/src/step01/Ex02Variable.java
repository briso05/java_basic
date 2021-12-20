package step01;

public class Ex02Variable {
	// 단일 주석 : 소스 코드에 대한 설명
	// 단일 주석으로 여러줄 하기 위해서는 해당 줄 선택후, ctrl + /
	/*
	 * 다중 주석
	 * 이것은 다중 주석입니다. 해당 부분을 선택한 후, ctrl + shift + /(슬래시) 해주면 된다
	 * 또는 /* 엔터 누르면 됨
	 */
	public static void main(String[] args) {
		
		/*
		 * 변수명
		 * - 시작은 문자, _, $
		 * - 소문자로 시작
		 * - 개발시, 의미있는 이름으로 변수를 만들 것
		 * - Camel case 명명법으로 변수명을 지어야 함 : ex) javaProgramming
		 * - 자바 예약어는 변수명으로 사용 불가
		 */
		
		//정수 관련 변수들
		
		//1. Byte(1 byte) : -128 ~ 127 사이의 정수
		byte vb = 127;
		System.out.println(vb);
		
		//2. Short(2 byte) : 
		short vs = 128;
		System.out.println(vs);
		
		//3. Int(4 byte)
		int vi = 1220;
		System.out.println(vi);
		
		//4. Long(8 byte)
		//java는 int를 기본 정수형으로 사용하기 때문임
		//뒤에 L을 안 붙이면 기본적으로 int로 인식함.
		//int 범위 내의 숫자는 L없이 작성하여도 에러가 없지만 
		//int 범위 외 정수의 경우 'L'으로 long타입이라고 반드시 명시해주어야 함		
		long vl = 10000000000L;
		System.out.println(vl);
		
		//**char(1 byte) : 문자 하나이지만, 해당 문자는 숫자로도 표현 가능(아스키 코드를 이용한 것)
		//아스키 코드 : 각각의 문자를 숫자에 대응하여 암호화한 것
		char vc = 'A';
		System.out.println(vc);
		
		char vc2 = 65;
		System.out.println(vc2);
		
		
		
		//실수 관련 변수들
		
		//1. double(8 byte) 
		double vd = 3.14;
		System.out.println(vd);
		
		//2. float(4 byte) 
		//Java는  기본 실수형으로 double을 사용함!
		//기본타입이 아니기 때문에, 뒤에 'F'라고 float형임을 명시해줘야 함
		//double보다 더 작은 범위의 실수를 포함하기 때문에, float의 경우 무조건 F 붙인다고 생각하자
		float vf = 3.14F;
		System.out.println(vf);
		
		
		
		//논리 관련 변수
		
		//boolean(1 byte) : true / false
		boolean vbool = true;
		System.out.println(vbool);

	
		//문자열 관련 변수
		
		//String -> 기본 타입이 아님, 참조 타입임
		String str = "문자열을 저장하는 데이터";
		System.out.println(str);
	}

}
