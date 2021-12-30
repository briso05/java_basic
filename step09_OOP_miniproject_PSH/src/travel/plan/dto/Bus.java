package travel.plan.dto;

public class Bus extends Transportation {
	private String busType;
	private String busNum;

	public Bus(int price, String busType, String busNum) {
		super(price);
		this.busType = busType;
		this.busNum = busNum;
	}

	public String getBusType() {
		return busType;
	}

	public String getBusNum() {
		return busNum;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public void setBusNum(String busNum) {
		this.busNum = busNum;
	}

	@Override
	public String toString() {
		return "[버스종류 : " + busType + ", 번호 : " + busNum + ", 비용 : " + price + "]";
	}

}
