package step02.oop;

class Parent3 {
	String name;
}

public class Child3 extends Parent3 {
	String nickName;

	// 최상위 클래스 Object에 정의된 메소드 Override
	// Override시 부모 메소드의 반환타입, 메소드명, 매개변수 동일해야함 + 접근제한자는 부모 메소드보다 접근 범위와 같거나 넓어야 함.
	@Override 						// 이 어노테이션은 해당 메소드는 부모 메소드를 재정의(Override)한 메소드임을 명시하는 것!
	public String toString() {
		return name + " " + nickName;
	}

	public static void main(String[] args) {
		Child3 ch3 = new Child3();
		ch3.nickName = "고운님";
		ch3.name = "AI18기";

		System.out.println(ch3); // toString() 오버라이드 전 : step02.oop.Child3@2a139a55 => 오버라이드 후 : AI18기 고운님
		System.out.println(ch3.toString());

	}

}
