package test;

import model.domain.Notebook;
import model.domain.NotebookFactory;

public class Test {
	public static void main(String[] args) {
		
		// NotebookFactory : singletone 객체
		NotebookFactory factory = NotebookFactory.getInstance();
		
		// NotebookFactory를 통한 Notebook 객체 생성(기본 생성자로 생성)
		Notebook nb1 = factory.createDefaultNotebook();
		
		// Notebook 정보 보기
		nb1.showNotebookInfo();
		
		// Notebook 정보 세팅
		nb1.setModel("Macbook Pro");
		nb1.setPrice(200);
		nb1.setWeight(2.13);
		
		// Notebook 정보 보기
		System.out.println(nb1.getModel());
		System.out.println(nb1.getPrice());
		System.out.println(nb1.getWeight());
		
		
		// NotebookFactory를 통한 Notebook 객체 생성(사용자 생성자로 생성)
		Notebook nb2 = factory.createCustomNotebook("LG gram", 160, 0.89);
		
		nb2.showNotebookInfo();
		
		nb2.setModel("Samsung Always 9");
		nb2.setPrice(134);
		nb2.setWeight(1.2);
		
		System.out.println(nb2.getModel());
		System.out.println(nb2.getPrice());
		System.out.println(nb2.getWeight());
		
		//
		Notebook nb3 = factory.createDefaultNotebook();
		nb3.showNotebookInfo();
		
		// 생성된 노트북 개수
		System.out.println(Notebook.countCreatedNotebook());
	}
}
