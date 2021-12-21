package step02;

import model.domain.People;

public class Ex06Practice {
	// Source 1
	// 매개변수로 들어오는 값을 비교하여 같을 경우(admin) true를 반환하는 메소드 개발 - 메소드명 : checkAdmin / 반환값 :
	// boolean / static
	// 개발 후 실행결과 확인
	static boolean checkAdmin(String id) {
		if(id.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// Source 2
	static People[] peopleArray() {
		People s1 = new People("Java", 25);
		People s2 = new People("Python", 29);
		People[] v = {s1, s2};
		return v;
	}

	// printPeopleName 메소드 개발
	/*
	 * printPeopleName(People[] v){} - 배열 내부의 모든 사람 이름 출력 - name 변수는 직접적인 접근 불가 :
	 * private - getName() 호출 가능 : public - for문 활용하여 출력 - 호출만으로 이름 출력할 것
	 */
	
	static void printPeopleName(People[] v){
		for (People ppl : v) {
			System.out.println(ppl.getName());
		}
	}
	
	public static void main(String[] args) {
		// 함수 호출
//		checkAdmin("admin");
		System.out.println(checkAdmin("admin"));

		// printPeopleName 메소드 결과 확인
		People[] v = peopleArray();
		printPeopleName(v);
	}

}