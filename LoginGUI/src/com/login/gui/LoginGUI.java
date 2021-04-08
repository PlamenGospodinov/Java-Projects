package com.login.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGUI implements ActionListener{
	private static JLabel label;
	private static JLabel passwordLabel;
	private static JTextField userText;
	private static JPasswordField passwordText;
	private static JPanel panel;
	private static JFrame frame;
	private static JButton button;
	private static JLabel success;
	public static void main(String[] args) {
		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		label = new JLabel("User");
		label.setBounds(10,20,80,25);
		panel.add(label);
		
		
		userText = new JTextField();
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);		
		
		
		button = new JButton("Login");
		button.setBounds(10,80,80,25);
		button.addActionListener(new LoginGUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
		
		
		frame.setVisible(true);
;	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();	
		String password = passwordText.getText();
		
		
		if(user.equals("Plamen") && password.equals("1234")) {
			success.setText("Login Successful!");
		}
		else {
			success.setText("Wrong username or password!");
		}
	}
}
