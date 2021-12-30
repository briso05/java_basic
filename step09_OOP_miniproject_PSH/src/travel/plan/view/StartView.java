package travel.plan.view;

import travel.plan.controller.TravelPlanController;
import travel.plan.dto.AbroadTravelPlan;
import travel.plan.dto.DomesticTravelPlan;
import travel.plan.dto.Ship;
import travel.plan.dto.Status;
import travel.plan.dto.Train;

public class StartView {

	public static void main(String[] args) {
		TravelPlanController controller = TravelPlanController.getInstance();
		
		// 모든 여행 계획 검색
		System.out.println("=== 1. 모든 여행 계획 검색 ===");
		controller.viewAllTravelPlanList();
		
		System.out.println();
		
		// 여행 계획 추가
		System.out.println("=== 2. 여행 계획 추가 ===");
		DomesticTravelPlan newDomesticPlan = new DomesticTravelPlan("7번국도 정복", "DTP04", "기획", "동서울", "속초", new Train(35000, "무궁화호", "동해선"), Status.YET);
		AbroadTravelPlan newAbroadPlan = new AbroadTravelPlan("블라디보스톡 촬영", "ATP04", "촬영", "동해", "러시아 블라디보스톡", new Ship(600000, "DBS크루즈훼리", "이스턴 드림호"), Status.YET, "필요없음");
		
		System.out.println("CASE 국내 >>");
		controller.insertPlan(newDomesticPlan);
		System.out.println();
		
		System.out.println("CASE 해외 >>");
		controller.insertPlan(newAbroadPlan);
		System.out.println();
		
		System.out.println("추가 후 확인 >>");
		controller.viewAllTravelPlanList();
		System.out.println();
		
		// 모든 국내여행 계획 검색
		System.out.println("=== 3-1. 모든 국내여행 계획 검색 ===");
		controller.viewAllDomesticTravelPlanList();
		
		System.out.println();
		
		// 모든 국제여행 계획 검색
		System.out.println("=== 3-2. 모든 해외여행 계획 검색 ===");
		controller.viewAllAbroadTravelPlanList();

		System.out.println();
	
		// 진행전(YET)인 여행 계획 검색
		System.out.println("=== 4-1. 진행전(YET)인 여행 계획 검색 ===");
		controller.viewStatusYetPlanList();
		
		System.out.println();
		
		// 여행중(ING)인 여행 계획 검색
		System.out.println("=== 4-2. 여행중(ING)인 여행 계획 검색 ===");
		controller.viewStatusIngPlanList();
		
		System.out.println();
		
		// 완료(DONE)인 여행 계획 검색
		System.out.println("=== 4-3. 완료(DONE)인 여행 계획 검색 ===");
		controller.viewStatusDonePlanList();
		
		System.out.println();
		
		// 여행ID로 여행 계획 검색
		System.out.println("=== 5-1. 여행ID로 여행 계획 검색 (성공) ===");
		System.out.println("CASE 국내 >>");
		controller.viewTravelPlan("DTP01");
		System.out.println();

		System.out.println("CASE 해외 >>");
		controller.viewTravelPlan("ATP01");
		System.out.println();

		System.out.println("=== 5-2. 여행ID로 여행 계획 검색 (실패) ===");
		controller.viewTravelPlan("DTP10");
		
		
		System.out.println();
		
		// 여행 계획 상태 변경
		System.out.println("=== 6. 여행 계획 상태 수정 ===");
		
		System.out.println("YET -> ING 상태변경 >>");
		controller.updatePlanStatus("DTP01");
		System.out.println();
		
		System.out.println("ING -> DONE 상태변경 >>");
		controller.updatePlanStatus("DTP01");
		System.out.println();
		
		System.out.println("DONE 상태변경 시도 (실패) >>");
		controller.updatePlanStatus("DTP01");
		System.out.println();
		
		System.out.println("존재하지 않는 계획 상태변경 시도 (실패) >>");
		controller.updatePlanStatus("DTP001");
		System.out.println();
		
		// 여행 계획 삭제
		System.out.println("=== 7-1. 여행 계획 삭제 (1개) ===");
		
		System.out.println("CASE 국내 (성공)>>");
		controller.deletePlan("DTP01");
		System.out.println();
		
		System.out.println("CASE 해외 (실패)>>");
		controller.deletePlan("ATP001");
		System.out.println();
		
		System.out.println("삭제 후 확인 >>");
		controller.viewAllTravelPlanList();
		System.out.println();
		
		System.out.println("=== 7-2. 여행 계획 삭제 (특정 상태) ===");
		System.out.println("삭제 전 >>");
		controller.viewAllTravelPlanList();
		System.out.println();
		
		System.out.println("YET 상태 모든 여행계획 삭제 >>");
		controller.deleteYetStatusPlans();
		System.out.println();
		
		System.out.println("ING 상태 모든 여행계획 삭제 >>");
		controller.deleteIngStatusPlans();
		System.out.println();
		
		System.out.println("DONE 상태 모든 여행계획 삭제 >>");
		controller.deleteDoneStatusPlans();
		System.out.println();
		
		System.out.println("삭제 후 확인 >>");
		controller.viewAllTravelPlanList();
		System.out.println();

		System.out.println("=== 7-3. 여행 계획 삭제 (전부) ===");
		System.out.println("*** 결과를 확인하기 위해서는, 실행전 7-2 부분 전체 주석해주세요!\n");
		
		controller.deleteAllPlans();
		System.out.println();
		
		System.out.println("삭제 후 확인 >>");
		controller.viewAllTravelPlanList();
		System.out.println();
		
		
	}
}
