package com.miit.ExceptionHandling;

import java.util.Scanner;

class Alpha implements AutoCloseable
{
	public void divison()
	{
		try 
		{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to number Dividing Operation");
		
		System.out.println("Enter the numerator :");
		int numerator=scan.nextInt();
		
		System.out.println("Enter the Denominator :");
		int denominator = scan.nextInt();
		
		int result = numerator /denominator;
		System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Please Provide non zero denominator");
		}
		System.out.println("========================================");
		System.out.println("User defined Exception handling worked");
	}
	public void close()
	{
		
	}
	
}

class Beta
{
	public void display()
	{
		Alpha a =new Alpha();
		a.divison();
	}
}


public class PropogationExample {

	public static void main(String[] args) 
	{
		Beta b = new Beta();
		b.display();

	}

}
