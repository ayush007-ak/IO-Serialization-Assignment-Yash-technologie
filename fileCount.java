package com.java.filehandling;
import java.io.*;
public class fileCount {

	public static void main(String[] args) {
		
		
		File filecount = new File("D:\\file System");
		int filecal= filecount.list().length;
		System.out.println("file count: "+filecal);
		// TODO Auto-generated method stub

	}

}
