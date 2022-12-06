package com.miit.Interface;


import java.util.Scanner;

interface Calculator {
	
	 void add();  // public abstract void add();
	 void sub();  // public abstract void sub();

}

class MyCalculator1 implements Calculator
{
	public void add()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the first no. to add : ");
		int a=scan.nextInt();
		System.out.println("Please Enter the Second no. to add : ");
		int b =scan.nextInt();
		
		int c =a+b;
		System.out.println(c);
	}
	public void sub()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the first no. to substract : ");
		int a=scan.nextInt();
		System.out.println("Please Enter the Second no. to substract : ");
		int b =scan.nextInt();
		
		int c =a-b;
		System.out.println(c);	
	}
}

class MyCalculator2 implements Calculator
{
	public void add()
	{
		int a=30;
		int b=40;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a=50;
		int b=40;
		int c=a-b;
		System.out.println(c);
		
	}
}

// Achieving Polymorphism 
class Calc
{
	public void permit(Calculator ref)
	{
		ref.add();
		ref.sub();
	}
}


public class LaunchCalculator
{

	public static void main(String[] args)
	{
		MyCalculator1 m1 = new MyCalculator1();
		MyCalculator2 m2 = new MyCalculator2();
		
		Calc c =new Calc();
		
	    c.permit(m1);
	    
	    System.out.println("====================================================================");
		
	    c.permit(m2);
		
		
		
	}
}

