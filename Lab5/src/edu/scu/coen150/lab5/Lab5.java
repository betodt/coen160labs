package edu.scu.coen150.lab5;

import java.awt.Color;
/**
 * @(#)Lab5.java
 */
import java.util.*; 

public class Lab5 {
/////////////////////////Exercise - 5//////////////////////////////

	public static Pawn [][] prepareBoard(){
		// Create a 3 x 2 array, call it board,  of Pawn objects with colors
		// of your choice.
		Random rand = new Random();
		//Color color;
		Pawn [][] board = new Pawn[3][2];
		String []colors = {"blue", "black", "white", "brown", "red", "green"};

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				//color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
				board[i][j] = new Pawn(colors[i*board[i].length + j]);
			}
		}
		
		return board;
	}
	public static void showBoard(Pawn [][] board){
		
		// Display board as a table showing pawn colors as
		//values of each cell
		
		for (int i = 0; i < board.length; i++) {
			System.out.print(" ");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].getColor());
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
	}

  
    public static void twoDimArray(){
    	
    	//Java treats 2d arrays as an array of arrays
    
    // create the single reference vals 
	int [][] vals;

	/* create the array of references 
		when you declare a 2D array:
		you must always specify the first dimension 
		vals = new int[][]; // ILLEGAL - NEEDS 1ST DIMENSION

		No need to specify the second dimension 
	*/
		vals = new int[5][]; // OK
		vals = new int[5][4]; // OK
		
		
		vals = new int[5][];

		// Now, to create the second level of arrays,
		for (int i=0; i < vals.length ; i++){

   			vals[i] = new int[4]; // create arrays of integers
    	}
    	// load values
    	// vals[i][j] represents a single value
    	// vals[i] - represents a single row (1d array) in vals
    
    	vals[0][0] = 20;
    	
    	System.out.println(vals[0][0]);
    
    }
 
    ///////////////////Exercise-4//////////////////////////////////
    
    
 	public static Book checkPrice(Book [] bookList, String title)
 	{
 		//int i = 0;
 		for (Book book : bookList) {
 			//System.out.println(i);
			if(book.getTitle().equals(title))
				return book;
			//i++;
		}
 		
 		return new Book("*NEW*" + title, 10.0);
 	}
 		
	

    public static void forEachLoop(){
    	
    	 //for-each loop: The basic for loop was extended in Java 5 to make iteration 
    	 //over arrays and other collections more convenient. 
		 //The for-each loop is used to access each successive value 
		 //in a collection of values.
    	 //
    	
    	double [] numList = {20.0,30.0,40.0,50.0, -40.0};
    	double sum = 0;
    	for (double d: numList)
    	{
    		if(d < 0) { continue; }
    		sum += d;
    	}
    	System.out.println(sum);
    	   	
    }
    
    
    ////////////////////Exercise 3//////////////////////////////////

    public static void copyArrays()
    {
    	int [] array1 = {1,2,3,4,5,6};
    	
    	// Copy array1 into array 2
    	int [] array2 = array1;
    	
    	// Now, change the value in array1[0]
    	array1[0] = 99;
    	
    	// What is the value in array2[0]? 
    	// AD - The value is 99, it is a shallow copy, reference, of array 1
    	// a) it is a shallow copy
    	
    	System.out.println(array2[0]);
    	
    	int [] array3 = Arrays.copyOf(array1,array1.length);
    	array1[0] = 222;
    	System.out.println(array3[0]);
    	// What is the value in array3[0]?
    	// AD - The value is 99, it made a deep copy on line 108
    	// b) copyOf copies as much of the array as needed to achieve the new length
    	// it will truncate the array of length is shorter than the array and pad with 0 if longer
    }
    
    ///////////////////////Exercise 2///////////////////////////////
    
    public static void displayCitiesInSortedOrder(String []cities){
    	
    	 // Display the cities in a sorted order
    	 // Use Arrays.sort(the arrayName)to sort the 
    	 // array.
    	 // Ref: http://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html
    	 // Display the contents of the array 
    	
    	Comparator<String> cmp_inst = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.equals(null) || o2.equals(null))
					return Character.MAX_VALUE;
				else
					return o1.compareToIgnoreCase(o2);
			}
		};
		
		Arrays.sort(cities, cmp_inst);
		
		for (String string : cities) {
			System.out.println(string);
		}
    	   	
    }
    
    public static void favoriteCities() {
    	
    	// Prompts the user to enter the number of 
    	// his/her favorite cities. And prompts to
    	// enter the city names, which are read into
    	// an array.
    	int howMany;
        String [] cities;

        System.out.print("Enter the number of your favorite cities: ");
        Scanner in = new Scanner(System.in);
        
        // Now create the cities object to accomodate the city names
        
        howMany = in.nextInt();
        cities = new String[howMany];
        
        System.out.println(cities.length);
        
    	// Read in the cities
        in.nextLine();//used to stop line skipping
        
        for (int i = 0; i < cities.length; i++){
                System.out.print("Enter the city name: ");
                cities[i] = in.nextLine();
        }

       // Call displayCities() and display the 
       // names in cities []
        
        displayCitiesInSortedOrder(cities);    		
   	
    }
    
   //////////////////////////////Exer1///////////////////////////
	// a) True, arrays in Java are static
	// b) False, Arrays in Java can't be resized;
 
    public static void exer1() {
    	int [] scores = new int[10];

    	// Load a value ...
    	scores[2] = 85;
    	scores[1] = 96;
    	
    	//scores[20] = 20; //out of bounds

    	// Display the value of 
   		 System.out.println(scores[1]);	
    }
    
    ///////////////////////////////////////////////////////////////
    public static void main(String [] args) {
    	// exer1();
    	// favoriteCities();
    	// copyArrays();
    	// forEachLoop();
    	twoDimArray();
    	showBoard(prepareBoard());
    	 
    	 // Exer 4 part b
    	 Book []books = new Book[7];
    	 
    	 int i = 1;
    	 
    	 for (Book book : books) {
			books[i-1] = new Book("Harry Potter " + i, 10.0 * i);
			//System.out.println(books[i-1].getTitle());
			i++;
		}
    	 
    	System.out.println(checkPrice(books, "Harry Potter 7").getTitle());
    	System.out.println(checkPrice(books, "Harry Potter 8").getTitle());
    	
    }
}
////////////////////////////////////////////////////////////////////

class Book {
    	private String title;
    	private double price;
    	
    	public Book(String title, double price)
    	{
    		this.title = title;
    		this.price = price;
    	}
    	
    	public String getTitle() {
    		return title;
    	}
    	
    }
 

 class Pawn 
 {
 	String color;
 	
 	public Pawn(String color)
 	{
 		this.color = color;
 	}
 	
 	public String getColor() {
 		return this.color;
 	}
 }
 	
 	
