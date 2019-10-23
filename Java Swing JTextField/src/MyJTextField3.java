/*
JTextField
color
setBackgroung()
setForeground()
*/


import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;


public class MyJTextField3 {
	public static void main(String[] args) {
		
				JFrame frame = new JFrame();
				
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setBounds(400, 100, 500, 400);
				
				Container c = frame.getContentPane();
				c.setLayout(null);
				
				JTextField myText = new JTextField();
				myText.setBounds(100 , 50 , 200 , 40);
				
				Font f = new Font("Times new roman",Font.ITALIC , 20 );
				myText.setFont(f);
				
				//Color mColor = new Color(10 , 20 , 30);		//Create your own Color
				//myText.setBackground(mColor);
				
				myText.setBackground(Color.YELLOW);
				myText.setForeground(Color.RED);
				
				c.add(myText);
				
			
	}

}
