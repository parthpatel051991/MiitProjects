package com.miit.Interface;





interface MyCal1
{
	void add(int a,int b);
}

class Mycal2
{
	public void sub(int a,int b)
	{
		int c =a-b;
		System.out.println(c);
	}
}

//in java , at same time you are allowed to extends class and interface together

class Calc3 extends Mycal2 implements MyCal1       
{
	public void add(int a,int b)
	{
		int c =a+b;
		System.out.println(c);
	}
}



public class Launch3 {

	public static void main(String[]args)
	{
		Calc3 a= new Calc3();
		
		a.sub(30,20);
		a.add(30, 20);
		
	}
}
