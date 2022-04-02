package EmpeloyeeView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Empeloyee_Create {

	private JFrame Empeloyee_Create;
	private JTextField text_Cid;
	private JTextField text_Cfather;
	private JTextField text_Caddress;
	private JTextField text_Cname;
	private JTextField text_Cage;
	private JTextField text_Ceducation;
	private JTextField text_Csalary;
	private JTextField text_Cposition;
	private JTextField text_Cphone;
	private JTextField text_Chome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyee_Create window = new Empeloyee_Create();
					window.Empeloyee_Create.setVisible(true);
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
		Empeloyee_Create = new JFrame();
		Empeloyee_Create.setBounds(100, 100, 1920, 1080);
		Empeloyee_Create.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Empeloyee_Create.getContentPane().setLayout(null);
		
		JDesktopPane Empeloyee_Craete = new JDesktopPane();
		Empeloyee_Craete.setBackground(Color.LIGHT_GRAY);
		Empeloyee_Craete.setBounds(10, 0, 1920, 1080);
		Empeloyee_Create.getContentPane().add(Empeloyee_Craete);
		
		JLabel lblNewLabel = new JLabel("Create");
		lblNewLabel.setBounds(10, 11, 46, 14);
		Empeloyee_Craete.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(10, 48, 46, 14);
		Empeloyee_Craete.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(10, 73, 46, 14);
		Empeloyee_Craete.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setBounds(10, 98, 46, 14);
		Empeloyee_Craete.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Father's Name");
		lblNewLabel_4.setBounds(10, 123, 88, 14);
		Empeloyee_Craete.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Education Rate");
		lblNewLabel_5.setBounds(10, 144, 88, 14);
		Empeloyee_Craete.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Base Salary");
		lblNewLabel_6.setBounds(252, 48, 88, 14);
		Empeloyee_Craete.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Position");
		lblNewLabel_7.setBounds(252, 73, 46, 14);
		Empeloyee_Craete.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address");
		lblNewLabel_8.setBounds(252, 98, 75, 14);
		Empeloyee_Craete.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Phone");
		lblNewLabel_9.setBounds(252, 123, 46, 14);
		Empeloyee_Craete.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Home Phone");
		lblNewLabel_10.setBounds(252, 144, 88, 14);
		Empeloyee_Craete.add(lblNewLabel_10);
		
		text_Cid = new JTextField();
		text_Cid.setBounds(116, 45, 86, 20);
		Empeloyee_Craete.add(text_Cid);
		text_Cid.setColumns(10);
		
		text_Cfather = new JTextField();
		text_Cfather.setBounds(116, 120, 86, 20);
		Empeloyee_Craete.add(text_Cfather);
		text_Cfather.setColumns(10);
		
		text_Caddress = new JTextField();
		text_Caddress.setBounds(363, 95, 86, 20);
		Empeloyee_Craete.add(text_Caddress);
		text_Caddress.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(10, 224, 89, 23);
		Empeloyee_Craete.add(btnClear);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(360, 224, 89, 23);
		Empeloyee_Craete.add(btnCreate);
		
		JPanel panel = new JPanel();
		panel.setBounds(652, 11, 978, 544);
		Empeloyee_Craete.add(panel);
		
		text_Cname = new JTextField();
		text_Cname.setBounds(116, 70, 86, 20);
		Empeloyee_Craete.add(text_Cname);
		text_Cname.setColumns(10);
		
		text_Cage = new JTextField();
		text_Cage.setBounds(116, 95, 86, 20);
		Empeloyee_Craete.add(text_Cage);
		text_Cage.setColumns(10);
		
		text_Ceducation = new JTextField();
		text_Ceducation.setBounds(116, 141, 86, 20);
		Empeloyee_Craete.add(text_Ceducation);
		text_Ceducation.setColumns(10);
		
		text_Csalary = new JTextField();
		text_Csalary.setBounds(363, 45, 86, 20);
		Empeloyee_Craete.add(text_Csalary);
		text_Csalary.setColumns(10);
		
		text_Cposition = new JTextField();
		text_Cposition.setBounds(363, 70, 86, 20);
		Empeloyee_Craete.add(text_Cposition);
		text_Cposition.setColumns(10);
		
		text_Cphone = new JTextField();
		text_Cphone.setBounds(363, 120, 86, 20);
		Empeloyee_Craete.add(text_Cphone);
		text_Cphone.setColumns(10);
		
		text_Chome = new JTextField();
		text_Chome.setBounds(363, 144, 86, 20);
		Empeloyee_Craete.add(text_Chome);
		text_Chome.setColumns(10);
	}
}
