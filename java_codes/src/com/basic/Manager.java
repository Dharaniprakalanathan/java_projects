package com.basic;

public class Manager {
	double salary;
	String name;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Manager()
	{
		
	}
	public boolean start()
	{
		return true;
	}
	public void accelerate()
	{
		salary+=100;
	}
	public static void main(String[] args)
	{
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		m1.salary=10000;
		m2.salary=20000;
		System.out.println(m1.salary);
		System.out.println(m2.salary);
		m1.accelerate();
		System.out.println(m1.salary);
	}

}
