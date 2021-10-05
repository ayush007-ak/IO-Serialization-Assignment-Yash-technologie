package com.java.filehandling;
import java.io.*;//importing everthing from io package
import java.io.IOException;


public class  readWritefile{
	public static void main(String args[]) {
		try{
			File myobj = new File("D:\\file System\\ayush.txt");
			if(myobj.createNewFile()) {
				System.out.println("Filcreated : "+myobj.getName());
			}else {
				System.out.println("file already exist");	
			
			}
			
		} catch(IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
	}

}
