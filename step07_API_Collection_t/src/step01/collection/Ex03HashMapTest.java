package step01.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import model.domain.Student;

public class Ex03HashMapTest {
	public static void main(String[] args) {
		// HashMap<K, V>
		HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
		
		// put() : 저장
		hmap1.put("a", 1);
		hmap1.put("b", 2);
		hmap1.put("c", 3);
		hmap1.put("d", 4);
		
		System.out.println(hmap1);
		
		// get() : key로 value 반환
		System.out.println(hmap1.get("c")); // 없는 데이터를 가져오려고 할 때에, null을 반환한다.
		
		
		// remove() : 해당 key와 value 삭제
		hmap1.remove("b");
		System.out.println(hmap1);
		System.out.println(hmap1.get("b"));
		
		// HashMap<String, Student>

		HashMap<String, Student> hmap2 = new HashMap<String, Student>();
		hmap2.put("k1",new Student("java", 1, "junior"));
		hmap2.put("k2",new Student("python", 2, "senior"));
		
		System.out.println(hmap2);
		
		// Student 객체 접근 가능
		hmap2.get("k1").setName("JavaScript");
		hmap2.get("k1").setGrade("freshman");
		System.out.println(hmap2);
		
		// HashMap<String, ArrayList>
		HashMap<String, ArrayList<Student>> hmap3 = new HashMap<String, ArrayList<Student>>();
		hmap3.put("1반", new ArrayList<Student>());
		System.out.println(hmap3);
		
		hmap3.get("1반").add(new Student("C", 3, "junior"));
		hmap3.get("1반").add(new Student("Ruby", 4, "Senior"));
		System.out.println(hmap3);

		
		// HashMap<String, HashMap>
		HashMap<String, HashMap<String, Integer>> hmap4 = new HashMap<String, HashMap<String,Integer>>();
		hmap4.put("대문자", new HashMap<String, Integer>());
		hmap4.put("소문자", new HashMap<String, Integer>());
		hmap4.put("특수문자", new HashMap<String, Integer>());
		System.out.println(hmap4);

		hmap4.get("대문자").put("A", (int) 'A');
		hmap4.get("대문자").put("B", (int) 'B');
		System.out.println(hmap4);
		
		hmap4.get("소문자").put("a", 97);
		hmap4.get("소문자").put("z", (int) 'z');
		hmap4.get("소문자").put("o", (int) 'o');
		System.out.println(hmap4);
		
		hmap4.get("특수문자").put("*", (int) '*');
		hmap4.get("특수문자").put("%", (int) '%');
		System.out.println(hmap4);
		

		
		HashMap<String, ArrayList<String>> hmap5 = new HashMap<String, ArrayList<String>>();
		ArrayList<String> arr3 = new ArrayList<String>();
		
		hmap5.put("k3", arr3);
		arr3.add("a");
		arr3.add("b");
		arr3.add("c");
		arr3.add("d");

		HashMap<String, HashMap> hmap6 = new HashMap<String, HashMap>();
		hmap6.put("k4", hmap5);
		
		// (hmap6 객체를 이용해서) b 출력하기
		System.out.println("(hmap6 객체를 이용해서) b 출력하기");
		System.out.println(((ArrayList<String>) hmap6.get("k4").get("k3")).get(1));
		
		// key값을 모를때?! 전체 출력하기
		// keySet()
		System.out.println("---keySet()---");
		Set<String> keySet = hmap1.keySet();
		System.out.println("hmap1의 keySet: " + keySet);
		System.out.println("hmap1의 values: " + hmap1.values());
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			
			String key= iter.next();
			if(key.equals("d")) {
				int value = hmap1.get(key);
				System.out.println("key="+key+", value="+value);
			}
			
		}
		
	}
}



























