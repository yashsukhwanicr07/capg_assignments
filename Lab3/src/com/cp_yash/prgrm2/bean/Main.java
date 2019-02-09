package com.cp_yash.prgrm2.bean;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ant";
		StringPositive sp=new StringPositive();
		String temp=sp.inputString(str);
		if(temp.equals(str))
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
		
	}
}
