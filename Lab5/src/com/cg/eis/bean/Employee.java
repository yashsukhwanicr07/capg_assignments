package com.cg.eis.bean;

public class Employee {
	public static int id=0;
	private int Employeeid=id;
	public Employee(String name,double salary,String designation)
	{
		 id++;
		 Employeeid=id;
		 this.Designation=designation;
		 this.name=name;
		 this.salary=salary;
	}
	private String name;
	private double salary;
	private String Designation;
	
	private String InsuranceScheme;
	
	public String getName() {
		return name;
	}
	
	public int getEmployeeid() {
		return Employeeid;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getInsuranceScheme() {
		return InsuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		InsuranceScheme = insuranceScheme;
	}

}
