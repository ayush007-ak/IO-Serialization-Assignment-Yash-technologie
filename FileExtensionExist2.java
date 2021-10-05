package com.java.filehandling;
import java.io.*;

public class FileExtensionExist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\file System");
		
		
		try {
		File[] files = file.listFiles();
		System.out.println("Files\t\t\tExtension");
		
		
		for(File fileses:files) {
			String fileName=fileses.toString();
			int index = fileName.indexOf('.');
			 if(index > 0) {
			        String extension = fileName.substring(index + 1);
			        System.out.println(fileName + "\t" + extension);
			      }	
		}
		}catch (NullPointerException e){
			System.err.println("error");
		}
		

	}

}
