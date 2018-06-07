package com.basic;

public class Sta {
	static int count =10;
	
	static {
		count++;
		System.out.println("First static block called"+count);
	}
	
	public Sta()
	{
		count++;
		System.out.println("cons block called"+count);
	}

	public void getItem()
	{
		count++;
		System.out.println("Instance()" +count);
	}
	
	public static void getcus()
	{
		count++;
		System.out.println("static()" +count);
	}
	
	public static void main(String args[])
	{
		Sta.count++;
		Sta.getcus();
		Sta sta = new Sta();
		sta.getItem();
		sta.getcus();
		sta.count++;
		System.out.println("value: "+count++);
	}
	static 
	{
		count++;
		System.out.println("second static block called"+count);
	}}