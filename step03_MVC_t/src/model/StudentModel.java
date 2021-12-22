package model;

import model.domain.Student;

public class StudentModel {
	
	// 가상의 DB역할
	private static Student[] allData = new Student[5];
	private static int index; //DB에 총 몇 개의 data가 들어가 있는지
	
	// 가상의 데이터 저장
	// byte code가 로딩될때 자동으로 실행되는 특화된 코드
	static {
		allData[0] = new Student("Java", 25);
		allData[1] = new Student("Python", 29);
		allData[2] = new Student("C++", 37);
		index = 3;
	}
	
	// 모든 학생들 검색
	public static Student[] getAll(){
		return allData;
	}

	// 한사람 정보만 검색
	public static Student getOne(String name) {
		for (int i = 0; i < allData.length; i++) {
			if(allData[i] != null && allData[i].getName().equals(name)) {
				return allData[i];
			}			
		}
		return null;
	}
	
	// 가입메소드
	/* Student 객체가 배열에 저장
	 * 개발
	 *  고려사항 1 : 매개변수 값으로 name, age -> Student 객체 생성 -> 배열에 저장
	 *  고려사항 2 : 매개변수 값으로 Student 객체 -> 배열에 저장 
	 */
	public static boolean insert(String name, int age){
		// 이미 DB 수용 범위 (allData.length) 보다 클 경우
		if (index >= allData.length) {
			System.out.println("이미 DB가 꽉 찼습니다.");
			return false;
		} else {
			if (name.trim().length() > 0 && age > 0) {
				allData[index++] = new Student(name, age);
				return true;
			} else {
				System.out.println("유효한 입력값을 넣어주세요.(이름: 공백제외 1자 이상, 나이: 1세 이상)");
				return false;
			}
		}
	}
	
	public static boolean insert(Student v){
		if (index < allData.length) {
			allData[index] = v;
			index++;
			return true;
		} else {
			System.out.println("이미 DB가 꽉 찼습니다.");
			return false;
		}
	}
	
	// 삭제메소드
	/* 개발
	 * - 고려사항 1. 미존재 데이터 삭제 요청
	 * - 고려사항 2. 존재 데이터 삭제 요청
	 * - 삭제의 의미 : 배열의 값 삭제(null로 바뀐다)
	 * - 만약
	 * 		1. 마지막 index의 데이터 삭제
	 * 		2. 중간 index 데이터값 삭제
	 *       	- 모든 사람 정보 검색시 삭제 영역의 데이터 출력
	 *       	- 고려사항
	 *       		1. 실행시 없는 객체의 내용값 출력시 실행 에러 발생 가능성
	 *       		2. 검증 필수
	 *       
	 * - 이름으로 삭제 요청 : 이름 존재 여부 확인 후 삭제
	 * 		- 확인 방법	
	 * 		1. 반복문을 통한 값 비교
	 * 		2. 반환된 이름값과 매개변수값과 비교
	 * 		3. 만약 
	 * 			- 동일
	 * 				삭제 후 true return
	 * 				반복 종료
	 * 			- 미동일
	 * 				없는 경우엔 false return  
	 */
	public static boolean delete(String name) {
		Student v = null;
		for(int i = 0; i < allData.length; i++) {
			v = allData[i];
			if (v != null && v.getName().equals(name)) {
				allData[i] = null;
				
				// 중간 요소를 삭제하게 되면, 뒤 요소들을 앞으로 한칸씩 이동시켜줌
				moveElementForward(allData, i, allData.length-1);
				index--;
				return true;
			}
		}
		System.out.println("존재하지 않는 학생입니다.");
		return false;
	}
	
	// (startIdx + 1)의 요소 ~ (endIdx)의 요소를 한칸씩 앞으로 이동
	private static Student[] moveElementForward(Student[] originalData, int startIdx, int endIdx) {
		for (int i = startIdx; i < endIdx; i++) {
			originalData[i] = originalData[i+1];
			System.out.println("요소 이동 진행 ("+(i+1)+"->"+i+")");
			
			if(originalData[i+1] == null) {
				break;
			}
		}
		originalData[endIdx] = null;
		return originalData;
	}
	
	// 수정 : 검색하고자 하는 학생의 이름이 있다면 -> 한살 추가
	public static Student updateAge(String name){
		for (int i = 0; i < allData.length; i++) {
			if (allData[i] != null && allData[i].getName().equals(name)) {
				allData[i].setAge(allData[i].getAge() + 1);
				return allData[i];
			}
		}
		return null;
	}
}
