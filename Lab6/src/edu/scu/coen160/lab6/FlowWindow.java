package edu.scu.coen160.lab6;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FlowWindow extends JFrame implements ActionListener{
     
    public FlowWindow() {
    	setTitle("FlowLayout");
    	
        Container contentPane = getContentPane();
        
        JPanel panel = new JPanel();
        
        // FlowLayout (int align, int hgap, int vgap);
        //Exer 1 b) vgap added more vertical space between the buttons
        
        //Exer 1 c) I can comment out this line because the default layout 
        //			for jpanel is FlowLayout
        // 			the default for JFrame is BorderLayout
   		//panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 30));
        
   		JButton b1 = new JButton("Button 1");
   		JButton b2 = new JButton("BT2");
   		JButton b3 = new JButton("Button 3");
   		JButton b4 = new JButton("Long-Named Button 4");
   		JButton b5 = new JButton("Button 5");
   		
   		
//		contentPane.add(b1);
//        contentPane.add(b2);
//        contentPane.add(b3);
//        contentPane.add(b4);
//        contentPane.add(b4);
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b4);
        
        contentPane.add(panel);
        
        b1.addActionListener(this);
   		b2.addActionListener(this);
   		b3.addActionListener(this);
   		b4.addActionListener(this);
   		b5.addActionListener(this);
   		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		//Exer 1 a)this statement sets the opening location 
		//			of the panel to the center of the screen
		setLocationRelativeTo(null);
    }
     public void actionPerformed( ActionEvent event ){
         JOptionPane.showMessageDialog( null,
            "You pressed: " + event.getActionCommand() );
    }
    public static void main(String args[]) {
        FlowWindow window = new FlowWindow();
      
    }
}
