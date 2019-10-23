//How to set Text of a JLabel

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
	

public class MyJLabel1 {	
		public static void main(String[] args) {
			
			JFrame frame = new JFrame();
			
			frame.setVisible(true);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setBounds(400, 100, 500, 400);
			
			Container c = frame.getContentPane();
			c.setLayout(null);
			c.setBackground(Color.MAGENTA);
			
			
			JLabel label = new JLabel("UserName:");
			label.setText("Password");
			label.setBounds(100, 50, 100, 30);
			c.add(label);
			
			
	}
		

}
