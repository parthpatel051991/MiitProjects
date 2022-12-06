package com.miit.ExceptionHandling;

import java.util.Scanner;

class OverAgeException extends Exception {

	public OverAgeException(String msg) {
		super(msg);

	}

}

class UnderAgeException extends Exception {
	public UnderAgeException(String msg) {
		super(msg);

	}
}

class DLApp {
	private int age;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age to check Your Eligibility for Full Driver License :");
		age = scan.nextInt();
	}

	public void verify() throws UnderAgeException, OverAgeException {
		if (age >= 18 && age <= 60) {
			System.out.println("Your are eligible to get D/L license");
		} else if (age < 18) {
			throw new UnderAgeException("You are under age to drive ..legal age for driving is 18 years.");
		} else if (age > 60) {
			throw new OverAgeException(
					"Sir,Gov of India stopped issuing D/L to over 60 years age people due to health and Safety issue of Senior citizens.");
		}
	}

}

class RTO {
	public void initiate() {
		DLApp dl = new DLApp();

		try {

			dl.input();
			dl.verify();
		} catch (Exception e) {
			System.out.println(e.getMessage());

			try {
				dl.input();
				dl.verify();
			} catch (Exception f) {
				System.out.println("You reached the limit of input.");
				System.out.println("Leagal age for driving in India is 18 to 60 years");
				System.exit(0);
			}

		}

	}

}

public class RtoCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RTO r = new RTO();
		r.initiate();

	}

}
