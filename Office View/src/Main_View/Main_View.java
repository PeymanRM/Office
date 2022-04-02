package Main_View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Main_View {

	private JFrame frame;
	private JLabel label;

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
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		label=new JLabel("");
		Image image=new ImageIcon(this.getClass().getResource("/Cool Plain Backgrounds.png")).getImage();
		label.setIcon(new ImageIcon(image));
		label.setBounds(0, 22, 1920, 1080);
		frame.getContentPane().add(label);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1920, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu mnCreate = new JMenu("Create");
		menuBar.add(mnCreate);
		
		JMenuItem Menu_Cempeloyee = new JMenuItem("Empeloyees");
		mnCreate.add(Menu_Cempeloyee);
		
		JMenuItem Menu_Cempeloyment = new JMenuItem("Empeloyments");
		mnCreate.add(Menu_Cempeloyment);
		
		JMenuItem Menu_Cdepartment = new JMenuItem("Departments");
		mnCreate.add(Menu_Cdepartment);
		
		JMenuItem Menu_Cdocument = new JMenuItem("Documents");
		mnCreate.add(Menu_Cdocument);
		
		JMenuItem Menu_Csalary = new JMenuItem("Salaries");
		mnCreate.add(Menu_Csalary);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem Menu_Eempeloyee = new JMenuItem("Empeloyees");
		mnEdit.add(Menu_Eempeloyee);
		
		JMenuItem Menu_Eempeloyet = new JMenuItem("Empeloyments");
		mnEdit.add(Menu_Eempeloyet);
		
		JMenuItem Menu_Edepratment = new JMenuItem("Departments");
		mnEdit.add(Menu_Edepratment);
		
		JMenuItem Menu_Edacument = new JMenuItem("Documents");
		mnEdit.add(Menu_Edacument);
		
		JMenuItem Menu_Esalary = new JMenuItem("Salaries");
		mnEdit.add(Menu_Esalary);
		
		JMenu mnDelete = new JMenu("Delete");
		menuBar.add(mnDelete);
		
		JMenuItem Menu_Dempeloyee = new JMenuItem("Empeloyees");
		mnDelete.add(Menu_Dempeloyee);
		
		JMenuItem Menu_Dempeloyment = new JMenuItem("Empeloyments");
		mnDelete.add(Menu_Dempeloyment);
		
		JMenuItem Menu_Ddepartment = new JMenuItem("Departments");
		mnDelete.add(Menu_Ddepartment);
		
		JMenuItem Menu_Ddocument = new JMenuItem("Documents");
		mnDelete.add(Menu_Ddocument);
		
		JMenuItem Menu_Dsalary = new JMenuItem("Salaries");
		mnDelete.add(Menu_Dsalary);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenuItem Menu_Vempeloyee = new JMenuItem("Empeloyees");
		mnView.add(Menu_Vempeloyee);
		
		JMenuItem Menu_Vempeloyment = new JMenuItem("Empeloyments");
		mnView.add(Menu_Vempeloyment);
		
		JMenuItem Menu_Vdepartment = new JMenuItem("Departments");
		mnView.add(Menu_Vdepartment);
		
		JMenuItem Menu_Vdocument = new JMenuItem("Documents");
		mnView.add(Menu_Vdocument);
		
		JMenuItem Menu_Vsalary = new JMenuItem("Salaries");
		mnView.add(Menu_Vsalary);
		
		JMenuBar menuBar_3 = new JMenuBar();
		menuBar.add(menuBar_3);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar.add(menuBar_2);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
	}
}
