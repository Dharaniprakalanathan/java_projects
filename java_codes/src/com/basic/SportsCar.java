package com.basic;

public class SportsCar extends Carr{
	int i = 100;
	
	public SportsCar()
	{
		System.out.println("Taxi cons empty");
		
	}
	
	public SportsCar(int speed)
	{
		super(speed);
		System.out.println("Taxi cons one args");
	}
	
	public SportsCar(int speed,String model )
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
		//Taxi taxi = new Taxi(5,"audi");
		//taxi.brake();
		
		Carr car = new SportsCar();
		car.brake();
		System.out.println(car.i);
		System.out.println(car instanceof SportsCar);
			
	}

}
