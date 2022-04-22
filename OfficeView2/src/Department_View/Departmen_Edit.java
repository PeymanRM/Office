package Department_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;

public class Departmen_Edit {

	private JFrame frame;
	private JTextField text_ED_Name;
	private JTextField text_ED_Duties;
	private JTextField text_ED_Number;
	private JTextField text_ED_Date;
	private JTextField text_ED_Time;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Departmen_Edit window = new Departmen_Edit();
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
	public Departmen_Edit() {
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
		
		JLabel lblNewLabel_9 = new JLabel(" EDIT");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9.setBounds(1128, 11, 444, 178);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("DEPARTMENTS");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(497, 11, 691, 178);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JPanel Panel_Create = new JPanel();
		Panel_Create.setLayout(null);
		Panel_Create.setBackground(SystemColor.inactiveCaption);
		Panel_Create.setBounds(497, 260, 797, 514);
		frame.getContentPane().add(Panel_Create);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(56, 55, 68, 26);
		Panel_Create.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Duties");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(430, 51, 89, 34);
		Panel_Create.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Number of empeloyees");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(56, 171, 236, 42);
		Panel_Create.add(lblNewLabel_4);
		
		text_ED_Name = new JTextField();
		text_ED_Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_ED_Name.setColumns(10);
		text_ED_Name.setBounds(46, 92, 302, 29);
		Panel_Create.add(text_ED_Name);
		
		text_ED_Duties = new JTextField();
		text_ED_Duties.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_ED_Duties.setColumns(10);
		text_ED_Duties.setBounds(427, 92, 339, 29);
		Panel_Create.add(text_ED_Duties);
		
		text_ED_Number = new JTextField();
		text_ED_Number.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_ED_Number.setColumns(10);
		text_ED_Number.setBounds(46, 224, 302, 29);
		Panel_Create.add(text_ED_Number);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDate.setBounds(430, 178, 89, 28);
		Panel_Create.add(lblDate);
		
		JButton button_ED_Create = new JButton("Edit");
		button_ED_Create.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_ED_Create.setBounds(677, 445, 89, 39);
		Panel_Create.add(button_ED_Create);
		
		JButton button_ED_Clear = new JButton("Clear");
		button_ED_Clear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_ED_Clear.setBounds(521, 445, 89, 39);
		Panel_Create.add(button_ED_Clear);
		
		text_ED_Date = new JTextField();
		text_ED_Date.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_ED_Date.setColumns(10);
		text_ED_Date.setBounds(427, 223, 339, 29);
		Panel_Create.add(text_ED_Date);
		
		text_ED_Time = new JTextField();
		text_ED_Time.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_ED_Time.setColumns(10);
		text_ED_Time.setBounds(46, 326, 285, 29);
		Panel_Create.add(text_ED_Time);
		
		JLabel lblNewLabel = new JLabel("Time");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(58, 276, 46, 39);
		Panel_Create.add(lblNewLabel);
		
		JButton button_ED_Home = new JButton("Home");
		button_ED_Home.setBounds(873, 933, 117, 61);
		frame.getContentPane().add(button_ED_Home);
	}

}
