package edu.scu.coen160.lab7;

import java.io.*;
import java.util.*;
import java.awt.Color;

class Sales{
	int quarter;
	int salesInK;
	
	public Sales (int quarter, int salesInK){
		this.quarter = quarter;
		this.salesInK = salesInK;
	}
	public int getAmount(){
		return salesInK;
	}
}
public class DataManager implements DataGetter{

	
	private Map<Color, Sales> sales =
            new LinkedHashMap<Color, Sales>();
	
	private Color [] salesColors;

    public void readDataFromFile(String fileName) 
    {
    	Sales saleByQ;
    	salesColors = new Color[4];
    	salesColors[0] = Color.red;
    	salesColors[1] = Color.green;
    	salesColors[2] = Color.blue;
    	salesColors[3] = Color.black;
    	BufferedReader reader = null;
    	try {
    
    		File inFile  = new File(fileName);  
    		reader = new BufferedReader(new FileReader(inFile));

        	//... Loop as long as there are input lines.
        	String line = null;
        	int lineCnt = 0;
        	try {      	
        		while ((line=reader.readLine()) != null) {
        			if (lineCnt >= 4) break;
            			// split each line into tokens
            		String [] fields = line.split(":");
            	    
      					// the String to int conversion happens here
      				int quarter = Integer.parseInt(fields[0].trim());
      				int salesAmount = Integer.parseInt(fields[1].trim());
      			
      				saleByQ = new Sales(quarter,salesAmount);
      			
			
		   		    sales.put(salesColors[lineCnt], saleByQ); 
            		++lineCnt;
    			} 		
    		}
    		finally{
    		
        		reader.close(); 
			}
    	}
    	catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
        catch (NumberFormatException e){
      			System.out.println("NumberFormatException: ");
      			System.exit(1);
    	}
		
        	 
    		
    }
    public Map<Color, Sales> getData()
    {
    	return sales;
    }
    
}