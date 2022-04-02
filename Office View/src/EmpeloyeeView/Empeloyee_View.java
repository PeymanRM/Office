package EmpeloyeeView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Empeloyee_View {

	private JFrame Empeloyee_view;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyee_View window = new Empeloyee_View();
					window.Empeloyee_view.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Empeloyee_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Empeloyee_view = new JFrame();
		Empeloyee_view.setBounds(100, 100, 1920, 1080);
		Empeloyee_view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Empeloyee_view.getContentPane().setLayout(null);
		
		JDesktopPane Empeloyee_View = new JDesktopPane();
		Empeloyee_View.setBounds(0, 0, 1920, 1080);
		Empeloyee_view.getContentPane().add(Empeloyee_View);
		
		JPanel panel = new JPanel();
		panel.setBounds(260, 61, 1005, 642);
		Empeloyee_View.add(panel);
		panel.setLayout(null);
		
		JScrollPane scro_Visit = new JScrollPane();
		scro_Visit.setBounds(2, 640, 993, -640);
		panel.add(scro_Visit);
		
		table = new JTable();
		scro_Visit.setViewportView(table);
	}
}
