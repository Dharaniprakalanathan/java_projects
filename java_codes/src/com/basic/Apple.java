package com.basic;

public class Apple {
	public static void main(String[] args)
	{
		int a = 10;
		
		System.out.println(a++);
		
		System.out.println(a--);
		
		System.out.println(a<20);
		
		System.out.println(a>20);
		
		System.out.println(a<=10);
		
		System.out.println(a>=10);
		
		System.out.println(a==10);
		
		System.out.println(a!=20);
		
		boolean isTrue = false;
		System.out.println(!isTrue);
		
		System.out.println(a%2 == 0);
		
		System.out.println(6 & 3);
		
		System.out.println(6 | 3);
		
		System.out.println(6 ^ 3);
		
		System.out.println((a<20)? a : 0);
		
		System.out.println(a==10 & isTrue);
		
		System.out.println(a==10 & !isTrue);
		
        System.out.println(a==10 | isTrue);
		
		System.out.println(a==10 | !isTrue);
		
		System.out.println(isTrue && confirm());
	}
		
		public static boolean confirm() {
		return false;
		
		
		
		
		
		
		
	}

}
