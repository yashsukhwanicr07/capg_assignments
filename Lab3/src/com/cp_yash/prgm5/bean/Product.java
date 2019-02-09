package com.cp_yash.prgm5.bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Product {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int year=sc.nextInt();
		LocalDate d=LocalDate.of(year, Month.valueOf(s1.toUpperCase()), 1);
		System.out.println("Enter Expiry Date");
		int exy=sc.nextInt();
		int exm=sc.nextInt();
		LocalDate p;
		p=d.plusYears(exy);
		p=p.plusMonths(exm);
		System.out.println(p);
		sc.close();
		}
	}
