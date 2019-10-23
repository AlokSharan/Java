/*
JButton
How to Set Text in JButton()
How to Set Background color and Font color of JButton
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;


public class MyJButton2 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JButton button = new JButton("Click");
		button.setBounds(100, 50, 100, 40);
		
		Font f = new Font("Times new roman" , Font.BOLD , 18);
		button.setFont(f);
		
		button.setBackground(Color.GREEN);	 // Background color and Font color
		button.setForeground(Color.RED);
		
		//button.setText("Submit"); 			//Create Method and Over-right click me Button
		
		c.add(button);
		
		
	}

}
