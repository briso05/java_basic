package travel.plan.dto;

public class Train extends Transportation {
	private String trainType;
	private String lineName;

	public Train(int price, String trainType, String lineName) {
		super(price);
		this.trainType = trainType;
		this.lineName = lineName;
	}

	public String getTrainType() {
		return trainType;
	}

	public String getLineName() {
		return lineName;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	@Override
	public String toString() {
		return "[기차종류 : " + trainType + ", 노선명 : " + lineName + ", 비용 : " + price + "]";
	}

}
