//setBackground

import javax.swing.*;
import java.awt.Color;
import java.awt.Container;


public class MyJFrame6 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("FrCoder Pvt Ltd");
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(500, 400);
		
		frame.setLocation(400 , 100);
		
		//frame.setBounds(400, 100, 500, 400);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\Java Swing\\src\\IndianFlag.jpg");
		
		frame.setIconImage(icon.getImage());
		
		Container c = frame.getContentPane();
		
		c.setBackground(Color.MAGENTA);
		
		
		
		
	}

}
