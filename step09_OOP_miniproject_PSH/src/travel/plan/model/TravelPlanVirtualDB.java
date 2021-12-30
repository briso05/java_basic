package travel.plan.model;

import java.util.ArrayList;

import travel.plan.dto.AbroadTravelPlan;
import travel.plan.dto.AirPlane;
import travel.plan.dto.Bus;
import travel.plan.dto.DomesticTravelPlan;
import travel.plan.dto.Status;
import travel.plan.dto.TravelPlan;

public class TravelPlanVirtualDB {
	private static TravelPlanVirtualDB instance = new TravelPlanVirtualDB();
	private ArrayList<TravelPlan> plans = new ArrayList<TravelPlan>();
	
	public TravelPlanVirtualDB() {
		plans.add(new DomesticTravelPlan("혼자 리프레쉬 여행", "DTP01", "휴식", "서울", "담양", new Bus(40000, "호남선 고속", "호남35"), Status.YET));
		plans.add(new AbroadTravelPlan("개발팀 연수", "ATP01", "출장", "서울(ICN)", "미국 샌프란시스코(SFO)", new AirPlane(804000, "델타항공", "DL081"), Status.DONE, "발급완료"));
	}
	
	public static TravelPlanVirtualDB getInstance() {
		return instance;
	}
	
	public ArrayList<TravelPlan> getAllPlansList() {
		return plans;
	}
	
	public void insertPlan(TravelPlan newPlan) {
		plans.add(newPlan);
	}
	
	public void removePlan(TravelPlan deletingPlan) {
		plans.remove(deletingPlan);
	}
	
}
