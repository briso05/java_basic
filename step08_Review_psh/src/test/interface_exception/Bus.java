package test.interface_exception;

import exception.FuelLackException;

public abstract class Bus {
	double fuel;
	int count;
	
	abstract void run() throws FuelLackException;
	abstract void chargeToFull();
}
