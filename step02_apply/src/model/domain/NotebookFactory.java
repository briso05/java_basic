package model.domain;

public class NotebookFactory {

	private static NotebookFactory factory = new NotebookFactory();
	
	private NotebookFactory() {}
	
	public static NotebookFactory getInstance() {
		return factory;
	}
	
	public Notebook createDefaultNotebook() {
		return new Notebook();
	}

	public Notebook createCustomNotebook(String model, int price, double weight) {
		return new Notebook(model, price, weight);
	}
	
}
