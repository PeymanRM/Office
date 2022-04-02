package Empeloyment_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Empeloyment_Edit {

	private JFrame Empeloyment_edit;
	private JTextField text_Empelo_Eeducation;
	private JTextField text_Empelo_Efather;
	private JTextField text_Empelo_Eage;
	private JTextField text_Empelo_Ename;
	private JTextField text_Empelo_Eid;
	private JTextField text_Empelo_oldid;
	private JTextField text_Empelo_Esalary;
	private JTextField text_Empelo_Ehome;
	private JTextField text_Empelo_Ephone;
	private JTextField text_Empelo_Eaddress;
	private JTextField text_Empelo_Eposition;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyment_Edit window = new Empeloyment_Edit();
					window.Empeloyment_edit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Empeloyment_Edit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Empeloyment_edit = new JFrame();
		Empeloyment_edit.setBounds(100, 100, 1920, 1080);
		Empeloyment_edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Empeloyment_edit.getContentPane().setLayout(null);
		
		JDesktopPane Empeloyment_Edit = new JDesktopPane();
		Empeloyment_Edit.setBackground(Color.LIGHT_GRAY);
		Empeloyment_Edit.setBounds(0, 0, 1920, 1080);
		Empeloyment_edit.getContentPane().add(Empeloyment_Edit);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(10, 11, 46, 14);
		Empeloyment_Edit.add(lblEdit);
		
		JLabel lblNewLabel_11 = new JLabel("Id for Edit");
		lblNewLabel_11.setBounds(10, 39, 88, 14);
		Empeloyment_Edit.add(lblNewLabel_11);
		
		JLabel lblNewLabel_1 = new JLabel("New Id");
		lblNewLabel_1.setBounds(10, 64, 46, 14);
		Empeloyment_Edit.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New Name");
		lblNewLabel_2.setBounds(10, 89, 75, 14);
		Empeloyment_Edit.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New Age");
		lblNewLabel_3.setBounds(10, 114, 46, 14);
		Empeloyment_Edit.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New Father's Name");
		lblNewLabel_4.setBounds(10, 139, 108, 14);
		Empeloyment_Edit.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Education Rate");
		lblNewLabel_5.setBounds(10, 163, 88, 14);
		Empeloyment_Edit.add(lblNewLabel_5);
		
		text_Empelo_Eeducation = new JTextField();
		text_Empelo_Eeducation.setColumns(10);
		text_Empelo_Eeducation.setBounds(116, 160, 86, 20);
		Empeloyment_Edit.add(text_Empelo_Eeducation);
		
		text_Empelo_Efather = new JTextField();
		text_Empelo_Efather.setColumns(10);
		text_Empelo_Efather.setBounds(116, 136, 86, 20);
		Empeloyment_Edit.add(text_Empelo_Efather);
		
		text_Empelo_Eage = new JTextField();
		text_Empelo_Eage.setText("");
		text_Empelo_Eage.setColumns(10);
		text_Empelo_Eage.setBounds(116, 111, 86, 20);
		Empeloyment_Edit.add(text_Empelo_Eage);
		
		text_Empelo_Ename = new JTextField();
		text_Empelo_Ename.setColumns(10);
		text_Empelo_Ename.setBounds(116, 86, 86, 20);
		Empeloyment_Edit.add(text_Empelo_Ename);
		
		text_Empelo_Eid = new JTextField();
		text_Empelo_Eid.setColumns(10);
		text_Empelo_Eid.setBounds(116, 61, 86, 20);
		Empeloyment_Edit.add(text_Empelo_Eid);
		
		text_Empelo_oldid = new JTextField();
		text_Empelo_oldid.setColumns(10);
		text_Empelo_oldid.setBounds(116, 36, 86, 20);
		Empeloyment_Edit.add(text_Empelo_oldid);
		
		text_Empelo_Esalary = new JTextField();
		text_Empelo_Esalary.setColumns(10);
		text_Empelo_Esalary.setBounds(363, 61, 86, 20);
		Empeloyment_Edit.add(text_Empelo_Esalary);
		
		JLabel lblNewLabel_6 = new JLabel("Base Salary");
		lblNewLabel_6.setBounds(252, 64, 88, 14);
		Empeloyment_Edit.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Position");
		lblNewLabel_7.setBounds(252, 89, 46, 14);
		Empeloyment_Edit.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address");
		lblNewLabel_8.setBounds(252, 114, 75, 14);
		Empeloyment_Edit.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Phone");
		lblNewLabel_9.setBounds(252, 139, 46, 14);
		Empeloyment_Edit.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Home Phone");
		lblNewLabel_10.setBounds(252, 163, 88, 14);
		Empeloyment_Edit.add(lblNewLabel_10);
		
		text_Empelo_Ehome = new JTextField();
		text_Empelo_Ehome.setText("");
		text_Empelo_Ehome.setColumns(10);
		text_Empelo_Ehome.setBounds(363, 160, 86, 20);
		Empeloyment_Edit.add(text_Empelo_Ehome);
		
		text_Empelo_Ephone = new JTextField();
		text_Empelo_Ephone.setColumns(10);
		text_Empelo_Ephone.setBounds(363, 136, 86, 20);
		Empeloyment_Edit.add(text_Empelo_Ephone);
		
		text_Empelo_Eaddress = new JTextField();
		text_Empelo_Eaddress.setColumns(10);
		text_Empelo_Eaddress.setBounds(363, 111, 86, 20);
		Empeloyment_Edit.add(text_Empelo_Eaddress);
		
		text_Empelo_Eposition = new JTextField();
		text_Empelo_Eposition.setText("");
		text_Empelo_Eposition.setColumns(10);
		text_Empelo_Eposition.setBounds(363, 86, 86, 20);
		Empeloyment_Edit.add(text_Empelo_Eposition);
		
		JButton bottun_Empelo_Edit = new JButton("Edit");
		bottun_Empelo_Edit.setBounds(360, 240, 89, 23);
		Empeloyment_Edit.add(bottun_Empelo_Edit);
		
		JButton bottun_Clear5 = new JButton("Clear");
		bottun_Clear5.setBounds(10, 240, 89, 23);
		Empeloyment_Edit.add(bottun_Clear5);
	}
}
