/*
 JButton
 How to use Image in JButton
 */
import java.awt.Container;

import javax.swing.*;


public class MyJButton3 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\FrCoder\\src\\IndianFlag.jpg");
		JButton button = new JButton(icon);
		button.setBounds(100, 50, 100, 40);
		
		
		
		c.add(button);
	}

}
