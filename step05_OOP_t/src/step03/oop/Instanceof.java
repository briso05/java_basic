/* 객체의 타입 확인(instanceof)
 * 	- 다형성으로 인한 타입과 객체 혼란 야기 가능
 * 	- 문법 : 객체 instanceof 타입
 *          왼편 객체가 오른쪽 타입으로 형변환 가능한지 -> 가능 : 참 / 불가능 : 거짓
 * 	- 결과 : boolean (true or false)
 */
package step03.oop;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}

public class Instanceof {
	public static void main(String[] args) {
		A a1 = new A();	// A 타입 A 객체
		A a2 = new B(); // A 타입 B 객체
		A a3 = new C(); // A 타입 C 객체
		A a4 = new D(); // A 타입 D 객체
		
		
		System.out.println(a1 instanceof A); // true
		System.out.println(a1 instanceof B); // false
		System.out.println(a1 instanceof C); // false
		System.out.println(a1 instanceof D); // false
		
		System.out.println();
		
		System.out.println(a2 instanceof A); // true
		System.out.println(a2 instanceof B); // true
		System.out.println(a2 instanceof C); // false
		System.out.println(a2 instanceof D); // false
		
		System.out.println();
		
		System.out.println(a3 instanceof A); // true
		System.out.println(a3 instanceof B); // false
		System.out.println(a3 instanceof C); // true
		
		System.out.println();

		System.out.println(a4 instanceof A); // true
		System.out.println(a4 instanceof B); // true
		System.out.println(a4 instanceof C); // false
		System.out.println(a4 instanceof D); // true
		
		System.out.println();

		B b1 = new B();
		B b2 = new D();
		
		System.out.println(b1 instanceof A); // true
		System.out.println(b1 instanceof B); // true
//		System.out.println(b1 instanceof C); // 에러 ! 아예 판단할 수 없도록! (B 입장에서 C와 연관 없음)
		System.out.println(b1 instanceof D); // false
		
		System.out.println();
		
		System.out.println(b2 instanceof A); // true
		System.out.println(b2 instanceof B); // true
		System.out.println(b2 instanceof D); // true
	}

}