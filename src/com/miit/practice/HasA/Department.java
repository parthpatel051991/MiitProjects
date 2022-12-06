package com.miit.practice.HasA;

// Target Object
public class Department {

	private int deptNo;
	private String deptName;
	private String deptLoc;
	
	
	
	// HAS -A VARIABLE
	private Employee1[] employees;


	//constructor injection

	public Department(int deptNo, String deptName, String deptLoc, Employee1[] employees) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		
		
		// Has-A variable injection through constructor injection
		this.employees = employees;
	} 
	
	public void display()
	{
		System.out.println();
	}
	
	
	
	
}
