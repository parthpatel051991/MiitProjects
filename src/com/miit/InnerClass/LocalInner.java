package com.miit.InnerClass;

class External
{
	public void display()
	{
		class Local
		{
			public void msg()
			{
				System.out.println("You are inside of local inner class");
			}
		}
		Local i = new Local();
		i.msg();
	}
}

public class LocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		External e =new External();
		
	
		
		e.display();
	}

}
