package view;

import model.Employee;

public class EndView {

	// 여러 사원 출력
	public static void printEmployees(Employee[] employees) {
		int count = 0;
		for (int i = 0; i < employees.length; i++) {
			Employee emp = employees[i];
			if(emp != null) {
				System.out.println(emp);
				count++;
			}
		}
		
		if(count <= 0) {
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
		} else {
			System.out.println("총 : "+count+" 명");
		}
	}
	
	// 사원 한 명 출력
	public static void printEmployee(Employee emp) {
		if(emp != null) {
			System.out.println(emp);
		} else {
			System.out.println("해당 사원이 존재하지 않습니다.");
		}
	}
	
	
	public static void printSuccess(String msg) {
		System.out.println(msg);
	}
	
	public static void printFail(String msg) {
		System.out.println(msg);
	}
}
