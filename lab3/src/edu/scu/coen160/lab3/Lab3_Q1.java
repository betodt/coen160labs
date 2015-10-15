package edu.scu.coen160.lab3;

/**
 * @(#)Stack.java
 */
class Array {
	
	private int [] itemList;
	private int maxLength = 10;
	
	public Array(int length){
		maxLength = length;
		itemList = new int[maxLength];
	}
	public Array(){
		itemList = new int[maxLength];
	}
	public void add(int index, int element){
		if (index < maxLength && index >= 0){
			itemList[index] = element;
		}
	}
	public int at(int index) throws Exception{
		if (index < maxLength && index >= 0){
			return itemList[index];
		}
		else {
			throw new Exception ("Invalid index");
		}
	}
	public void show()
	{
		for (int i = 0; i < itemList.length; ++i)
			System.out.print (itemList[i] +" ");
		System.out.println ();
	}	
}

class Stack {
	private Array a;
	private int top;
	
	public Stack() {
		a = new Array();
		top = 0;
	}
	
	public Stack(int length) {
		a = new Array(length);
		top = 0;
	}
	
	public void push(int item) {
		//if stack is empty, set it 
		if(top == -1)
			top = 0;
			
		a.add(top, item);
		top++;
	}

	public String pop() {
		String popped = "Nothing";
		try {
			popped = Integer.toString(a.at(top-1));
			
			top--;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return popped;
	}
	
	public void showStack() {
		// Show the elements in the order of LIFO	
		if(top == -1) 
			System.out.println("Stack Empty!");
		
		int i = 0;
		System.out.print("Stack: ");
		while (i < top) {
			try {
				System.out.print(a.at(i) + " ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			i++;
		}
		
		System.out.println();
	}
		
}

public class Lab3_Q1{
	
	public static void q1(){
		Stack myStack = new Stack(30);
		
		
		/*
		 * Question 1: Code would work with an empty stack
		 * comment out push below to show it works
		 * additionally pop 4 times to remove these elements
		 * 
		 * Q2: The try catch block allows my code to keep running even when an error occurs
		 */
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		
		System.out.println("Popped: " + myStack.pop());

//		uncomment this block to show that stack works even after popping all elements
		
//		System.out.println("Popped: " + myStack.pop());
//		System.out.println("Popped: " + myStack.pop());
//		System.out.println("Popped: " + myStack.pop());
//		
//		myStack.push(50);
		
		myStack.showStack();
		
	}
	
}