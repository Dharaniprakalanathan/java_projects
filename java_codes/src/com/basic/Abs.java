package com.basic;

public abstract class Abs {
	
	public Abs()
	{
		System.out.println("Abstract method empty ");
	}
	
	public abstract void getItem();
	
	

	public static void main(String args[])
	{
		SubAbs sub = new SubAbs();
	}
	
}



 class SubAbs extends Abs{
	 
	 public SubAbs()
	 {
		 System.out.println("Abstract method ");
	 }

	@Override
	public void getItem()
	{
		System.out.println("Good");
	}
		
	
	
		
	 
	
}