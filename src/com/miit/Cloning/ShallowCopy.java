package com.miit.Cloning;

class Abc implements Cloneable
{
	int i;
	int j;
	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}
	protected  Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
}

public class ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abc obj = new Abc();
		
		obj.i = 5;
		obj.j = 6;
		
		System.out.println("Obj Details : "  + obj);
		
		System.out.println("=========================================================================");
		
		Abc obj1=obj;
		
		System.out.println("Obj1 Details : " +obj1);
		
		System.out.println("=========================================================================");
		System.out.println("To verify the shallow copy , we are making change in Obj1 values whcih is copy of Obj.");
		System.out.println("After making Change in Obj1 values , if it also change the values of ObJ values then it proves that it is Shallow Copy");
		System.out.println("obj1.i=10;\r\n"
				+ "obj1.j=20;");
		
		obj1.i=10;
		obj1.j=20;
		
		System.out.println("============================================================================");
		System.out.println("Obj New Details : "  + obj);
		System.out.println("Obj1 New Details : " +obj1);
	}

}
