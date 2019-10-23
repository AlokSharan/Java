import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalCulator {

	private JFrame frame;
	private JTextField txtEnterNumber;
	private JTextField txtEnterSecondNumber;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalCulator window = new CalCulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalCulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtEnterNumber = new JTextField();
		txtEnterNumber.setForeground(Color.LIGHT_GRAY);
		txtEnterNumber.setText("");
		txtEnterNumber.setBounds(143, 54, 130, 36);
		frame.getContentPane().add(txtEnterNumber);
		txtEnterNumber.setColumns(10);
		
		txtEnterSecondNumber = new JTextField();
		txtEnterSecondNumber.setForeground(Color.LIGHT_GRAY);
		txtEnterSecondNumber.setText("");
		txtEnterSecondNumber.setBounds(336, 54, 130, 36);
		frame.getContentPane().add(txtEnterSecondNumber);
		txtEnterSecondNumber.setColumns(10);
		
		JButton btnNewButton = new JButton("Add(+)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(txtEnterNumber.getText());
					num2=Integer.parseInt(txtEnterSecondNumber.getText());
					
					ans=num1 + num2;
					textField_2.setText(Integer.toString(ans));
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number!");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(143, 142, 130, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus(-)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,minus;
				try {
					num1=Integer.parseInt(txtEnterNumber.getText());
					num2=Integer.parseInt(txtEnterSecondNumber.getText());
					
					minus=num1 - num2;
					textField_2.setText(Integer.toString(minus));
					
				} catch (Exception e3) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number!");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(336, 142, 130, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("      Answer");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(143, 232, 130, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(342, 238, 124, 36);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}

}
