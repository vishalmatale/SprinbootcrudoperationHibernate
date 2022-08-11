package com.tcs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private int empName;
	private int empAdress;
	private int empEmail;
	private int empAge;
	private int empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpName() {
		return empName;
	}
	public void setEmpName(int empName) {
		this.empName = empName;
	}
	public int getEmpAdress() {
		return empAdress;
	}
	public void setEmpAdress(int empAdress) {
		this.empAdress = empAdress;
	}
	public int getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(int empEmail) {
		this.empEmail = empEmail;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAdress=" + empAdress + ", empEmail="
				+ empEmail + ", empAge=" + empAge + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
