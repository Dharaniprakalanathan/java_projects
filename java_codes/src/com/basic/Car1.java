package com.basic;

public class Car1 {
private String model;
private double speed;

public Car1()
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

public void changeInt(int i)
{
	i+=10;
	System.out.println(i);
}

public static void main(String args[])
{
	Car1 car1 = new Car1();
	Car1 car2 = new Car1();
	car1.setSpeed(20.0);
	car2.setSpeed(30.0);
	System.out.println(car1.getSpeed());
	System.out.println(car2.getSpeed());
	
	car1.accelerate();
	car2.accelerate();
	System.out.println(car1.speed);
	
	int count=100;
	car1.changeInt(count);
	System.out.println(count);
	
}
}
