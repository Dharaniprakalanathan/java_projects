package com.basic;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle() {
		
	}
public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
		if(length > 0.0 && length < 20.0 && width > 0.0 && width < 20.0)
		 {
			this.length = length;	
			this.width = width;
		}
		else
		{
			System.out.println("Enter number length and width between 0.0 to 20.0");
		}
			
		}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length > 0.0 && length < 20.0) {
			this.length = length;	
		}
		else
		{
			System.out.println("Enter number between 0.0 to 20.0");
		}
			
		}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width > 0.0 && width < 20.0) {
			this.width = width;
		}
		else
		{
			System.out.println("Enter number between 0.0 to 20.0");
		}	
		}
	public void findArearectangle() {
		if(length > 0.0 && length < 20.0 && width > 0.0 && width < 20.0)
		{
		
			System.out.println(length * width);
	}
		}
	public static void main(String arg[]) {
		Rectangle r1 = new Rectangle();
		r1.setLength(5);
	    r1.setWidth(17.0);
	   
	    Rectangle r2 = new Rectangle(8,25.0);
	   	    r1.findArearectangle();
	    r2.findArearectangle();
	}

}
