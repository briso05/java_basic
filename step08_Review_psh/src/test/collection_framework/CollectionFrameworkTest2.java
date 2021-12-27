package test.collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CollectionFrameworkTest2 {
	public static void main(String[] args) {
		ArrayList<Product> bar = new ArrayList<Product>();
		bar.add(new Product("바밤바", 600));
		bar.add(new Product("메로나", 700));

		ArrayList<Product> cone = new ArrayList<Product>();
		cone.add(new Product("월드콘", 1500));
		cone.add(new Product("부라보콘", 1400));
		
		ArrayList<Product> cup = new ArrayList<Product>();
		cup.add(new Product("투게더", 5600));
		cup.add(new Product("조안나", 6000));
		
		HashMap<String, ArrayList> iceCream = new HashMap<String, ArrayList>();
		iceCream.put("바류", bar);
		iceCream.put("콘류", cone);
		iceCream.put("컵류", cup);
		
		/*
		 * 문제 2) 변수명 iceCream인 HashMap을 이용하여 바류에 "수박바", 500원 인 아이스크림을 추가하고, 출력해보자
		 */
		System.out.println("수박바 추가 전");
		Set<String> keySet1 = iceCream.keySet();
		for(String key : keySet1) {
			System.out.println(iceCream.get(key));
		}
		
		// 정답 >>
		((ArrayList<Product>) iceCream.get("바류")).add(new Product("수박바", 500));
		
		System.out.println("수박바 추가 후");
		Set<String> keySet2 = iceCream.keySet();
		for(String key : keySet2) {
			System.out.println(iceCream.get(key));
		}
		
		System.out.println("-------------------------------------------------------");
		
		HashMap<String, HashMap> product = new HashMap<String, HashMap>();
		product.put("아이스크림", iceCream);
		
		/*
		 * 문제 3) 변수명 product인 HashMap을 이용하여 "월드콘"의 가격을 출력해보자.
		 */
		
		int price = ((ArrayList<Product>) product.get("아이스크림").get("콘류")).get(0).getPrice();
		System.out.println(price);
		
	}
}
