/*
JButton
How to Create setBounds()
 */
import java.awt.Container;
import javax.swing.*;


public class MyJButton {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JButton button = new JButton("Click Me");	//Set Text in Button
		button.setBounds(100, 50, 100, 40);
		
		//button.setText("Submit"); 		//Create Method and Over right click me Button
		
		c.add(button);
		
		
	}

}
