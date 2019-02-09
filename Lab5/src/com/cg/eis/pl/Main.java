package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String temp=sc.nextLine();
		Employee e1=new Employee(sc.next(),sc.nextDouble(),temp);
		Service sv1=new Service();
		sv1.getInsuranceScheme(e1);
		System.out.println(sv1.Display(e1));
		
		
	

	}

}
