package com.miit.Singleton;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
	}

}
