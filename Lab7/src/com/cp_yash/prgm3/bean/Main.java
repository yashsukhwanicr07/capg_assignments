package com.cp_yash.prgm3.bean;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements in list1");
		int n1=sc.nextInt();
		System.out.println("enter no of elements in list2");
		int n2=sc.nextInt();
		System.out.println("enter elements in list1");
		for(int i=0;i<n1;i++)
		{
			l1.add(sc.nextInt());
		}
		for(int i=0;i<n2;i++)
		{
			l2.add(sc.nextInt());
		}
		Operation obj=new Operation();
		l1=obj.removeElements(l1, l2);
		System.out.println(l1);
	}
}
