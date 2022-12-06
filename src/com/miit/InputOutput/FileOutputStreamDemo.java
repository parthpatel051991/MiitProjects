package com.miit.InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fout=new FileOutputStream("Demo.txt");
		
		
//		fout.wait(65); // o/p -> A
		
		
		String str ="Welcome to Java";
		
		byte b[]=str.getBytes();
		
		fout.write(b);     // o/p -> Welcome to Java
		fout.close();
		System.out.println("success");
	}

}
