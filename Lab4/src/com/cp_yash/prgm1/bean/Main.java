package com.cp_yash.prgm1.bean;

public class Main {

	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.setName("Smith");
		Person p2=new Person();
		p2.setName("Kathy");
		Account smith=new Account();
		smith.setAccHolder(p1);
		smith.setBalance(2000);
		Account Kathy=new Account();
		Kathy.setAccHolder(p2);
		Kathy.setBalance(3000);
		smith.deposit(2000);
		System.out.println(smith.getBalance());
		Kathy.withdraw(2000);
		System.out.println(Kathy.getBalance());
		System.out.println(smith);
		System.out.println(Kathy);
	}
}
