package com.miit.MultiThreading;

class Weapon implements Runnable
{
	String res1 = "Bramhastra";
	String res2 = "Pashupastra";
	String res3 = "Garudastra";
	
	public void run()
	{
		try {
			String s1 = Thread.currentThread().getName();
			if(s1.equals("Rama"))
			{
				ramaAcqRes();
			}
			else
			{
				ravanaAcqRes();
			}
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("Some Intrupption ");
		}
		
			
	}
	
	public void ramaAcqRes()
	{
		try {
			Thread.sleep(3000);
			synchronized (res1)
			{
				System.out.println("Rama has acquired "+res1);

				Thread.sleep(3000);
				synchronized (res2)
				{
					System.out.println("Rama has acquired "+res2);
					Thread.sleep(3000);
					synchronized (res3)
					{
						System.out.println("Rama has acquired "+res3);
					}
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void ravanaAcqRes()
	{
		try {
			Thread.sleep(3000);
			synchronized (res1)
			{
				System.out.println("Ravana has acquired "+res1);

				Thread.sleep(3000);
				synchronized (res2)
				{
					System.out.println("Ravana has acquired "+res2);
					Thread.sleep(3000);
					synchronized (res3)
					{
						System.out.println("Ravana has acquired "+res3);
					}
				}
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}


public class RamayanWeapon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Weapon w = new Weapon();
		
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		
		t1.setName("Rama");
		t2.setName("Ravana");
		
		
		t1.start();
		t2.start();
		
	}

}
