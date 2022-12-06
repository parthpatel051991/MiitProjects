package com.miit.WrapperClass;

import java.util.ArrayList;

public class WrapperDemo {

	
	public static void main(String[] args) throws Exception {
		
		// Java is 99.99 % oop language
	    // Reason - primitive data types , int ,float , double,byte ,char etc
		
		// Wrapper Class -  Integer , Float,Double.Character etc 
		
		
		int i =5;
		
		Integer iObj = new Integer(i);  // Boxing
		Integer jObj = i;               // AutoBoxing
		
		
		int j = iObj.intValue();        // Unboxing
		int k = iObj;                  // AutoUnboxing
		
	
		// Use of Wrapper Class - Collection of framework  and when you work with framework
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		values.add(5);
		values.add(7);
	//	values.add("Parth");
		
		System.out.println(values);
		
		
		// Use of primitive data type - When you work with loops , it is much faster processing time than wrapper class
		
		
	}
	
}
