package com.basic;

public class Date {
	int Month;
	int Day;
	int Year;
	public Date()
	{
		
	}
public Date(int month,int day,int year)
{
	this.Month=month;
	this.Day=day;
	this.Year=year;
	
}

public int getMonth() {
	return Month;
}

public void setMonth(int month) {
	this.Month = month;
}

public int getDay() {
	return Day;
}

public void setDay(int day) {
	this.Day = day;
}

public int getYear() {
	return Year;
}

public void setYear(int year) {
	this.Year = year;
}
public void displayDate()
{
System.out.println(Month+"/"+Day+"/"+Year);
}
public static void main(String args[]) {
	Date d1 = new Date();
	d1.setMonth(11);
	d1.setDay(5);
	d1.setYear(1995);
	d1.displayDate();
	Date d2=new Date(6,22,2017);
	d2.displayDate();
	
}
}