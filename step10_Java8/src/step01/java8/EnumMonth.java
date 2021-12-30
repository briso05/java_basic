package step01.java8;

public enum EnumMonth {
	JANUARY(1), FEBUARY(2), MARCH(3);
	
	private int monthNum;
	
	EnumMonth(int monthNum) {
		this.monthNum = monthNum;
	}
	
	public int getMonthNum() {
		return this.monthNum;
	}
	
}
/*
 * public enum EnumMonth {
 * 		JANUARY, FEBUARY
 * }
 *
 * public class EnumMonth {
 * 
 * 		public String name;
 * 		public EnumMonth (String name) {
 *	 		this.name = name;
 *  	}
 * }
 */