package com.basic;

public abstract class Animal implements Travel,Owner {

	}


class Lion extends Vehicle
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

class Cat extends Vehicle
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

class Rabbit extends Vehicle
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