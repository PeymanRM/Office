package Documents_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Document_Edit {

	private JFrame frame;
	private JTextField text_DE_Id;
	private JTextField text_DoE_Name;
	private JTextField text_DoE_subject;
	private JTextField text_DoE_Name_Transmitte;
	private JTextField text_DoE_Name_Reciver;
	private JTextField text_DoE_Date;
	private JTextField text_DoE_Time;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Document_Edit window = new Document_Edit();
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
	public Document_Edit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.windowBorder);
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_9_1 = new JLabel("DOCUMENTS");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(501, 11, 691, 178);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9 = new JLabel(" EDIT");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9.setBounds(1031, 11, 444, 178);
		frame.getContentPane().add(lblNewLabel_9);
		
		JPanel Panel_Do_Edit = new JPanel();
		Panel_Do_Edit.setLayout(null);
		Panel_Do_Edit.setBackground(SystemColor.inactiveCaption);
		Panel_Do_Edit.setBounds(495, 245, 800, 541);
		frame.getContentPane().add(Panel_Do_Edit);
		
		JLabel lblDepartmentId = new JLabel("Id");
		lblDepartmentId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDepartmentId.setBounds(60, 23, 94, 14);
		Panel_Do_Edit.add(lblDepartmentId);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(60, 107, 72, 20);
		Panel_Do_Edit.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Subject");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(423, 95, 68, 29);
		Panel_Do_Edit.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name of transmitter");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(60, 201, 170, 39);
		Panel_Do_Edit.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Name of reciver");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(423, 211, 150, 21);
		Panel_Do_Edit.add(lblNewLabel_4);
		
		text_DE_Id = new JTextField();
		text_DE_Id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DE_Id.setColumns(10);
		text_DE_Id.setBounds(49, 50, 124, 29);
		Panel_Do_Edit.add(text_DE_Id);
		
		text_DoE_Name = new JTextField();
		text_DoE_Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoE_Name.setColumns(10);
		text_DoE_Name.setBounds(49, 138, 303, 29);
		Panel_Do_Edit.add(text_DoE_Name);
		
		text_DoE_subject = new JTextField();
		text_DoE_subject.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoE_subject.setColumns(10);
		text_DoE_subject.setBounds(404, 138, 315, 29);
		Panel_Do_Edit.add(text_DoE_subject);
		
		text_DoE_Name_Transmitte = new JTextField();
		text_DoE_Name_Transmitte.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoE_Name_Transmitte.setColumns(10);
		text_DoE_Name_Transmitte.setBounds(49, 239, 303, 29);
		Panel_Do_Edit.add(text_DoE_Name_Transmitte);
		
		text_DoE_Name_Reciver = new JTextField();
		text_DoE_Name_Reciver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoE_Name_Reciver.setColumns(10);
		text_DoE_Name_Reciver.setBounds(404, 239, 315, 29);
		Panel_Do_Edit.add(text_DoE_Name_Reciver);
		
		JButton button_DoE_Edit = new JButton("Edit");
		button_DoE_Edit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_DoE_Edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_DoE_Edit.setBounds(630, 447, 89, 39);
		Panel_Do_Edit.add(button_DoE_Edit);
		
		JButton button_DoE_Clear = new JButton("Clear");
		button_DoE_Clear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_DoE_Clear.setBounds(507, 447, 89, 39);
		Panel_Do_Edit.add(button_DoE_Clear);
		
		text_DoE_Date = new JTextField();
		text_DoE_Date.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoE_Date.setColumns(10);
		text_DoE_Date.setBounds(60, 322, 208, 29);
		Panel_Do_Edit.add(text_DoE_Date);
		
		JLabel lblNewLabel = new JLabel("Date");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(60, 299, 46, 14);
		Panel_Do_Edit.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Time");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(423, 292, 46, 29);
		Panel_Do_Edit.add(lblNewLabel_5);
		
		text_DoE_Time = new JTextField();
		text_DoE_Time.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoE_Time.setColumns(10);
		text_DoE_Time.setBounds(404, 322, 192, 29);
		Panel_Do_Edit.add(text_DoE_Time);
		
		JButton button_DoE_home = new JButton("Home");
		button_DoE_home.setBounds(873, 933, 117, 61);
		frame.getContentPane().add(button_DoE_home);
	}
}
