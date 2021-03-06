//Excercise 4 Lab 6

package edu.scu.coen160.lab6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
// Exercise2.java

class inputWindow extends JFrame implements ActionListener{
	
	private JTextField fN = new JTextField(10);
	private JTextField mN = new JTextField(10);
	private JTextField lN = new JTextField(10);
	private JTextField fullN = new JTextField(10);

	public inputWindow() {
		JButton inputButton = new JButton("Full Name");
		JPanel inputPanel, outputPanel, buttonPanel;
		
		Container contentPane = getContentPane();
		
		inputPanel = new JPanel();
		outputPanel = new JPanel();
		buttonPanel = new JPanel();
		
		inputPanel.add(new JLabel("First Name"));
		inputPanel.add(fN);
		
		inputPanel.add(new JLabel("Middle Name"));
		inputPanel.add(mN);
		
		inputPanel.add(new JLabel("Last Name"));
		inputPanel.add(lN);

		outputPanel.add(new JLabel("Full Name"));
		outputPanel.add(fullN);
		
		buttonPanel.add(inputButton);
		
		contentPane.add(inputPanel, BorderLayout.NORTH);
		contentPane.add(outputPanel, BorderLayout.CENTER);
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		
		inputButton.addActionListener( this );
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		fullN.setText(StringExercise.fullName(fN.getText(), mN.getText(), lN.getText()));
	}
}

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
		if (firstNameF.length() > 0)
			firstNameF = Character.toUpperCase(firstNameF.charAt(0)) + firstNameF.substring(1) + " ";
		
		String middleNameF = middleName.toLowerCase();
		if (middleNameF.length() > 0)
			middleNameF = Character.toString(middleNameF.charAt(0)).toUpperCase() + ".";
		
		String lastNameF = lastName.toLowerCase();
		if (lastNameF.length() > 0)
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
    
    public static void main(String args[]) {
		inputWindow inWin= new inputWindow();
	}
}