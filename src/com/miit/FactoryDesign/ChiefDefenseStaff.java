package com.miit.FactoryDesign;

public class ChiefDefenseStaff {

	public AttackType getAttack(String str) {
		
		if(str.equalsIgnoreCase("Army")) {
			return new Army();
		}
		else if(str.equalsIgnoreCase("AirForce"))
		{
			return new AirForce();
		}
		else 
			return new Navy();
	}
}
