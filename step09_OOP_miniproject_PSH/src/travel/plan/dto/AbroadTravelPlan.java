package travel.plan.dto;

public class AbroadTravelPlan extends TravelPlan {
	private String visa;

	public AbroadTravelPlan(String travelTitle, String travelId, String purpose, String arrival, String departure,
			Transportation transportation, Status status, String visa) {
		super(travelTitle, travelId, purpose, arrival, departure, transportation, status);
		this.visa = visa;
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

	@Override
	public String toString() {
		return "해외여행계획 [제목 : " + travelTitle + ", Id : " + travelId + ", 목적 : " + purpose + ", 출발 : " + departure
				+ ", 도착 : " + arrival + ", 교통 : " + transportation + ", 비자 : " + visa + ", 상태 : " + status + "]";
	}

}
