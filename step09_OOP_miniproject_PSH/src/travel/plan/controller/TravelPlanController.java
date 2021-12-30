package travel.plan.controller;

import java.util.ArrayList;

import travel.plan.dto.AbroadTravelPlan;
import travel.plan.dto.DomesticTravelPlan;
import travel.plan.dto.Status;
import travel.plan.dto.TravelPlan;
import travel.plan.exception.NotExistException;
import travel.plan.service.TravelPlanService;
import travel.plan.view.EndView;
import travel.plan.view.FailView;

public class TravelPlanController {
	private static TravelPlanController instance = new TravelPlanController();
	private TravelPlanService service = TravelPlanService.getInstance();
	
	private TravelPlanController() {}
	
	public static TravelPlanController getInstance() {
		return instance;
	}
	
	
	// 모든 계획 검색
	public void viewAllTravelPlanList() {
		ArrayList<TravelPlan> planList = service.getAllPlans();
		EndView.viewTravelPlanList(planList);
	}
	
	// 모든 국내 계획 검색
	public void viewAllDomesticTravelPlanList() {
		ArrayList<DomesticTravelPlan> planList = service.getAllDomesticPlans();
		EndView.viewTravelPlanList(planList);
	}
	
	// 모든 국내 계획 검색
	public void viewAllAbroadTravelPlanList() {
		ArrayList<AbroadTravelPlan> planList = service.getAllAbroadPlans();
		EndView.viewTravelPlanList(planList);
	}
	
	// 여행상태 진행전(YET)인 계획 검색
	public void viewStatusYetPlanList() {
		ArrayList<TravelPlan> planList;
		try {
			planList = service.getPlansByStatus(Status.YET);
			EndView.viewMessage("검색을 완료했습니다.");
			EndView.viewTravelPlanList(planList);
		} catch (NotExistException e) {
			FailView.viewFailMessage(e.getMessage());
		} catch (Exception e) {
			FailView.viewFailMessage(e.getMessage());
		}
	}
	
	// 여행상태 여행중(ING)인 계획 검색
	public void viewStatusIngPlanList() {
		ArrayList<TravelPlan> planList;
		try {
			planList = service.getPlansByStatus(Status.ING);
			EndView.viewMessage("검색을 완료했습니다.");
			EndView.viewTravelPlanList(planList);
		} catch (NotExistException e) {
			FailView.viewFailMessage(e.getMessage());
		} catch (Exception e) {
			FailView.viewFailMessage(e.getMessage());
		}
	}
	
	// 여행상태 완료(DONE)인 계획 검색
	public void viewStatusDonePlanList() {
		ArrayList<TravelPlan> planList;
		try {
			planList = service.getPlansByStatus(Status.DONE);
			EndView.viewMessage("검색을 완료했습니다.");
			EndView.viewTravelPlanList(planList);
		} catch (NotExistException e) {
			FailView.viewFailMessage(e.getMessage());
		} catch (Exception e) {
			FailView.viewFailMessage(e.getMessage());
		}
	}
	
	// 특정 여행계획 검색_
	public void viewTravelPlan(String travelId) {
		TravelPlan plan;
		try {
			plan = service.getPlan(travelId);
			EndView.viewMessage("검색을 완료했습니다.");
			EndView.viewTravelPlan(plan);
		} catch (NotExistException e) {
			FailView.viewFailMessage(e.getMessage());
		} catch (Exception e) {
			FailView.viewFailMessage(e.getMessage());
		}
	}
	
	// 새로운 여행계획 추가
	public void insertPlan(TravelPlan newPlan) {
		service.insertPlan(newPlan);
		EndView.viewMessage("새로운 여행계획이 정상적으로 추가되었습니다.");
	}
	
	// 특정 여행계획 삭제
	public void deletePlan(String travelId) {
		try {
			service.deletePlan(travelId);
			EndView.viewMessage("ID "+travelId+" 이(가) 정상적으로 삭제되었습니다.");
		} catch (NotExistException e) {
			FailView.viewFailMessage(e.getMessage());
			FailView.viewFailMessage("삭제에 실패했습니다.");
		} catch (Exception e) {
			FailView.viewFailMessage(e.getMessage());
		}
	}
	
	// 특정 여행계획 삭제
	public void deleteAllPlans() {
		service.deleteAllPlans();
		EndView.viewMessage("모든 여행계획이 정상적으로 삭제되었습니다.");
	}
	
	// 특정 여행계획의 상태 변경 ( YET -> ING -> DONE )
	public void updatePlanStatus(String travelId) {
		try {
			Status status = service.updatePlanStatus(travelId);
			EndView.viewMessage("상태가 정상적으로 "+status+" (으)로 정상적으로 업데이트되었습니다.");
		} catch (NotExistException e) {
			FailView.viewFailMessage(e.getMessage());
			FailView.viewFailMessage("상태 업데이트에 실패했습니다.");
		} catch (Exception e) {
			FailView.viewFailMessage(e.getMessage());
		}
	}
	
	// YET 상태 계획 모두 삭제
	public void deleteYetStatusPlans() {
		try {
			int count = service.deletePlansByStatus(Status.YET);
			EndView.viewMessage("YET 상태 여행계획 총 " + count +" 개가 정상적으로 삭제되었습니다.");
		} catch (NotExistException e) {
			FailView.viewFailMessage(e.getMessage());
			FailView.viewFailMessage("삭제에 실패했습니다.");
		} catch (Exception e) {
			FailView.viewFailMessage(e.getMessage());
		}
	}

	// ING 상태 계획 모두 삭제
	public void deleteIngStatusPlans() {
		try {
			int count = service.deletePlansByStatus(Status.ING);
			EndView.viewMessage("ING 상태 여행계획 총 " + count +" 개가 정상적으로 삭제되었습니다.");
		} catch (NotExistException e) {
			FailView.viewFailMessage(e.getMessage());
			FailView.viewFailMessage("삭제에 실패했습니다.");
		} catch (Exception e) {
			FailView.viewFailMessage(e.getMessage());
		}
	}

	// DONE 상태 계획 모두 삭제
	public void deleteDoneStatusPlans() {
		try {
			int count = service.deletePlansByStatus(Status.DONE);
			EndView.viewMessage("DONE 상태 여행계획 총 " + count +" 개가 정상적으로 삭제되었습니다.");
		} catch (NotExistException e) {
			FailView.viewFailMessage(e.getMessage());
			FailView.viewFailMessage("삭제에 실패했습니다.");
		} catch (Exception e) {
			FailView.viewFailMessage(e.getMessage());
		}
	}
	
	
	
}
