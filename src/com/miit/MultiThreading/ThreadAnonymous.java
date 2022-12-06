package com.miit.MultiThreading;

public class ThreadAnonymous {

	public static void main(String[] args) {

		Runnable obj1 = new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Hii");

					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}
		};

		Runnable obj2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Hello");

					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}
		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		try {
			Thread.sleep(15);
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
	}
}
