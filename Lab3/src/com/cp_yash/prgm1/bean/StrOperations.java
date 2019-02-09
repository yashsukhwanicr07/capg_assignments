package com.cp_yash.prgm1.bean;

public class StrOperations {
	
	public void addStr(String str)
	{
		System.out.println(str+str);
	}
	public void replac(String s)
	{
		int i;
		String temp="";
		for(i=0;i<s.length();i++)
		{
			if(i%2==0)
				temp=temp+"#";
			else
				temp=temp+s.charAt(i);
				
		}
		System.out.println(temp);
	}
	public void duplicate(String s)
	{
		String temp="";
		int i;
		int j;
		int c=0;
		for(i=0;i<s.length();i++)
		{
			for(j=0;j<temp.length();j++)
			{
				if(s.charAt(i)==temp.charAt(j))
					c=1;
			}
			if(c==0)
				temp=temp+s.charAt(i);
			c=0;
				
		}
		System.out.println(temp);
	}
	public void changeCase(String s)
	{
		int i=0;
		String temp="";
		for(i=0;i<s.length();i++)
		{
			if(i%2==1)
				temp=temp+Character.toUpperCase(s.charAt(i));
			else
				temp=temp+s.charAt(i);
		}
		System.out.println(temp);
		
	}
}
