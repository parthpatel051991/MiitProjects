package com.miit.ExceptionHandling;

import java.util.Scanner;

class MyException extends Exception {
	
	
	public MyException(String msg)
	{
		super(msg);
	}
}

public class CustomException {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the value of i :");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();

		try {
			if (i < 10) 
			{
				throw new MyException("Error");
			}
		} 
		catch (MyException e) 
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("you are in finally");
		}
		
		System.out.println("code is worked");

	}
	
}