package stpe05.inferfaceex;

abstract class A {
	
	abstract void help();// 메서드가 선언만 되어 있고, 구현되어 있지 않을때 => 해당 메서드 abstract 선언
						 // 클래스 입장에서, 추상메소드가 존재한다면 class 도 완전하게 구현된 클래스가 아니기 때문에 calss도 abstract 선언
	// 추상 클래스는 상속하고 메소드 오버라이드하는데는 전혀 문제가 없음
	// 또한 해당 객체를 생성할 수 있음, 그러나 기존의 형태대로는 객체를 생성할 수 없다.!( 미완성된 메소드를 오버라이드하는 익명클래스를 선언해주어야 함 )
	
//	abstract void good() {} // 아무 내용이 없더라도 {} 블럭이 있다면 구현된 것!
							// 추상메서드로 정의하기 위해서는 {}블록 자체가 없어야 함
}

class B extends A {
	@Override
	void help() {
		System.out.println("B : help 메소드");
	}
}

class C extends A {
	@Override
	void help() {
		System.out.println("C : help 메소드");
	}
}

// class에 final로 선언하게 되면 더이상 해당 클래스는 상속할 수 없게 됨.
// 대표적인 예 String 클래스
public class Ex01Abstract {
	int age = 30;
	final String name = "playdata";
	final double PI = 3.14; // 고정된 상수 값의 경우 사용가능
							// 변수명을 모두 대문자로 작성해주어야 함
							// 변수명이 여러 단어로 연결되어 있는 경우, 각 단어를 언더바(_)로 구분해줘야 함
	final int MAX_NUMBER = 99;
	
	final void print() {    // 해당 메소드는 상속받은 클래스에서 오버라이드 불가
		System.out.println("출력");
	}
	
	
	public static void main(String[] args) {
		// Final
		Ex01Abstract ex01 = new Ex01Abstract();
		ex01.age = 31;
		System.out.println(ex01.name);
//		ex01.name = "java";
		// final을 선언하면 해당 값에 접근할 수 있으나
		// 해당 변수의 값을 변경할 수 없다.
		
		// Abstract
//		A a = new A();  // 기존의 향태대로는 객체를 생성할 수 없다!
		A a = new A() { // 내부 익명 클래스를 이용하여 추상클래스를 재정의해줘야 함
			@Override
			void help() {}
		};
		
	}
}


class Child extends Ex01Abstract {
//	void print() {} //에러 : Cannot override the final method from Ex01Abstract
}	