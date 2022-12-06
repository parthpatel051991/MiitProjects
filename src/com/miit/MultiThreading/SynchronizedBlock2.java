package com.miit.MultiThreading;

class Miit implements Runnable
{
	 public void run()
	{
		try {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "  + i);
		}
		
			Thread.sleep(3000);
			
		synchronized (this) {
			for(int i=0;i<5;i++)
			{
				System.out.println(Thread.currentThread().getName()+" " +(char)(i+65));
			}
		}
		
		Thread.sleep(3000);
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" " +(char)(i+70));
		}
		
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



public class SynchronizedBlock2 {

	public static void main(String[] args) {
		
		Miit m = new Miit();
		
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		
		t1.start();
		t2.start();

	}

}
