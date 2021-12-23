package step02.oop;

/*
 * 모든 클래스의 최상위 조상 클래스는 Object!
 */
class Parent /*extends Object*/{ // Object 클래스를 상속받고 있음, 해당 extends 구문은 생략되어있음!
	String name;
	int age;
	
	Parent() {
		System.out.println("부모 생성자");
	}
	
	void printAll() {
		System.out.println("부모 메소드");
		System.out.println(name);
		System.out.println(age);
	}
}

public class Child extends Parent { //extends 뒤에는 하나의 Class 만 올 수 있음!! (즉, 다중 상속 안됨 / 이를 지원하기 위해 인터페이스 고안됨)
	
	String bucket;
	
	Child() {
//		super(); // 이것이 생략되어 있는 것과 동일!
		System.out.println("자식 생성자");
	}
	
	
	// override 안 했을 때, 해당 메소드 내 이 문장이 있는 것과 같음
//	void printAll() {
//		super.printAll(); 
//	}
	
	// 부모 메소드 Override
	// 메소드 오버라이딩 : 부모의 메소드를 그대로 사용(호출)하는데 메소드 내 로직(기능)은 자식의 로직을 따름!
	@Override 
	void printAll() {
//		super.printAll(); // 있으면, 부모 메소드 내 로직 실행된 다음, override된 자식 메소드 내 로직도 실행!
		System.out.println("override 된 자식 메소드");
		System.out.println(bucket);
	}
	
	public static void main(String[] args) {
		
		// 1. 일반 상속
		Child c = new Child(); // 자식 생성자 호출 전 부모 생성자 호출!
								// 부모 생성자 호출 -> 자식 생성자 호출
		c.name = "Java";
		c.age = 25;
		c.bucket = "여행";
		
		c.printAll();  // override 안 한 경우, 부모 메소드 호출
						// 			    한 경우, 자식 메소드 호출
		
		// 2. 다형성
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		// 2-1. 자동 타입 변형 : 자식타입 -> 부모타입
		// *** 부모타입으로는 자식객체를 만들 수 있다.
		Parent p2 = new Child();
		/*
		 * 윗 라인 상세 과정
		 * 
		 * Child ch1 = new Child();
		 * Parent p2 = ch1;
		 */
		
		
		// *** 그러나, 자식타입으로는 부모객체를 만들 수는 없다!
//		Child c2 = new Parent(); 			// 에러!
//		Child c2 = (Child) new Parent(); 	// 에러! 이렇게 해도 java.lang.ClassCastException
		
		
		// 2-2. 강제 타입 변형 : 부모타입 -> 자식 타입
		Parent p3 = new Child();	// 부모 타입이지만, 자식 객체(new 된 것)!
		Child c3 = (Child) p3;		// 자식 타입으로 강제 타입 변경하기 위해서는 
									// 객체 생성시 자식 객체로 생성되어야 함 ( 생성된 객체의 원래 타입으로 돌아갈 때에만 가능 )
		
		/*
		 * 비교
		 * 
		 * Parent p3 = new Parent(); 	// 부모 타입 , 부모 객체!
		 * Child c3 = (Child) p3; 		// 에러! 
		 * 						  		// 객체 생성시 부모 객체로 생성! => 자식 객체로 강제 타입 변형 불가!
		 */
		
		p3.age = 21; // 부모 타입의 자식 객체 => 부모 타입에 해당하는 필드, 메소드만 사용 가능
						// => 자식의 것(bucket 필드는 접근 불가)
		p3.printAll(); 	// 부모의 메소드를 사용하지만,
						// 오버라이드된 메소드가 존재할 경우, 해당 메소드(자식 것) 사용!
		
		c3.age = 20;			// 자식 타입의 자식 객체(부모타입에서 강제 형변환) => 부모의 것 + 자식의 것 모두 사용 가능
		c3.bucket = "버킷";
		c3.printAll(); 			// 오버라이드된 메소드(자식 것) 사용!
		
		// 다시한번 확인해보기!
		p3.name = "Java p3";
		p3.age = 27;
		p3.printAll();
//		p3.bucket = "접근 불가능";  // 접근 불가능 이유는? p3 는 현재 부모타입이기 때문!

		c3.name = "Java c3";
		c3.age = 29;
		c3.printAll();
		c3.bucket = "접근 가능";  // 접근 가능 이유는? c3 는 현재 자식타입이기 때문!
	}
}
