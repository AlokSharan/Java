//setSize(width,height)
//setLocation(x,y)
//setBounds(x , y , width , height)

import javax.swing.*;

public class MyJFrame1 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(500,400);							//(Width,Height)
		frame.setLocation(400, 100);					//(X,Y)Coordinates
		 			
	}

}
