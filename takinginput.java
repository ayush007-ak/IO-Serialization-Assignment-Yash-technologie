package com.java.ioStudent;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.java.ioStudent.Student;

public class takinginput {
	

	public static void main(String[] args) {
		 int total;
		
		// TODO Auto-generated method stub
        Student s = new Student();
        try(Scanner sc = new Scanner(System.in)
        		) {
        	System.out.println("Student Name");
        	if(sc.hasNext()) {
        		s.setStudentName(sc.nextLine());
        	}else {
        		throw new InputMismatchException("Invalid Input");
        	}
        	System.out.println("Student Rollno");
        	if(sc.hasNextInt()) {
        		s.setRollno(sc.nextInt());
        	}
        	System.out.println("Sememster1 marks");
        	if(sc.hasNextInt()) {
        		s.setSemester1(sc.nextInt());
        	}
        	System.out.println("sem2");
        	if(sc.hasNextInt()) {
        		s.setSemester2(sc.nextInt());
        	}
        	System.out.println("Sem3");
        	if(sc.hasNextInt()) {
        		s.setSemester3(sc.nextInt());
        	}
        	
        	total=s.getSemester1()+s.getSemester2()+s.getSemester3()*100/300;
        	System.out.println("total percent : "+total);
        	
        }catch (InputMismatchException ex){
        	System.err.println("incorrect input");
        }
        if(s.getStudentName()==null || s.getRollno()==0 || s.getSemester1()==0.0 || s.getSemester2()==0 || s.getSemester3()==0) {
			System.out.println("Please try again later...");
		}else {
		System.out.println(s);
		}
        
        
        //for file
        try{
            File file = new File("D:\\file System\\student.txt"); 
            PrintWriter writer = new PrintWriter(file);
            writer.write(s.getStudentName() + " " + s.getRollno() + " "+ s.getSemester1() + " " + s.getSemester2()+ " " +s.getSemester3() + "total marks : " );
            writer.close();
        } catch(IOException e){
            e.printStackTrace();

        }
	}

}
