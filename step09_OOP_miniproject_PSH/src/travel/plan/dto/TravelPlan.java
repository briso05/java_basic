package travel.plan.dto;


/**
 * 
 * @author PSH 
 * @see travel.plan.dto.DomesticTravelPlan, travel.plan.dto.AbroadTravelPlan
 * @since 2021
 * 
 */
public class TravelPlan {
	
	protected String travelTitle;
	protected String travelId;
	protected String purpose;
	protected String arrival;
	protected String departure;
	protected Transportation transportation;
	protected Status status;
	
	public TravelPlan(String travelTitle, String travelId, String purpose, String arrival, String departure,
			Transportation transportation, Status status) {
		super();
		this.travelTitle = travelTitle;
		this.travelId = travelId;
		this.purpose = purpose;
		this.arrival = arrival;
		this.departure = departure;
		this.transportation = transportation;
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTravelTitle() {
		return travelTitle;
	}

	public String getTravelId() {
		return travelId;
	}

	public String getPurpose() {
		return purpose;
	}

	public String getArrival() {
		return arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public Transportation getTransportation() {
		return transportation;
	}

	public void setTravelTitle(String travelTitle) {
		this.travelTitle = travelTitle;
	}

	public void setTravelId(String travelId) {
		this.travelId = travelId;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public void setTransportation(Transportation transportation) {
		this.transportation = transportation;
	}


	@Override
	public String toString() {
		return "여행계획 [제목 : " + travelTitle + ", Id : " + travelId + ", 목적 : " + purpose
				+ ", 출발 : " + departure + ", 도착 : " + arrival + ", 교통 : " + transportation
				+ ", 상태 : " + status + "]";
	}
	

}
