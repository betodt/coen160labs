package edu.scu.coen160.lab2_exercises;

import java.util.Scanner;

// Exercise1.java
class CheckThings {
	public boolean isItALeapYear(int year){

		// This method should check if the parameter year is a leap year and return a true.
		// Otherwise a false.

		// A leap year is a year that is divisible by 4 and not by hundred  OR
		// it is divisible by 400.

		// Complete the code segment. Fix any errors in the method signature.

		return (year % 400 == 0) ? true : (year % 100 == 0) ? false : (year % 4 == 0) ? true : false;
	}
}

public class Exercise1 {
    public static void tester1() {
    	
    	CheckThings checker = new CheckThings();
        
        // Insert code to check, by calling the method you have written,
        //  if the following years are leap years or not.
        // 1716,1989, 1992, 2000, 2010, 2012. 
        // Test your code with other years of your choice.
    	
    	System.out.println("Exercise 1:");
    	System.out.println("Is it a leap year?");
       
       // static references
       
//       System.out.println("1716: " + CheckThings.isItALeapYear(1716));
//       System.out.println("1989: " + CheckThings.isItALeapYear(1989));
//       System.out.println("1992: " + CheckThings.isItALeapYear(1992));
//       System.out.println("2000: " + CheckThings.isItALeapYear(2000));
//       System.out.println("2010: " + CheckThings.isItALeapYear(2010));
//       System.out.println("2012: " + CheckThings.isItALeapYear(2012));
       
       //instance references
	     System.out.println("1716: " + checker.isItALeapYear(1716));
	     System.out.println("1989: " + checker.isItALeapYear(1989));
	     System.out.println("1992: " + checker.isItALeapYear(1992));
	     System.out.println("2000: " + checker.isItALeapYear(2000));
	     System.out.println("2010: " + checker.isItALeapYear(2010));
	     System.out.println("2012: " + checker.isItALeapYear(2012));
    }
    
    public static void tester2() {
    	CheckThings checker = new CheckThings();
    	
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Enter a year:");
    	
    	int year = in.nextInt();
    	
    	// static reference
    	//System.out.println(year + ": " + CheckThings.isItALeapYear(year));
    	
    	// instance reference
    	System.out.println(year + ": " + checker.isItALeapYear(year));
    	
    	in.close();
    }
	
}
