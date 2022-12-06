package com.miit.InnerClass;
@FunctionalInterface
interface Computer
{
	void show();
}

//@FunctionalInterface
//interface Computer2
//{
//	int add(int num1,int num2);
//}


public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Computer com = ()-> System.out.println("In a lambda expression");
		
		com.show();
		
		
//		Computer2 com1 =( num1, num2) ->num1+num2;
		
	}

}
