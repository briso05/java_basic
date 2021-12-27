package step01;

class A{}
class B extends A{}
class C extends A{}


public class Ex01Exception {
	public static void main(String[] args) {
		// java.lang.NullPointerException
		String str1 = null;
		
//		str1.length();
		try {
			str1.length();
			
		} catch (NullPointerException e) {
			System.err.println("해당 문자열이 null입니다.");
		}
		
		// java.lang.NumberFormatException
		String str2 = "three";
		
//		Integer.parseInt(str2); // 여기서 에러가 나면 뒤 코드들은 실행 안됨
		try {
			Integer.parseInt(str2);
			
		} catch (NumberFormatException e) {
			System.err.println("해당 문자열은 숫자로 변환할 수 없습니다.");
		}
		
		// java.lang.ArrayIndexOutOfBoundsException
		int[] i1 = {1, 2, 3};
		System.out.println(i1[2]);
//		System.out.println(i1[3]);
		
		// java.lang.ArithmeticException
//		int i2 = 10/0; 
//		System.out.println(i2);
		
		// java.lang.ClassCastException
		A a = new B();
		B b = new B();
//		C c = (C) a; //에러! A타입의 B객체를 C타입으로 바꿀 수 없음!(B 객체는 C 클래스와 상관없는 클래스이기 때문)
		
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		
		System.out.println(b instanceof B);
//		System.out.println(b instanceof C); // 에러 java.lang.Error
		
		
	}

}
