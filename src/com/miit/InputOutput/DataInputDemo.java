package com.miit.InputOutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DataInputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream fin =new FileInputStream("DataIO.txt");
		
		DataInputStream din=new DataInputStream(fin);
		
//		int count=din.available();
		
		byte b[]=din.readAllBytes();
		
//		din.read(b);
		
		for(byte bt:b) {
			
			char k = (char)bt;
			System.out.print(k+" ");
		}
		
		fin.close();
		din.close();
		
	}

}
