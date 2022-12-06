package com.miit.InputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("Demo.txt");

		try {

			FileOutputStream fos = new FileOutputStream(f);

			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("demo content");

			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);

			String str = dis.readUTF();

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}