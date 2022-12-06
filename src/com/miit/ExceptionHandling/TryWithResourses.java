package com.miit.ExceptionHandling;

import java.util.Scanner;

public class TryWithResourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner scan = new Scanner(System.in);)
		{
			System.out.println("Enter the sentenced to print :");
			String n =scan.nextLine();
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try(Alpha a = new Alpha())
		{
			System.out.println("Welcome to Alpha class");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
