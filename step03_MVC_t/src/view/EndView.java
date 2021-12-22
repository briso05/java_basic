package view;

import model.domain.Student;

public class EndView {
	//모든 데이터 출력
	/* 고려사항1 : 객체가 없는 값이 출력되는 경우
	 */
	public static void printAll(Student[] allData){
//		for (Student student : allData) {
		for (int i = 0; i < allData.length; i++) {
			Student student = allData[i];
			if (student != null) {
//				System.out.println(student);
				System.out.println(i +", "+ student);
			}
		}
	}
	
	// 한명 출력
	public static void printOne(Student student){
		if(student != null) {
			System.out.println(student);
		} else {
			System.out.println("존재하지 않는 학생입니다.");
		}
	}
	
	public static void printSuccess(String msg) {
		System.out.println(msg);
	}

	public static void printFail(String msg) {
		System.out.println(msg);
	}
}
