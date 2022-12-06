package com.miit.InputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("demo4.txt");
		File g = new File("demo5.txt");

		FileOutputStream fout = new FileOutputStream(f);
		FileOutputStream gout = new FileOutputStream(g);
		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		String s = "This is an example of ByteArray Output/Input Stream.";

		byte b[] = s.getBytes();

		bout.write(b);
		bout.writeTo(fout);
		bout.writeTo(gout);

		ByteArrayInputStream bin = new ByteArrayInputStream(b);

		int i;
		while ((i = bin.read()) != -1) {

			System.out.print((char) i);
		}

		bin.close();
		fout.close();
		gout.close();
		bout.flush();

	}

}
