package step03;

public class Log4j {
	
	//private 멤버 변수
	private static Log4j instance = new Log4j();
	
	//private 생성자
	private Log4j() {}
	
	//
	public static Log4j getInstance() {
		return instance;
	}
	
	//info()
	public String info() {
		return "알림 : 관리자 접근";
	}
	
	//warn()
	public String warn() {
		return "경고 : 접근 불가";
	}
	
}
