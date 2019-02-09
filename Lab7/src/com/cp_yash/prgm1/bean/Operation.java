package com.cp_yash.prgm1.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Operation 
{
	public ArrayList getSorted(ArrayList a)
	{
		
		ArrayList<Integer> temp=new ArrayList<Integer>();
		for(int i=0;i<4;i++)
		{
			int temp1=(int) a.get(i);
			StringBuilder temp2=new StringBuilder(Integer.toString(temp1));
			temp2.reverse();
			temp.add(Integer.parseInt(temp2.toString()));
		}
		Collections.sort(temp);
		return temp;
	}

}
