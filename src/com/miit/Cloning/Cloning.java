package com.miit.Cloning;

public class Cloning {


	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Abc obj = new Abc();
		
		obj.i=5;
		obj.j=6;
		
		Abc obj1 = (Abc) obj.clone();
		
		System.out.println("Obj details :"+obj);
		
		System.out.println("Obj1 details : " +obj1);
		
		System.out.println("============To check weather is it Shallow or deep Copy ? =============");
		
		obj1.i=10;
		obj1.j=20;
		
		System.out.println("obj1.i=10;\r\n"
				+ "obj.j=20;");
		
		System.out.println("============After changing values of obj1 ==============================");
		
		System.out.println("Obj New Details : "  + obj);
		System.out.println("Obj1 New Details : " +obj1);  
		
		System.out.println("=========================================================================");
		System.out.println("Summary : So its look externally shallow and internally its deep copy . So Clonable copy is \r\n" +
		"combination of shallow and deep copy");
		
		
		
		
	}

}
