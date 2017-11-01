package com.randomStuff;

public class StaticBlockExample {

	public static final int count;
	

	 static{
		 //to intialise static or static final variable. Or to run some code, 
		 //which u want to run just when the class is loaded
	 count = 42;
	 System.out.println("in static block: " + count);
	
	 }

	

}
