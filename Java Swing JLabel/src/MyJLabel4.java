//How to use both Image and Text in JLabel


import java.awt.Container;
import javax.swing.*;


public class MyJLabel4 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 100, 500, 400);
		frame.setTitle("Alok Sharan");
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\Java Swing JLabel\\src\\IndianFlag.jpg");
		
		JLabel label = new JLabel("Text" , icon , JLabel.LEFT);
		label.setBounds(400, 100, icon.getIconWidth(), icon.getIconHeight());
		
		c.add(label);
		
	}
	

}
