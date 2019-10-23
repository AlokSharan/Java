//Using setBounds for size and location in one method
//setBounds(x , y , width , height)

import javax.swing.*;

public class MyJFrame2 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(400, 100, 500, 400);
	}

}
