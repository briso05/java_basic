package model.domain;

import model.Employee;

public class EmployeeModel {

	// 가상의 DB역할
	private static Employee[] allData = new Employee[20];
	private static int index = 7;
	
	// 가상의 데이터 저장
	static {
		allData[0] = new Employee("김길동", 30, "서울중앙", "인사");
		allData[1] = new Employee("이순신", 37, "서울북부", "총무");
		allData[2] = new Employee("강감찬", 27, "대전", "비서");
		allData[3] = new Employee("박철수", 25, "서울남부", "고객관리");
		allData[4] = new Employee("김영희", 25, "서울남부", "인사");
		allData[5] = new Employee("홍길동", 37, "서울북부", "고객관리");
		allData[6] = new Employee("박철수", 40, "대전", "인사");
	}
	
	// 모든 사원 검색
	public static Employee[] getAll() {
		return allData;
	}
	
	// 사원 한 명 검색 (사원 번호)
	public static Employee getOne(long employeeNum) {
		for (int i = 0; i < allData.length; i++) {
			Employee tmp = allData[i];
			if(tmp != null && tmp.getEmployeeNum() == employeeNum) {
				return tmp;
			}
		}
		return null;
	}
	
	// 사원 검색
	// 1. 이름으로 검색
	public static Employee[] getSomeByName(String name) {
		return getSome("name", name);
	}

	// 2. 지점으로 검색
	public static Employee[] getSomeByBranch(String branch) {
		return getSome("branch", branch);
	}
	
	// 3. 부서로 검색
	public static Employee[] getSomeByDepartment(String department) {
		return getSome("department", department);
	}
	
	
	// K, V로 검색
	private static Employee[] getSome(String key, String value) {
		System.out.println("찾으시는 데이터:"+value);
		Employee[] employees = new Employee[20];
		
		int count = 0;
		for (int i = 0; i < allData.length; i++) {
			Employee tmp = allData[i];
			String searchValue = null;

			if(tmp != null) {
				if(key.equals("name")) {
					searchValue = tmp.getName();
				} else if (key.equals("branch")){
					searchValue = tmp.getBranch();
				} else if (key.equals("department")){
					searchValue = tmp.getDepartment();
				}
				
				if(searchValue == value) {
					employees[count++] = tmp;
				}
			}
		}
		return employees;
	}
	
	// 사원 등록
	public static boolean insert(Employee emp) {
		if (index < allData.length) {
			allData[index] = emp;
			index++;
			return true;
		} else {
			System.out.println("이미 DB가 꽉 찼습니다.[최대 20명]");
			return false;
		}
	}
	
	// 사원 수정
	// 1. 나이 수정
	public static Employee updateAge(long empNum, int age) {
		for (int i = 0; i < allData.length; i++) {
			if (allData[i] != null && allData[i].getEmployeeNum() == empNum) {
				if(age <= 0) {
					System.out.println("유효한 나이값을 입력해주세요.");
					return allData[i];
				}
				allData[i].setAge(age);
				return allData[i];
			}
		}
		return null;
	}
	
	// 2. 지점 수정
	public static Employee updateBranch(long empNum, String branch) {
		for (int i = 0; i < allData.length; i++) {
			if (allData[i] != null && allData[i].getEmployeeNum() == empNum) {
				allData[i].setBranch(branch);
				return allData[i];
			}
		}
		return null;
	}
	// 3. 부서 수정
	public static Employee updateDepartment(long empNum, String department) {
		for (int i = 0; i < allData.length; i++) {
			if (allData[i] != null && allData[i].getEmployeeNum() == empNum) {
				allData[i].setDepartment(department);
				return allData[i];
			}
		}
		return null;
	}
	
	// 사원 삭제
	public static boolean delete(long empNum) {
		Employee emp = null;
		for(int i = 0; i < allData.length; i++) {
			emp = allData[i];
			if (emp != null && emp.getEmployeeNum() == empNum) {
				allData[i] = null;
				
				// 중간 요소를 삭제하게 되면, 뒤 요소들을 앞으로 한칸씩 이동시켜줌
				moveElementForward(allData, i, allData.length-1);
				index--;
				return true;
			}
		}
		System.out.println("존재하지 않는 사원입니다.");
		return false;
	}
	
	// (startIdx + 1)의 요소 ~ (endIdx)의 요소를 한칸씩 앞으로 이동
	private static Employee[] moveElementForward(Employee[] originalData, int startIdx, int endIdx) {
		for (int i = startIdx; i < endIdx; i++) {
			originalData[i] = originalData[i+1];
//			System.out.println("요소 이동 진행 ("+(i+1)+"->"+i+")");
			
			if(originalData[i+1] == null) {
				break;
			}
		}
		originalData[endIdx] = null;
		return originalData;
	}
	
}
