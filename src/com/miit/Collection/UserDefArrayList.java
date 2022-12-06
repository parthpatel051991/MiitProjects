package com.miit.Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
	 int rollNo;
	 String name;
	 int age;
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
}




public class UserDefArrayList {

	public static void main(String args[])
	{
		Student s1=new Student(1, "Parth", 31);
		Student s2=new Student(2, "Bijal", 29);
		Student s3=new Student(3, "Kinjal", 30);
		
		ArrayList<Student> list= new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(st.rollNo +" "+st.name +" "+ st.age);
		}
		
		
		
	}
	
	
}
