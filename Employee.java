package com.java.serializationTest;
import java.io.Serializable;

public class Employee implements Serializable{
	private int empId;
	public Employee(int empId, String empFirstName, String empLastName, String empDOB, String empGender) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empDOB = empDOB;
		this.empGender = empGender;
	}
	private String empFirstName;
    private String empLastName;
    private String empDOB;
    private String empGender;
	
    public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	
	} 

class Manager extends Employee{
	
	private int managerId;

	public Manager(int empId, String empFirstName, String empLastName, String empDOB, String empGender, int managerId) {
		super(empId, empFirstName, empLastName, empDOB, empGender);
		this.managerId = managerId;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
}

}
