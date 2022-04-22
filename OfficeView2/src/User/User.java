package User;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class User {

	private JFrame frame;
	private JTextField text_Username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User window = new User();
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
	public User() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(589, 311, 835, 544);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tesla Limited Co.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(302, 11, 362, 85);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1.setBounds(173, 158, 172, 31);
		panel.add(lblNewLabel_1);
		
		text_Username = new JTextField();
		text_Username.setFont(new Font("Tahoma", Font.PLAIN, 25));
		text_Username.setBounds(355, 156, 309, 38);
		panel.add(text_Username);
		text_Username.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_1.setBounds(173, 280, 161, 31);
		panel.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordField.setEchoChar('*');
		passwordField.setBounds(355, 280, 309, 38);
		panel.add(passwordField);
		
		JButton button_Enter = new JButton("Enter");
		button_Enter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Enter.setBounds(575, 403, 89, 51);
		panel.add(button_Enter);
		
		JButton button_Back = new JButton("Back");
		button_Back.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Back.setBounds(256, 403, 89, 51);
		panel.add(button_Back);
	}
}
