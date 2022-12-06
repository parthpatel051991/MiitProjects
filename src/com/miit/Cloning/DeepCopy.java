package com.miit.Cloning;

public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abc obj = new Abc();
		
		obj.i=5;
		obj.j=6;
		
		System.out.println("Obj Details : "  + obj);
		
		System.out.println("==========================================================");
		
		Abc obj1 = new Abc();
		
		System.out.println("Obj1 Details Before copy : " +obj1);
		
		System.out.println("===========================================================");
		
		System.out.println("Deep Copy Manually");
		
		obj1.i=obj.i;
		obj1.j=obj.j;
		
		System.out.println("obj1.i=obj.i;\r\n"
				+ "obj1.j=obj.j;");
		
		System.out.println("==============================================================");
		
		System.out.println("Obj1 After Deep Copy Details : " +obj1);
		
		System.out.println("===============================================================");
		
		System.out.println("Verification of Deep Copy");
		System.out.println("We will change the details of Obj1 and it should not affect the value of obj(original object)");
		
		obj1.i=10;
		obj1.j=20;
		
		System.out.println("obj1.i=10;\r\n"
				+ "obj1.j=20;");
		
		System.out.println("====================================================================");
		System.out.println("Obj verification Details : "  + obj);
		System.out.println("Obj1 verification Details : " +obj1);
		
		System.out.println("=====================================================================");
		System.out.println("Since Obj details not get affected , it proves that obj1 is deep copy of obj");
	}

}
