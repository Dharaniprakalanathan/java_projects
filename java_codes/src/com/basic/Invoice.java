package com.basic;

public class Invoice {
	String partNumber;
	String partDescription;
	double price;
	int quantity;
	public Invoice()
	{
		
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0)
		{
			this.price = 0.0;
		}else
		{
		this.price = price;
	}}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0)
		{
			this.quantity=0;
			
		}
		else
		{
		this.quantity = quantity;
	}}
	public double getInvoiceAmount()
	{
		return price*quantity;
	}
	public static void main(String args[])
	{
		Invoice invoice1 = new Invoice();
		invoice1.setPartNumber("Ani");
		invoice1.setPrice(500);
		invoice1.setPartDescription("bolt");
		invoice1.getInvoiceAmount();
		invoice1.setQuantity(10);
		System.out.println(invoice1.getInvoiceAmount());
	}
	}


