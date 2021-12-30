package step01.java8;

public enum CityLoc {
	JONGROGU(110,1111), JUNGGU(140, 1112);
	
	private int siGunGuCode;
	private int instituteCode;
	
	CityLoc(int siGunGuCode, int instituteCode) {
		this.siGunGuCode = siGunGuCode;
		this.instituteCode = instituteCode;
	}
	
	public int getSiGunGuCode() {
		return this.siGunGuCode;
	}
	
	public int getInstituteCode() {
		return this.instituteCode;
	}
}
