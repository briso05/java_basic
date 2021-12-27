package step01.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02HashSetTest {
	public static void main(String[] args) {
		// HashSet
		HashSet<String> set1 = new HashSet<String>();
		
		// add() : set에 객체를 넣는다.
		set1.add("Set");
		set1.add("Collection");
		set1.add("List");
		System.out.println(set1);

		set1.add("Set");
		set1.add("List");
		set1.add("Map");
		System.out.println(set1);
		
		// size() : 저장 객체 수
		System.out.println(set1.size());
		
		// 출력
		for(String str : set1) {
			System.out.println(str);
		}

		set1.forEach(str -> System.out.println(str));
		
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str + " " + str.length());
		}

		System.out.println();
		
		
		// 확인
		
		// isEmpty() : 해당 set이 비어있으면 true
		System.out.println(set1.isEmpty()); 			// false

		// contains() : 해당 객체가 set 내에 존재하면 true
		System.out.println(set1.contains("Set")); 		// true
		System.out.println(set1.contains("HashSet")); 	// false
	}
}
