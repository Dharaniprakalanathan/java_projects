package com.basic;
import java.util.Scanner;
public class Airline {
	 int seating[] = {0,0,0,0,0,0,0,0,0,0};
	 
	public static void main(String[] args){
		int seating[] = {0,0,0,0,0,0,0,0,0,0};
        Scanner input = new Scanner(System.in);
        int count = 0;
        int number=5;

        System.out.println("Please type 1 for First Class or 2 for Economy: "); 
        Airline airline = new Airline();
        
        airline.check(9);
        airline.economySeat(6);
        airline.check(4);
        airline.firstClassSeat(4);
        
        int section = input.nextInt();

        if (section == 1) 
        {
        	
        	airline.firstClassSeat(count);
        }

        else 
        {
        	airline.economySeat(number);
        }
	}
public  void firstClassSeat(int count )
     {
	
        if (seating[count] < 5)
        {
        	System.out.println("Seat no:"+count);
            System.out.println("class : Firstclass");
       
            count++;
            
        }
        else
        {
        	System.out.println("Sorry, the flight is fully booked");
        }
     }
     
public  void economySeat(int number)
{
         if (seating[number] <10)
            {
                System.out.println("Seat no:"+number);
                System.out.println("class : Economyclass");
                
                number++;
                
            }
            else
            {
            	System.out.println("Economy is fully booked");
                System.out.println("Economy is fully booked. Would you like a seat in First Class? Type 1 for Yes or 2 for No: ");
               
                Scanner input = new Scanner(System.in);
                int choice = input.nextInt();

                if (choice == 1)
                    {
                	
                    }

                    else
                    {
                        System.out.println("Next flight is in 3 hours."); 
                    }

               }
}
public boolean check(int num)
{
	int i = num;
	if(seating[i-1]==1) {
		System.out.println("The seat "+i+"is no longer available");
		System.out.println();
		return true;
	}
	else
	{
		System.out.println("The seat "+i+"is empty");
		System.out.println();
		return false;
	}
}

public void assignment(int choice)
{
	if(choice == 2)
	{
		System.out.println("Next flight is in 3 hours.");
	}
	else if(choice == 1)
	{
		firstClassSeat(1);
	}
	else
	{
		System.out.println("Please enter your decision");
	}
}
}
