package Empeloyment_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class New_Empeloyed_View {

	private JFrame frame;
	private JTextField text_Empelo_Search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Empeloyed_View window = new New_Empeloyed_View();
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
	public New_Empeloyed_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 0, 102));
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_Empelo_Edit = new JButton("Edit");
		button_Empelo_Edit.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		button_Empelo_Edit.setBackground(SystemColor.inactiveCaption);
		button_Empelo_Edit.setBounds(209, 820, 170, 109);
		frame.getContentPane().add(button_Empelo_Edit);
		
		JLabel lblNewLabel_9 = new JLabel("     VIEW");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9.setBounds(921, 0, 513, 197);
		frame.getContentPane().add(lblNewLabel_9);
		
		JButton button_Empelo_Delete = new JButton("Delete");
		button_Empelo_Delete.setForeground(new Color(0, 51, 102));
		button_Empelo_Delete.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		button_Empelo_Delete.setBackground(SystemColor.inactiveCaption);
		button_Empelo_Delete.setBounds(1521, 820, 170, 109);
		frame.getContentPane().add(button_Empelo_Delete);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(276, 258, 370, 252);
		frame.getContentPane().add(panel);
		
		JLabel Search = new JLabel("Search Id");
		Search.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Search.setBounds(10, 37, 160, 14);
		panel.add(Search);
		
		text_Empelo_Search = new JTextField();
		text_Empelo_Search.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Search.setColumns(10);
		text_Empelo_Search.setBounds(10, 70, 220, 29);
		panel.add(text_Empelo_Search);
		
		JButton button_Empelo_Select = new JButton("Select");
		button_Empelo_Select.setBounds(271, 202, 89, 39);
		panel.add(button_Empelo_Select);
		
		JButton button_Empelo_Clear4 = new JButton("Clear");
		button_Empelo_Clear4.setBounds(10, 202, 89, 39);
		panel.add(button_Empelo_Clear4);
		
		JButton button_Empelo_home = new JButton("Home");
		button_Empelo_home.setBounds(951, 936, 125, 66);
		frame.getContentPane().add(button_Empelo_home);
		
		JLabel lblNewLabel_9_1 = new JLabel("NEW EMPELOYED");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(290, 9, 786, 178);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(687, 183, 817, 619);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
	}
}
