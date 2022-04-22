package Empeloyment_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class New_Empeloyed_Create {

	private JFrame frame;
	private JTextField text_Empelo_Cid;
	private JTextField text_Empelo_Cname;
	private JTextField text_Empelo_Cage;
	private JTextField text_Empelo_Cfather;
	private JTextField text_Empelo_Cdegree;
	private JTextField text_Empelo_Clandline;
	private JTextField text_Empelo_Cphone;
	private JTextField text_Empelo_Caddress;
	private JTextField text_Empelo_Cposition;
	private JTextField text_Empelo_Csalary;
	private JTextField text_Empelo_Cdepartmentid;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Empeloyed_Create window = new New_Empeloyed_Create();
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
	public New_Empeloyed_Create() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 102, 153));
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel(" CREATE");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9.setBounds(1106, 0, 444, 178);
		frame.getContentPane().add(lblNewLabel_9);
		
		JPanel Panel_Create = new JPanel();
		Panel_Create.setLayout(null);
		Panel_Create.setBackground(SystemColor.inactiveCaption);
		Panel_Create.setBounds(129, 261, 715, 532);
		frame.getContentPane().add(Panel_Create);
		
		JLabel Id = new JLabel("   Id");
		Id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Id.setBounds(37, 32, 46, 23);
		Panel_Create.add(Id);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(37, 93, 112, 23);
		Panel_Create.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(586, 83, 30, 39);
		Panel_Create.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Father's Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(370, 15, 284, 179);
		Panel_Create.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Degree");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(208, 353, 144, 30);
		Panel_Create.add(lblNewLabel_4);
		
		text_Empelo_Cid = new JTextField();
		text_Empelo_Cid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Cid.setColumns(10);
		text_Empelo_Cid.setBounds(34, 57, 112, 29);
		Panel_Create.add(text_Empelo_Cid);
		
		text_Empelo_Cname = new JTextField();
		text_Empelo_Cname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Cname.setColumns(10);
		text_Empelo_Cname.setBounds(34, 121, 304, 29);
		Panel_Create.add(text_Empelo_Cname);
		
		text_Empelo_Cage = new JTextField();
		text_Empelo_Cage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Cage.setColumns(10);
		text_Empelo_Cage.setBounds(576, 121, 55, 29);
		Panel_Create.add(text_Empelo_Cage);
		
		text_Empelo_Cfather = new JTextField();
		text_Empelo_Cfather.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Cfather.setColumns(10);
		text_Empelo_Cfather.setBounds(370, 121, 159, 29);
		Panel_Create.add(text_Empelo_Cfather);
		
		text_Empelo_Cdegree = new JTextField();
		text_Empelo_Cdegree.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Cdegree.setColumns(10);
		text_Empelo_Cdegree.setBounds(208, 389, 159, 29);
		Panel_Create.add(text_Empelo_Cdegree);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalary.setBounds(397, 353, 276, 30);
		Panel_Create.add(lblSalary);
		
		JLabel lblNewLabel_1_1 = new JLabel("Position");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(37, 353, 104, 30);
		Panel_Create.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(37, 140, 104, 61);
		Panel_Create.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Phone");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(37, 212, 152, 39);
		Panel_Create.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Landline");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(483, 220, 112, 23);
		Panel_Create.add(lblNewLabel_4_1);
		
		text_Empelo_Clandline = new JTextField();
		text_Empelo_Clandline.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Clandline.setColumns(10);
		text_Empelo_Clandline.setBounds(469, 251, 165, 29);
		Panel_Create.add(text_Empelo_Clandline);
		
		text_Empelo_Cphone = new JTextField();
		text_Empelo_Cphone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Cphone.setColumns(10);
		text_Empelo_Cphone.setBounds(37, 251, 301, 29);
		Panel_Create.add(text_Empelo_Cphone);
		
		text_Empelo_Caddress = new JTextField();
		text_Empelo_Caddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Caddress.setColumns(10);
		text_Empelo_Caddress.setBounds(37, 186, 645, 29);
		Panel_Create.add(text_Empelo_Caddress);
		
		text_Empelo_Cposition = new JTextField();
		text_Empelo_Cposition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Cposition.setColumns(10);
		text_Empelo_Cposition.setBounds(37, 389, 138, 29);
		Panel_Create.add(text_Empelo_Cposition);
		
		JButton button_Create_Empelo = new JButton("Create");
		button_Create_Empelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_Create_Empelo.setBounds(588, 465, 89, 39);
		Panel_Create.add(button_Create_Empelo);
		
		JButton button_Clear1_Empelo = new JButton("Clear");
		button_Clear1_Empelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_Clear1_Empelo.setBounds(469, 467, 89, 39);
		Panel_Create.add(button_Clear1_Empelo);
		
		text_Empelo_Csalary = new JTextField();
		text_Empelo_Csalary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Csalary.setColumns(10);
		text_Empelo_Csalary.setBounds(393, 389, 161, 29);
		Panel_Create.add(text_Empelo_Csalary);
		
		JLabel Department_Id = new JLabel("Dept Id");
		Department_Id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Department_Id.setBounds(37, 291, 89, 39);
		Panel_Create.add(Department_Id);
		
		text_Empelo_Cdepartmentid = new JTextField();
		text_Empelo_Cdepartmentid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Cdepartmentid.setBounds(37, 324, 112, 29);
		Panel_Create.add(text_Empelo_Cdepartmentid);
		text_Empelo_Cdepartmentid.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(397, 252, 62, 28);
		Panel_Create.add(textField);
		textField.setColumns(10);
		
		JButton button_Empelo_Chome = new JButton("Home");
		button_Empelo_Chome.setBounds(950, 936, 117, 61);
		frame.getContentPane().add(button_Empelo_Chome);
		
		JLabel lblNewLabel_9_1 = new JLabel("NEW EMPELOYED");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(354, 0, 809, 178);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JScrollPane table_Empeloyed_Creat = new JScrollPane();
		table_Empeloyed_Creat.setBounds(902, 228, 817, 619);
		frame.getContentPane().add(table_Empeloyed_Creat);
	}
}
