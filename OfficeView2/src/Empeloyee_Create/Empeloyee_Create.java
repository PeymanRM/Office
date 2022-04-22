package Empeloyee_Create;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Empeloyee_Create {

	private JFrame Empeloyee;
	private JTextField text_Cid;
	private JTextField text_Cfullname;
	private JTextField text_Cage;
	private JTextField text_Cfather;
	private JTextField text_Ceducation;
	private JTextField text_Cland;
	private JTextField text_Cphone;
	private JTextField text_Caddress;
	private JTextField text_Cposition;
	private JTextField text_Csalary;
	private JTextField text_Ccode;
	private JTextField text_Cdept;
	private JTable table_Empeloyee_Create;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyee_Create window = new Empeloyee_Create();
					window.Empeloyee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Empeloyee_Create() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Empeloyee = new JFrame();
		Empeloyee.getContentPane().setBackground(new Color(128, 128, 128));
		Empeloyee.setBounds(100, 100, 1920, 1080);
		Empeloyee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Empeloyee.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel(" CREATE");
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(983, 0, 444, 178);
		Empeloyee.getContentPane().add(lblNewLabel_9);
		
		JPanel Panel_Create = new JPanel();
		Panel_Create.setBackground(SystemColor.inactiveCaption);
		Panel_Create.setBounds(129, 261, 815, 568);
		Empeloyee.getContentPane().add(Panel_Create);
		Panel_Create.setLayout(null);
		
		JLabel Id = new JLabel("Id");
		Id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Id.setBounds(36, 11, 46, 20);
		Panel_Create.add(Id);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(36, 79, 99, 20);
		Panel_Create.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(701, 75, 61, 29);
		Panel_Create.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Father's Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(381, 82, 128, 14);
		Panel_Create.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Degree");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(276, 351, 87, 29);
		Panel_Create.add(lblNewLabel_4);
		
		text_Cid = new JTextField();
		text_Cid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Cid.setBounds(23, 39, 112, 29);
		Panel_Create.add(text_Cid);
		text_Cid.setColumns(10);
		
		text_Cfullname = new JTextField();
		text_Cfullname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Cfullname.setBounds(23, 110, 304, 29);
		Panel_Create.add(text_Cfullname);
		text_Cfullname.setColumns(10);
		
		text_Cage = new JTextField();
		text_Cage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Cage.setBounds(701, 110, 61, 29);
		Panel_Create.add(text_Cage);
		text_Cage.setColumns(10);
		
		text_Cfather = new JTextField();
		text_Cfather.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Cfather.setBounds(372, 110, 263, 29);
		Panel_Create.add(text_Cfather);
		text_Cfather.setColumns(10);
		
		text_Ceducation = new JTextField();
		text_Ceducation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Ceducation.setBounds(255, 389, 159, 29);
		Panel_Create.add(text_Ceducation);
		text_Ceducation.setColumns(10);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalary.setBounds(541, 333, 63, 64);
		Panel_Create.add(lblSalary);
		
		JLabel lblNewLabel_1_1 = new JLabel("Position");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(36, 351, 63, 32);
		Panel_Create.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(36, 160, 87, 14);
		Panel_Create.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Phone");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(36, 226, 87, 14);
		Panel_Create.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Landline");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(548, 226, 87, 14);
		Panel_Create.add(lblNewLabel_4_1);
		
		text_Cland = new JTextField();
		text_Cland.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Cland.setColumns(10);
		text_Cland.setBounds(541, 251, 221, 29);
		Panel_Create.add(text_Cland);
		
		text_Cphone = new JTextField();
		text_Cphone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Cphone.setColumns(10);
		text_Cphone.setBounds(23, 251, 304, 29);
		Panel_Create.add(text_Cphone);
		
		text_Caddress = new JTextField();
		text_Caddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Caddress.setColumns(10);
		text_Caddress.setBounds(23, 186, 739, 29);
		Panel_Create.add(text_Caddress);
		
		text_Cposition = new JTextField();
		text_Cposition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Cposition.setColumns(10);
		text_Cposition.setBounds(23, 389, 176, 29);
		Panel_Create.add(text_Cposition);
		
		JButton button_Create = new JButton("Create");
		button_Create.setBounds(716, 498, 89, 39);
		Panel_Create.add(button_Create);
		
		JButton button_Clear1 = new JButton("Clear");
		button_Clear1.setBounds(617, 498, 89, 39);
		Panel_Create.add(button_Clear1);
		
		text_Csalary = new JTextField();
		text_Csalary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Csalary.setColumns(10);
		text_Csalary.setBounds(509, 389, 161, 29);
		Panel_Create.add(text_Csalary);
		
		text_Ccode = new JTextField();
		text_Ccode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Ccode.setBounds(467, 251, 61, 29);
		Panel_Create.add(text_Ccode);
		text_Ccode.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dept Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(36, 291, 63, 20);
		Panel_Create.add(lblNewLabel);
		
		text_Cdept = new JTextField();
		text_Cdept.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Cdept.setBounds(23, 316, 112, 29);
		Panel_Create.add(text_Cdept);
		text_Cdept.setColumns(10);
		
		JButton button_Chome = new JButton("Home");
		button_Chome.setBounds(873, 933, 117, 61);
		Empeloyee.getContentPane().add(button_Chome);
		
		JLabel lblNewLabel_9_1 = new JLabel("EMPELOYEES");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(432, 0, 603, 178);
		Empeloyee.getContentPane().add(lblNewLabel_9_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(984, 228, 817, 619);
		Empeloyee.getContentPane().add(scrollPane);
		
		table_Empeloyee_Create = new JTable();
		scrollPane.setViewportView(table_Empeloyee_Create);
	}
}
