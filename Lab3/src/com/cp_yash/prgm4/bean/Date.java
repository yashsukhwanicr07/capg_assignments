package com.cp_yash.prgm4.bean;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Date {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		String mnth=sc.next();
		int year=sc.nextInt();
		LocalDate d=LocalDate.of(year, Month.valueOf(mnth.toUpperCase()), day);
		Period p;
		p=d.until(LocalDate.now());		
	System.out.println(Math.abs(p.getDays()));
	System.out.println(Math.abs(p.getMonths()));
	System.out.println(Math.abs(p.getYears()));

}
}
