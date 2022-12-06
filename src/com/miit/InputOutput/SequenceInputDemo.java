package com.miit.InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream input1=new FileInputStream("demo.txt");
		FileInputStream input2=new FileInputStream("C:\\Users\\cadet\\eclipse-workspace EE\\MiitPractice\\Demo1.txt");
		
		//We will read the data from two files and will put in third file
		FileOutputStream fout=new FileOutputStream("demo2.txt");
		
		SequenceInputStream inst = new SequenceInputStream(input1,input2);
		
//		int j;
//		
//		while((j=inst.read())!=-1) {
//			
//			System.out.print((char)j);
//			fout.write(j);
//		}
		
		
		// We will USE enumeration to read above three files.
		
		FileInputStream input3= new FileInputStream("Demo2.txt");
		FileInputStream input4= new FileInputStream("Demo3.txt");
		
		Vector v=new Vector();
		
		v.add(input1);
		v.add(input2);
		v.add(input3);
		v.add(input4);
		
		Enumeration e =v.elements();
		
		//passing enumeration objects to StreaminputStream constructor
		
		SequenceInputStream inst1=new SequenceInputStream(e);
		
		int i;
		while((i=inst1.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
		
		
		
		
		inst.close();
		inst1.close();
		input1.close();
		input2.close();
		input3.close();
		input4.close();
		fout.close();
		
	}

}
