package test.interface_exception;

import exception.FuelLackException;

public class CityBus extends Bus{
	private static final double FUEL_CAPACITY = 21.0; 
	
	public CityBus(double fuel) {
		count = 0;
		if(fuel > FUEL_CAPACITY) {
			this.fuel = FUEL_CAPACITY;
		} else if(fuel < 0) {
			this.fuel = 0;
		} else {
			this.fuel = fuel;
		}
	}
	
	@Override
	void run() throws FuelLackException {
		System.out.println("CityBus가 "+ ++count +"번째 운행을 시작합니다.");
		if(fuel < 10) {
			count--;
			throw new FuelLackException("연료가 부족하여 정상적으로 운행을 시작하지 못했습니다. 충전해주세요.");
		}
		fuel -= 10;
		System.out.println("CityBus가 정상적으로 운행을 완료했습니다.");
	}

	@Override
	void chargeToFull() {
		System.out.println("연료가 완전히 충전 되었습니다.");
		fuel = FUEL_CAPACITY;
	}
	
}
