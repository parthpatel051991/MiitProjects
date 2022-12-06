package com.miit.MultiThreading;

//Producer thread Operations
class Producer extends Thread {
	// Producer thread producing data by StringBuffer
	StringBuffer sb;

	// Variable used by Threads for communication
	boolean dataProvider = false;

	public Producer() {
		// StringBuffer object created with default capacity 16
		sb = new StringBuffer();
	}

	// Producer Producing data

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				sb.append(i + ": ");
				Thread.sleep(100);
				System.out.println("appending");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		dataProvider = true;

	}

}

class Consumer extends Thread {
	// creating producer object to get StringBuffer data from producer
	Producer producer;

	//Injection of producer object into Consumer
	public Consumer(Producer producer) {
		super();
		this.producer = producer;
	}

	//Consuming data from Producer
	public void run() {
		
		//Check for the producer dataProvider variable , if it true then only consume the data
		while (producer.dataProvider == false) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Consume the data Produced by Producer
		System.out.println(producer.sb);
	}

}

//Inefficient way of inter Thread communication
public class Communication {

	public static void main(String[] args) {

		Producer obj1 = new Producer();
		Consumer obj2 = new Consumer(obj1);

		Thread t1 = new Thread(obj1); // Producer thread
		Thread t2 = new Thread(obj2); // Consumer Thread

		
		t2.start(); // consumer should wait
		t1.start(); // Producer should Start
		

	}

}
