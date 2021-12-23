/* 값 비교
 * 	1. 참조
 * 		- == : 주소값 비교
 * 		- equals() : 객체 보유 내용 값 비교
 * 				- 타입이 동일한 경우 다른 객체라도 데이터 값이 동일한지 비교
 * 
 *  2. 기본 타입
 *  	- ==
 * 
 * 	3. String의 equals()
 * 		- Object 클래스의 주소값 equals() 재정의 -> 서로 다른 객체라도 데이터 값만을 비교
 * 
 *  4. java.lang.Object의 equals()
 *  	- public boolean equals(Object o){
 *  	  		객체의 주소값을 비교
 *        }
 */
/* equals() 재정의 개발
 * 1. 매개변수로 들어온 Object 타입의 객체 -> Person타입으로 형변환이 가능한지 검증
 * 2. 동일 타입인 경우 - instanceof
 * 3. 멤버 변수들값 비교 - 참조타입 equals() / 기본타입 ==, 상속받지 않은 멤버변수 호출 시 반드시 형변화가 필수
 * 4. 검증 후 멤버 변수들이 갖고있는 데이터가 동일할 경우 true를 반환
 * 	  하나라도 다르다면? false
 */
package step04.override;

class Person1 extends Object{
	String name;
	int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object o) {
		// 조건을 주어 비교댜상인지 아닌지를 판별해야 함! 어떤 조건으로 줘야 할까?
		// 1. 입력값으로 들어온 Object o 가 Person1일 때에 비교를 하기로 했다!
		// 2. 입력값으로 들어온 Object o의 이름과 나이가 기준 객체와 모두 같다면?! false -> true로 반환하기로 했다!
		if( o instanceof Person1 ) {
			Person1 p = (Person1) o;
			if(name.equals(p.name) && age == p.age ) {
				return true;
			}
		} else {
			System.out.println("Person1 타입으로 형변환 불가하기 때문에 false 반환");
		}
		return false;
	}
}

class Person2 extends Object{
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class EqualsOverride {
	public static void main(String[] args) {
		Person1 p1 = new Person1("Java", 25);
		Person1 p2 = new Person1("Java", 25);
		Person2 p3 = new Person2("Java", 25);
		
		// 주소값
		System.out.println(p1.hashCode()); // 705927765
		System.out.println(p2.hashCode()); // 366712642
		System.out.println(p3.hashCode()); // 1829164700
		
		// equals()
		System.out.println(p1.equals(p2)); // false => true
		System.out.println(p1.equals(p3)); // false 
	}

}
