package com.miit.InputOutput;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("DataIO.txt");
		FileOutputStream fout=new FileOutputStream(f);
		
		DataOutputStream dout=new DataOutputStream(fout);
		
		dout.writeBytes("This is an Example of DataOutputStream.");
		
		dout.flush();
		dout.close();
		fout.close();
		System.out.println("success");
	}

}
