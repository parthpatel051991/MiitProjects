package com.miit.InnerClass;

interface Demo
{
	void disp();
}

class Alpha implements Demo
{
	public void disp()
	{
		System.out.println("I have given a body.");
		System.out.println("This Example is for Without Anonymous inner Class");
	}
}

public class WithoutAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d = new Alpha();
		
		d.disp();
	}

}
