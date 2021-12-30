package step01.lombok;

import model.domain.Student;

public class MavenTest {
	public static void main(String[] args) {
		Student st = new Student("java", 56);
		System.out.println(st.getName());
		System.out.println(st.getAge());
	}
}
