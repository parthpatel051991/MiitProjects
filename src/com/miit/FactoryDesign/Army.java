package com.miit.FactoryDesign;

public class Army implements AttackType {

	public Army() {
		System.out.println("object is created");
	}
	
	@Override
	public void attack() {
		
		System.out.println("Intializing Army Attack.");
	}

}
