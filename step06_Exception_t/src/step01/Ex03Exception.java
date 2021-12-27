package step01;

import exception.NotAdminException;

public class Ex03Exception {
	/* 관리자 계정 검증
	 *  - 고려사항
	 *  	- admin인 경우 : 정상 실행
	 *  	- admin이 아닐 경우 : 비정상 실행
	 *  					-> Exception 발생
	 *  						-> 사용자 정의 예외(Application Exception)
	 *  - 사용자 정의 예외 명명 : NotAdminException
	 * 
	 */
	
	public static void checkAdmin(String id) throws NotAdminException {
		if(id.equals("admin")) {
			System.out.println("관리자 계정으로 접속 실행");
		} else {
			throw new NotAdminException("관리자 계정으로 접속 실패");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAdmin("admin1");
		} catch (NotAdminException e) {
//			System.err.println(e);
			System.out.println(e.getMessage());
		}
		
	}
}

