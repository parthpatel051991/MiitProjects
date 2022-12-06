package com.miit.objectMethods;

import com.miit.practice.HasA.Employee1;

public class Equals {

	public static void main(String [] args) {
		
		Employee1 e1 = new Employee1(1, "Parth");
		Employee1 e2 =new Employee1(1, "Parth");
		
		// without overridden equal method
		System.out.println(e1.equals(e2));
		
		
		// we used overridden method of equals ,so it will give us true answer... by default is false
		System.out.println(e1.equals1(e2));
		
	}
	
	
}
