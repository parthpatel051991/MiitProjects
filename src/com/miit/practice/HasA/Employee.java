package com.miit.practice.HasA;


// Target object
public class Employee {

	private int eid;
	private String ename;
	private String eaddress;
	
	
	//Has-A variable Injection
	
	private Account account;


	// Constructor Injection
/*	public Employee(int eid, String ename, String eaddress, Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.account = account;
	}
	
*/	
	//Setter when you perform setter injection
	
	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	

	
	
	// CODE FOR DISPLAYING DATA FOR EMPLOYEE
	void display() 
	{
		System.out.println("*********************Employee Details********************");
		System.out.println("Employee id :"+eid);
		System.out.println("Employee Name :" +ename);
		System.out.println("Employee Address : "+eaddress);
		System.out.println("*********************Account Details Are******************");
		System.out.println("Employee Account no is : "+account.getAccNo());
		System.out.println("Employee Account type is : "+account.getAccType());
		System.out.println("Employee Accoun Name is : "+account.getAccName());
	}

	

	
	
	
	
	
}
