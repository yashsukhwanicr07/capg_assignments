package com.cp_yash.prgrm2.bean;

import java.util.Arrays;

public class StringPositive {
	public String inputString(String str)
	{
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

}
