package Empeloyee_Create;

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
import javax.swing.JTable;

public class Empeloyee_Edit {

	private JFrame Empeloyee_Edit;
	private JTextField text_Ename;
	private JTextField text_Eage;
	private JTextField text_Efather;
	private JTextField text_Edegree;
	private JTextField text_Elandline;
	private JTextField text_Ephone;
	private JTextField text_Eaddress;
	private JTextField text_Eposition;
	private JTextField text_Esalary;
	private JTextField text_Eid_Department;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyee_Edit window = new Empeloyee_Edit();
					window.Empeloyee_Edit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Empeloyee_Edit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Empeloyee_Edit = new JFrame();
		Empeloyee_Edit.getContentPane().setBackground(SystemColor.windowBorder);
		Empeloyee_Edit.setBounds(100, 100, 1920, 1080);
		Empeloyee_Edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Empeloyee_Edit.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("     EDIT");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9.setBounds(902, 0, 513, 197);
		Empeloyee_Edit.getContentPane().add(lblNewLabel_9);
		
		JPanel Panel_Create = new JPanel();
		Panel_Create.setLayout(null);
		Panel_Create.setBackground(SystemColor.inactiveCaption);
		Panel_Create.setBounds(495, 245, 815, 560);
		Empeloyee_Edit.getContentPane().add(Panel_Create);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(47, 22, 97, 25);
		Panel_Create.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(702, 22, 46, 25);
		Panel_Create.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Father's Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(433, 22, 112, 25);
		Panel_Create.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Degree");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(318, 340, 180, 29);
		Panel_Create.add(lblNewLabel_4);
		
		text_Ename = new JTextField();
		text_Ename.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Ename.setColumns(10);
		text_Ename.setBounds(37, 58, 326, 29);
		Panel_Create.add(text_Ename);
		
		text_Eage = new JTextField();
		text_Eage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Eage.setColumns(10);
		text_Eage.setBounds(691, 58, 61, 29);
		Panel_Create.add(text_Eage);
		
		text_Efather = new JTextField();
		text_Efather.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Efather.setColumns(10);
		text_Efather.setBounds(418, 58, 187, 29);
		Panel_Create.add(text_Efather);
		
		text_Edegree = new JTextField();
		text_Edegree.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Edegree.setColumns(10);
		text_Edegree.setBounds(554, 371, 194, 29);
		Panel_Create.add(text_Edegree);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalary.setBounds(554, 340, 76, 29);
		Panel_Create.add(lblSalary);
		
		JLabel lblNewLabel_1_1 = new JLabel("Position");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(47, 340, 84, 29);
		Panel_Create.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(47, 104, 97, 14);
		Panel_Create.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Phone");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(42, 203, 87, 14);
		Panel_Create.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Landline");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(547, 203, 87, 14);
		Panel_Create.add(lblNewLabel_4_1);
		
		text_Elandline = new JTextField();
		text_Elandline.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Elandline.setColumns(10);
		text_Elandline.setBounds(534, 228, 214, 29);
		Panel_Create.add(text_Elandline);
		
		text_Ephone = new JTextField();
		text_Ephone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Ephone.setColumns(10);
		text_Ephone.setBounds(37, 228, 326, 29);
		Panel_Create.add(text_Ephone);
		
		text_Eaddress = new JTextField();
		text_Eaddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Eaddress.setColumns(10);
		text_Eaddress.setBounds(37, 135, 715, 29);
		Panel_Create.add(text_Eaddress);
		
		text_Eposition = new JTextField();
		text_Eposition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Eposition.setColumns(10);
		text_Eposition.setBounds(37, 371, 205, 29);
		Panel_Create.add(text_Eposition);
		
		JButton button_Edit = new JButton("Edit");
		button_Edit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_Edit.setBounds(659, 474, 89, 39);
		Panel_Create.add(button_Edit);
		
		JButton button_Eclear = new JButton("Clear");
		button_Eclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_Eclear.setBounds(541, 476, 89, 39);
		Panel_Create.add(button_Eclear);
		
		text_Esalary = new JTextField();
		text_Esalary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Esalary.setColumns(10);
		text_Esalary.setBounds(311, 371, 187, 29);
		Panel_Create.add(text_Esalary);
		
		text_Eid_Department = new JTextField();
		text_Eid_Department.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Eid_Department.setBounds(37, 300, 146, 29);
		Panel_Create.add(text_Eid_Department);
		text_Eid_Department.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Department Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(47, 264, 122, 25);
		Panel_Create.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(468, 228, 46, 29);
		Panel_Create.add(textField);
		textField.setColumns(10);
		
		JButton button_Ehome = new JButton("Home");
		button_Ehome.setBounds(873, 933, 117, 61);
		Empeloyee_Edit.getContentPane().add(button_Ehome);
		
		JLabel lblNewLabel_9_1 = new JLabel("EMPELOYEES");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(479, 0, 702, 197);
		Empeloyee_Edit.getContentPane().add(lblNewLabel_9_1);
	}
}
