package edu.scu.coen160.lab3;

public class Lab3_Q4 {
	public static void q4() {
		 char[] fromArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			    'h', 'i', 'j', 'k', 'l', 'm' };
        char[] toArray = new char[10];

        System.arraycopy(fromArray, 2, toArray, 0, 10);
        System.out.println(new String(toArray));
          
        
        // Exercise 4_1
        char [] arr = new char[5];
        arr[0] = 'A';  arr[1] = 'B';   arr[2] = 'C';  arr[3] = 'D';
        
        // Write code to insert 'X' in the middle of array, using arraycopy(). 
        char [] fromArr = new char[1];
        fromArr[0] = 'X';
        
        System.arraycopy(fromArr, 0, arr, 0, 1);
        System.out.println(new String(arr)); // Should print ABXCD
        
        
        // Exercise 4_2
        char [] courseName = {'C','O','E','N','2','1','6','0'};
        // Write code to remove '2' from courseName, using arraycopy().
        System.arraycopy(courseName, 5, courseName, 4, 3);
        courseName[courseName.length-1] = ' ';
        System.out.println(new String(courseName)); // Should print COEN160
        
        
	}
}
