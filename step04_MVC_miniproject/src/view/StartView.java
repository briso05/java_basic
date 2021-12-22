package view;

import controller.EmployeeController;

public class StartView {
	public static void main(String[] args) {
		
		System.out.println("-- 모든 사원 검색 --");
		EmployeeController.request(1);
		
		System.out.println();
		
		System.out.println("-- 사원 등록 --");
		EmployeeController.request(6);
		
		
		System.out.println("-- 사원 등록 후 사원 검색 --");
		EmployeeController.request(1);
		
		System.out.println();
		

		
		System.out.println("-- 사원 삭제 --");
		EmployeeController.request(7);
		
		
		System.out.println("-- 사원 삭제 후 사원 검색 --");
		EmployeeController.request(1);
		
		System.out.println();
		
		
		System.out.println("-- 사원 나이 수정 --");
		EmployeeController.request(8);
		System.out.println("-- 사원 지점 수정 --");
		EmployeeController.request(9);
		System.out.println("-- 사원 부서 수정 --");
		EmployeeController.request(10);
		
		System.out.println();
		
		System.out.println("-- 사원 수정 후 사원 검색 --");
		EmployeeController.request(1);
		
		System.out.println();
		
		
		System.out.println("-- 사원번호로 사원 검색 (0명 또는 1명) --");
		EmployeeController.request(2);

		System.out.println();
		
		System.out.println("-- 이름으로 사원 검색 (0명 이상)--");
		EmployeeController.request(3);

		System.out.println();
		
		System.out.println("-- 지점으로 사원 검색 (0명 이상)--");
		EmployeeController.request(4);
		
		System.out.println();
		
		System.out.println("-- 부서로 사원 검색 (0명 이상)--");
		EmployeeController.request(5);
		
		
	}
}
