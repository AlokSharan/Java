/*
Event Handling for JButton

How to Write Action Listener for a JButton

ActionListener
void actionPerformed()
addActionListener()
 */

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
	
	JButton button = new JButton("Submit");
	Container c;
	
	
	MyFrame() {
		
		c = this.getContentPane();
		c.setLayout(null);
		
		button.setBounds(100, 50, 100, 50);
		
		c.add(button);
		
	}
	
}


public class MyJButton6{
	public static void main(String[] args) {
		
		MyFrame frame = new MyFrame();
		frame.setTitle("My Sweet Home");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 50, 700, 500);
		
	}
	
}