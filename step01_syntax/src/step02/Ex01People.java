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
public class Ex01People {
	// 멤버 변수
	String name = "java";
	int age = 25;
	double height = 163.2;
	
	// 기본생성자
	public Ex01People() {}
	
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
	
	public static void main(String[] args) {
		Ex01People ppl1 = new Ex01People();
		System.out.println(ppl1.name); // java
		System.out.println(ppl1.age);  // 25
		System.out.println(ppl1.height); 
		
		System.out.println(ppl1.getName()); // java
		System.out.println(ppl1.getAge());  // 25
		System.out.println(ppl1.getHeight()); // 163.2
		
		//void 메소드 호출
		ppl1.print(); 
		ppl1.showInfo();
		
	}
}
