package com.miit.ExceptionHandling;

import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

}
