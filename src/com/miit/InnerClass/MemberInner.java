package com.miit.InnerClass;


class Outer
{
	private String n ="Hello";
	
	class Inner
	{
		public void msg()
		{
			System.out.println("The messesge is :"+n);
		}
	}
}


public class MemberInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj = new Outer();
		
	    Outer.Inner obj1 = obj.new Inner();
	    
	    obj1.msg();
	}

}
