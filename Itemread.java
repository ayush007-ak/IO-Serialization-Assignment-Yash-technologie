package com.java.serializationTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Itemread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(InputStream os = new FileInputStream("D:\\file System\\emp.txt");
			ObjectInputStream ois = new ObjectInputStream(os);	)
				
		
				{
			Item item = (Item)ois.readObject();
			System.out.println(item);
					
				}catch(IOException | ClassNotFoundException item) {
					item.printStackTrace();
				}

	}

}
