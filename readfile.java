package com.java.filehandling;
import java.io.*;
import java.util.Scanner;

public class readfile {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		File myReader = new File("D:\\file System\\ak.txt");
		Scanner sc = new Scanner(myReader);
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
