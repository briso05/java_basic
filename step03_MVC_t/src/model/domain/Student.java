package model.domain;

// dto
public class Student { 
	private String name;
	private int age;
	
	public Student() {}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}else {
			System.out.println("입력한 나이는 유효하지 않습니다");
		}
	}
	// toString() : 학생 객체 출력시 주소값 대신 모든 정보 출력
	public String toString() {
		return name + " " + age;
	}
}
