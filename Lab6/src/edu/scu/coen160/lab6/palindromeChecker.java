package edu.scu.coen160.lab6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class PalindromeChecker extends JFrame {
   private JButton palindromeBtn;
   private JTextField inputTxtFld;
   

   public PalindromeChecker(){
      super( "PalindromeChecker" );
      // get content pane
      Container container = getContentPane();
      // set the layout
      container.setLayout( new FlowLayout() );
      
      // ***create the text field 
      inputTxtFld = new JTextField(10);
      
      // ***Add the text field to the frame
      container.add(inputTxtFld);
      
      // ***Create the button
      palindromeBtn = new JButton("Check it!");
    
	  // ***Add the button to the frame
     container.add(palindromeBtn);

	 
      // create an instance of inner class ButtonHandler
      // to use for button event handling

      ButtonHandler handler = new ButtonHandler();
     
      // ***Add the handler as the ActionListener on the button
      palindromeBtn.addActionListener(handler);

      setSize(600,300);
      setVisible( true );
   }
   
   // inner class for button event handling
   private class ButtonHandler implements ActionListener {
      // handle button event
      public void actionPerformed( ActionEvent event ){
    	  
    	  // Read the input from the inputTxtField
    	  // and call the method, isItPalindrome wit the input
    	  
    	  String input = inputTxtFld.getText();
    	  
    	  boolean result = isItPalindrome(input);
    	  
         JOptionPane.showMessageDialog( null, "Is " +input +" a palindrome? :"+result);
      }
      public boolean isItPalindrome(String input){
    	  // A StringBuilder class has methods append()a dn
    	  // reverse() methods
    	  
    	  StringBuilder strBuilder = new StringBuilder();
    	  strBuilder.append(input);
    	  strBuilder = strBuilder.reverse();
    	  
    	  // Convert the strBuilder into a String 
    	  String reversedStr = strBuilder.toString();
    	  
    	  // ***Now compare the input and reversed strings using equals()
		  // return the result
    	  // Ref: https://docs.oracle.com/javase/tutorial/java/data/comparestrings.html  
    	  
    	  if(reversedStr.compareToIgnoreCase(input) == 0)
    		  return true;
    	  
    	  return false;
      }         
      
   } // end private inner class ButtonHandler
     
	// execute application
	   public static void main( String [] args ){
	      PalindromeChecker application = new PalindromeChecker();

	      application.setDefaultCloseOperation(
	         JFrame.EXIT_ON_CLOSE );
	   }
}
