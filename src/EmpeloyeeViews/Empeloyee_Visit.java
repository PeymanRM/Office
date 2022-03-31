package EmpeloyeeViews;



import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.EventQueue;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Empeloyee_Visit {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyee_Visit window = new Empeloyee_Visit();
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
	public Empeloyee_Visit() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 1920, 1080);
		panel.add(desktopPane);
		
		JPanel panel_EV = new JPanel();
		panel_EV.setLayout(null);
		panel_EV.setBounds(748, 11, 915, 530);
		desktopPane.add(panel_EV);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(903, 519, -890, -511);
		panel_EV.add(scrollPane);
	}
}
