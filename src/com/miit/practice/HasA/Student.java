package com.miit.practice.HasA;


class Address{
	
	int houseNo;
	String streetAddress;
	String city;
	String province;
	String postalcode;
	String country;
	
}

public class Student{      // if you write student extends Address then its called student is address which is not true. 
	                       // which is called Is-A relationship ..  

	String name;
	int age;
	int sid;
	
	// Has -A variable  1-1 association
	
	Address address;
	
	/* one student can have many address
	 Has -A variable 1-Many association
	 
	 Address[] address;
	 */
}