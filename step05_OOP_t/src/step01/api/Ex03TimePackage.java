package step01.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex03TimePackage {
	public static void main(String[] args) {
		// LocalDate 클래스 : 로컬 날짜
		LocalDate currDate = LocalDate.now(); // 현재 날짜(년월일 시분초 시간대)
		System.out.println(currDate);
		System.out.println(currDate.getYear() + ": 년"); 
		System.out.println(currDate.getMonth() + ": 월(영어단어)");
		System.out.println(currDate.getMonthValue()+ ": 월");
		System.out.println(currDate.getDayOfWeek()+ ": 요일(영어단어)");
		System.out.println(currDate.getDayOfYear()+ ": 일년 중 몇번째 요일");
		System.out.println(currDate.getDayOfMonth()+ ": 일");
		System.out.println(currDate.isLeapYear()+ ": 윤년 여부");
		
		System.out.println();
		
		// LocalTime 클래스 : 로컬 시간
		LocalTime currTime = LocalTime.now(); // 현재 시간(시분초.밀리초)
		System.out.println(currTime);
		System.out.println(currTime.getHour());
		System.out.println(currTime.getMinute());
		System.out.println(currTime.getSecond());
		
		System.out.println();
		
		// LocalDateTime 클래스 : 로컬 날짜, 시간
		// plus, minus - 년(Year), 월(Month), 주(Week), 일(Day)
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(ldt1 + ": 현재");
		System.out.println(ldt1.plusYears(1));
		System.out.println(ldt1.minusDays(1));
		
		// with() : 사용자 정의 변경 - 년(Year), 월(Month), 일(DayofMonth, DayOfYear), 시(Hour), 분(Minute),초(Second)
		LocalDateTime ldt2 = LocalDateTime.now();
		System.out.println(ldt2 + ": 현재");
		System.out.println(ldt2.withYear(2023));
		
		// 초기화 후 변경
		LocalDateTime ldt3 = null;
		System.out.println(ldt3); 
		
		ldt3 = ldt2.withYear(2022).withMonth(2).withDayOfMonth(22).withHour(14).withMinute(22).withSecond(2);
		System.out.println(ldt3);
		
		System.out.println();
		
		// ZonedDateTime 클래스 : 특정 zone의 날짜, 시간
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDateTime);
		
	}
}
