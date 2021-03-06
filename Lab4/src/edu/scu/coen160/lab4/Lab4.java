package edu.scu.coen160.lab4;

import java.util.*;
import java.util.regex.Pattern;

class MissedFlight extends Exception{
	String flight;
	public MissedFlight(String flight){
		// Write a statement to initialize the data member 
		// flight with the parameter
		try{
			if(Pattern.matches("[a-zA-Z]{2,3}\\d+", flight)){
				this.flight = flight;
			}
			else {
				throw new Exception("Invalid flight number.");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}	
	public String toString(){
		return "Missed "+flight;
	}
}
class CanceledFlight extends Exception{
	String flight;
	public CanceledFlight(String flight){
		// Write a statement to initialize the data member 
		// flight with the parameter
		try{
			if(Pattern.matches("[a-zA-Z]{2,3}\\d+", flight)){
				this.flight = flight;
			}
			else {
				throw new Exception("Invalid flight number.");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}	
	public String toString(){
		return "Missed "+flight;
	}
}

 
public class Lab4 {
    
	public static void exer1(){
        int denominator, numerator;
        numerator   = 4;
        denominator = 0;
        
        //excercise 1: this contains a divide by zero exception
        //we need to make sure denominator is initialized to a 
        //non-zero number
        //stack trace: java.lang.ArithmeticException
        System.out.println("Result: "+numerator / denominator);
        
        //this part was not printed w/ the exception
        System.out.println("exer1 - end."); 
    }
	
	public static void exer1_fix(){
        int denominator, numerator;
        numerator   = 4;
        denominator = 0;
        
        try {
        	System.out.println("Result: "+numerator / denominator);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
        
        //now that we have a try catch block
        //this statement will print
        System.out.println("exer1 - end."); 
    }
	/*
	 * The first time I ran this, I entered 4
	 * The program output:
	 * 
	 * 		Enter an integer: 4
	 * 		The square of 4 is 16
	 * 		exer2 - end.
	 * 
	 * The ending statement did print
	 * 
	 * The second time runnin this code,
	 * I entered the string "oops"
	 * This was the output:
	 * 
	 * 		Enter an integer: oops
	 * 		Exception in thread "main" java.util.InputMismatchException
	 * 		at java.util.Scanner.throwFor(Scanner.java:864)
	 * 		at java.util.Scanner.next(Scanner.java:1485)
	 * 		at java.util.Scanner.nextInt(Scanner.java:2117)
	 *	 	at java.util.Scanner.nextInt(Scanner.java:2076)
	 * 		at edu.scu.coen160.lab4.Lab4.exer2(Lab4.java:85)
	 * 		at edu.scu.coen160.lab4.Lab4.main(Lab4.java:94)
	 * 
	 * The exer2-end statement did NOT print
	 */
	public static void exer2(){
	    Scanner scanner = new Scanner( System.in);
	    int num ;

	    System.out.print("Enter an integer: ");
	    num = scanner.nextInt();
	    // Squaring the number input
	    System.out.println("The square of " + num + " is " + num*num );
             
        System.out.println("exer2 - end."); 
	}
	
	/*
	 * Here I used a try catch around the scanner and squaring
	 * functions to ensure we are working with a valid input
	 * 
	 * This is the output: 
	 * 
	 * Enter an integer: oops
	 * java.util.InputMismatchException
	 * exer2 - end.
	 * 
	 * And exer2 - end printed
	 */
	public static void exer2_fix(){
	    Scanner scanner = new Scanner( System.in);
	    int num;

	    System.out.print("Enter an integer: ");
	    
	    try {
			num = scanner.nextInt();
			// Squaring the number input
		 	System.out.println("The square of " + num + " is " + num*num );

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	   
        System.out.println("exer2 - end.");
        scanner.close();
	}
	
	/*
	 * Parsed string inputs for integers
	 * in an infinite loop
	 * until integer is given
	 */
	public static void exer2_2(){
	    Scanner scanner = new Scanner( System.in);

	    while (true) {
	    	System.out.print("Enter an integer: ");
	    	String input = scanner.next();
		    int num;
	    	try {
				num = Integer.parseInt(input);
				// Squaring the number input
			 	System.out.println("The square of " + num + " is " + num*num );
			 	break;
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e);
			}
		}
		    
	   
        System.out.println("exer2 - end.");
        scanner.close();
	}

	public static void exer4(int status,String flight){
		try {
		      switch(status){
		      	case 1:
		      		throw new MissedFlight(flight);
		      	case 2:
		    	  	throw new CanceledFlight(flight);
		      	default:
		    	  	System.out.println("Arriving as planned");
		      }
		}
		catch (MissedFlight e) {
		      System.out.println(e);
		}
		catch (CanceledFlight e) {
		      System.out.println(e);
		}
		finally {
		      // Block of code that is always executed when the try block is exited,
		      // no matter how the try block is exited.
		      System.out.println("Appointment moved to 11th March");
		}
		System.out.println("exer4 - done\n");
	}
	
	public static void main(String[] args) {
//		//using try catch here still catches the exception thrown
//		//thrown in the function
//		try {
//			Lab4 .exer1();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.err.println(e);
//		}
		
		Lab4.exer4(1,"AA123");
		Lab4.exer4(3,"AA123");
		Lab4.exer4(2,"12345");
		Lab4.exer4(1,"AA124353");
		Lab4.exer4(3,"AAB12343");
		Lab4.exer4(2,"12345AA");
		Lab4.exer4(1,"A123");
		Lab4.exer4(3,"AbA123");
		Lab4.exer4(2,"aBBa12345");
		
	}

}
