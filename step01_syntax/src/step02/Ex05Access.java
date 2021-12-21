package step02;

import model.domain.People;

/* 
 * Access modifier : 접근 제한자
 * - 범위
 * 		1. public : 동일 class, package, 외부 package
 * 		2. protected : 동일 class, package
 * 					단, 상속 관계시 외부 package의 class도 호출 가능
 * 		3. default : 동일 package
 * 		4. private : 동일 class
 * 
 * - 위치
 * 		1. 클래스 : public, default
 * 		2. 변수 : public, protected, default, private
 * 		3. 생성자 : public, protected, default, private
 * 		4. 메소드 : public, protected, default, private
 */

public class Ex05Access {

	public static void main(String[] args) {
		People ppl = new People("java", 25);
		System.out.println(ppl.getName());
		ppl.setName("Good");
		System.out.println(ppl.getName());
		
		System.out.println(ppl.getAge());
		ppl.setAge(26);
		System.out.println(ppl.getAge());
		ppl.setAge(-26);
		System.out.println(ppl.getAge());
		
	}
}
