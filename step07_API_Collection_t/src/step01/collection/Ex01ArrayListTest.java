package step01.collection;

import java.util.ArrayList;
import java.util.Iterator;

import model.domain.Student;

public class Ex01ArrayListTest {
	public static void main(String[] args) {
		// ArrayList
		ArrayList arr1 = new ArrayList();
		
		// add() : ArrayList에 맨 뒤 index에 객체를 저장하는 메소드
		arr1.add("ArrayList");
		arr1.add(3);
		arr1.add(new Student("java", 1, "junior"));
		arr1.add(3);
		System.out.println(arr1);
		
		// get(int idx) : 인덱스 번호를 이용하여 값을 가져올 수 있는 메소드 
		System.out.println(arr1.get(0));
		
		// size() : ArrayList가 갖고 있는 데이터의 수
		System.out.println(arr1.size());
		
		// remove() : 삭제하고자 하는 대상을 지정(인덱스 번호로 지정 혹은 객체 자체를 지정)하여 해당 데이터 삭제
		arr1.remove(0);
		System.out.println(arr1);
		arr1.remove(Integer.valueOf(3)); // 해당 값을 가진 객체들 중 첫번째 객체 삭제
		System.out.println(arr1);
//		arr1.remove(0);
//		System.out.println(arr1);
		
		System.out.println("---arr1 출력---");
		
		// arr1 출력
		Iterator it = arr1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getClass().getSimpleName());
		}
		
		for ( int i = 0; i < arr1.size(); i++ ) {
			System.out.println(arr1.get(i));
		}
		
		System.out.println("------------------------------------------");
		
		
		// 제네릭(Generic)
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("ArrayList2");
//		arr2.add(2); // 제네릭 타입에 String을 선언했기 때문에 String 타입만 매개변수로 넘길 수 있다.
		for (int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i).length());
		}
		
		
//		ArrayList<int> arr3 = new ArrayList<int>(); // 제네릭 타입에는 참조형 타입만 들어갈 수 있기 때문에,
													// 기본 타입을 ArrayList를 만들고 싶을 때는 wrapper 클래스를 이용해야 한다
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
//		arr3.add(Integer.valueOf(3)); // 자동으로 autoboxing이 되기 때문에 이렇게 사용 안하고  
		arr3.add(3); 				  // 이것 처럼 기본타입으로 써도 된다.
		
		System.out.println(arr3);
		System.out.println(arr3.get(0).getClass()); // 기본타입으로 반환되는 것이 아니라 참조타입으로 반환된다. 이것의 타입은 Integer type!
	}
}
