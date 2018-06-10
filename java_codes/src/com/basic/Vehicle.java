package com.basic;

public abstract class Vehicle implements Travel,Owner {

	}


class Bus extends Vehicle
{

@Override
public int getSpeed() {
	return 0;

}

@Override
public String getOwnerName() {
	return null;
}
}

class Cycle extends Vehicle
{

@Override
public int getSpeed() {
	return 0;

}

@Override
public String getOwnerName() {
	return null;
}
}

class Bike extends Vehicle
{

//@Override
public int getSpeed() {
	return 0;
	

}

@Override
public String getOwnerName() {
	return null;
}
}