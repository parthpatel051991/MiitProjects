package com.miit.Inheritance;


	class Demo
	{
		int a,b,c;
		public Demo()
		{
			
			a=10;
			b=20;
			c=a+b;
		}
		
		public Demo(int x,int y)
		{
			c=x+y;
		}
	}
	class Demo1 extends Demo
	{
		int m,n,o;
		
		public Demo1()
		{
			super(30,40);
			m=10;
			n=20;
			o=m+n;
		}
		
		public Demo1(int x,int y)
		{
			//super(x,y);
			this();
			o=x+y;
		}
	
		public void disp()
		{
			System.out.println(c);
			System.out.println(o);
		}
	
	}	
public class Launch1 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 d = new Demo1();
		Demo1 d1 = new Demo1(10,40);
	 
		
		d.disp();
		System.out.println("==============================================");
		
		d1.disp();
		
		
	}

}
