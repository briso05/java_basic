package step03;

public class Check {
	
	static Log4j logger = Log4j.getInstance();
	
	// loginSuccess
	public static void loginSuccess() {
		System.out.println(logger.info());
	}
	
	// loginFail
	public static void loginFail() {
		System.out.println(logger.warn());
	}
}
