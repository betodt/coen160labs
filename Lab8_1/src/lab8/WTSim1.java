/*
 * Alberto Diaz
 * Lab 8, pt 1
 * COEN 160L
 * 
 */
package lab8;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;
class WaterTank extends Observable{
	
	final int CAPACITY = 1000;
	final int ADDED_VOLUME_PER_STEP = 800;
    int currentVolume = 0;  
    boolean shutOff = false;

    WaterTank(int c){currentVolume = c;}
    WaterTank(){}

    public void flowIn(int addedVolume){     		
      		if (currentVolume+addedVolume < CAPACITY){
      			currentVolume += addedVolume;
      			open();		
      		}
      		System.out.println(currentVolume);
    }
    public void flowIn(){     		
  		if (currentVolume+ADDED_VOLUME_PER_STEP < CAPACITY){
  			currentVolume += ADDED_VOLUME_PER_STEP;
  			open();		
  		}
    }
     public void flowOut(){
    	 if (!shutOff){
      		currentVolume -= 30;
      		
      		// Volume changed. Therefore notify the observers
      		
      		setChanged();
  			notifyObservers(); // a) this tells the observer that a change has occurred
    	 }
     }
     public void open(){
    	 shutOff = false;
     }
     public void setShutOff(boolean flag) {shutOff = flag;}
     public int getCurrentVolume() { return currentVolume;}
    
}  

class LevelMonitor implements Observer{    

    final int CRITICAL_LEVEL;
    int critCount;
    
    WaterTank tank; // this is the Observable object that should be observed
	
    public LevelMonitor (int level,WaterTank t){
        this.CRITICAL_LEVEL = level;
        critCount = 0;
        tank = t;  
        // add this as the observer on tank
        tank.addObserver(this);
        
        if (tank.getCurrentVolume() > CRITICAL_LEVEL){
        	tank.open();
        }
    }
    public LevelMonitor(){
    	this.CRITICAL_LEVEL = 10;
    	critCount = 0;
    }


    // b) this method is called when LevelMonitor is notified
    public void update(Observable o,Object t){
    	
       int volume = tank.getCurrentVolume();
       if (volume <= CRITICAL_LEVEL){
    	   System.out.print("CRITICAL: "+volume);
    	   System.out.println(" Shutting off WaterTank");
    	   critCount++;
    	   tank.setShutOff(true);
       }
       else
    	   System.out.println("Levels OK: "+volume + ", Times tank hit critical: " + critCount);
    }     
}

//////////////////////////////////////////////////

public class WTSim1 extends JFrame implements ActionListener{

	
	WaterTank tank = new WaterTank(200);		
	LevelMonitor monitor = new LevelMonitor(50,tank);
	
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("in")){
			tank.flowIn();
		}
		else if (e.getActionCommand().equals("out")){
			tank.flowOut();
		}
		
	}
	public static void main(String[] args) {
				
		WaterTank tank = new WaterTank(200);		
		LevelMonitor monitor = new LevelMonitor(50,tank);
		
		tank.flowOut();
		tank.flowOut();
		tank.flowOut();
		tank.flowOut();
		tank.flowOut();
		tank.flowOut();
		tank.flowOut();
		tank.flowOut();
		tank.flowIn(800);
		tank.flowOut();
		tank.flowOut();
		
		

	}

}
