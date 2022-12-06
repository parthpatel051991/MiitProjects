package com.miit.practice.HasA;

public class Test2 {

	public static void main(String[] args) {
		
		// dependent object creation
		Employee1 e1=new Employee1(10, "Sachin");		
		Employee1 e2=new Employee1(07, "Dhoni");
		Employee1 e3=new Employee1(99, "Saurav");
		
		Employee1 [] employees =new Employee1[3];
		
		employees[0]=e1;
		employees[1]=e2;
		employees[2]=e3;
		
		
		
		
		// target object creation
		
		Department d1 = new Department(1, "BCCI", "DUBAI", employees);
		
	}

}
