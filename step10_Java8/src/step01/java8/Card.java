package step01.java8;

public enum Card {
	KAKAO(1244), HANA(3634), NH(2642);
	
	private int serialNum;
	
	Card(int serialNum) {
		this.serialNum = serialNum;
	}
	
	public int getSerialNum() {
		return this.serialNum;
	}
	
	// Enum 타입 : 데이터를 열거한 타입
	// 이 안에 들어간 데이터는 각각이 객체임
	// 각각의 데이터에 값을 바인딩할 수 있음!
}
