package Empeloyment_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Empeloyment_Create {

	private JFrame Empeloyment_create;
	private JTextField text_Empelo_Cid;
	private JTextField text_Empelo_Cfather;
	private JTextField text_Empelo_Caddress;
	private JTextField text_Empelo_Cname;
	private JTextField text_Empelo_Cage;
	private JTextField text_Empelo_Ceducation;
	private JTextField text_Empelo_Salary;
	private JTextField text_Empelo_Cposition;
	private JTextField text_Empelo_Cphone;
	private JTextField text_Empelo_Chome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyment_Create window = new Empeloyment_Create();
					window.Empeloyment_create.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Empeloyment_Create() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Empeloyment_create = new JFrame();
		Empeloyment_create.setBounds(100, 100, 1920, 1080);
		Empeloyment_create.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Empeloyment_create.getContentPane().setLayout(null);
		
		JDesktopPane Empeloyment_Create = new JDesktopPane();
		Empeloyment_Create.setBackground(Color.LIGHT_GRAY);
		Empeloyment_Create.setBounds(0, 0, 1920, 1080);
		Empeloyment_create.getContentPane().add(Empeloyment_Create);
		
		JLabel lblNewLabel = new JLabel("Create");
		lblNewLabel.setBounds(10, 11, 46, 14);
		Empeloyment_Create.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(10, 48, 46, 14);
		Empeloyment_Create.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(10, 73, 46, 14);
		Empeloyment_Create.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setBounds(10, 98, 46, 14);
		Empeloyment_Create.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Father's Name");
		lblNewLabel_4.setBounds(10, 123, 88, 14);
		Empeloyment_Create.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Education Rate");
		lblNewLabel_5.setBounds(10, 144, 88, 14);
		Empeloyment_Create.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Base Salary");
		lblNewLabel_6.setBounds(252, 48, 88, 14);
		Empeloyment_Create.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Position");
		lblNewLabel_7.setBounds(252, 73, 46, 14);
		Empeloyment_Create.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address");
		lblNewLabel_8.setBounds(252, 98, 75, 14);
		Empeloyment_Create.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Phone");
		lblNewLabel_9.setBounds(252, 123, 46, 14);
		Empeloyment_Create.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Home Phone");
		lblNewLabel_10.setBounds(252, 144, 88, 14);
		Empeloyment_Create.add(lblNewLabel_10);
		
		text_Empelo_Cid = new JTextField();
		text_Empelo_Cid.setColumns(10);
		text_Empelo_Cid.setBounds(116, 45, 86, 20);
		Empeloyment_Create.add(text_Empelo_Cid);
		
		text_Empelo_Cfather = new JTextField();
		text_Empelo_Cfather.setColumns(10);
		text_Empelo_Cfather.setBounds(116, 120, 86, 20);
		Empeloyment_Create.add(text_Empelo_Cfather);
		
		text_Empelo_Caddress = new JTextField();
		text_Empelo_Caddress.setColumns(10);
		text_Empelo_Caddress.setBounds(363, 95, 86, 20);
		Empeloyment_Create.add(text_Empelo_Caddress);
		
		JButton button_Clear4 = new JButton("Clear");
		button_Clear4.setBounds(10, 224, 89, 23);
		Empeloyment_Create.add(button_Clear4);
		
		JButton button_Empelo_Create = new JButton("Create");
		button_Empelo_Create.setBounds(360, 224, 89, 23);
		Empeloyment_Create.add(button_Empelo_Create);
		
		JPanel panel = new JPanel();
		panel.setBounds(652, 11, 978, 544);
		Empeloyment_Create.add(panel);
		
		text_Empelo_Cname = new JTextField();
		text_Empelo_Cname.setColumns(10);
		text_Empelo_Cname.setBounds(116, 70, 86, 20);
		Empeloyment_Create.add(text_Empelo_Cname);
		
		text_Empelo_Cage = new JTextField();
		text_Empelo_Cage.setColumns(10);
		text_Empelo_Cage.setBounds(116, 95, 86, 20);
		Empeloyment_Create.add(text_Empelo_Cage);
		
		text_Empelo_Ceducation = new JTextField();
		text_Empelo_Ceducation.setColumns(10);
		text_Empelo_Ceducation.setBounds(116, 141, 86, 20);
		Empeloyment_Create.add(text_Empelo_Ceducation);
		
		text_Empelo_Salary = new JTextField();
		text_Empelo_Salary.setColumns(10);
		text_Empelo_Salary.setBounds(363, 45, 86, 20);
		Empeloyment_Create.add(text_Empelo_Salary);
		
		text_Empelo_Cposition = new JTextField();
		text_Empelo_Cposition.setColumns(10);
		text_Empelo_Cposition.setBounds(363, 70, 86, 20);
		Empeloyment_Create.add(text_Empelo_Cposition);
		
		text_Empelo_Cphone = new JTextField();
		text_Empelo_Cphone.setColumns(10);
		text_Empelo_Cphone.setBounds(363, 120, 86, 20);
		Empeloyment_Create.add(text_Empelo_Cphone);
		
		text_Empelo_Chome = new JTextField();
		text_Empelo_Chome.setColumns(10);
		text_Empelo_Chome.setBounds(363, 144, 86, 20);
		Empeloyment_Create.add(text_Empelo_Chome);
	}

}
