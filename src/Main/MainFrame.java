package Main;



import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class MainFrame {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 * @throws HeadlessException 
	 */
	
	public static void main(String[] args){
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image image=new ImageIcon(this.getClass().getResource("/Cool Plain Backgrounds.png")).getImage();
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		menuBar.setBounds(0, 0, 1920, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu CM = new JMenu("Create");
		menuBar.add(CM);
		
		JMenuItem CM_Empeloyees = new JMenuItem("Empeloyees");
		CM.add(CM_Empeloyees);
		
		JMenuItem CM_Empeloyments = new JMenuItem("Empeloyments");
		CM.add(CM_Empeloyments);
		
		JMenuItem CM_Departments = new JMenuItem("Departments");
		CM.add(CM_Departments);
		
		JMenuItem CM_Documents = new JMenuItem("Documents");
		CM.add(CM_Documents);
		
		JMenuItem CM_Salary = new JMenuItem("Salaries");
		CM.add(CM_Salary);
		
		JMenu EM = new JMenu("Edit");
		menuBar.add(EM);
		
		JMenuItem EM_Empeloyee = new JMenuItem("Empeloyees");
		EM.add(EM_Empeloyee);
		
		JMenuItem EM_Empeloyment = new JMenuItem("Empeloyments");
		EM.add(EM_Empeloyment);
		
		JMenuItem EM_Departments = new JMenuItem("Departments");
		EM.add(EM_Departments);
		
		JMenuItem EM_Documents = new JMenuItem("Documents");
		EM.add(EM_Documents);
		
		JMenuItem EM_Salary = new JMenuItem("Salaries");
		EM.add(EM_Salary);
		
		JMenu DM = new JMenu("Delete");
		menuBar.add(DM);
		
		JMenuItem DM_Empeloyees = new JMenuItem("Empeloyees");
		DM.add(DM_Empeloyees);
		
		JMenuItem DM_Empeloyments = new JMenuItem("Empeloyments");
		DM.add(DM_Empeloyments);
		
		JMenuItem DM_Departments = new JMenuItem("Departments");
		DM.add(DM_Departments);
		
		JMenuItem DM_Documents = new JMenuItem("Documents");
		DM.add(DM_Documents);
		
		JMenuItem DM_Salary = new JMenuItem("Salaries");
		DM.add(DM_Salary);
		
		JMenu VM = new JMenu("Visit");
		menuBar.add(VM);
		
		JMenu VM_Empeloyees = new JMenu("Empeloyees");
		VM.add(VM_Empeloyees);
		
		JMenuItem VM_Salary = new JMenuItem("Salary");
		VM_Empeloyees.add(VM_Salary);
		
		JMenuItem VM_Empeloyments = new JMenuItem("Empeloyments");
		VM.add(VM_Empeloyments);
		
		JMenuItem VM_Departments = new JMenuItem("Departments");
		VM.add(VM_Departments);
		
		JMenuItem VM_Documents = new JMenuItem("Documents");
		VM.add(VM_Documents);
		
		JMenuItem Salary = new JMenuItem("Salaries");
		VM.add(Salary);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar.add(menuBar_2);
		
		JLabel lbl= new JLabel();
		lbl.setBounds(0, 22, 1920, 1080);
		frame.getContentPane().add(lbl);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.WHITE);
		lbl.setIcon(new ImageIcon(image));
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

