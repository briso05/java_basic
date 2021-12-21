package model.domain;

/* 
 * 도메인 모델(Domain Model)
 * - 객체 지향 분석 설계 기반으로 구현하고자 하는 도메인(비즈니스 영역)의 모델을 생성하는 패턴
 * - 도메인에서의 객체 판별, 목록 작성, 객체간의 관계
 * - 속성과 기능 분리
 * - 단순 : 테이블 하나 = 하나의 도메인 객체
 * - 재사용성, 유지보수 용이, 확장성
 * - 모델 구축의 어려움
 */
//직접 데이터에 접근하지 않고 데이터를 수정하고, 얻기 위해 get/set 메서드 사용 -> 데이터 은닉화
//정보 은닉 : encapsulation
public class People {
	private String name; // private 으로 멤버 변수를 설정하면 동일 클래스에서만 접근 가능하기 때문에 
						 // 직접적으로 멤버변수에 접근불가능해진다.
						 // 멤버 변수에 직접 접근하여 수정할 수 있게 되면, 유효하지 않는 데이터를 검증할 수 없음 ( 코드 블럭을 통해 데이터 검증을 위해서도 set 메서드 필요)
	private int age;
	
	public People() {}
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getXXXX
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setXXXX
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		} else {
			System.out.println("나이값을 확인해주세요.");
		}
	}
}
