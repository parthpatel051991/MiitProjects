package com.miit.practice.HasA;
// Dependent Object
public class Account {

	// instance variable
	private String accNo;
	private String accType;
	private String accName;



	/* performing constructor injection

	public Account(String accNo, String accType, String accName) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.accName = accName;
	}
	 */

	// performing setter injection

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}



	public void setAccType(String accType) {
		this.accType = accType;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}




	// SENDING THE DATA TO USERS when we use Constructor Injection


	public String getAccNo() {
		return accNo;
	}



	public String getAccType() {
		return accType;
	}



	public String getAccName() {
		return accName;
	}

}
