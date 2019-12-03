/*30. Create a class to calculate Area of circle with one data member to store the radius and another to store area value.
Create method members
  1. init - to input radius from user
  2. calc - to calculate area
  3. display- to display area*/ 

import java.util.Scanner;


public class CricleArea {
	private int  radius;
	double result;
	void init()
	{
		System.out.println("Enter the radius\n");
		Scanner sc= new Scanner(System.in);
		
		radius=sc.nextInt();
	}
	
	double cal()
	{
		result=3.14*radius*radius;
		return result;
		
	}
	void display()
	{
		System.out.println("area of circle "+result);
		
	}
	
	public static void main(String[] args)
	{
		CricleArea ca = new CricleArea();
		ca.init();
	    ca.cal();
	    ca.display();
	    
	}
	

}
