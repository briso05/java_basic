package step02;

/* 클래스와 객체
 * - 데이터 값을 저장 및 제공
 * 
 * - 설계
 * 1. 데이터 : name, age
 * 2. 기능 : name, age 반환 / 단순 출력
 * 
 * - 개발
 *  1. 데이터 저장에 필요한 메모리
 *  2. 기능 구별, 수행을 위한 코드작성
 *  	* 객체 생성
 *  
 * - 클래스를 개발하는 것이 객체를 만드는 것은 아니다
 */
public class Ex02People {
	// 멤버 변수
	String name = "java";
	int age = 25;
	double height = 163.2;
	
	// 생성자를 아예 만들지 않으면, 기본 생성자는 자동 생성되지만
	// 사용자 정의 생성자가 있다면, 기본 생성자가 생성되지 않는다.
	
	// 기본생성자
	public Ex02People() {}
	
	// 사용자 정의 생성자
	public Ex02People(String name, int age) { // 객체 자기 자신을 뜻하는 this
		this.name = name; // 객체 내 name 속성(this.name)에 외부에서 넣어준 매개값 name을 저장
		if ( age > 0 ) {
			this.age = age;
		} else {
			System.out.println("나이값을 확인해주세요.");
		}
	}
	
	// 메소드
	// getName()
	public String getName() {
		return name;
	}
	
	// getAge()
	public int getAge() {
		return age;
	}
	
	// getHeight()
	public double getHeight() {
		return height;
	}
	
	//void 타입메소드 : 리턴값이 없음
	public void print() {
		System.out.println("일반 출력 void 메소드");
	}
	
	public void showInfo() {
		System.out.println(name + ", " + age + ", " + height);
	}
	
	// setName()
	public void setName(String name) {
		this.name = name;
	}
	
	// setAge()
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		} else {
			System.out.println("나이값을 확인해주세요.");
		}
	}
	
	public static void main(String[] args) {
		Ex02People ppl1 = new Ex02People();
		System.out.println(ppl1.name); // java
		System.out.println(ppl1.age);  // 25
		
		Ex02People ppl2 = new Ex02People();
		ppl2.name = "java2";
		System.out.println(ppl2.name);
		
		Ex02People ppl3 = new Ex02People("java3", 33);
		System.out.println(ppl3.name);
		System.out.println(ppl3.age);

		Ex02People ppl4 = new Ex02People("java4", -25); // 나이 < 0 일때, '나이값을 확인해주세요' 메시지 출력
		System.out.println(ppl4.age);  // 25 // 이때, 나이는 기본값으로 세팅됨
		
		//setXXXX() : set 메소드
		Ex02People ppl5 = new Ex02People("java5", 24);
		System.out.println(ppl5.age); // 이렇게 데이터 직접 접근은 매우 안좋은 방법!
		ppl5.setAge(35);
		System.out.println(ppl5.getAge());
		
		// 실습 1 : setName() -> java55
		System.out.println(ppl5.getName());
		ppl5.setName("java55");
		System.out.println(ppl5.getName());
		
		// 실습 2 : 나이에 -값이 들어갔을 경우에는 "나이값을 확인해주세요"라는 문자열이 출력되도록 setAge()메소드를 고치기
		System.out.println(ppl5.getAge());
		ppl5.setAge(-50);
		System.out.println(ppl5.getAge());
		ppl5.setAge(36);
		System.out.println(ppl5.getAge());
	}
}
