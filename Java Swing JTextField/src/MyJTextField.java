/*
JTextField 
How to Create setBounds
*/

import java.awt.Container;
import javax.swing.*;


public class MyJTextField {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 100, 500, 400);
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JTextField myField = new JTextField();
		myField.setBounds(100, 50, 200, 40);
		
		c.add(myField);
		
		
		
	}

}
