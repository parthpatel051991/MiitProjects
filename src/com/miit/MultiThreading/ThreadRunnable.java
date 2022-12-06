package com.miit.MultiThreading;



public class ThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable obj1 = new Hii();
		Runnable obj2 = new Hello();
		
//		obj1.start();
//		obj2.start();
		
		Thread t1 =new Thread(obj1);
		Thread t2 = new Thread(obj2);
	
		t1.start();
		try
		{Thread.sleep(15);}
		
		catch(Exception e){System.out.println(e);}
		
		t2.start();
	}

}
