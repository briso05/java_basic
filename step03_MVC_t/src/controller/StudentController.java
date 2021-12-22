/* 컨트롤러(Controller)
 * - (Start)Veiw에서 요청 -> 요청 처리 결과 반환 -> (End)View 전달
 * - 요청값 - 수행 기능
 * 		1 - 모든 검색
 * 		2 - 개인 검색
 * 		3 - 저장
 * 		4 - 삭제
 * 		5 - 수정
 */

package controller;

import model.StudentModel;
import model.domain.Student;
import view.EndView;

public class StudentController {
	public static void request(int reqNumber) {
		if(reqNumber == 1) {
			// 모든 검색 : Read, select ~
			EndView.printAll(StudentModel.getAll());	
		
		}else if(reqNumber == 2) {
			// 개인 검색 
			EndView.printOne(StudentModel.getOne("Python"));
		
		}else if(reqNumber == 3) {
			// 저장 : Create, insert ~
			boolean r = StudentModel.insert(new Student("Go", 11));
			if(r) { 
				EndView.printSuccess("등록 성공");
			}else {
				EndView.printFail("등록 실패");
			}
		
		}else if(reqNumber == 4) {
			// 삭제 : Delete, delete ~
			boolean r = StudentModel.delete("C++");
			if(r) { 
				EndView.printSuccess("삭제 성공");
			}else {
				EndView.printFail("삭제 실패");
			}
		
		}else if(reqNumber == 5) {
			// 수정 : Update, update ~
			EndView.printOne(StudentModel.updateAge("Java"));
		
		}else {
			EndView.printFail("요청하신 정보는 서비스 할 수 없습니다");
		}
	}
}


















