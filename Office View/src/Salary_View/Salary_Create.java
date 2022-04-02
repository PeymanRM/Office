package Salary_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;

public class Salary_Create {

	private JFrame frame;
	private JTextField text_Csalary;
	private JTextField text_Csalary_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salary_Create window = new Salary_Create();
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
	public Salary_Create() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(desktopPane);
		
		JLabel lblNewLabel_2 = new JLabel("Salary");
		lblNewLabel_2.setBounds(9, 114, 46, 14);
		desktopPane.add(lblNewLabel_2);
		
		text_Csalary = new JTextField();
		text_Csalary.setBounds(160, 111, 86, 20);
		desktopPane.add(text_Csalary);
		text_Csalary.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Pay");
		lblNewLabel_3.setBounds(9, 166, 46, 14);
		desktopPane.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Yes");
		chckbxNewCheckBox.setBounds(160, 163, 46, 23);
		desktopPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("No");
		chckbxNewCheckBox_1.setBounds(206, 163, 44, 23);
		desktopPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel = new JLabel("Create");
		lblNewLabel.setBounds(8, 19, 46, 14);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id for Search");
		lblNewLabel_1.setBounds(8, 76, 85, 14);
		desktopPane.add(lblNewLabel_1);
		
		text_Csalary_id = new JTextField();
		text_Csalary_id.setColumns(10);
		text_Csalary_id.setBounds(158, 72, 86, 20);
		desktopPane.add(text_Csalary_id);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(165, 221, 89, 23);
		desktopPane.add(btnCreate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(15, 223, 89, 23);
		desktopPane.add(btnClear);
	}
}
