package com.miit.Singleton;

public class TestEnum {

	public static void main(String[] args) {
		
		SingletonWithEnum swe1 = SingletonWithEnum.INSTANCE;    // object created 
		swe1.i=5;
		System.out.println(swe1.i);
		System.out.println( "HashCode for swe1 :"+swe1.hashCode());
		
		System.out.println();
		
		SingletonWithEnum swe2 = SingletonWithEnum.INSTANCE;    
		swe1.i=10;
		System.out.println(swe2.i);
		System.out.println( "HashCode for swe2 :"+swe2.hashCode());
		
	}

}
