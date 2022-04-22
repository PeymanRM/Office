package Documents_View;

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
import javax.swing.JTable;

public class Documents_Create {

	private JFrame frame;
	private JTextField text_DoC_Id;
	private JTextField text_DoC_Name;
	private JTextField text_DoC_Subject;
	private JTextField text_DoC_Nametransmitte;
	private JTextField text_DoC_Namereciver;
	private JTextField text_DoC_Date;
	private JTextField text_DoC_Time;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Documents_Create window = new Documents_Create();
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
	public Documents_Create() {
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
		
		JLabel lblNewLabel_9_1 = new JLabel("DOCUMENTS");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(489, 11, 691, 178);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9 = new JLabel(" CREATE");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9.setBounds(1024, 11, 444, 178);
		frame.getContentPane().add(lblNewLabel_9);
		
		JPanel Panel_Create = new JPanel();
		Panel_Create.setLayout(null);
		Panel_Create.setBackground(SystemColor.inactiveCaption);
		Panel_Create.setBounds(129, 261, 800, 541);
		frame.getContentPane().add(Panel_Create);
		
		JLabel lblDepartmentId = new JLabel("Id");
		lblDepartmentId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDepartmentId.setBounds(58, 25, 94, 14);
		Panel_Create.add(lblDepartmentId);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(57, 101, 68, 28);
		Panel_Create.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Subject");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(444, 106, 68, 23);
		Panel_Create.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name of transmitter");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(57, 207, 192, 29);
		Panel_Create.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Name of reciver");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(444, 213, 143, 22);
		Panel_Create.add(lblNewLabel_4);
		
		text_DoC_Id = new JTextField();
		text_DoC_Id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoC_Id.setColumns(10);
		text_DoC_Id.setBounds(46, 51, 145, 29);
		Panel_Create.add(text_DoC_Id);
		
		text_DoC_Name = new JTextField();
		text_DoC_Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoC_Name.setColumns(10);
		text_DoC_Name.setBounds(46, 139, 323, 29);
		Panel_Create.add(text_DoC_Name);
		
		text_DoC_Subject = new JTextField();
		text_DoC_Subject.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoC_Subject.setColumns(10);
		text_DoC_Subject.setBounds(428, 139, 285, 29);
		Panel_Create.add(text_DoC_Subject);
		
		text_DoC_Nametransmitte = new JTextField();
		text_DoC_Nametransmitte.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoC_Nametransmitte.setColumns(10);
		text_DoC_Nametransmitte.setBounds(46, 240, 318, 29);
		Panel_Create.add(text_DoC_Nametransmitte);
		
		text_DoC_Namereciver = new JTextField();
		text_DoC_Namereciver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoC_Namereciver.setColumns(10);
		text_DoC_Namereciver.setBounds(428, 242, 293, 29);
		Panel_Create.add(text_DoC_Namereciver);
		
		text_DoC_Date = new JTextField();
		text_DoC_Date.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoC_Date.setBounds(44, 325, 215, 29);
		Panel_Create.add(text_DoC_Date);
		text_DoC_Date.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Date");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(61, 297, 46, 14);
		Panel_Create.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Time");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(452, 299, 46, 14);
		Panel_Create.add(lblNewLabel_5);
		
		text_DoC_Time = new JTextField();
		text_DoC_Time.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DoC_Time.setBounds(431, 328, 221, 29);
		Panel_Create.add(text_DoC_Time);
		text_DoC_Time.setColumns(10);
		
		JButton button_DoC_Create = new JButton("Create");
		button_DoC_Create.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_DoC_Create.setBounds(632, 446, 89, 39);
		Panel_Create.add(button_DoC_Create);
		
		JButton button_DoC_Clear = new JButton("Clear");
		button_DoC_Clear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_DoC_Clear.setBounds(471, 446, 89, 39);
		Panel_Create.add(button_DoC_Clear);
		button_DoC_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button_DoC_home = new JButton("Home");
		button_DoC_home.setBounds(873, 933, 117, 61);
		frame.getContentPane().add(button_DoC_home);
		
		table = new JTable();
		table.setBounds(984, 228, 817, 619);
		frame.getContentPane().add(table);
	}
}
