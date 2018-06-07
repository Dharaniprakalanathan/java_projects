package com.basic;

public class Payment {
	static double salary;
	static double commission;
    int count[] = new int[10];
	
    public static double getSalary() {
		return salary;
	}
	public static void setSalary(double salary) {
		Payment.salary = salary;
	}
	public static double getCommission() {
		return commission;
	}
	public static void setCommission(double commission) {
		Payment.commission = commission;
	}
    
	public void CalculatePayment(int grosssales)
	{
		double newsalary = salary+(grosssales*(commission/100.0));
		System.out.println(newsalary);
		salary = newsalary;
	}
	
	public void setrange(double salary)
	{
		if(salary>=200 && salary<300)
		{
			System.out.println("A range");
			int oldvalue = count[0];
			int newvalue = oldvalue+1;
			count[0] = newvalue;
			System.out.println("The salespeople earned salaries in each of the ranges "+count[0]);
		}
		
		else if(salary>=300 && salary<400)
		{
			System.out.println("B range");
			int oldvalue = count[1];
			int newvalue = oldvalue+1;
			count[1] = newvalue;
			System.out.println("The salespeople earned salaries in each of the ranges "+count[1]);
		}
		
		else if(salary>=400 && salary<500)
		{
			System.out.println("c range");
			int oldvalue = count[2];
			int newvalue = oldvalue+1;
			count[2] = newvalue;
			System.out.println("The salespeople earned salaries in each of the ranges "+count[2]);
		}
		
		else if(salary>=500 && salary<600)
		{
			System.out.println("D range");
			int oldvalue = count[3];
			int newvalue = oldvalue+1;
			count[3] = newvalue;
			System.out.println("The salespeople earned salaries in each of the ranges "+count[3]);
		}
		
		else if(salary>=600 && salary<700)
		{
			System.out.println("E range");
			int oldvalue = count[4];
			int newvalue = oldvalue+1;
			count[4] = newvalue;
			System.out.println("The salespeople earned salaries in each of the ranges "+count[4]);
		}
		
		else if(salary>=700 && salary<800)
		{
			System.out.println("F range");
			int oldvalue = count[5];
			int newvalue = oldvalue+1;
			count[5] = newvalue;
			System.out.println("The salespeople earned salaries in each of the ranges "+count[5]);
		}
		
		else if(salary>=800 && salary<900)
		{
			System.out.println("G range");
			int oldvalue = count[6];
			int newvalue = oldvalue+1;
			count[6] = newvalue;
			System.out.println("The salespeople earned salaries in each of the ranges "+count[6]);
		}
		
		else if(salary>=900 && salary<1000)
		{
			System.out.println("H range");
			int oldvalue = count[7];
			int newvalue = oldvalue+1;
			count[7] = newvalue;
			System.out.println("The salespeople earned salaries in each of the ranges "+count[7]);
		}
		
		else if(salary>1000 )
		{
			System.out.println("I range");
			int oldvalue = count[8];
			int newvalue = oldvalue+1;
			count[8] = newvalue;
			System.out.println("The salespeople earned salaries in each of the ranges "+count[8]);
		}
		
		else 
		{
			System.out.println("Out of range");
			int oldvalue = count[9];
			int newvalue = oldvalue+1;
			count[9] = newvalue;
			System.out.println("The salespeople earned salaries in each of the ranges "+count[9]);
		}
	}
		
		public static void main(String args[])
		{
		   Payment payment = new Payment();
		   payment.setSalary(200.0);
		   payment.setCommission(9);
		   payment.CalculatePayment(5000);
		   payment.setrange(salary);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
    
	


