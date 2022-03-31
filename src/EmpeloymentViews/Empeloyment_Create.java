package EmpeloymentViews;

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

public class Empeloyment_Create {

	private JFrame Main_Fram;
	private JTextField text_Empelo_id;
	private JTextField text_Empelo_name;
	private JTextField text_Empelo_age;
	private JTextField text_Empelo_father;
	private JTextField text_Empelo_education;
	private JTextField text_Empelo_salary;
	private JTextField text_Empelo_position;
	private JTextField text_Empelo_address;
	private JTextField text_Empelo_home;
	private JTextField text_Empelo_phone;
	private JTextField tex_Empelo_departmentid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyment_Create window = new Empeloyment_Create();
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
	public Empeloyment_Create() {
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
		lblNewLabel_8.setBounds(209, 97, 93, 14);
		desktopPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Phone");
		lblNewLabel_9.setBounds(232, 122, 46, 14);
		desktopPane.add(lblNewLabel_9);
		
		text_Empelo_id = new JTextField();
		text_Empelo_id.setBounds(113, 20, 86, 20);
		desktopPane.add(text_Empelo_id);
		text_Empelo_id.setColumns(10);
		
		text_Empelo_name = new JTextField();
		text_Empelo_name.setBounds(113, 44, 86, 20);
		desktopPane.add(text_Empelo_name);
		text_Empelo_name.setColumns(10);
		
		text_Empelo_age = new JTextField();
		text_Empelo_age.setBounds(113, 69, 86, 20);
		desktopPane.add(text_Empelo_age);
		text_Empelo_age.setColumns(10);
		
		text_Empelo_father = new JTextField();
		text_Empelo_father.setBounds(113, 94, 86, 20);
		desktopPane.add(text_Empelo_father);
		text_Empelo_father.setColumns(10);
		
		text_Empelo_education = new JTextField();
		text_Empelo_education.setBounds(113, 119, 86, 20);
		desktopPane.add(text_Empelo_education);
		text_Empelo_education.setColumns(10);
		
		text_Empelo_salary = new JTextField();
		text_Empelo_salary.setBounds(312, 20, 86, 20);
		desktopPane.add(text_Empelo_salary);
		text_Empelo_salary.setColumns(10);
		
		text_Empelo_position = new JTextField();
		text_Empelo_position.setBounds(312, 44, 86, 20);
		desktopPane.add(text_Empelo_position);
		text_Empelo_position.setColumns(10);
		
		text_Empelo_address = new JTextField();
		text_Empelo_address.setBounds(312, 69, 86, 20);
		desktopPane.add(text_Empelo_address);
		text_Empelo_address.setColumns(10);
		
		text_Empelo_home = new JTextField();
		text_Empelo_home.setBounds(312, 94, 86, 20);
		desktopPane.add(text_Empelo_home);
		text_Empelo_home.setColumns(10);
		
		text_Empelo_phone = new JTextField();
		text_Empelo_phone.setBounds(312, 119, 86, 20);
		desktopPane.add(text_Empelo_phone);
		text_Empelo_phone.setColumns(10);
		
		JButton button_Clear3 = new JButton("Clear");
		button_Clear3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_Clear3.setBounds(10, 201, 89, 23);
		desktopPane.add(button_Clear3);
		
		JButton bottun_Create_Empeloyment = new JButton("Create");
		bottun_Create_Empeloyment.setBounds(309, 201, 89, 23);
		desktopPane.add(bottun_Create_Empeloyment);
		
		JLabel lblNewLabel_10 = new JLabel("Create");
		lblNewLabel_10.setBounds(10, 0, 408, 14);
		desktopPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Department Id");
		lblNewLabel_11.setBounds(219, 147, 93, 14);
		desktopPane.add(lblNewLabel_11);
		
		tex_Empelo_departmentid = new JTextField();
		tex_Empelo_departmentid.setBounds(312, 144, 86, 20);
		desktopPane.add(tex_Empelo_departmentid);
		tex_Empelo_departmentid.setColumns(10);
	}
}
