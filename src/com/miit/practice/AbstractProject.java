package com.miit.practice;


abstract class Computer{
	
	public abstract void code();
	public abstract void playVideo();

	public void compute() 
	{
		System.out.println("This machine is able to computing logical calculation.");
	}
}

class Laptop extends Computer{
	
	public void code()
	{
		System.out.println("Laptop is able to code.");
	}
	public void playVideo()
	{
		System.out.println("Laptop able to plat video.");
	}
	
}

class Desktop extends Computer
{
	public void code()
	{
		System.out.println("Desktop is able to code.");
	}

	public void playVideo()
	{
		System.out.println("Desktop is able to play video.");
	}
}


public class AbstractProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
		Computer a = new Laptop();     // Upcasting - you can't create a object out of computer because its Abstract class
		
		a.code();
		a.playVideo();
		a.compute();
		
		System.out.println("=================================================================================");
		
		Laptop b =new Laptop();
		Alien x = new Alien();
		
		x.build(b);
		
		System.out.println("==================================================================================");
	
		Desktop c = new Desktop();
		
		x.build(c);
	
	
	
	
	}

}
