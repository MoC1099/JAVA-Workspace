package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {

	// sysout cnt + space
	// command + shift + F (formats the entire file.
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passwordlabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);

		panel.setLayout(null);

		// we are going to have a user lable and a box for user name
		// we are gonna have a pasword label and a box for passwork
		// we are gonna have a login lable and small piece of info that will
		// tell what the info is about
		userlabel = new JLabel("User");
		// now for the user lable we are going to use some bounce and padding to make it
		// look nice.
		userlabel.setBounds(10, 20, 80, 25);
		panel.add(userlabel);

		// now we need to add a box where we could add text
		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		passwordlabel = new JLabel("Password");
		// x,y,w,h
		passwordlabel.setBounds(10, 50, 80, 25);
		panel.add(passwordlabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);

		// now we have to make button
		button = new JButton("Login");
		// to add an action to a button on swing
		button.addActionListener(new GUI());
		button.setBounds(10, 80, 80, 25);
		panel.add(button);

		// lets add that success label
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
// add action to a button
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		// System.out.println(user+"," + password);

		if (user.equals("Saad") && password.equals("CHs@@d12"))
			success.setText("Login Successful!");
		else
			success.setText("wrong info");
	}

}
