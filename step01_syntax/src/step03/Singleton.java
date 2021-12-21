package step03;

//- 하나의 객체를 이용하여 내부적인 메소드 혹은 정보를 사용하는 패턴
//- 메모리를 효율적으로 사용하기 위해
public class Singleton {
	// private 멤버 변수
	private static Singleton instance = new Singleton();
	
	// private 생성자
	private Singleton() {}
	
	// getInstance() : 외부에서 호출이 가능하도록 지정
	public static Singleton getInstance() {
		if( instance == null ) {
			instance = new Singleton();
		}
		return instance;
	}

}
