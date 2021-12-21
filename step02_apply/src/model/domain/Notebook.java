package model.domain;

public class Notebook {
	// 노트북 생성된 개수
	private static int count = 0;
	
	private int serialNum;  // 시리얼 넘버
	private String model = "Macbook Air"; // 모델명
	private int price = 123; // 가격
	private double weight = 1.7; // 노트북 무게
	
	// 기본 생성자
	protected Notebook() {
		this.serialNum = count++;
	}
	
	// 사용자 임의 생성자
	protected Notebook(String model, int price, double weight) {
		this.serialNum = count++;
		this.model = model;
		this.price = price;
		this.weight = weight;
	}
	
	// setXXX
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(int price) {
		if(price > 0) {
			this.price = price;
		} else {
			System.out.println("유효하지 않은 값입니다. 0 이상의 값으로 세팅해주세요.");
		}
	}
	
	public void setWeight(double weight) {
		if(weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("유효하지 않은 값입니다. 0 이상의 값으로 세팅해주세요.");
		}
	}
	
	// getXXX
	public String getModel() {
		return model;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getWeight() {
		return weight;
	}
	
	// Notebook 정보 보여주기
	public void showNotebookInfo() {
		System.out.println("Notebook [ serialNum = "+serialNum+", model = "+model+", price = "+price+", weight = "+weight+ " ]");
	}
	
	public static int countCreatedNotebook() {
		return count;
	}

}
