package com.java.filehandling;
import java.io.*;

public class writefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter filewrite = new FileWriter("D:\\file System\\ak.txt");
			filewrite.write("Java is good programming language");
	        filewrite.close();
	        System.out.println("Succesfully wroteth file");
	        
		}catch (IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
		

	}

}
