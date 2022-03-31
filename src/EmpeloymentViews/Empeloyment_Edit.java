package EmpeloymentViews;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Empeloyment_Edit {

	private JFrame frame_Empeloyee_Update;
	private JTextField text_Empelo_Edname;
	private JTextField text_Empelo_Edage;
	private JTextField text_Empelo_Edfather;
	private JTextField text_Empelo_Ededucation;
	private JTextField text_Empelo_Edsalary;
	private JTextField text_Empelo_Edposition;
	private JTextField text_Empelo_Edhome;
	private JTextField text_Empelo_Edphone;
	private JTextField text_Empelo_Edid;
	private JTextField text_Empelo_Edaddress;
	private JTextField text_Empelo_oldid;
	private JTextField text_Empelo_Eddepartment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyment_Edit window = new Empeloyment_Edit();
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
	public Empeloyment_Edit() {
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
		desktopPane.setBounds(0, 0, 1930, 1091);
		panel.add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("New Id");
		lblNewLabel.setBounds(10, 82, 46, 14);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New Name");
		lblNewLabel_1.setBounds(10, 106, 83, 14);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New Age");
		lblNewLabel_2.setBounds(10, 131, 63, 14);
		desktopPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New Father's Name");
		lblNewLabel_3.setBounds(10, 156, 120, 14);
		desktopPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New Education Rate");
		lblNewLabel_4.setBounds(10, 181, 120, 14);
		desktopPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New Base Salary");
		lblNewLabel_5.setBounds(236, 82, 120, 14);
		desktopPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New Position");
		lblNewLabel_6.setBounds(236, 106, 83, 14);
		desktopPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New Address");
		lblNewLabel_7.setBounds(236, 131, 99, 14);
		desktopPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New Home's phone");
		lblNewLabel_8.setBounds(236, 156, 119, 14);
		desktopPane.add(lblNewLabel_8);
		
		JLabel text_Empelo = new JLabel("New Phone number");
		text_Empelo.setBounds(236, 181, 119, 14);
		desktopPane.add(text_Empelo);
		
		text_Empelo_Edid = new JTextField();
		text_Empelo_Edid.setColumns(10);
		text_Empelo_Edid.setBounds(140, 76, 86, 20);
		desktopPane.add(text_Empelo_Edid);
		
		text_Empelo_Edname = new JTextField();
		text_Empelo_Edname.setColumns(10);
		text_Empelo_Edname.setBounds(140, 100, 86, 20);
		desktopPane.add(text_Empelo_Edname);
		
		text_Empelo_Edage = new JTextField();
		text_Empelo_Edage.setColumns(10);
		text_Empelo_Edage.setBounds(140, 125, 86, 20);
		desktopPane.add(text_Empelo_Edage);
		
		text_Empelo_Edfather = new JTextField();
		text_Empelo_Edfather.setColumns(10);
		text_Empelo_Edfather.setBounds(140, 150, 86, 20);
		desktopPane.add(text_Empelo_Edfather);
		
		text_Empelo_Ededucation = new JTextField();
		text_Empelo_Ededucation.setColumns(10);
		text_Empelo_Ededucation.setBounds(140, 175, 86, 20);
		desktopPane.add(text_Empelo_Ededucation);
		
		text_Empelo_Edsalary = new JTextField();
		text_Empelo_Edsalary.setColumns(10);
		text_Empelo_Edsalary.setBounds(365, 76, 86, 20);
		desktopPane.add(text_Empelo_Edsalary);
		
		text_Empelo_Edposition = new JTextField();
		text_Empelo_Edposition.setColumns(10);
		text_Empelo_Edposition.setBounds(365, 100, 86, 20);
		desktopPane.add(text_Empelo_Edposition);
		
		text_Empelo_Edaddress = new JTextField();
		text_Empelo_Edaddress.setColumns(10);
		text_Empelo_Edaddress.setBounds(365, 125, 86, 20);
		desktopPane.add(text_Empelo_Edaddress);
		
		text_Empelo_Edhome = new JTextField();
		text_Empelo_Edhome.setColumns(10);
		text_Empelo_Edhome.setBounds(365, 150, 86, 20);
		desktopPane.add(text_Empelo_Edhome);
		
		text_Empelo_Edphone = new JTextField();
		text_Empelo_Edphone.setColumns(10);
		text_Empelo_Edphone.setBounds(365, 175, 86, 20);
		desktopPane.add(text_Empelo_Edphone);
		
		JButton button_Clear1 = new JButton("Clear");
		button_Clear1.setBounds(10, 277, 89, 23);
		desktopPane.add(button_Clear1);
		
		JButton bottun_Empelo_Edit = new JButton("Edit");
		bottun_Empelo_Edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bottun_Empelo_Edit.setBounds(362, 277, 89, 23);
		desktopPane.add(bottun_Empelo_Edit);
		
		JLabel lblNewLabel_10 = new JLabel("Edit");
		lblNewLabel_10.setBounds(10, 11, 388, 14);
		desktopPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("Id for Edit");
		lblNewLabel_9.setBounds(10, 48, 83, 14);
		desktopPane.add(lblNewLabel_9);
		
		text_Empelo_oldid = new JTextField();
		text_Empelo_oldid.setBounds(140, 45, 86, 20);
		desktopPane.add(text_Empelo_oldid);
		text_Empelo_oldid.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("New Department Id");
		lblNewLabel_11.setBounds(236, 209, 135, 14);
		desktopPane.add(lblNewLabel_11);
		
		text_Empelo_Eddepartment = new JTextField();
		text_Empelo_Eddepartment.setBounds(365, 206, 86, 20);
		desktopPane.add(text_Empelo_Eddepartment);
		text_Empelo_Eddepartment.setColumns(10);
	}
}
