package com.basic;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle() {
		
	}
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
		}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length > 0.0 && width < 20.0)
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(length > 0.0 && width < 20.0)
		this.width = width;
	}
	public double findArearectangle() {
		return length * width;
	}
	public static void main(String arg[]) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(8,15.0);
	    r1.setLength(5);
	    r1.setWidth(17.0);
	    r1.findArearectangle();
	    r2.findArearectangle();
	    System.out.println( r1.findArearectangle());
	    System.out.println( r2.findArearectangle());
	}

}
