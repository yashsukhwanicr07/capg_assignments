package com.cp_yash.prgm4.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
public static void main(String[] args) {
List<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(3);
	
Squares obj = new Squares();
Map<Integer, Double> map=obj.getSquares(list);
for(Integer keys : map.keySet())
{
	String key = keys.toString();
String value = map.get(keys).toString();
System.out.println(key + "  :  " + value);
}
}
}