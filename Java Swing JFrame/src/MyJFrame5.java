//setIconImage


import javax.swing.*;


public class MyJFrame5 {
	public static void main(String[] args) {

		
		 JFrame frame = new JFrame(); 
		 
		 frame.setVisible(true);
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 frame.setBounds(400, 100, 500, 400);
		 
		 frame.setTitle("Alok Sharan");
		 

		ImageIcon icon = new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\Java Swing\\src\\IndianFlag.jpg");
		
		frame.setIconImage(icon.getImage());
				 
	}

}
