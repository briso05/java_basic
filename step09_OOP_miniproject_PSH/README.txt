1. 주제 : 여행계획관리 프로젝트

2. 구조 :
	- DTO
		- TravelPlan - 여행계획 : 제목, id, 목적, 출발, 도착, 교통[Transportation], 상태(YET, ING, DONE)
			하위 클래스
			- DomesticTravelPlan - 국내 여행계획 : 
			- AbroadTravelPlan	 - 해외 여행계획 : 비자
			
		- Transportation - 교통 : 비용  
			하위 클래스
			- Bus		- 버스 : 번호, 버스종류
			- Train		- 기차 : 노선명, 기차 종류
			- AirPlane	- 비행기 : 항공사, 항공편명
			- Ship		- 선박 : 선박사, 선박명
		

3. 기능 : service 기준
	[완]
	- ArrayList<TravelPlan> getAllPlans() : 모든 여행계획 반환
	- ArrayList<DomesticTravelPlan> getAllDomesticPlans() : 모든 국내 여행계획 반환
	- ArrayList<AbroadTravelPlan> getAllAbroadPlans() : 모든 해외 여행계획 반환
	- ArrayList<TravelPlan> getPlansByStatus(Status status) : 특정 상태에 해당하는 계획만 반환
	- TravelPlan getPlan(String travelId) : 여행 id로 특정 여행 계획 검색
	- Status updatePlanStatus(String planId) : 이전상태에서 다음상태로 여행계획 상태 변경(출발전 -> 여행중 -> 여행종료)
	- void insertPlan(TravelPlan plan) : 여행 계획 추가
	- void deletePlan(String travelId) : 여행 계획 1개 삭제
	- int deletePlansByStatus(Status status) : 특정 상태의 여행계획 삭제 
	- void deleteAllPlans() : 모든 여행계획 삭제
	
	[미완]
	- void updatePlanTransportation(String planId, Transportation transportation) : 선택된 여행계획 교통수단 변경

4. 실행 :
	- StartView에서 실행 -> 결과 console에 출력
	- 7-3 결과 확인을 위해서는 콘솔창에 적혀있는 안내문을 따라해주세요.
