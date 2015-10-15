package edu.scu.coen160.lab2_exercises;
// Exercise3.java

class RandomNumbers {
	
	public static void genRandNum(int range, int count){
		
		// The Math.random() method returns random double numbers 
		// in the range >=0.0 to <1.0 . 
	
		// To scale the number to a range of 0-10 for example, we need
		// to multiply it with 10 and cast it to an int to truncate the 
		// fractional part.
		
		//int rand = (int) (10.0 * Math.random()) ;
		
		
		// Modify the program such that the method takes 2 parameters, namely,
		// the range and a count of how many numbers to generate in the method.
		// The method generates and prints the count of numbers 
		System.out.println("Exercise 3:");
		
		while (count > 0) {
			System.out.println((int) (range * Math.random()));
			count--;
		}
		
	}

}


public class Exercise3 {

    public static void tester () {
    	
    	// Generate 10 numbers in the range of 0-10
     	RandomNumbers.genRandNum(50,10);
    		
    }
    
    
}