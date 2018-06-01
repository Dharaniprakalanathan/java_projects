package com.basic;

public class SavingsAccount {
	public static double annualInterestRate;
	double savingsBalance;
	
	public SavingsAccount(double balance)
	{
		this.savingsBalance = balance;
	}
	public  void MonthlyInterest()
	{
		double MonthlyInterest = (savingsBalance*(annualInterestRate/100.0))/12;
	    savingsBalance = savingsBalance + MonthlyInterest;
		System.out.println("The saving balance is" +savingsBalance);
		
	}
	public static void modifyInterestRate(int newvalue){
		 annualInterestRate = newvalue;
	}
	
	public static void main(String args[]) {
		SavingsAccount sb1 = new SavingsAccount(2000);
		SavingsAccount sb2 = new SavingsAccount(3000);
		SavingsAccount.modifyInterestRate(4);
		sb1.MonthlyInterest();
		sb2.MonthlyInterest();
		SavingsAccount.modifyInterestRate(5);                               
		sb1.MonthlyInterest();
		sb2.MonthlyInterest();
	}
	

}
