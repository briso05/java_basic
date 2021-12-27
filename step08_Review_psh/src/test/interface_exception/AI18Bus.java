package test.interface_exception;

import exception.FuelLackException;
import interfaces.AutoChargeable;

public class AI18Bus extends Bus implements AutoChargeable{
	private static final double FUEL_CAPACITY = 21.0; 
	
	public AI18Bus(double fuel) {
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
		System.out.println("AI18Bus가 "+ ++count +"번째  운행을 시작합니다.");
		if(fuel < 10) {
			count--;
			throw new FuelLackException("연료가 부족하여 정상적으로 운행을 시작하지 못했습니다. 충전해주세요.");
		}
		fuel -= 10;
		System.out.println("AI18Bus가 정상적으로 운행을 완료했습니다.");
		autoCharge();
	}

	@Override
	void chargeToFull() {
		System.out.println("연료가 완전히 충전 되었습니다.");
		fuel = FUEL_CAPACITY;
	}

	@Override
	public void autoCharge() {
		int addedFuel = (int) (Math.random() * 10) + 1;
		fuel += addedFuel;
		System.out.println("연료 "+addedFuel+"L가 자동 충전되었습니다.");
	}
	
}
