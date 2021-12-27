package stpe05.inferfaceex;

public class AI18Printer extends Printer implements Connector, Printable {
	// 자바
	// 상속은 단일 상속만 지원
	
	// 인터페이스를 사용할 경우, 다중 상속이 가능하다
	
	// 클래스를 상속받으면, 이미 구현된 메소드도 있을 수 있기 때문에 직접 부모 클래스에 가서 기능을 확인해야 함
	// 그러나 인터페이스를 상속받으면, 모두가 구현되어 있지 않기 때문에  구현이 강제됨=> 해당 기능을 인터페이스를 가서 확인하지 않아도 확인
	// 인터페이스를 기능별로 나눠서 생성하는 이유는?
	// 만약 각각 종류의 프린터에 원하는 기능이 다 다르다고 할 때
	// 프린터라는 상위 클래스에 모든 기능을 넣으면,,, 
	// 어떤 기능을 어떤 종류의 프린터는 지원하지 않는다고 할 때 -> 지원하지 않는 기능임에도 들어가 있음
	// 그러나 기능들을 인터페이스로 나눠놓으면 
	// 해당 기능을 다른 종류의 프린터에 지원하지 않는다고 하면 해당 인터페이스만 implement 안하면 됨
	
	// abstract의 경우, 상속 받은 하위 클래스에서 재정의를 강제한다!
	
	@Override
	public void selectDoc() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void printDoc() {
		System.out.println("AI18 프린터를 통해 문서를 출력합니다.");
	}
	
	@Override
	public void cancelPrintingDoc() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void connectComputer() {
		System.out.println("AI18 프린터가 연결되었습니다.");
	}
	
	
	public static void main(String[] args) {
		AI18Printer ai18Printer = new AI18Printer();
		ai18Printer.connectComputer();
		
//		Printable print = new Printable();
		// 인터페이스 자체의 객체 생성 불가 : Interface 내에 미완성된 메소드가 있기 때문에
		
		Printable print2 = new AI18Printer();
		// 인터페이스 타입의 객체는 생성 가능
		// 이때 new 하는 객체는 해당 interface를 implements 해야함
	}
}
