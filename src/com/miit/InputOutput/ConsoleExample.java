package com.miit.InputOutput;

import java.io.Console;
import java.io.IOException;

public class ConsoleExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
			Console c =System.console();
		try {
			
			
			System.out.println("Enter Your name: ");
			String n = c.readLine();
			
			System.out.println("Welcome "+n);
			
			System.out.println("Enter Your password: ");
			char pass[]=c.readPassword();
			
			String n1=String.valueOf(pass);;
			
			System.out.println("Your Password is "+n1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
