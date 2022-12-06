package com.miit.FactoryDesign;

public class FactoryAttack {

	public static void main(String[] args) {
	

		ChiefDefenseStaff cds = new ChiefDefenseStaff();
		
	
		
		AttackType at = cds.getAttack("army");
		
		at.attack();
	
		
		at = cds.getAttack("");
		at.attack();
		
		at=cds.getAttack("airforce");
		at.attack();
		
	}

}
