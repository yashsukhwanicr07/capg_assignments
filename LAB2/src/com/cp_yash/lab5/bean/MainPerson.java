package com.cp_yash.lab5.bean;

import com.cp_yash.lab5.bean.Person;

public class MainPerson {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1=new Person();
		Person obj2=new Person("Divya","Bharati",Gender.F,"9634563920");
		System.out.println(obj2.toString());

	}
}