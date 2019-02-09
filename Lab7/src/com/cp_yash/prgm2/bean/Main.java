package com.cp_yash.prgm2.bean;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s1= "capgemini";
	String s2="pg";
	System.out.println("s1="+s1 +"s2="+s2  );
	List<String> list = new ArrayList<String>();
	StrOperations obj= new StrOperations();
	String str=obj.method1(s1,s2);
	System.out.println("s1="+str +"s2="+s2  );
	list.add(str);
	String str2=obj.method2(str,s2);
	list.add(str2);
	System.out.println("----s1="+str2 +"s2="+s2  );
	
	String str3=obj.method3(str2,s2);
	list.add(str2);
	System.out.println("----s1="+str3 +"s2="+s2  );
	
	String str4=obj.method4(str3,s2);
	list.add(str4);
	System.out.println("----s1="+str4 +"s2="+s2  );
	
	String str5=obj.method5(str4,s2);
	list.add(str5);
	System.out.println("----s1="+str5
			+"s2="+s2  );
}
}