package com.java.serializationTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class Itemimplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Item item = new Item();
        item.setItemId(101);
        item.setItemDescription("iphone");
        item.setItemDiscountPercentage(10);
        item.setItemUnitPrice(20000);
        item.setItemQuantityAvailable(2);
        
        
        //serialization
        try (OutputStream os = new FileOutputStream("D:\\file System\\emp.txt");
            	ObjectOutputStream op = new ObjectOutputStream(os);){
        	op.writeObject(item);
        	
        }catch(IOException e) {
        	e.printStackTrace();
        }
        
        //deseralization
        try(
				InputStream is=new FileInputStream("D:\\file System\\emp.txt");
				ObjectInputStream ois=new ObjectInputStream(is);
			   ){
				Item it = (Item)ois.readObject();
				System.out.println(it);
//				BWhichIsImplementingSerilizable b=(BWhichIsImplementingSerilizable)ois.readObject();
//				System.out.println(b);
//				System.out.println(b.getA());
				
			}catch(IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
}
