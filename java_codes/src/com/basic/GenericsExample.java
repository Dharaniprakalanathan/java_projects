package com.basic;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
	
	public static void main(String args[])
	{
		List list = new ArrayList();
		
		list.add("String one");
		list.add("String two");
		list.add("String three");
		
		String abc = (String)list.get(0);
		System.out.println(abc);
		
		
        List<String> listone = new ArrayList();
		
		listone.add("String one");
		listone.add("String two");
		listone.add("String three");
		
		String abc1 =listone.get(1);
		System.out.println(abc1); 
		add(10.0,30.0);
		add("one","two");
		add(new Car(),new Taxi());
		
		
	}
	
	public static <D,S> double add(D d,S s) {
		System.out.println(d);
		System.out.println(s);
		return 20.0;
	}

}
