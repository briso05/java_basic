package travel.plan.view;

import java.util.ArrayList;

import travel.plan.dto.TravelPlan;

public class EndView {
	
	// 계획 리스트 출력
	public static <T extends TravelPlan> void viewTravelPlanList(ArrayList<T> allTravelPlan) {
		System.out.println("Total : "+allTravelPlan.size());
		int i = 1;
		for (T t : allTravelPlan) {
			System.out.println((i++)+". "+t);
		}
	}
	
	// 단일 계획 출력
	public static <T extends TravelPlan> void viewTravelPlan(T travelPlan) {
		System.out.println(travelPlan);
	}
	
	// 예외가 아닌 단순 메세지 출력
	public static void viewMessage(String message) {
		System.out.println("[INFO] "+message);
	}
}
