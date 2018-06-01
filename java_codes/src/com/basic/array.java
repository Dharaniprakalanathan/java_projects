package com.basic;

public class array {
	
	public static void main(String args[]) {
		int arr[] = new int[8];
		int N=12345,i=0;
		
		while(N!=0)
		{
			 arr[i] = N % 10;
			System.out.print(arr[i]);
			i++;
			N=N/10;
			
			}
		
	}
	
}
