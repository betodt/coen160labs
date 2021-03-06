package edu.scu.coen160.lab3;

/**
 * Lockable Items
 */
// Define Lockable interface

class Box implements Lockable{
	private String boxno;
	private String key;
	boolean locked = false;
	
	public Box(String boxno){
		this.boxno = boxno;
		
		// create the key by concatenating 
		// box number with the word "key"
		
		this.key = this.boxno + "key";
	}
	public void lock(String key){
	
		if (key.equals(this.key)){
			locked = true;
		}
	}
	public void unlock(String key){
		if (key.equals(this.key)){
			locked = false;
		}
	}
	public void show(){
		if (!locked){
			System.out.println("Box:Showing Contents");
		}
		else
			System.out.println("Box:Locked");
	}
}

class Laptop implements Lockable{
	private String password;
	private boolean locked = false;
	
	public Laptop (String pword){
		// call setPassword() with pword
		this.setPassword(pword);
	
	}
	public Laptop (){
		password = null;
	}
	public void setPassword(String pword){
	
		// Write code to check if pword is null, set locked to false.
		// You can write it by just adding an appropriate check to the code below
		if(pword == null) 
			this.locked = false;
		
		this.password = null;
	
	}
	public void lock(String pword){
		if (!locked)	// if not locked already, lock it
			setPassword(pword);
		
	}
	public void unlock(String pword){
		
		// Write code to check if locked is true or false.
		// if false do nothing.
		// If true, compare password and pword. If they are
		// equal, set locked to false.
		
		if(this.locked == true)
			if(this.password == pword)
				locked = false;
		
	}
	public void show(){
		if (!locked){
			System.out.println("Laptop:ready");
		}
		else
			System.out.println("Laptop:Locked");
	}
	
	
}


public class Lab3_Q3{
	
	public static void q3(){
		Box box1 = new Box ("1234");
		
		box1.lock("1234");
		
		box1.unlock ("1234");
		box1.show();
					
		Laptop c1 = new Laptop();
		c1.lock("coen160");
		c1.show();
		
		c1.unlock("coen160");
		c1.show();
		
		Lockable [] items = new Lockable[2];
		
		items[0] = box1;
		items[1] = c1;
		
		
		// Would this work? not until show is added to the interface
		
		items[0].show();
		
		// If not, why not?
		
		
		
		
	}
	
}