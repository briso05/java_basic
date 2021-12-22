package model;

public class Employee {
	private static long employeeSerial = 0L;
	
	// 멤버 변수
	private long employeeNum;	// 사원 번호
	private String name;		// 이름
	private int age;			// 나이
	private String branch;		// 소속 지점
	private String department;	// 소속 부서
	
	// 기본 생성자
	public Employee() {
		this.employeeNum = employeeSerial++;
		this.name = "홍길동";
		this.age = 25;
		this.branch = "서울북부";
		this.department = "인사";
	}
	
	// 사용자 임의 생성자
	public Employee(String name, int age, String branch, String department) {
		this.employeeNum = employeeSerial++;
		this.name = name;
		this.age = age;
		this.branch = branch;
		this.department = department;
	}
	
	
	// getXXX
	public long getEmployeeNum() {
		return employeeNum;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public String getDepartment() {
		return department;
	}
	
	// setXXX
	public void setEmployeeNum(long employeeNum) {
		this.employeeNum = employeeNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	// toString
	public String toString() {
		return employeeNum + ", " + name + ", " + age + ", " + branch + ", " + department;
	}
}
