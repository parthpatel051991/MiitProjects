package com.miit.MultiThreading;

//Producer thread Operations
class Producer1 extends Thread {
	// Producer thread producing data by StringBuffer
	StringBuffer sb1;



	public Producer1() {
		// StringBuffer object created with default capacity 16
		sb1 = new StringBuffer();
	}

	// Producer Producing data

	@Override
	public void run() {

		synchronized (sb1) {
			for (int i = 1; i <= 10; i++) {
				try {
					sb1.append(i + ": ");
					Thread.sleep(100);
					System.out.println("appending");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			//send the notification
			sb1.notify();
		}


	}

}

class Consumer1 extends Thread {
	// creating producer object to get StringBuffer data from producer
	Producer1 producer1;

	//Injection of producer object into Consumer
	public Consumer1(Producer1 producer1) {
		super();
		this.producer1 = producer1;
	}

	//Consuming data from Producer
	public void run() {
		
		synchronized (producer1.sb1) {
			try {
				
				producer1.sb1.wait();
				
				//Consume the data Produced by Producer
				System.out.println(producer1.sb1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}


// Efficient way of doing communication between inter thread using wait() and notify()
public class ImprovedCommunication {

	//Main thread is driving code where he start the other thread
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Producer1 obj1 = new Producer1();
		Consumer1 obj2 = new Consumer1(obj1);

		Thread t1 = new Thread(obj1); // Producer thread
		Thread t2 = new Thread(obj2); // Consumer Thread

		t2.start(); // consumer should wait
		t1.start(); // Producer should Start
		
		

	}

}
