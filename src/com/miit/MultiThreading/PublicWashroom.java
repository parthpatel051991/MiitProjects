package com.miit.MultiThreading;

class Bathroom implements Runnable {

	synchronized public void run() {
		try {

			System.out.println(Thread.currentThread().getName() + " is entered the washrrom.");
			Thread.sleep(3000);

			System.out.println(Thread.currentThread().getName() + " is using washroom");
			Thread.sleep(3000);

			System.out.println(Thread.currentThread().getName() + " is exited washroom");
		} 
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class PublicWashroom {
	public static void main(String[] args) {

		Bathroom bath = new Bathroom();

		Thread t1 = new Thread(bath);
		Thread t2 = new Thread(bath);
		Thread t3 = new Thread(bath);

		t1.setName("BOY");
		t2.setName("Girl");
		t3.setName("Other");

		t1.start();
		t2.start();
		t3.start();
	}
}
