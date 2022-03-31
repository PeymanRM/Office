package EmpeloyeeSalaryViews;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class Salary_Edit {

	private JFrame frame;
	private JTextField text_Edit_salary;
	private JTextField text_Edit_search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salary_Edit window = new Salary_Edit();
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
	public Salary_Edit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(desktopPane);
		
		JLabel lblNewLabel_1 = new JLabel("Search Empeloyee");
		lblNewLabel_1.setBounds(0, 45, 102, 14);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salary");
		lblNewLabel_2.setBounds(0, 95, 102, 14);
		desktopPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pay");
		lblNewLabel_3.setBounds(0, 134, 46, 14);
		desktopPane.add(lblNewLabel_3);
		
		JCheckBox Check_Epay_yes = new JCheckBox("Yes");
		Check_Epay_yes.setBounds(148, 134, 52, 23);
		desktopPane.add(Check_Epay_yes);
		
		JCheckBox Check_Epay_no = new JCheckBox("N0");
		Check_Epay_no.setBounds(202, 134, 59, 23);
		desktopPane.add(Check_Epay_no);
		
		text_Edit_salary = new JTextField();
		text_Edit_salary.setColumns(10);
		text_Edit_salary.setBounds(148, 92, 118, 20);
		desktopPane.add(text_Edit_salary);
		
		text_Edit_search = new JTextField();
		text_Edit_search.setColumns(10);
		text_Edit_search.setBounds(148, 42, 118, 20);
		desktopPane.add(text_Edit_search);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(0, 0, 46, 14);
		desktopPane.add(lblEdit);
	}

}
