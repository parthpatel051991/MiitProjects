package com.miit.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable
{
	private String name;

	public MyRunnable(String name) {
		
		this.name = name;
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("Start Thread :" + name);
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Ended Thread :"+ name);
	}
	
	
}


public class ThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=0;i<10;i++)
		{
			Runnable runnable = new MyRunnable("myworkerThread:" +i);
			executorService.execute(runnable);
		}
		
		executorService.shutdown();
		
		while(!executorService.isTerminated()) {}
		System.out.println("All request completed sucessfully");
		}
	}


