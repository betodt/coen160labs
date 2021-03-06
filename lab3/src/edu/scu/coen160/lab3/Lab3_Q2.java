package edu.scu.coen160.lab3;

class PowerUser {
	public void powerDown() {
		//print out what we are powering down
		System.out.println("Powering " + this.getClass().getSimpleName() + " down!");
	}
}
class EmergencyLight extends PowerUser {}
class Computer extends PowerUser {}
class TV extends PowerUser {}

class BuildingManager {
	PowerUser things[] = new PowerUser[24];
	int numItems = 0;

	public void powerDownAtNight( ) {
		//AD: only power down items we have added
		for (int i=0; i<numItems; i++)
			things[i].powerDown();
	}

	/** Add an PowerUser to this building */
	public void add(PowerUser thing) {
	
		things[numItems] = thing;
		
		//AD: increment num items after each add
		numItems++;
	}

}
public class Lab3_Q2 {
	public static void q2() {
		BuildingManager b1 = new BuildingManager( );
	
		b1.add(new EmergencyLight()); 

		b1.add(new Computer());
	
		b1.add(new TV());

		b1.powerDownAtNight( );
	}
}
