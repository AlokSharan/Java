
                                                                                                                                                                                                             `9                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      Cursor(Cursor.HAND_CURSOR);
		button3.setCursor(c3);
		
		c.add(button1);
		c.add(button2);
		c.add(button3);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button1) {
			c.setBackground(Color.RED);
		}
		
		if(e.getSource() == button2) {
			c.setBackground(Color.YELLOW);
		}
		
		if (e.getSource() == button3) {
			c.setBackground(Color.GREEN);
			
		}
	}
	
}


public class MyJButton7{
	public static void main(String[] args) {
		
		MyFrame1 frame = new MyFrame1();
		frame.setTitle("My Sweet Home");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 50, 700, 500);
		
	}
	
}