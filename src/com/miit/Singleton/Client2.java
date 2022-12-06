package com.miit.Singleton;

public class Client2 {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println(Test2.getTest().hashCode());

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println(Test2.getTest().hashCode());

			}
		});

		t1.start();
		t2.start();
	}
}
