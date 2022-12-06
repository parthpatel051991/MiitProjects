package com.miit.practice;

public class AreaInheritance {




	public void fillColor(String n) 
	{
		System.out.println("This shape's color is "+n );

	}
}

class Rectangle extends AreaInheritance{
	
	
	
	

	public void fillColor(String n) 
	{
		System.out.println("-------------------");
		System.out.println("This shape's color is "+n );

	}

	public void calAreaRectangle(int length,int width) {


		System.out.println("Area of Rectangle is : "+ (length*width));

	}
	
	
	
	public void calAreaRectangle(double length,double width) {


		System.out.println("Area of Rectangle is : "+ (length*width));

	}
	
	public void calAreaRectangle(double length,double width,String color) {


		System.out.println("Area of Rectangle is : "+ (length*width) + " it is filled with "+color);

	}
	
	
}
	class Triangle extends AreaInheritance{


		public void calAreaTriangle(double base,double height)
		{

			double area = (base*height)/2;

			System.out.println("Area of Traingle is :" + area);


		}

		public void calAreaTriangle(double base,double height,String color)
		{

			double area = (base*height)/2;

			System.out.println("Area of Traingle is :" + area +" it is filled with :"+color);


		}
		
		
	}

	class Circle extends AreaInheritance
	{
		public void calAreaCircle(double radius) 
		{
			double area = 3.14 * radius *radius ;

			System.out.println("Area of circle is :"+area);
		}




	}

	class TestAreaInheritance{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Circle c1 =new Circle();
		Triangle t1=new Triangle();
		Rectangle r1=new Rectangle();
		
		
		c1.fillColor("Blue");
		c1.calAreaCircle(5);
		
		System.out.println("==============================================================");
		
		t1.fillColor("Red");
		t1.calAreaTriangle(5, 6);
		
		System.out.println("==============================================================");
		
		
		r1.calAreaRectangle(5, 10);
		r1.fillColor("Green");
		
		

	}
	
	}
