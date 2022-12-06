package com.miit.AbstractFactory;

public class LgManufacurer extends Company {

	@Override
	public Fan createFan() {
		
		return new LgFan();
	}

	@Override
	public Heater createHeater() {
		
		return new LgHeater();
	}
}
