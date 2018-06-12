package com.basic;

public enum Level {

	 HIGH(3),
	 MEDIUM(2),
	 LOW(1);
	 
	  final int levelcode;
	
	private Level(int levelcode)
	{
		this.levelcode = levelcode;
	}
	
	public int getlevelcode()
	{
		return this.levelcode;
	}
}
