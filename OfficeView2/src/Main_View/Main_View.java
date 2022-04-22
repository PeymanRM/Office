package Main_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Main_View {

	private JFrame frame;
	private JLabel label1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_View window = new Main_View();
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
	public Main_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   WELCOME");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 94));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(570, 164, 866, 617);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnEmpeloyees = new JMenu("Empeloyees");
		mnEmpeloyees.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnEmpeloyees);
		
		JMenuItem Empeloyee_Create = new JMenuItem("Create");
		Empeloyee_Create.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnEmpeloyees.add(Empeloyee_Create);
		
		JMenuItem Empeloyee_View = new JMenuItem("View");
		Empeloyee_View.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnEmpeloyees.add(Empeloyee_View);
		
		JMenu mnNewEmpeloyed = new JMenu("New Empeloyeds");
		mnNewEmpeloyed.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewEmpeloyed);
		
		JMenuItem Empeloyed_Create = new JMenuItem("Create");
		Empeloyed_Create.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewEmpeloyed.add(Empeloyed_Create);
		
		JMenuItem Empeloyment_View = new JMenuItem("View");
		Empeloyment_View.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewEmpeloyed.add(Empeloyment_View);
		
		JMenu mnDepartments = new JMenu("Departments");
		mnDepartments.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnDepartments);
		
		JMenuItem Department_Create = new JMenuItem("Create");
		Department_Create.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnDepartments.add(Department_Create);
		
		JMenuItem Department_View = new JMenuItem("View");
		Department_View.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnDepartments.add(Department_View);
		
		JMenu mnDocument = new JMenu("Documents");
		mnDocument.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnDocument);
		
		JMenuItem Document_Create = new JMenuItem("Create");
		Document_Create.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnDocument.add(Document_Create);
		
		JMenuItem Document_View = new JMenuItem("View");
		Document_View.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnDocument.add(Document_View);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		
	}
}
