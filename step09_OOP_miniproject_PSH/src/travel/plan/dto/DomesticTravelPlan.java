package travel.plan.dto;

public class DomesticTravelPlan extends TravelPlan{

	public DomesticTravelPlan(String travelTitle, String travelId, String purpose, String arrival, String departure,
			Transportation transportation, Status status) {
		super(travelTitle, travelId, purpose, arrival, departure, transportation, status);
	}

	@Override
	public String toString() {
		return "국내여행계획 [제목 : " + travelTitle + ", Id : " + travelId + ", 목적 : " + purpose
			+ ", 출발 : " + departure + ", 도착 : " + arrival + ", 교통 : " + transportation
			+ ", 상태 : " + status +"]";
	}

}
