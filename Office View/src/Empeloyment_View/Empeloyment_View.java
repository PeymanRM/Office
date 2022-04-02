package Empeloyment_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;

public class Empeloyment_View {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyment_View window = new Empeloyment_View();
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
	public Empeloyment_View() {
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
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(0, 0, 1904, 1080);
		frame.getContentPane().add(desktopPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(260, 61, 1005, 642);
		desktopPane.add(panel);
		
		JScrollPane scro_Visit = new JScrollPane();
		scro_Visit.setBounds(2, 640, 993, -640);
		panel.add(scro_Visit);
	}
}
