package EmpeloyeeSalaryViews;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class Salary_Create {

	private JFrame frame;
	private JTextField txt_search;
	private JTextField text_Esalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salary_Create window = new Salary_Create();
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
	public Salary_Create() {
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
		desktopPane.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("Create");
		lblNewLabel.setBounds(10, 11, 46, 14);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search Empeloyee");
		lblNewLabel_1.setBounds(10, 56, 102, 14);
		desktopPane.add(lblNewLabel_1);
		
		txt_search = new JTextField();
		txt_search.setBounds(158, 53, 118, 20);
		desktopPane.add(txt_search);
		txt_search.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Salary");
		lblNewLabel_2.setBounds(10, 106, 102, 14);
		desktopPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pay");
		lblNewLabel_3.setBounds(10, 145, 46, 14);
		desktopPane.add(lblNewLabel_3);
		
		JCheckBox Check_pay_yes = new JCheckBox("Yes");
		Check_pay_yes.setBounds(158, 145, 52, 23);
		desktopPane.add(Check_pay_yes);
		
		text_Esalary = new JTextField();
		text_Esalary.setBounds(158, 103, 118, 20);
		desktopPane.add(text_Esalary);
		text_Esalary.setColumns(10);
		
		JCheckBox Check_pay_no = new JCheckBox("N0");
		Check_pay_no.setBounds(212, 145, 59, 23);
		desktopPane.add(Check_pay_no);
	}
}
