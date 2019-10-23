/*
How to Set Different type of Cursor for a JButton

Cursor
setCursor()
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MyJButton5 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JButton button = new JButton("Click me");
		button.setBounds(100, 50, 130, 40);
		
		Font f = new Font("Times new roman" , Font.BOLD , 18);
		button.setFont(f);
		
		button.setBackground(Color.BLUE);
		button.setForeground(Color.GREEN);
		
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);	//Hovering Hand Cursor on JButton
		button.setCursor(cur);
		
		c.add(button);
		
		
	}

}
