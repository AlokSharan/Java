/*
JPasswordField
How to Create
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;


public class MyJPasswordField {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Password");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("Password");				//JLabel field Create
		label.setBounds(69, 87, 106, 30);
		
		Font f = new Font("Ariel" , Font.BOLD , 20);		//Label font Create
		label.setFont(f);
		
		
		JPasswordField password = new JPasswordField();		//JPassword field Create
		password.setBounds(204, 84, 117, 33);
		
		Font f1 = new Font("Ariel" , Font.BOLD , 30);		//Password font Create
		password.setFont(f1);
		
		JButton button = new JButton("Submit");				//JButton field Create
		button.setBounds(330, 85, 117, 33);
		
		password.setBackground(Color.GREEN);				//Password field Background and Foreground change
		password.setForeground(Color.RED);
		
		
			
		
		c.add(label);
		c.add(password);
		c.add(button);
		
		
	}

}
