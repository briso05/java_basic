package test.interface_exception;

import exception.FuelLackException;

public class BusTest {

	public static void main(String[] args) {
		//CityBus 테스트 : CityBus => 일반 버스
		CityBus cityBus = new CityBus(15.0);
		try {
			cityBus.run();
			cityBus.run();
		} catch (FuelLackException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(">>> CityBus 충전소에서 완전 충전 ");
		cityBus.chargeToFull();
		
		try {
			cityBus.run();
		} catch (FuelLackException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("-----------------------------");
		
		//AI18Bus 테스트 : AI18Bus => 1회 운행 후, 자동으로 일부 연료(1~10L사이 임의의 값) 충전됨
		AI18Bus ai18Bus = new AI18Bus(15.0);
		try {
			ai18Bus.run();
			ai18Bus.run();
			ai18Bus.run();
			ai18Bus.run();
			ai18Bus.run();
			ai18Bus.run();
		} catch (FuelLackException e) {
			System.err.println(e.getMessage());
			ai18Bus.autoCharge();
		}
		
		System.out.println(">>> AI18Bus 충전소에서 완전 충전 ");
		ai18Bus.chargeToFull();

		try {
			ai18Bus.run();
			ai18Bus.run();
			ai18Bus.run();
			ai18Bus.run();
			ai18Bus.run();
			ai18Bus.run();
		} catch (FuelLackException e) {
			System.err.println(e.getMessage());
			ai18Bus.autoCharge();
		}
		
	}

}
