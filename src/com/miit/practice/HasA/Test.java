package com.miit.practice.HasA;

// This is example of 1-1 has a relationship

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
    // Creating Dependent object
//	Account account	=new Account("10010", "checking", "Salary");
	
		Account account= new Account();  // when you use setter injection
		
	
		// Creating Target object and injection of dependent object in Constructor only
//	Employee e1=new Employee(1, "Parth", "Winnipeg", account);
		
		Employee e1 = new Employee(); // when you use setter injection
		
		
	
	// Checking the data of employee weather injection happened or not ?
   
	
		// setter injection for dependent object
		account.setAccNo("10010");
		account.setAccType("checking");
		account.setAccName("Salary");
		
		
		// setter injection for target object
		e1.setEid(1);
		e1.setEname("Parth");
		e1.setEaddress("Winnipeg");
		
		e1.setAccount(account); // performing setter injection to account
		
		
		
	   e1.display();
		
		
	}

}
