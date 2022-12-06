package com.miit.objectMethods;

import com.miit.practice.HasA.Employee1;

public class CloneMethod  {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee1 e1 =new Employee1(1, "Parth");
		
		
		Employee1 e2 = (Employee1)e1.clone();
		
		
		System.out.println(e2.getEid());
		System.out.println(e2.getEname());
		
		
		e2.setEid(2);
		e2.setEname("Bijal");
		
		System.out.println("");
		
		System.out.println(e2.getEid());
		System.out.println(e2.getEname());
		
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
	
	
}
