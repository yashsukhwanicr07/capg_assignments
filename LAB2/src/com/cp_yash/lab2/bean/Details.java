package com.cp_yash.lab2.bean;

public class Details {
	private String firstName;
	private String lastName;
	private char gender;
	Details(String a,String b,char c){
		this.firstName=a;
		this.lastName=b;
		this.gender=c;
	}
	Details()
	{
		this.firstName="Divya";
		this.lastName="Bharati";
		this.gender='F';
	}
	

	public String getfName() {
		return firstName;
	}

	public void setfName(String firstName) {
		this.firstName = firstName;
	}

	public String getlName() {
		return lastName;
	}

	public void setlName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	public String toString()
	{
		return "Details \n"+"-------------\n"+"FirstName: " + firstName + "\n" + "LastName: " + lastName +"\n" + "Gender :" + gender;
	}
}


