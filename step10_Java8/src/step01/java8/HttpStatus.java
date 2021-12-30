package step01.java8;

public enum HttpStatus {
	// 이렇게 쓸 경우, 맨 뒤에 ;이 필요하다.!
	// Color Enum 과 비교해보자!
	OK(200), BAD(400), NOT_FOUND(404);

	private int num;
	
	// 생성자를 이용해서 enum 값에 값을 바인딩할 수 있음
	HttpStatus(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return this.num;
	}
	
}
