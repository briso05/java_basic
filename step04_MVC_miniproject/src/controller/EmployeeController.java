package controller;

import model.Employee;
import model.domain.EmployeeModel;
import view.EndView;

public class EmployeeController {
	
	public static void request(int reqNum) {
		if( reqNum == 1 ) {
			// 모든 사원 검색
			EndView.printEmployees(EmployeeModel.getAll());
			
		} else if ( reqNum == 2 ) {
			// 사원번호로 사원 한명 검색
			EndView.printEmployee(EmployeeModel.getOne(3));
			
		} else if ( reqNum == 3 ) {
			// 이름으로 사원 검색(0명 이상)
			EndView.printEmployees(EmployeeModel.getSomeByName("박철수"));

		} else if ( reqNum == 4 ) {
			// 지점으로 사원 검색(0명 이상)
			EndView.printEmployees(EmployeeModel.getSomeByBranch("서울중앙"));

		} else if ( reqNum == 5 ) {
			// 부서로 사원 검색(0명 이상)
			EndView.printEmployees(EmployeeModel.getSomeByDepartment("인사"));

		} else if ( reqNum == 6 ) {
			// 사원 등록
			boolean r = EmployeeModel.insert(new Employee("홍길동", 25, "서울중앙", "총무"));
			if(r) { 
				EndView.printSuccess("등록 성공");
			}else {
				EndView.printFail("등록 실패");
			}
			
		} else if ( reqNum == 7 ) {
			// 사원 삭제 ( 사원 번호로 )
			boolean r = EmployeeModel.delete(2);
			if(r) { 
				EndView.printSuccess("삭제 성공");
			}else {
				EndView.printFail("삭제 실패");
			}
		} else if ( reqNum == 8 ) {
			// 사원번호로 사원 한명의 나이 수정
			EndView.printEmployee(EmployeeModel.updateAge(4, 29));
			
		} else if ( reqNum == 9 ) {
			// 사원번호로 사원 한명의 지점 수정
			EndView.printEmployee(EmployeeModel.updateBranch(4, "대전"));
			
		} else if ( reqNum == 10 ) {
			// 사원번호로 사원 한명의 부서 수정
			EndView.printEmployee(EmployeeModel.updateDepartment(4, "고객관리"));
			
		} else {
			EndView.printFail("요청하신 정보는 서비스 할 수 없습니다");
		}
	}
}
