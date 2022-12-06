package com.miit.InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fin = new FileInputStream("Demo.txt");
		
//		int i = fin.read();
		
//		System.out.println((char)i);     // o/p -> W
 		
		int i=0;    
        while((i=fin.read())!=-1){    
         
        	System.out.print((char)i);    
        }    
        fin.close();  
		
		
		

	}

}
