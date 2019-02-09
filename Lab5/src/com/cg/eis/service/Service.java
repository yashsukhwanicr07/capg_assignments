package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class Service implements EmployeeService 
{
	public void getEmployeeDetails(String name,double salary,String Designation)
	{
		Employee e=new Employee(name,salary,Designation);
		Service sv=new Service();
		String ins=sv.getInsuranceScheme(e);
		e.setInsuranceScheme(ins);
	}
	
	public String getInsuranceScheme(Employee e)
	
	{
		if(e.getSalary()>5000 && e.getSalary()<20000 && e.getDesignation().equals("System Associate"))
		{
			e.setInsuranceScheme("Scheme C");
		}
		else if(e.getSalary()>=20000 && e.getSalary()<40000 && e.getDesignation().equals("Programmer"))
		{
			e.setInsuranceScheme("Scheme B");
		}
		else if(e.getSalary()>=40000 && e.getDesignation().equals("Manager"))
		{
			e.setInsuranceScheme("Scheme B");
		}
		else if(e.getSalary()<5000 && e.getDesignation().equals("Clerk"))
		{
			e.setInsuranceScheme("No Scheme");
		}
		return e.getInsuranceScheme();
	
	}
	
	public String Display(Employee e)
	{
		return e.getName() + "," + e.getSalary() + "," +e.getDesignation() + "," +e.getInsuranceScheme() + "," + e.getEmployeeid();
	}
	

}
