package stpe05.inferfaceex;

public interface Ex02Interface {
	// 자기 자신 만의 객체를 만들 수 없음

	// 상수
	/* public static final */ int AGE = 30; 
		// 해당 변수는 public static final이 생략되어 있음
		// 상수 취급됨 
	
	// 추상메소드
	/* public abstract */ void print();
		// 인터페이스 내 메소드는 명시하디 않아도  모든 메소드는 추상 메소드
		// 구현부 {} 삭제해줘야 함
		// public abstract 생략되어 있는 것!
}
// 인터페이스에서 정의되는 멤버 변수 : public static final
// 인터페이스에서 정의되는 메소드 : public abstract