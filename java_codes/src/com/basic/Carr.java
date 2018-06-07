package com.basic;

public class Carr {
	private String model;
	private double speed;
	public Carr()
	{
		System.out.println("empty cons called");
	}
	
	public Carr(int speed)
	{
		this();
		this.speed=speed;
		System.out.println("one args cons called");
	}
	
	public Carr(int speed,String model )
	{
		this(speed);
		this.speed=speed;
		this.model=model;
		System.out.println("two args cons called");
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
		//Carr car1=new Carr();
		//Carr car2=new Carr(20);
		Carr car3=new Carr(30,"audi");
		//car1.speed=20.0;
		//car2.speed=10.0;
		//System.out.println(car1.speed);
		//System.out.println(car2.speed);
		//car1.accelerate();
		//car2.accelerate();
		//System.out.println(car1.speed);
		//System.out.println(car2.speed);
		
	}

}


