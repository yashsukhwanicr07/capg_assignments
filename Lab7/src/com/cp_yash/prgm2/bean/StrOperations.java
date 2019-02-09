package com.cp_yash.prgm2.bean;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class StrOperations{
	String result="";
	String method1(String s1, String s2) {
		char arr1[]= s1.toCharArray();
		
		for(int i=0;i<arr1.length;i++)
		{
			if(i%2==0 && i!=arr1.length-1)
			{
				result=result+arr1[i]+ s2;	
			}
			else if(i%2==0 && i==arr1.length-1)
			{
				result=result+arr1[i];
			}
		}
		return(result);
	}
	String method2(String s1, String s2)
	{
		char arr1[]= s1.toCharArray();
		char arr2[]= s2.toCharArray();
		int len2= s2.length()-1;
		int temp=s2.length();
		if(s1.indexOf(s2)!=s1.lastIndexOf(s2))
		{
			int lastIndex=s1.lastIndexOf(s2);
			while(temp--!=0)
			arr1[lastIndex++]=arr2[len2--];
			
			return(new String(arr1));
		}
		else 
			return(s1+s2);
		
	}
	String method3(String s1, String s2)
	{
		if(s1.indexOf(s2)!=s1.lastIndexOf(s2))
		{
			String str=s1.replaceFirst(s2, "");
			return(str);
			
		}
		else 
			return("1111"+s1);
	}
	String method4(String s1, String s2)
	{
		if(s2.length()%2==0)
		{
			return(s2.substring(0, (s2.length())/2)+s1+s2.substring((s2.length()/2), s2.length()));
		}
		else
			
			return(s2.substring(0, ((s2.length())/2)+1)+s1+s2.substring((s2.length()/2)+1, s2.length()));
		}
	String method5(String s1, String s2)
	{
		String str=s1;
		char arr2[]=s2.toCharArray();
		for(int i=0;i<s2.length();i++)
		{
			String str2=Character.toString(arr2[i]);
			str=str.replaceAll(str2, "*");
		}
		return str;
	}
}