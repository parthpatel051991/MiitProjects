package com.miit.Singleton;

public class Test2 {

	private static  Test2 t;
	
	private Test2() {
		System.out.println("Instance is Created");
	}
	
	public static  Test2 getTest() {
		
		if(t==null)
		{
			synchronized(Test2.class)
			{
				if(t==null)
				{
					t=new Test2();
				}
			}
		}
		return t;
		
	}
}
