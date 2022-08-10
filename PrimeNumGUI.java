package JavaGUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrimeNumGUI implements ActionListener {
//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

	
	private static JLabel numlabel;
	private static JTextField userText;
	private static JButton enter;  
	private static JLabel Table;
	private static JPanel panel;
	private static JFrame frame;
	
	public static void main(String[] args) {
		
		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Prime number checker");
		frame.setVisible(true);
		
		numlabel = new JLabel("Enter number");
		numlabel.setBounds(10, 20, 80, 25);
		panel.add(numlabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		enter = new JButton("Enter");
		enter.setBounds(10, 80, 80, 25);
		enter.addActionListener(new PrimeNumGUI());
		panel.add(enter);
		
		Table = new JLabel("");
		Table.setBounds(20,110, 400, 35);
		panel.add(Table);
		
		frame.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// What the button does is tied to this method 
		String IntStr = userText.getText();
		int number = Integer.parseInt(IntStr);
		boolean bool = true;
		
		if(number > 0) {
			for(int i = 2; i<number; i++) {
				if( number % i == 0) {
					bool = false;
					break;
				}
			}
			if(bool && number > 1) {
				Table.setText(number + " is a prime number.");
			}else {
				Table.setText(number + " is not a prime number");
			}
		}else {
			Table.setText(number + " is not a positive integer. Only enter positive integers!");
		}
		
	}

}
