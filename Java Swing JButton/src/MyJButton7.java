/*
Event Handling
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class MyFrame1 extends JFrame implements ActionListener {
	JButton button1 = new JButton("RED");
	JButton button2 = new JButton("YELLOW");
	JButton button3 = new JButton("GREEN");
	Container c;
	
	
MyFrame1() {
		
		c = this.getContentPane();
		c.setLayout(null);
		
		button1.setBounds(100, 50, 100, 50);
		button2.setBounds(300, 50, 100, 50);
		button3.setBounds(500, 50, 100, 50);
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		c.add(button1);
		c.add(button2);
		c.add(button3);
		
		}

public void actionPerformed(ActionEvent e) {		//Method Override
	
	if (e.getSource() == button1) {
		c.setBackground(Color.RED);
	}
	
	if (e.getSource() == button2) {
		c.setBackground(Color.YELLOW);
		
	}
	
	if (e.getSource() == button3) {
		c.setBackground(Color.GREEN);
		
	}
		
	}
}
	
	
	

public class MyJButton7{
	public static void main(String[] args) {
		
		MyFrame1 frame = new MyFrame1();
		frame.setTitle("My Sweet Home");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 50, 700, 500);
		
	}
	
}



/*

ActionListener in Java is a class that is responsible in handling all action 
events such as when the user clicks on a component. Mostly, action listeners 
are used for JButtons. An ActionListener can be used by the implements keyword 
to the class definition.

 */
