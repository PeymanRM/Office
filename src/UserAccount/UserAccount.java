package UserAccount;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class UserAccount {

	private JFrame UserAccount;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserAccount window = new UserAccount();
					window.UserAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		UserAccount = new JFrame();
		UserAccount.setBounds(100, 100, 1920, 1080);
		UserAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UserAccount.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 1920, 45);
		UserAccount.getContentPane().add(panel);
		panel.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(0, 0, 1920, 47);
		panel.add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("                             Welcom To Office");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(700, -12, 1920, 48);
		desktopPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 41, 1920, 1080);
		UserAccount.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1920, 1080);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.LIGHT_GRAY);
		desktopPane_1.setBounds(0, 0, 1920, 1080);
		panel_2.add(desktopPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setBounds(828, 361, 63, 30);
		desktopPane_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(960, 366, 202, 20);
		desktopPane_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PassWord");
		lblNewLabel_2.setBounds(828, 479, 63, 14);
		desktopPane_1.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(960, 476, 202, 20);
		desktopPane_1.add(passwordField);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(1073, 616, 89, 23);
		desktopPane_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(828, 616, 89, 23);
		desktopPane_1.add(btnNewButton_1);
	}
}
