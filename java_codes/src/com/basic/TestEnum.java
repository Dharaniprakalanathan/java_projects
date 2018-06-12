package com.basic;

public class TestEnum {
	
	public static void main(String args[])
	{
		Level level = Level.HIGH;
		System.out.println(level.getClass().getName());
		System.out.println(level.name());
		System.out.println(level.ordinal());
		System.out.println(level.levelcode);
		System.out.println(level.getlevelcode());
		
		
		Level levelone = Level.MEDIUM;
		switch(levelone)
		{
		case HIGH:
			System.out.println("This is High");
			break;
			
		case MEDIUM:
			System.out.println("This is MEDIUM");
			break;
			
		case LOW:
			System.out.println("This is LOW");
			break;
			}
			
			Level levelTwo[] = Level.values();
			for(int i=0;i<levelTwo.length;i++)
			{
				System.out.println(levelTwo);
			}
			
		}
		
	}


