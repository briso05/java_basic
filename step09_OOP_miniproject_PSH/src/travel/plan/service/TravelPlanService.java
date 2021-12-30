package travel.plan.service;

import java.util.ArrayList;

import travel.plan.dto.AbroadTravelPlan;
import travel.plan.dto.DomesticTravelPlan;
import travel.plan.dto.Status;
import travel.plan.dto.TravelPlan;
import travel.plan.exception.NotExistException;
import travel.plan.model.TravelPlanVirtualDB;

public class TravelPlanService {
	private static TravelPlanService instance = new TravelPlanService();
	private TravelPlanVirtualDB travelPlanData = TravelPlanVirtualDB.getInstance();
	
	private TravelPlanService() {}
	
	public static TravelPlanService getInstance() {
		return instance;
	}
	
	// 모든 계획 반환
	public ArrayList<TravelPlan> getAllPlans() {
		return travelPlanData.getAllPlansList();
	}
	
	// 모든 국내 계획 반환
	public ArrayList<DomesticTravelPlan> getAllDomesticPlans(){
		ArrayList<DomesticTravelPlan> dplan = new ArrayList<DomesticTravelPlan>();
		
		for (TravelPlan plan : travelPlanData.getAllPlansList()) {
			if(plan instanceof DomesticTravelPlan) {
				dplan.add((DomesticTravelPlan) plan);
			}
		}
		
		return dplan;
	}

	// 모든 해외 계획 반환
	public ArrayList<AbroadTravelPlan> getAllAbroadPlans(){
		ArrayList<AbroadTravelPlan> aplan = new ArrayList<AbroadTravelPlan>();
		
		for (TravelPlan plan : travelPlanData.getAllPlansList()) {
			if(plan instanceof AbroadTravelPlan) {
				aplan.add((AbroadTravelPlan) plan);
			}
		}
		
		return aplan;
	}
	
	
	// 여행 상태에 따른 계획 목록 반환
	public ArrayList<TravelPlan> getPlansByStatus(Status status) throws NotExistException{
		ArrayList<TravelPlan> plans = new ArrayList<TravelPlan>();
		
		for (TravelPlan plan : travelPlanData.getAllPlansList()) {
			if(plan.getStatus().equals(status)) {
				plans.add(plan);
			}
		}
		
		if(plans.size() <= 0) {
			throw new NotExistException(status+" 인 여행계획이 존재하지 않습니다.");
		}
		
		return plans;
	}
	
	// 여행 ID으로 여행 계획 1개 반환 
	public TravelPlan getPlan(String travelId) throws NotExistException {
		for (TravelPlan plan : travelPlanData.getAllPlansList()) {
			if(plan.getTravelId().equals(travelId)) {
				return plan;
			}
		}
		
		throw new NotExistException("ID \""+ travelId+ "\" 을(를) 가진 여행계획을 찾지 못했습니다.");
	}
	
	
	// 새로운 여행계획 추가
	public void insertPlan(TravelPlan plan) {
		travelPlanData.insertPlan(plan);
	}
	
	
	// 여행계획 1개 삭제
	public void deletePlan(String travelId) throws NotExistException {
		TravelPlan plan = getPlan(travelId);
		travelPlanData.removePlan(plan);
	}

	// 특정 상태의 여행계획 전부 삭제
	/**
	 * @param status 삭제하고 싶은 여행계획의 상태 지정
	 * @return 삭제된 여행계획의 개수
	 * @throws NotExistException 해당 상태에 해당하는 여행계획이 존재하지 않을 때 발생
	 */
	public int deletePlansByStatus(Status status) throws NotExistException {
		int count = 0;
		ArrayList<TravelPlan> plans = getPlansByStatus(status);
		for (TravelPlan plan : plans) {
			travelPlanData.removePlan(plan);
			count++;
		}
		
		return count;
	}

	// 여행계획 전부 삭제
	public void deleteAllPlans() {
		travelPlanData.getAllPlansList().clear();
	}
	
	// 여행계획 상태 변경 (YET -> ING -> DONE)
	public Status updatePlanStatus(String travelId) throws NotExistException {
		TravelPlan plan = getPlan(travelId);
		if ( plan.getStatus().equals(Status.YET) ) {
			plan.setStatus(Status.ING);
		} else if ( plan.getStatus().equals(Status.ING) ) {
			plan.setStatus(Status.DONE);
		} else if ( plan.getStatus().equals(Status.DONE) ) {
			throw new NotExistException("더이상 상태변경이 불가능합니다.");
		}
		
		return plan.getStatus();
	}
	
	
}
