package EmpeloyeeViews;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Empeloyee_Create {

	private JFrame Main_Fram;
	private JTextField text_id;
	private JTextField text_name;
	private JTextField text_age;
	private JTextField text_father;
	private JTextField text_education;
	private JTextField text_salary;
	private JTextField text_position;
	private JTextField text_address;
	private JTextField text_home;
	private JTextField text_phone;
	private JTextField text_departmentid;
	private JTable table_Ecreate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyee_Create window = new Empeloyee_Create();
					window.Main_Fram.setVisible(true);
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
		Main_Fram = new JFrame();
		Main_Fram.setBounds(100, 100, 1920, 1080);
		Main_Fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main_Fram.getContentPane().setLayout(null);
		
		JPanel panel_Create = new JPanel();
		panel_Create.setBounds(0, 0, 1920, 1080);
		Main_Fram.getContentPane().add(panel_Create);
		panel_Create.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(0, 0, 1920, 1080);
		panel_Create.add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(10, 23, 46, 14);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(10, 47, 46, 14);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setBounds(10, 72, 46, 14);
		desktopPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Father's Name");
		lblNewLabel_3.setBounds(10, 97, 93, 14);
		desktopPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Education Rate");
		lblNewLabel_4.setBounds(10, 122, 93, 14);
		desktopPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Base Salary");
		lblNewLabel_5.setBounds(219, 23, 83, 14);
		desktopPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Position");
		lblNewLabel_6.setBounds(219, 47, 46, 14);
		desktopPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setBounds(219, 72, 69, 14);
		desktopPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Home's phone");
		lblNewLabel_8.setBounds(219, 97, 93, 14);
		desktopPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Phone number");
		lblNewLabel_9.setBounds(219, 122, 83, 14);
		desktopPane.add(lblNewLabel_9);
		
		text_id = new JTextField();
		text_id.setBounds(113, 20, 86, 20);
		desktopPane.add(text_id);
		text_id.setColumns(10);
		
		text_name = new JTextField();
		text_name.setBounds(113, 44, 86, 20);
		desktopPane.add(text_name);
		text_name.setColumns(10);
		
		text_age = new JTextField();
		text_age.setBounds(113, 69, 86, 20);
		desktopPane.add(text_age);
		text_age.setColumns(10);
		
		text_father = new JTextField();
		text_father.setBounds(113, 94, 86, 20);
		desktopPane.add(text_father);
		text_father.setColumns(10);
		
		text_education = new JTextField();
		text_education.setBounds(113, 119, 86, 20);
		desktopPane.add(text_education);
		text_education.setColumns(10);
		
		text_salary = new JTextField();
		text_salary.setBounds(312, 20, 86, 20);
		desktopPane.add(text_salary);
		text_salary.setColumns(10);
		
		text_position = new JTextField();
		text_position.setBounds(312, 44, 86, 20);
		desktopPane.add(text_position);
		text_position.setColumns(10);
		
		text_address = new JTextField();
		text_address.setBounds(312, 69, 86, 20);
		desktopPane.add(text_address);
		text_address.setColumns(10);
		
		text_home = new JTextField();
		text_home.setBounds(312, 94, 86, 20);
		desktopPane.add(text_home);
		text_home.setColumns(10);
		
		text_phone = new JTextField();
		text_phone.setBounds(312, 119, 86, 20);
		desktopPane.add(text_phone);
		text_phone.setColumns(10);
		
		JButton button_Clear1 = new JButton("Clear");
		button_Clear1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_Clear1.setBounds(10, 206, 89, 23);
		desktopPane.add(button_Clear1);
		
		JButton bottun_Create = new JButton("Create");
		bottun_Create.setBounds(309, 206, 89, 23);
		desktopPane.add(bottun_Create);
		
		JLabel lblNewLabel_10 = new JLabel("Create");
		lblNewLabel_10.setBounds(10, 0, 408, 14);
		desktopPane.add(lblNewLabel_10);
		
		text_departmentid = new JTextField();
		text_departmentid.setBounds(312, 150, 86, 20);
		desktopPane.add(text_departmentid);
		text_departmentid.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Department Id");
		lblNewLabel_11.setBounds(219, 153, 83, 14);
		desktopPane.add(lblNewLabel_11);
		
		JPanel panel_ETcreate = new JPanel();
		panel_ETcreate.setBounds(770, 23, 915, 530);
		desktopPane.add(panel_ETcreate);
		panel_ETcreate.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(903, 519, -890, -511);
		panel_ETcreate.add(scrollPane);
		
		table_Ecreate = new JTable();
		scrollPane.setViewportView(table_Ecreate);
		table_Ecreate.setSurrendersFocusOnKeystroke(true);
		table_Ecreate.setCellSelectionEnabled(true);
		table_Ecreate.setColumnSelectionAllowed(true);
		table_Ecreate.setFillsViewportHeight(true);
		table_Ecreate.setBackground(Color.BLACK);
	}
}
