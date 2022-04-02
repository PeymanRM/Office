package EmpeloyeeView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Empeloyee_Edit {

	private JFrame Empeloyee_edit;
	private JTextField text_Eid;
	private JTextField text_Efather;
	private JTextField textField_7;
	private JTextField text_Eold_Id;
	private JTextField text_Ename;
	private JTextField text_Eeducation;
	private JTextField text_Esalary;
	private JTextField text_Eposition;
	private JTextField text_Ephone;
	private JTextField text_Ehome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyee_Edit window = new Empeloyee_Edit();
					window.Empeloyee_edit.setVisible(true);
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
		Empeloyee_edit = new JFrame();
		Empeloyee_edit.setBounds(100, 100, 1920, 1080);
		Empeloyee_edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Empeloyee_edit.getContentPane().setLayout(null);
		
		JDesktopPane Empeloyee_Edit = new JDesktopPane();
		Empeloyee_Edit.setBackground(Color.LIGHT_GRAY);
		Empeloyee_Edit.setBounds(0, 0, 1920, 1080);
		Empeloyee_edit.getContentPane().add(Empeloyee_Edit);
		
		JLabel lblNewLabel = new JLabel("Create");
		lblNewLabel.setBounds(10, 11, 46, 14);
		Empeloyee_Edit.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New Id");
		lblNewLabel_1.setBounds(10, 64, 46, 14);
		Empeloyee_Edit.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New Name");
		lblNewLabel_2.setBounds(10, 89, 75, 14);
		Empeloyee_Edit.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New Age");
		lblNewLabel_3.setBounds(10, 114, 46, 14);
		Empeloyee_Edit.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New Father's Name");
		lblNewLabel_4.setBounds(10, 139, 108, 14);
		Empeloyee_Edit.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Education Rate");
		lblNewLabel_5.setBounds(10, 163, 88, 14);
		Empeloyee_Edit.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Base Salary");
		lblNewLabel_6.setBounds(252, 64, 88, 14);
		Empeloyee_Edit.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Position");
		lblNewLabel_7.setBounds(252, 89, 46, 14);
		Empeloyee_Edit.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address");
		lblNewLabel_8.setBounds(252, 114, 75, 14);
		Empeloyee_Edit.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Phone");
		lblNewLabel_9.setBounds(252, 139, 46, 14);
		Empeloyee_Edit.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Home Phone");
		lblNewLabel_10.setBounds(252, 163, 88, 14);
		Empeloyee_Edit.add(lblNewLabel_10);
		
		text_Eid = new JTextField();
		text_Eid.setColumns(10);
		text_Eid.setBounds(116, 61, 86, 20);
		Empeloyee_Edit.add(text_Eid);
		
		text_Efather = new JTextField();
		text_Efather.setColumns(10);
		text_Efather.setBounds(116, 136, 86, 20);
		Empeloyee_Edit.add(text_Efather);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(363, 111, 86, 20);
		Empeloyee_Edit.add(textField_7);
		
		JButton bottun_Clear2 = new JButton("Clear");
		bottun_Clear2.setBounds(10, 240, 89, 23);
		Empeloyee_Edit.add(bottun_Clear2);
		
		JButton bottun_Edit = new JButton("Edit");
		bottun_Edit.setBounds(360, 240, 89, 23);
		Empeloyee_Edit.add(bottun_Edit);
		
		JPanel panel = new JPanel();
		panel.setBounds(652, 11, 978, 544);
		Empeloyee_Edit.add(panel);
		
		JLabel lblNewLabel_11 = new JLabel("Id for Edit");
		lblNewLabel_11.setBounds(10, 39, 88, 14);
		Empeloyee_Edit.add(lblNewLabel_11);
		
		text_Eold_Id = new JTextField();
		text_Eold_Id.setBounds(116, 36, 86, 20);
		Empeloyee_Edit.add(text_Eold_Id);
		text_Eold_Id.setColumns(10);
		
		text_Ename = new JTextField();
		text_Ename.setBounds(116, 86, 86, 20);
		Empeloyee_Edit.add(text_Ename);
		text_Ename.setColumns(10);
		
		JTextField text_Eage = new JTextField();
		text_Eage.setText("");
		text_Eage.setBounds(116, 111, 86, 20);
		Empeloyee_Edit.add(text_Eage);
		text_Eage.setColumns(10);
		
		text_Eeducation = new JTextField();
		text_Eeducation.setBounds(116, 160, 86, 20);
		Empeloyee_Edit.add(text_Eeducation);
		text_Eeducation.setColumns(10);
		
		text_Esalary = new JTextField();
		text_Esalary.setBounds(363, 61, 86, 20);
		Empeloyee_Edit.add(text_Esalary);
		text_Esalary.setColumns(10);
		
		text_Eposition = new JTextField();
		text_Eposition.setText("");
		text_Eposition.setBounds(363, 86, 86, 20);
		Empeloyee_Edit.add(text_Eposition);
		text_Eposition.setColumns(10);
		
		text_Ephone = new JTextField();
		text_Ephone.setBounds(363, 136, 86, 20);
		Empeloyee_Edit.add(text_Ephone);
		text_Ephone.setColumns(10);
		
		text_Ehome = new JTextField();
		text_Ehome.setText("");
		text_Ehome.setBounds(363, 160, 86, 20);
		Empeloyee_Edit.add(text_Ehome);
		text_Ehome.setColumns(10);
	}
}
