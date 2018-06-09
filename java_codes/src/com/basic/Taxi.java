package com.basic;

public class Taxi extends Carr {
	
	public Taxi()
	{
		System.out.println("Taxi cons empty");
		
	}
	
	public Taxi(int speed)
	{
		super(speed);
		System.out.println("Taxi cons one args");
	}
	
	public Taxi(int speed,String model )
	{
		this(speed);
		
		System.out.println("two args cons called");
	}
	
	@Override
	public void brake() {
		super.brake();
		System.out.println("brake in taxi called");
		
	}
	
	public static void main(String args[])
	{
		Taxi taxi = new Taxi(5,"audi");
		taxi.brake();
	}

}
