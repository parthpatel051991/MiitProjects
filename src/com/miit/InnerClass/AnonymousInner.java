package com.miit.InnerClass;

@FunctionalInterface
interface Demo1
{
	int add(int num1,int num2);

}

public class AnonymousInner {

	public static void main(String[] args) {

		Demo1 d = (num1,num2) -> num1+num2;
			
		
		
		System.out.println(d.add(5,5));

	}

}
