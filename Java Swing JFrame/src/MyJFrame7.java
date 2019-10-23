//setResizable()
//Restrict the user to resize the JFrame

import javax.swing.*;
import java.awt.Container;
import java.awt.Color;

public class MyJFrame7 {

	public static void main(String[] args) {
			
			JFrame frame = new JFrame("FrCoder Pvt Ltd");
			
			frame.setVisible(true);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setSize(500, 400);
			
			frame.setLocation(400 , 100);
			
			//frame.setBounds(400, 100, 500, 400);
			
			ImageIcon icon = new ImageIcon("C:\\Users\\hp\\eclipse-workspace\\FrCoder\\src\\IndianFlag.jpg");			
			frame.setIconImage(icon.getImage());
			
			
			Container c = frame.getContentPane();			
			c.setBackground(Color.MAGENTA);
			
			frame.setResizable(false);
			
			
			
			
		}

}
