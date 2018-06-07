package com.basic;

public class Reverse {
	public static void main(String args[])
	{
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	      
	      
	      for (int i = 0; i < numbers.length / 2; i++) {
	         int temp = numbers[i];
	         numbers[i] = numbers[numbers.length - 1 - i];
	         numbers[numbers.length - 1 - i] = temp;
	      } 
	      
	      
	}

}
