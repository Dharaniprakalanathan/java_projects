package com.basic;
import java.util.Scanner;
public class User {
	public static void main(String args[])
	{
		int number1,number2,sum;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		 number1 = scan.nextInt();
		 
		System.out.println("Enter first number:");
	    number2 = scan.nextInt();
		
	    sum = number1+number2;
		System.out.println("The sum is:"+sum);
	}

}
