package com.basic;

public class Car {
	private String model;
	private double speed;
	public Car()
	{
		
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public boolean start()
	{
		return true;
	}
	public void accelerate()
	{
		speed+=10;
	}
	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car();
		car1.speed=20.0;
		car2.speed=10.0;
		System.out.println(car1.speed);
		System.out.println(car2.speed);
		car1.accelerate();
		car2.accelerate();
		System.out.println(car1.speed);
		System.out.println(car2.speed);
		
	}

}
