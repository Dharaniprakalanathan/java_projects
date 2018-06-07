package com.basic;

public class MinMax {
	public static void main(String args[])
	{
		
	int a[] = {3,4,5,2,33,24,2};
	int min = a[0],m;
	for(int i=0; i<a.length; i++) {
		if(a[i]<=min)
		{
			 m= a[i];
	
			System.out.println("The min is:"+m);
		}
	
		if(a[i]>min)
		{
			int n=a[i];
			System.out.println("The max is:"+n);
		}
		
}
	}	}