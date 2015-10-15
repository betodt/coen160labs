package edu.scu.coen160.lab2_exercises;
// Exercise2.java

class StringExercise {
	
	public static String fullName(String firstName, String middleName, String lastName){
		
		// Create a string for full name as lastName, firstName,first letter of 
		// middle name followed by a . (dot). The first initials of first and last
		// names and the middle initial should be in upper case and the rest in lower
		// case.
		// For example, Robert (first), alan (middle) and Smith (last) should be 
		// written as Smith, Robert A.
		// Return the full name. 
		
		String firstNameF = firstName.toLowerCase();
		if (firstNameF != "")
			firstNameF = Character.toUpperCase(firstNameF.charAt(0)) + firstNameF.substring(1) + " ";
		
		String middleNameF = middleName.toLowerCase();
		if (middleNameF != "")
			middleNameF = Character.toString(middleNameF.charAt(0)).toUpperCase() + ".";
		
		String lastNameF = lastName.toLowerCase();
		if (lastNameF != "")
			lastNameF = Character.toUpperCase(lastNameF.charAt(0)) + lastNameF.substring(1) + ", ";
		
		return lastNameF + firstNameF + middleNameF;
		
	}
	public static boolean palindrome(String text){
		
		// check if text is a palindrome and return a true if it is and
		// false otherwise.
		
		StringBuffer originalStr = new StringBuffer(text.toLowerCase().replaceAll("[^a-zA-Z]", ""));
		String one = originalStr.toString();
		
		StringBuffer tempStr = new StringBuffer(originalStr.reverse());
		String two = tempStr.toString();
		
		return one.equals(two);
	}
}


public class Exercise2 {

    public static void tester() {
    	// Test fullName with the following data
    	// robert (first), james (middle), CLARK (last)
    	// Test with data of your choice. 
    	
    	System.out.println("Exercise 2:");
    	System.out.println(StringExercise.fullName("robert", "james", "CLARK"));
    	System.out.println(StringExercise.fullName("alberto", "", "diAz"));
    	System.out.println(StringExercise.fullName("beto", "", ""));
    	
    	// Test palindrome() with the following data
    	// A man, a plan, a canal, Panama
    	// desserts
    	// radar
    	// Madam
    	
    	System.out.println("A man, a plan, a canal, Panama: " + StringExercise.palindrome("A man, a plan, a canal, Panama"));
    	System.out.println("desserts:" + StringExercise.palindrome("desserts"));
    	System.out.println("radar: " + StringExercise.palindrome("radar"));
    	System.out.println("Madam: " + StringExercise.palindrome("Madam"));    		
    }
    
    
}