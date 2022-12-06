package com.miit.MiitProjects;

import java.util.ArrayList;
import java.util.Scanner;

class Account {

	private int acc_no;
	private String name;
	private int pin;
	private double amount;
	private String acc_Type;

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(double amount) {
		this.amount = amount;
		
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setAcc_Type(String acc_Type) {
		this.acc_Type = acc_Type;
	}

	public String getAcc_Type() {
		return acc_Type;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public int getPin() {
		return pin;
	}

	Scanner s1 = new Scanner(System.in);

	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", name=" + name + ", pin=" + pin + ", amount=" + amount + ", acc_Type="
				+ acc_Type + "]";
	}

	public void welcomeCustomer() {

		System.out.println("Welcome to Money Bank.");
		System.out.println("====================================================================================");
		System.out.println("choose your service. Select 1 for Open New Account Or Select 2 for existing Customer");

		int i = s1.nextInt();

		Account a = new Account();

		if (i == 1) {
			a.openAccount();
		} else if (i == 2) {
			a.authentication(a);
		} else {
			System.out.println("invalid input. Enter valid input.");
			a.welcomeCustomer();
		}
		s1.close();
	}

	public void openAccount() {

		System.out.println("***************************************************************************************");
		
		System.out.println("What kind of Account would you like to Open. Choose 1 for Checking or 2 for Savings  ");
		
		int j = s1.nextInt();

		Account a = new Account();

		if (j == 1) {

			Account.customerDetails("Checking");
		} else if (j == 2) {

			Account.customerDetails("Saving");
		} else {
			System.out.println("Invalid Input.Choose 1 for Checking or 2 for Savings");
			a.openAccount();
		}
		s1.close();
	}

	public static void customerDetails(String n) {

		Scanner s2 = new Scanner(System.in);

		Account a = new Account();

		a.setAcc_Type(n);

		System.out.println("Enter the Your Full Name. ");
		String name = s2.nextLine();

		a.setName(name);

		int acc_no = (int) (1000 + (Math.random() * 1000));
		System.out.println("Account No is generated :" + acc_no);

		a.setAcc_no(acc_no);

		System.out.println("Ragister your Pin no.");

		int pin = s2.nextInt();

		a.setPin(pin);

		System.out.println("Enter your Staring balance for your Account :");

		double amount = s2.nextDouble();
		
		if(amount<0)
		{
			System.out.println("Starting Account Balance should not be Negative. Re-start your application.");
			
			Account.customerDetails(n);
		}

		a.setAmount(amount);

//		System.out.println(a.toString());

		System.out.println("Congretulation Your " + n + " Account is Created Succesfully.");

		System.out.println("=====================================================================================");

		a.authentication(a);

		s2.close();

	}

	public void authentication(Account a) {

		Account a1 = new Account();
		a1.setAcc_no(1000);
		a1.setAcc_Type("Saving");
		a1.setName("Parth Patel");
		a1.setPin(5555);
		a1.setAmount(1000);

		Account a2 = new Account();
		a2.setAcc_no(2000);
		a2.setAcc_Type("Checking");
		a2.setName("XXXX Patel");
		a2.setPin(4444);
		a2.setAmount(5000);

		ArrayList<Account> list = new ArrayList<>();

		list.add(a1);
		list.add(a2);
		list.add(a);

		System.out.println("Welcome Enter Your Account No :");
		int acc_no = s1.nextInt();

		int flag = 0;
		boolean acc_noInput = false;
		for (int counter = 0; counter < list.size(); counter++) {
			if (acc_no == (list.get(counter).getAcc_no())) {
				acc_noInput = true;
				flag = counter;
				break;
			}
		}
		if (acc_noInput) {
			System.out.println("Account No is Correct");

			System.out.println("Enter Your Pin No.");
			int pin = s1.nextInt();

			if (pin == (list.get(flag).getPin())) {

				System.out.println("You are Authanticated. Thank you.");
				list.get(flag).bankingFunction(list.get(flag));

			} else {
				System.out.println("Incorrect pin");
				a.authentication(a);
			}
		} else {

			System.out.println("Incorrect account no.");
			a.authentication(a);
		}
		s1.close();
	}

	public void bankingFunction(Account a) {
		;
		System.out.println("==============================================================================");
//		System.out.println(a.toString());
		
		a.displayinformation();

		System.out.println("==============================================================================");

		System.out.println("Enter 1 for Deposit or 2 for withdrawal or 3 for check balance :");

		int i = s1.nextInt();

		if (i == 1) {
			double amt;

			System.out.println("Enter Deposit amount: ");
			amt = s1.nextDouble();

			amount = amount + amt;

			System.out.println("Deposited amount :" + amt);
			System.out.println("Balance: " + amount);
		} else if (i == 2) {

			double amt;

			System.out.println("Enter Withdrawal amount: ");
			amt = s1.nextDouble();

			if (amt > amount) {
				System.out.println("Balance is insufficient.");
			} else {

				amount = amount - amt;
				System.out.println("Withdrwed amount :" + amt);
				System.out.println("Balance: " + amount);

			}
		} else if (i == 3) {

			System.out.println("Account balance is :" + amount);
		}

		System.out.println("Thank You !! See you soon.");
	}

	public void displayinformation() {
		System.out.println("Account holder: " + name);
		System.out.println("A/c no :" + acc_no);
		System.out.println("A/c balance: " + amount);
	}

	public static class Bank {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Account a1 = new Account();

			a1.welcomeCustomer();

		}

	}
}