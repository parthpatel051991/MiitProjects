package com.miit.InputOutput;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fout = new FileOutputStream("Demo.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		String s = "BufferedOutputStream";
		
		byte b[]=s.getBytes();
		
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		
		System.out.println("success");
		
	}

}
