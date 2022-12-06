package com.miit.Interface;

interface Calc1
{
	void add(int a,int b);
}
interface Calc2
{
	int sub(int a,int b);
}

class Calculator1 implements Calc1,Calc2
{
	public void add(int a,int b)
	{
		int c =a+b;
		System.out.println(c);
	}
	public int sub(int a,int b)
	{
		int c =a-b;
	
		return c;
	}
}

public class Launch2 {

	public static void main(String[]args)
	{
		Calculator1 c =new Calculator1();
		
		c.add(10, 20);
		System.out.println(c.sub(50, 25));
		
	}
}
