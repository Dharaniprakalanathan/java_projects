package com.basic;

public class PolyTest {
	
	public static void main(String args[])
	{
	
		PolyTest pt = new PolyTest();
		SportsCar sc = new SportsCar();
		PoliceCar pc = new PoliceCar();
		Taxi taxi = new Taxi();
		
		pt.brake(sc);
		pt.brake(pc);
		pt.brake(taxi);
		
		Carr car[] = {new Taxi(),new SportsCar(),new PoliceCar()};
	}
		
		public void brake(Carr car)
		{
			car.brake();
		}
		

}
