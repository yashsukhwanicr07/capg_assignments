package com.cp_yash.prgm2.bean;

public class CurrentAccount extends Account 
{
	final long overdraftLimit=10000;
	static long drawnAmount=0;
	public void withdraw(double a)
	{
		if(drawnAmount>=10000)
		{
			System.out.println("Limit Exceed");
		}
		else
		{
			setBalance(this.getBalance()-a);
			drawnAmount+=a;
		}
	}

}
