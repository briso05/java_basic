package step02;

/* 
 * Static(정적)
 * - '고정'이라는 의미보다는 객체의 소속이 아닌 클래스의 소속
 * - 객체의 생성 없이도 사용할 수 있는 변수 혹은 메소드
 * - static의 종류
 * 		- static 변수
 * 		- static 메소드
 * - 공통적으로 사용하는 변수 혹은 메소드에 적용 가능하다!
 */
// 객체의 소속이 아닌 클래스의 소속이다
// 메모리상에서 이미 일정 영역을 차지하고 있음!
public class Ex04Static {
	//멤버 변수
	String name;
	static String companyName; // static 변수에 대한 선언만 되어 있음
	 							// 이는 static 블럭에서 초기화해주어야 함
	
	// static 키워드를 사용한 변수는 클래스가 메모리에 올라갈 때 자동 생성됨. 즉, 인스턴스(객체) 생성 없이 바로 사용가능
	// 클래스 메모리 영역에 클래스 변수들이 올라가면 static 변수는 프로그램이 종료될 때까지 내려가지 않는다.
	// 일반 멤버 변수의 경우, 객체가 자신의 기능을 수행하고 메모리에서 내려가게 되면 클래스 영역에서도 해당 멤버 변수도 클래스 메모리 영역에서 내려감
	// 메모리 영역에서 의미 없는 객체는 garbage collector가 수거함
	 
	// static 초기화 블럭 : 이곳 안에서는 static 변수만 초기화 가능함
	// 이렇게 쓰는 이유는 static 만큼은 static 블럭 내에서 명확하게 초기화하기 위해
	static {
		 companyName = "playdata";
		 
//		 name = ""; // non-static 변수의 경우, 그냥 쓸 수 없고 객체 생성 후에야만 사용가능
//		 Ex04Static ppl = new Ex04Static(); // 이렇게 쓸 수 있지만, 굳이 이렇게 쓰지 않는다
//		 ppl.name = "";
		 
	}
	 
	//기본 생성자
	Ex04Static() {}
	 
	//사용자 정의 생성자
	Ex04Static(String name) {
		this.name = name;
	}
	 
	//메소드
	void showName() {
		System.out.println(name);
	}
	
	static void showCompanyName() {
		System.out.println(companyName);
	}
	 
	public static void main(String[] args) { // static 인 것 밑에 non-static 인 것이 오기 위해서는 객체 생성이 필요함
		Ex04Static ppl1 = new Ex04Static("java");
		System.out.println(ppl1.name);
		System.out.println(companyName); //static 멤버 변수는 객체 소속이 아니라 클래스 소속이기 때문에 클래스만 있어도 사용가능
		
		ppl1.showName(); // non-static method이기 때문에, 객체가 필요
		showCompanyName(); // static method(객체 소속 아님)이기 때문에, 객체 생성이 필요 없음
	}
}
