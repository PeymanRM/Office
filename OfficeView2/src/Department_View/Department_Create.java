package Department_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Department_Create {

	private JFrame frame;
	private JTextField text_Cdept_Id;
	private JTextField text_CD_Name;
	private JTextField text_CD_Duties;
	private JTextField text_CD_Number;
	private JTextField text_CD_Date;
	private JTextField text_CD_Time;
	private JTable table_Department_Create;

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
		frame.getContentPane().setBackground(new Color(51, 102, 153));
		frame.getContentPane().setForeground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel(" CREATE");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9.setBounds(1079, 11, 444, 178);
		frame.getContentPane().add(lblNewLabel_9);
		
		JPanel Panel_CD_Create = new JPanel();
		Panel_CD_Create.setLayout(null);
		Panel_CD_Create.setBackground(SystemColor.inactiveCaption);
		Panel_CD_Create.setBounds(129, 261, 819, 545);
		frame.getContentPane().add(Panel_CD_Create);
		
		JLabel lblDepartmentId = new JLabel("Id");
		lblDepartmentId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDepartmentId.setBounds(58, 11, 94, 14);
		Panel_CD_Create.add(lblDepartmentId);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(58, 97, 68, 14);
		Panel_CD_Create.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Duties");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(434, 97, 68, 14);
		Panel_CD_Create.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of empeloyees");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(58, 206, 248, 52);
		Panel_CD_Create.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(434, 225, 87, 14);
		Panel_CD_Create.add(lblNewLabel_4);
		
		text_Cdept_Id = new JTextField();
		text_Cdept_Id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Cdept_Id.setColumns(10);
		text_Cdept_Id.setBounds(46, 36, 145, 29);
		Panel_CD_Create.add(text_Cdept_Id);
		
		text_CD_Name = new JTextField();
		text_CD_Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_CD_Name.setColumns(10);
		text_CD_Name.setBounds(46, 122, 285, 29);
		Panel_CD_Create.add(text_CD_Name);
		
		text_CD_Duties = new JTextField();
		text_CD_Duties.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_CD_Duties.setColumns(10);
		text_CD_Duties.setBounds(416, 122, 285, 29);
		Panel_CD_Create.add(text_CD_Duties);
		
		text_CD_Number = new JTextField();
		text_CD_Number.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_CD_Number.setColumns(10);
		text_CD_Number.setBounds(46, 257, 285, 29);
		Panel_CD_Create.add(text_CD_Number);
		
		text_CD_Date = new JTextField();
		text_CD_Date.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_CD_Date.setColumns(10);
		text_CD_Date.setBounds(416, 257, 285, 29);
		Panel_CD_Create.add(text_CD_Date);
		
		JButton button_CD_Create = new JButton("Create");
		button_CD_Create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_CD_Create.setBounds(612, 475, 89, 39);
		Panel_CD_Create.add(button_CD_Create);
		
		JButton button_CD_Clear = new JButton("Clear");
		button_CD_Clear.setBounds(452, 475, 89, 39);
		Panel_CD_Create.add(button_CD_Clear);
		
		text_CD_Time = new JTextField();
		text_CD_Time.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_CD_Time.setBounds(46, 387, 285, 29);
		Panel_CD_Create.add(text_CD_Time);
		text_CD_Time.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Time");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(58, 337, 46, 39);
		Panel_CD_Create.add(lblNewLabel);
		
		JLabel lblNewLabel_9_1 = new JLabel("DEPARTMENTS");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(455, 11, 691, 178);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JButton button_Chome = new JButton("Home");
		button_Chome.setBounds(873, 933, 117, 61);
		frame.getContentPane().add(button_Chome);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(984, 228, 817, 619);
		frame.getContentPane().add(scrollPane);
		
		table_Department_Create = new JTable();
		scrollPane.setViewportView(table_Department_Create);
	}
}
