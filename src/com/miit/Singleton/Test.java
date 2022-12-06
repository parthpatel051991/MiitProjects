package com.miit.Singleton;

public class Test {

	private static Test t = null;
	
	private Test() {
		
		System.out.println("Instance is Created");
		
	} // to avoid object creation by the user using new Keword
	
	public static Test getTest(){ // getTest() is a factory method
		
		if(t==null)
		{
			t=new Test();
		}
		return t;
	}
}
