package com.basic;

public class Model {
	public static void main(String args[])
	{
		Travel Travelone = new Bus();
		Travel TravelTwo = new Cat();
		
		System.out.println(Travelone instanceof Bus);
		
		Travel Travelthree = new Rabbit();
		Owner owner = (Rabbit)Travelthree;
		
		System.out.println(owner instanceof Rabbit);
		
	}


}
