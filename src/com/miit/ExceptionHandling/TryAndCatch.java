package com.miit.ExceptionHandling;

public class TryAndCatch {
	
	public static void main (String [] args)
	{
		
		

	//	int a []= {1,2,3};
	//	System.out.println(a[10]);
		
		
		
		try
		{
			int a []= {1,2,3};
			System.out.println(a[10]);
		}
		catch(Exception e)
		{
			System.out.println("Something Went Wrong");
		}
	
	}
	
	

}
