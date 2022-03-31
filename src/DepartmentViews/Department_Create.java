package DepartmentViews;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Department_Create {

	private JFrame frame;
	private JTextField text_Did;
	private JTextField text_Dname;
	private JTextField text_Ddutes;
	private JTextField text_Dnumber;
	private JTextField text_Dinfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Department_Create window = new Department_Create();
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
	public Department_Create() {
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
		
		JLabel lblNewLabel = new JLabel("Create");
		lblNewLabel.setBounds(10, 11, 46, 14);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Department's Id");
		lblNewLabel_1.setBounds(10, 52, 121, 14);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Department's Name");
		lblNewLabel_2.setBounds(10, 77, 121, 14);
		desktopPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Department's Dutes");
		lblNewLabel_3.setBounds(10, 102, 121, 14);
		desktopPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Number of Empeloyees");
		lblNewLabel_4.setBounds(10, 127, 121, 14);
		desktopPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Empeloyees Info");
		lblNewLabel_5.setBounds(10, 152, 121, 14);
		desktopPane.add(lblNewLabel_5);
		
		text_Did = new JTextField();
		text_Did.setBounds(158, 49, 86, 20);
		desktopPane.add(text_Did);
		text_Did.setColumns(10);
		
		text_Dname = new JTextField();
		text_Dname.setBounds(158, 74, 86, 20);
		desktopPane.add(text_Dname);
		text_Dname.setColumns(10);
		
		text_Ddutes = new JTextField();
		text_Ddutes.setBounds(158, 99, 86, 20);
		desktopPane.add(text_Ddutes);
		text_Ddutes.setColumns(10);
		
		text_Dnumber = new JTextField();
		text_Dnumber.setBounds(158, 124, 86, 20);
		desktopPane.add(text_Dnumber);
		text_Dnumber.setColumns(10);
		
		text_Dinfo = new JTextField();
		text_Dinfo.setBounds(158, 149, 86, 20);
		desktopPane.add(text_Dinfo);
		text_Dinfo.setColumns(10);
		
		JButton bottun_Dcreate = new JButton("Create");
		bottun_Dcreate.setBounds(246, 249, 89, 23);
		desktopPane.add(bottun_Dcreate);
		
		JButton bottun_Dclear = new JButton("Clear");
		bottun_Dclear.setBounds(10, 249, 89, 23);
		desktopPane.add(bottun_Dclear);
	}
}
