package com.java.filehandling;

import java.io.*;

public class fileExtensionexist {
	
	public static void mian(String args[]) {
		File file = new File("D:\\file System\\test1.txt");
		System.out.println("File extension is: "+ getFileExtension(file));
		
	}
	
	private static String getFileExtension(File file) {
		String filename = file.getName();
		if(filename.lastIndexOf(".") != -1 && filename.lastIndexOf(".") != 0);
		return
		filename.substring(filename.lastIndexOf(".")+1);
		else return "";
		
	}

}
