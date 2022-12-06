package com.miit.AbstractFactory;

public class Factory {

	public static void main(String[] args) {
		
		Company bajaj = new BajajManufacturer();
		Fan bajajFan = bajaj.createFan();
		bajajFan.assemble();
		
		Heater bajajHeater=bajaj.createHeater();
		bajajHeater.assemble();
		
		
		Company lg = new LgManufacurer();
		Fan lgFan=lg.createFan();
		lgFan.assemble();
		
		Heater lgHeater = lg.createHeater();
		lgHeater.assemble();

	}

}
