package travel.plan.dto;

public class Ship extends Transportation {
	private String vesselAgent;
	private String vesselName;

	public Ship(int price, String vesselAgent, String vesselName) {
		super(price);
		this.vesselAgent = vesselAgent;
		this.vesselName = vesselName;
	}

	public String getVesselAgent() {
		return vesselAgent;
	}

	public String getVesselName() {
		return vesselName;
	}

	public void setVesselAgent(String vesselAgent) {
		this.vesselAgent = vesselAgent;
	}

	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	@Override
	public String toString() {
		return "[선박사 : " + vesselAgent + ", 선박명 : " + vesselName + ", 비용 : " + price + "]";
	}

}
