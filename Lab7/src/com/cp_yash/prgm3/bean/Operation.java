package com.cp_yash.prgm3.bean;

import java.util.ArrayList;

public class Operation
{
	public ArrayList<Integer> removeElements(ArrayList l1,ArrayList l2)
	{
		l1.removeAll(l2);
		return l1;
	}
}
	
