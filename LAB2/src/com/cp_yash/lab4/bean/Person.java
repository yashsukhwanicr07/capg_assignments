package com.cp_yash.lab4.bean;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	private String phoneNumber;
	Person(String a,String b,char c,String d){
		this.firstName=a;
		this.lastName=b;
		this.gender=c;
		this.phoneNumber=d;
		
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	Person()
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
		return "Details \n"+"-------------\n"+"FirstName: " + firstName + "\n" + "LastName: " + lastName +"\n" + "Gender :" + gender + "\n" + "Phone NUmber: " + phoneNumber;
	}
}



	

