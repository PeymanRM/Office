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

public class New_Empeloyed_Edit {

	private JFrame frame;
	private JTextField text_Empelo_Ename;
	private JTextField text_Empelo_Eage;
	private JTextField text_Empelo_Efather;
	private JTextField text_Empelo_Edegree;
	private JTextField text_Empelo_Elandline;
	private JTextField text_Empelo_Ephone;
	private JTextField text_Empelo_Eaddress;
	private JTextField text_Empelo_Eposition;
	private JTextField text_Empelo_Esalary;
	private JTextField text_Empelo_Edepartment;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Empeloyed_Edit window = new New_Empeloyed_Edit();
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
	public New_Empeloyed_Edit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.windowBorder);
		frame.getContentPane().setForeground(new Color(51, 0, 0));
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("     EDIT");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9.setBounds(1102, 0, 513, 197);
		frame.getContentPane().add(lblNewLabel_9);
		
		JPanel Panel_Create = new JPanel();
		Panel_Create.setLayout(null);
		Panel_Create.setBackground(SystemColor.inactiveCaption);
		Panel_Create.setBounds(485, 238, 815, 649);
		frame.getContentPane().add(Panel_Create);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(72, 37, 93, 14);
		Panel_Create.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(707, 30, 67, 29);
		Panel_Create.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Father's Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(400, 35, 112, 18);
		Panel_Create.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Degree");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(319, 402, 87, 29);
		Panel_Create.add(lblNewLabel_4);
		
		text_Empelo_Ename = new JTextField();
		text_Empelo_Ename.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Ename.setColumns(10);
		text_Empelo_Ename.setBounds(53, 62, 303, 29);
		Panel_Create.add(text_Empelo_Ename);
		
		text_Empelo_Eage = new JTextField();
		text_Empelo_Eage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Eage.setColumns(10);
		text_Empelo_Eage.setBounds(696, 62, 67, 29);
		Panel_Create.add(text_Empelo_Eage);
		
		text_Empelo_Efather = new JTextField();
		text_Empelo_Efather.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Efather.setColumns(10);
		text_Empelo_Efather.setBounds(399, 62, 220, 29);
		Panel_Create.add(text_Empelo_Efather);
		
		text_Empelo_Edegree = new JTextField();
		text_Empelo_Edegree.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Edegree.setColumns(10);
		text_Empelo_Edegree.setBounds(306, 434, 159, 29);
		Panel_Create.add(text_Empelo_Edegree);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalary.setBounds(548, 404, 67, 24);
		Panel_Create.add(lblSalary);
		
		JLabel lblNewLabel_1_1 = new JLabel("Position");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(72, 409, 87, 14);
		Panel_Create.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(72, 113, 93, 29);
		Panel_Create.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Phone");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(72, 200, 87, 24);
		Panel_Create.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Landline");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(620, 198, 87, 29);
		Panel_Create.add(lblNewLabel_4_1);
		
		text_Empelo_Elandline = new JTextField();
		text_Empelo_Elandline.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Elandline.setColumns(10);
		text_Empelo_Elandline.setBounds(598, 238, 165, 29);
		Panel_Create.add(text_Empelo_Elandline);
		
		text_Empelo_Ephone = new JTextField();
		text_Empelo_Ephone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Ephone.setColumns(10);
		text_Empelo_Ephone.setBounds(53, 238, 301, 29);
		Panel_Create.add(text_Empelo_Ephone);
		
		text_Empelo_Eaddress = new JTextField();
		text_Empelo_Eaddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Eaddress.setColumns(10);
		text_Empelo_Eaddress.setBounds(53, 143, 721, 29);
		Panel_Create.add(text_Empelo_Eaddress);
		
		text_Empelo_Eposition = new JTextField();
		text_Empelo_Eposition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Eposition.setColumns(10);
		text_Empelo_Eposition.setBounds(53, 434, 138, 29);
		Panel_Create.add(text_Empelo_Eposition);
		
		JButton button_Empelo_Ecreate = new JButton("Edit");
		button_Empelo_Ecreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_Empelo_Ecreate.setBounds(707, 508, 89, 39);
		Panel_Create.add(button_Empelo_Ecreate);
		
		JButton button_Empelo_Eclear = new JButton("Clear");
		button_Empelo_Eclear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_Empelo_Eclear.setBounds(562, 508, 89, 39);
		Panel_Create.add(button_Empelo_Eclear);
		
		text_Empelo_Esalary = new JTextField();
		text_Empelo_Esalary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Esalary.setColumns(10);
		text_Empelo_Esalary.setBounds(526, 434, 161, 29);
		Panel_Create.add(text_Empelo_Esalary);
		
		text_Empelo_Edepartment = new JTextField();
		text_Empelo_Edepartment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Empelo_Edepartment.setColumns(10);
		text_Empelo_Edepartment.setBounds(53, 347, 143, 29);
		Panel_Create.add(text_Empelo_Edepartment);
		
		JLabel lblNewLabel = new JLabel("Dept Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(72, 307, 119, 29);
		Panel_Create.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(526, 238, 62, 29);
		Panel_Create.add(textField);
		textField.setColumns(10);
		
		JButton button_Empelo_Ehome = new JButton("Home");
		button_Empelo_Ehome.setBounds(1004, 936, 117, 61);
		frame.getContentPane().add(button_Empelo_Ehome);
		
		JLabel lblNewLabel_9_1 = new JLabel("NEW EMPELOYED");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(485, 9, 772, 178);
		frame.getContentPane().add(lblNewLabel_9_1);
	}
}
