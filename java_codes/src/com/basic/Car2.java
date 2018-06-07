package com.basic;

public class Car2 {
	private String model;
	private double speed;

	public Car2()
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
	
	public void accelerate(int speed) {
		this.speed=50.0;
		System.out.println("speed is:"+ speed);
	}
	
	
	public void accelerate(int speed,String model) {
		this.speed=60.0;
		this.model="audi";
		System.out.println("speed is:"+speed + "model is:"+ model);
	}
	
	
	public void accelerate(String model,int speed) {
		this.model="toyota";
		this.speed=70.0;
		System.out.println("model is:"+ model + "speed is:"+speed);
		
	}
	
	public void changeInt(int i)
	{
		i+=10;
		System.out.println(i);
	}

	public static void main(String args[])
	{
		Car2 car1 = new Car2();
		Car2 car2 = new Car2();
		car1.setSpeed(20.0);
		car2.setSpeed(30.0);
		System.out.println(car1.getSpeed());
		System.out.println(car2.getSpeed());
		
		car1.accelerate();
		car2.accelerate();
		System.out.println(car1.speed);
		
		car1.accelerate(50);
		car1.accelerate(60,"audi");
		car1.accelerate("toyota",70);
		
		int count=100;
		car1.changeInt(count);
		System.out.println(count);
		
	}
	}


