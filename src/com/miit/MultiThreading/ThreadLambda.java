package com.miit.MultiThreading;

public class ThreadLambda {

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hii" + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		},"Hii Thread");
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello" + + Thread.currentThread().getPriority());

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		},"Hello Thread");
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try {
			Thread.sleep(15);
		}

		catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		
		
		
//		t1.setName("Thread 1");
//		t2.setName("Thread 2");

		
		
	//	System.out.println(t1.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");
	}


}
