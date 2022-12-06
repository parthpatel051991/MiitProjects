package com.miit.ExceptionHandling;

import java.util.Scanner;

class InvalidUserInput extends Exception {

		public InvalidUserInput(String msg) {
		super(msg);
	}
}

class ATM {
	private int accountNum = 1111;
	private int password = 2222;
	private int accN;
	private int pw;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the account Number :");
		accN = scan.nextInt();
		System.out.println("Enter the password");
		pw = scan.nextInt();
	}

	public void verify() throws InvalidUserInput {
		if (accountNum == accN && password == pw) {
			System.out.println("Collect your Cash");
		} else {
//			InvalidUserInput iup = new InvalidUserInput();
//			System.out.println("Invalid Credentials");
//			throw iup;
			
			throw new InvalidUserInput("Invalid credentials !");
		}
	}

}

class Bank {
	public void initiate() {
		try {
			ATM a = new ATM();
			a.input();
			a.verify();
		} catch (Exception e) {
			try {
				System.out.println(e.getMessage());
				ATM a = new ATM();
				a.input();
				a.verify();
			} catch (Exception f) {
				try {
					System.out.println(e.getMessage());
					ATM a = new ATM();
					a.input();
					a.verify();
				} catch (Exception g) {
					System.out.println("Your Card is Blocked. Go to visit your nearest branch");
				}
			}

		}

	}

}

public class ATMCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank();

		b.initiate();

	}

}
