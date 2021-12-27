package step01;

// Info.class
class Info {
	static {
		System.out.println("Info 클래스");
	}
}

public class Ex02Exception {
	public static void main(String[] args) {
		/* API 개발자
		 * 고려사항 1 - 정상 실행 - 메모리에 로딩 완료
		 * 고려사항 2 - 비정상 실행 - 미존재 class -> 다양한 경우의 수 처리 유도 : 견고한 설계 바탕의 개발 가능
		 */
		
		// 예외 기본
		try {
			// NumberFormatException
			String str2 = "three";
			Integer.parseInt(str2);
		} catch (Exception e) {
//			e.printStackTrace(); // 배포시에는 해당 부분은 지운다!
			System.out.println("예외처리");
		}
		System.out.println("출력");
		
		try {
			Class c = Class.forName("step01.Info2");
			System.out.println(c.getTypeName());
		} catch (Error e) {
			System.err.println(e.getClass());
			System.out.println("해당 클래스를 찾지 못했습니다.");
		} catch (Exception e) {
			System.err.println(e.getClass());
		}
		//일반적으로 과거에 Classpath에서 Class를 로드하려 시도했지만 실패하였고, 
		//다시 해당 Class를 사용하려고 시도할 때 로드에 실패했던 전적이 있으니 로드를 시도하지도 않고 NoClassDefFoundError를 뱉는다.

		
		
		// catch문 순서
		try {
			// NumberFormatException
			String str2 = "three";
			Integer.parseInt(str2);
			
			// NullPointerException
			String str1 = null;
			System.out.println(str1.length());
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (Exception e) { // 발생하는 모든 Exception을 잡기 때문에 catch문 중 가장 마지막 catch 문에 사용해야 함
			System.out.println(e);
		}

		
		// multi-catch문
		// catch문 순서
		try {
			// NumberFormatException
			String str2 = "three";
			Integer.parseInt(str2);
			
			// NullPointerException
			String str1 = null;
			System.out.println(str1.length());
			
		} catch (NumberFormatException | NullPointerException e) { // 여러 예외를 한꺼번에 catch함 > 간결하게 작성할 수 있음!
			e.printStackTrace();
			System.out.println(e);
			System.out.println("모든 예외 처리 완료");
		} 
		
	}
}



















