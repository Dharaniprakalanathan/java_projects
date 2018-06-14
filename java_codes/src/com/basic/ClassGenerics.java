package com.basic;

public class ClassGenerics <D,S,R>{
	
	public ClassGenerics()
	{
		
	}

	public R getCustomer(D d,S s)
	{
		return null;
	}
	
	
public static void main(String args[])
{
	ClassGenerics <Double,Double,Integer> cs = new ClassGenerics <Double,Double,Integer>();
	Integer i = cs.getCustomer(10.0, 20.0);
	System.out.println(i);
	
	
}
}
