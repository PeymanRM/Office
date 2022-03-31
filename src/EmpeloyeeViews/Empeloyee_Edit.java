package EmpeloyeeViews;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Empeloyee_Edit {

	private JFrame frame_Empeloyee_Update;
	private JTextField text_Edname;
	private JTextField text_Edage;
	private JTextField text_Edfather;
	private JTextField text_Ededucation;
	private JTextField text_Edsalary;
	private JTextField text_Edposition;
	private JTextField text_Edaddress;
	private JTextField text_Edhome;
	private JTextField text_Edphone;
	private JTextField text_Edid;
	private JTextField text_oldid;
	private JTextField text_Eddepartment;
	private JTable table_Eedit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyee_Edit window = new Empeloyee_Edit();
					window.frame_Empeloyee_Update.setVisible(true);
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
		frame_Empeloyee_Update = new JFrame();
		frame_Empeloyee_Update.setBounds(100, 100, 1920, 1080);
		frame_Empeloyee_Update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_Empeloyee_Update.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1920, 1080);
		frame_Empeloyee_Update.getContentPane().add(panel);
		panel.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(10, 11, 1930, 1091);
		panel.add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("New Id");
		lblNewLabel.setBounds(10, 82, 46, 14);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New Name");
		lblNewLabel_1.setBounds(10, 106, 79, 14);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New Age");
		lblNewLabel_2.setBounds(10, 131, 79, 14);
		desktopPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New Father's Name");
		lblNewLabel_3.setBounds(10, 156, 115, 14);
		desktopPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New Education Rate");
		lblNewLabel_4.setBounds(10, 181, 115, 14);
		desktopPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New  Base Salary");
		lblNewLabel_5.setBounds(257, 82, 100, 14);
		desktopPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New Position");
		lblNewLabel_6.setBounds(257, 106, 100, 14);
		desktopPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New Address");
		lblNewLabel_7.setBounds(257, 131, 100, 14);
		desktopPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New Home's phone");
		lblNewLabel_8.setBounds(257, 156, 118, 14);
		desktopPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New Phone number");
		lblNewLabel_9.setBounds(257, 181, 118, 14);
		desktopPane.add(lblNewLabel_9);
		
		text_Edid = new JTextField();
		text_Edid.setColumns(10);
		text_Edid.setBounds(147, 76, 86, 20);
		desktopPane.add(text_Edid);
		
		text_Edname = new JTextField();
		text_Edname.setColumns(10);
		text_Edname.setBounds(147, 100, 86, 20);
		desktopPane.add(text_Edname);
		
		text_Edage = new JTextField();
		text_Edage.setColumns(10);
		text_Edage.setBounds(147, 125, 86, 20);
		desktopPane.add(text_Edage);
		
		text_Edfather = new JTextField();
		text_Edfather.setColumns(10);
		text_Edfather.setBounds(147, 150, 86, 20);
		desktopPane.add(text_Edfather);
		
		text_Ededucation = new JTextField();
		text_Ededucation.setColumns(10);
		text_Ededucation.setBounds(147, 175, 86, 20);
		desktopPane.add(text_Ededucation);
		
		text_Edsalary = new JTextField();
		text_Edsalary.setColumns(10);
		text_Edsalary.setBounds(385, 79, 86, 20);
		desktopPane.add(text_Edsalary);
		
		text_Edposition = new JTextField();
		text_Edposition.setColumns(10);
		text_Edposition.setBounds(385, 103, 86, 20);
		desktopPane.add(text_Edposition);
		
		text_Edaddress = new JTextField();
		text_Edaddress.setColumns(10);
		text_Edaddress.setBounds(385, 128, 86, 20);
		desktopPane.add(text_Edaddress);
		
		text_Edhome = new JTextField();
		text_Edhome.setColumns(10);
		text_Edhome.setBounds(385, 153, 86, 20);
		desktopPane.add(text_Edhome);
		
		text_Edphone = new JTextField();
		text_Edphone.setColumns(10);
		text_Edphone.setBounds(385, 178, 86, 20);
		desktopPane.add(text_Edphone);
		
		JButton button_Clear2 = new JButton("Clear");
		button_Clear2.setBounds(10, 274, 89, 23);
		desktopPane.add(button_Clear2);
		
		JButton bottun_Edit = new JButton("Edit");
		bottun_Edit.setBounds(382, 274, 89, 23);
		desktopPane.add(bottun_Edit);
		
		JLabel lblNewLabel_10 = new JLabel("Edit");
		lblNewLabel_10.setBounds(10, 11, 388, 14);
		desktopPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Id for Edit");
		lblNewLabel_11.setBounds(10, 48, 89, 14);
		desktopPane.add(lblNewLabel_11);
		
		text_oldid = new JTextField();
		text_oldid.setBounds(147, 45, 86, 20);
		desktopPane.add(text_oldid);
		text_oldid.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("New Department Id");
		lblNewLabel_12.setBounds(257, 206, 115, 14);
		desktopPane.add(lblNewLabel_12);
		
		text_Eddepartment = new JTextField();
		text_Eddepartment.setBounds(385, 203, 86, 20);
		desktopPane.add(text_Eddepartment);
		text_Eddepartment.setColumns(10);
		
		JPanel panel_ETedit = new JPanel();
		panel_ETedit.setLayout(null);
		panel_ETedit.setBounds(803, 11, 915, 530);
		desktopPane.add(panel_ETedit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(903, 519, -890, -511);
		panel_ETedit.add(scrollPane);
		
		table_Eedit = new JTable();
		scrollPane.setViewportView(table_Eedit);
		table_Eedit.setSurrendersFocusOnKeystroke(true);
		table_Eedit.setFillsViewportHeight(true);
		table_Eedit.setColumnSelectionAllowed(true);
		table_Eedit.setCellSelectionEnabled(true);
		table_Eedit.setBackground(Color.BLACK);
	}
}
