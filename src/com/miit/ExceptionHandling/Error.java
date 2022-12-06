package com.miit.ExceptionHandling;


class DemoRuntime 
{
	public void disp()
	{
		disp();
	}
	
	
}


public class Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoRuntime a = new DemoRuntime();
				
		
		a.disp();
	}

}
