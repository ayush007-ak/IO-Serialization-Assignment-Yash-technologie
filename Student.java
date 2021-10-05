package com.java.ioStudent;

import java.io.Serializable;

public class Student implements Serializable {
	
	 public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getSemester1() {
		return Semester1;
	}
	public void setSemester1(int semester1) {
		Semester1 = semester1;
	}
	public int getSemester2() {
		return Semester2;
	}
	public void setSemester2(int semester2) {
		Semester2 = semester2;
	}
	public int getSemester3() {
		return Semester3;
	}
	public void setSemester3(int semester3) {
		Semester3 = semester3;
	}
	 private int Rollno;
	 private String StudentName;
	 private int Semester1 ;
	 private int Semester2 ;
	 private int Semester3 ;
	 @Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", StudentName=" + StudentName + ", Semester1=" + Semester1
				+ ", Semester2=" + Semester2 + ", Semester3=" + Semester3 + "]";
	}
	

}
