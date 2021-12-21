package step02;

// 객체 생성 프로세스
public class Ex03Object {

	public static void main(String[] args) {
		/* B 객체 생성
		 * - B 객체의 생성시점?!
		 */
		
		A a = new A();
		C c = new C();
		B b = new B(); // ** 중요 ** A가 먼저 생성된 다음, B 생성자를 통해 생성
					   // 클래스 내 멤버 변수가 먼저 메모리에 올라가고... 이후 생성자를 호출하여 해당 변수들을 사용하여 객체를 생성한다.
	}
}

class A {
	A(){
		System.out.println("클래스 A 생성");
	}
	
}

class B {
	A a = new A();
	B(){
		System.out.println("클래스 B 생성");
	}
	
}

class C {
	C(){
		System.out.println("클래스 C 생성");
	}
	
}
