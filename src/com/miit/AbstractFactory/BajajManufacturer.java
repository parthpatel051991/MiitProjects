package com.miit.AbstractFactory;

public class BajajManufacturer extends Company {

	@Override
	public Fan createFan() {
		// TODO Auto-generated method stub
		return new BajajFan();
	}

	@Override
	public Heater createHeater() {
		// TODO Auto-generated method stub
		return new BajajHeater();
	}

}
