package com.miit.ExceptionHandling;

import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to array forming application");
		try
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the Array Size :");
			int size = scan.nextInt();
			
			int ar[]=new int[size];
			
			System.out.println("Enter the Element to your array :");
			
			int element= scan.nextInt();
			
			System.out.println("Enter the position in array for your element");
			
			int pos = scan.nextInt();
			
			ar[pos]=element;
			
			System.out.println("Array is look like : ");
			System.out.println("=======================================================");
			for(int i=0;i<size;i++)
			{
			System.out.print(ar[i] +" ");
			}
			System.out.println();
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Array size should not be Negative . please be positive !");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please be in a limit size of Array");
		}
		catch(Exception e)
		{
			System.out.println("Something wrong with your input");
			System.out.println("Exception is "+e);
		}
		
		System.out.println("Thank you for using Application");
	}

}
