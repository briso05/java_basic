package step01.java8;

public class Ex01Enum {
	public static void main(String[] args) {
		System.out.println(Color.RED);
		System.out.println(Color.BLUE);
		System.out.println(Color.YELLOW);
		System.out.println(Color.GREEN);
		
		System.out.println();

		Car c1 = new Car(Color.BLUE);
		System.out.println(c1);
		
		System.out.println("===================");
		
		System.out.println(HttpStatus.NOT_FOUND);
		
		System.out.println();
		
		// Enum 내 선언된 값들은 그 자체로 해당 Enum 타입의 객체임
		for(HttpStatus status : HttpStatus.values()) {
			System.out.println(status + " " + status.getNum());
		}
		System.out.println();

		// Enum 클래스에 field에 선언하여 enum 내 선언된 값과 바인딩할 수 있게 만들 수 있다.
		// Enum 값 객체를 사용하여 바인된 값을 가져오기 위해서는 
		// 아래와 같이 get Method를 만들어줘야 함
		System.out.println(HttpStatus.NOT_FOUND.getNum());

		System.out.println();
		HttpStatus status = HttpStatus.NOT_FOUND; // 어디서 받아온 HttpStatus 값
		
		if (status.getNum() /* 404 */ == HttpStatus.NOT_FOUND.getNum()) {
			System.out.println("에러페이지 로드를 위한 예외 처리를 해줘야 합니다.");
		}
		System.out.println("===================");
		
		for (Card card : Card.values()) {
			System.out.println(card + " " + card.getSerialNum());
		}
		
		System.out.println();
		
		Calendar calendar = new Calendar();
		calendar.setMonth(Month.MARCH);
		
		System.out.println(EnumMonth.FEBUARY);
		System.out.println(EnumMonth.FEBUARY.getMonthNum());
		
		calendar.setMonth(EnumMonth.MARCH.getMonthNum());
		//static final은 값이 변경될 수 없는 상수임
		
		System.out.println();
		
		City city = new City();
		city.cityLocName = CityLoc.JONGROGU;
		
		System.out.println("시군구 이름 : " + city.cityLocName);
		System.out.println("시군구 코드 : " + city.cityLocName.getSiGunGuCode());
		System.out.println("시군구 등록 " + city.cityLocName.getInstituteCode());
	}
}
