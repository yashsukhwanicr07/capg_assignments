package com.cp_yash.prgm1.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<4;i++)
		{
			a.add(sc.nextInt());
		}
		Operation obj=new Operation();
		System.out.println(obj.getSorted(a));
		
		
	}

}
