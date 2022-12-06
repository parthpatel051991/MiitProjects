package com.miit.practice.HasA;

public class Employee1 implements Cloneable {

	private int eid;
	private String ename;
	
	
	// Constructor injection
	
	public Employee1(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}


	
	
	// getters to get value
	
	
	public int getEid() {
		return eid;
	}


	public String getEname() {
		return ename;
	}
	
	
	 public boolean equals(Object obj) {
	        return (this == obj);
	    }
	
	
	// its related to object method equal ... overriding method of equal
	
	 public boolean equals1(Employee1 obj) {
	        return (this.getEid()==(obj.getEid()) && (this.getEname().equals(obj.getEname()))  ) ;
	    }
	
	// overriding method of ToString
	 
	 public String toString() {
	        return this.getEname() + "@" + this.getEid();
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 public void setEid(int eid) {
		this.eid = eid;
	}




	public void setEname(String ename) {
		this.ename = ename;
	}




	public Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();
	    }
	 
	 
}
