package travel.plan.dto;

public class AirPlane extends Transportation {
	private String airline;
	private String flightNum;

	public AirPlane(int price, String airline, String flightNum) {
		super(price);
		this.airline = airline;
		this.flightNum = flightNum;
	}

	public String getAirline() {
		return airline;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	@Override
	public String toString() {
		return "[항공사 : " + airline + ", 항공편명 : " + flightNum + ", 비용 : " + price + "]";
	}

}
