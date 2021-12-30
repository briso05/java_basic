package step01.java8;

public enum Answer {
	YES(1, true), NO(0, false);
	
	private int num;
	private boolean isTrue;
	
	Answer(int num, boolean isTrue) {
		this.num = num;
		this.isTrue = isTrue;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public boolean getIsTrue() {
		return this.isTrue;
	}
}
