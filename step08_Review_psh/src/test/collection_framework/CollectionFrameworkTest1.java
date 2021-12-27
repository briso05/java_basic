package test.collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionFrameworkTest1 {
	public static void main(String[] args) {
		ArrayList<Product> onCart = new ArrayList<Product>();
		onCart.add(new Product("바밤바", 600));
		onCart.add(new Product("메로나", 700));
		onCart.add(new Product("메로나", 700));
		onCart.add(new Product("월드콘", 1500));
		onCart.add(new Product("메로나", 700));
		onCart.add(new Product("메로나", 700));
		onCart.add(new Product("월드콘", 1500));
		onCart.add(new Product("부라보콘", 1400));
		onCart.add(new Product("투게더", 5600));
		onCart.add(new Product("조안나", 6000));
		onCart.add(new Product("조안나", 6000));
		
		/*
		 * 문제 1) 어떤 사람이 아이스크림 판매점에서 아이스크림을 장바구니에 담았다.
		 * 		장바구니에 담은 순서대로 onCart 변수명의 ArrayList에 담았다.
		 * 		이를 이용하여  Map을 만들어보고 출력해보자.
		 * 		Key		=> 아이스크림 제품(Product 타입)
		 * 		Value 	=> 해당 제품을 담은 개수(Integer 타입)
		 */
		
		// 1-1) Map 만들기
		HashMap<Product, Integer> receipt = new HashMap<Product, Integer>();
		
		// 1-2) 같은 제품명&가격을 가진 제품을 동일한 제품으로 취급하여 
		//      -> Product를 Key값에 세팅하기 위해서는 
		//		Product 클래스내에 일부 메소드를 오버라이드 해야 한다. 해당 메소드는 무엇인가?
		
		// 답 : equals(), hashCode()
		
		// 1-3) Map에 담기
		Iterator<Product> iter_p = onCart.iterator();
		
		while (iter_p.hasNext()) {
			Product p = iter_p.next();
			Integer count = receipt.get(p);
			if( count == null) {
				receipt.put(p, 1);
			} else {
				receipt.put(p, count+1);
			}
		}
		
		// 1-4) Map에 담은 것 출력하기 - KeySet이용
		Set<Product> productList = receipt.keySet();
		
		for(Product p : productList) {
			System.out.println(p+" : "+receipt.get(p));
		}
		
		
		
		
	}
}
