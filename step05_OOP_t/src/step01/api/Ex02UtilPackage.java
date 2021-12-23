package step01.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02UtilPackage {
	public static void main(String[] args) {
		// Date 클래스
		Date date = new Date();  // 현재 시간 : 년 월 일 시 분 초 시간대
		System.out.println(date.toString());
		
		// SimpleDateFormat() : 특정 문자열 포맷으로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(date)); // 반환 타입 : String
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		// Calendar 클래스
		Calendar cal = Calendar.getInstance();
		System.out.print("년 : ");
		System.out.println(cal.get(Calendar.YEAR));		
		System.out.print("월 MONTH ** 0부터 시작!(+1 해줘야 함) : ");
		System.out.println(cal.get(Calendar.MONTH) + 1);		
		System.out.print("일 : ");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));		
		System.out.print("요일 [일 = 0 ~~ 토 = 7] : ");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		System.out.print("시 : ");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));		
		System.out.print("분 : ");
		System.out.println(cal.get(Calendar.MINUTE));		
		System.out.print("초 : ");
		System.out.println(cal.get(Calendar.SECOND));	
	}
}
