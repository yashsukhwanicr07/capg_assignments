package com.cp_yash.prgm1.bean;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		String name="RamSwaroop";
		System.out.println("Enter your choice");
		System.out.println("1-Add the String to itself\n" + 
				"2-Replace odd positions with # \n" + 
				"3- Remove duplicate characters in the String\n" + 
				" 4-Change odd characters to upper case");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		StrOperations obj=new StrOperations();
		switch(ch)
		{
		case 1:
			obj.addStr(name);
			break;
		case 2:
			obj.replac(name);
			break;
		case 3:
			obj.duplicate(name);
			break;
		case 4:
			obj.changeCase(name);
			break;
		default:
			System.out.println("invalid choice");
		}
	}
}