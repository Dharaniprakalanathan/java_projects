package com.basic;

public class Car1Example {
	
	
	public void aMethod(Car1 car1)
	{
		car1.setSpeed(500);
	}
	
	public static void main(String args[])
	{
		Car1 car1 = new Car1();
		car1.setSpeed(300);
		System.out.println(car1.getSpeed());
		
		Car1Example car1example = new Car1Example();
		car1example.aMethod(car1);
		System.out.println("Speed is:"+car1.getSpeed());
		
	}

}
