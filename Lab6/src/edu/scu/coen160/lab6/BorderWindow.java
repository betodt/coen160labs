package edu.scu.coen160.lab6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderWindow extends JFrame {
     
    public BorderWindow() {
	
		setTitle("BorderLayout");
		Container contentPane = getContentPane();
		
		//this removes the top button 
//        contentPane.add(new JButton("Button 1 (NORTH)"),
//                        BorderLayout.NORTH);
		
		//this removes the center button
//        contentPane.add(new JButton("2 (CENTER)"),
//                        BorderLayout.CENTER);
		
		//this removes the west (left) button
//        contentPane.add(new JButton("Button 3 (WEST)"),
//                        BorderLayout.WEST);
		
		//this removes the south button
//        contentPane.add(new JButton("Long-Named Button 4 (SOUTH)"),
//                        BorderLayout.SOUTH);
		
		//this removes the east button
//        contentPane.add(new JButton("Button 5 (EAST)"),
//                        BorderLayout.EAST);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
		pack();
		setVisible(true);
    }

    public static void main(String args[]) {
        BorderWindow window = new BorderWindow();
    }
}
