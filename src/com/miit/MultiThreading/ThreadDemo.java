package com.miit.MultiThreading;

class Hii   extends Thread  // implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hii");

			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Hello   extends Thread   // implements Runnable
{
	public void run ()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");

			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

public  class ThreadDemo {

	public static void main(String[] args) {

		Hii obj1 = new Hii();
		Hello obj2 = new Hello();

//		obj1.show();
//		obj2.show();
		
		
		
		obj1.start();
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		obj2.start();		
	}
}
