
// class extends class
//class implements interface
//interface extends interface




package com.miit.practice;

interface Car
{
	void drive();
}

interface SuperCar extends Car
{
	void fly();
}


class Nano implements SuperCar 
{
	public void drive()
	{
		System.out.println("Nano can drive");
	}

	public void fly()
	{
		System.out.println("Yes, Nano could fly if you go beyond speed of 100 km/h");
	}

}



public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperCar a =new Nano();  // new Car --- not new SuperCar because you can't instantiate Interface
		
		a.drive();
		a.fly();
		
	}

}
