package EmpeloyeeViews;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Empeloyee_Delete {

	private JFrame frame;
	private JTextField text_delete;
	private JTable table_Edelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyee_Delete window = new Empeloyee_Delete();
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
	public Empeloyee_Delete() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(0, 0, 1920, 1080);
		panel.add(desktopPane);
		
		JLabel lblIdForDelete = new JLabel("Id ");
		lblIdForDelete.setBounds(10, 85, 89, 14);
		desktopPane.add(lblIdForDelete);
		
		text_delete = new JTextField();
		text_delete.setColumns(10);
		text_delete.setBounds(69, 82, 89, 20);
		desktopPane.add(text_delete);
		
		JButton bottun_Create = new JButton("Delete");
		bottun_Create.setBounds(196, 252, 89, 23);
		desktopPane.add(bottun_Create);
		
		JButton button_Clear1 = new JButton("Clear");
		button_Clear1.setBounds(10, 252, 89, 23);
		desktopPane.add(button_Clear1);
		
		JLabel lblNewLabel = new JLabel("Delete");
		lblNewLabel.setBounds(10, 11, 275, 14);
		desktopPane.add(lblNewLabel);
		
		JPanel panel_ETdelete = new JPanel();
		panel_ETdelete.setLayout(null);
		panel_ETdelete.setBounds(624, 11, 915, 530);
		desktopPane.add(panel_ETdelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(903, 519, -890, -511);
		panel_ETdelete.add(scrollPane);
		
		table_Edelete = new JTable();
		scrollPane.setViewportView(table_Edelete);
		table_Edelete.setSurrendersFocusOnKeystroke(true);
		table_Edelete.setFillsViewportHeight(true);
		table_Edelete.setColumnSelectionAllowed(true);
		table_Edelete.setCellSelectionEnabled(true);
		table_Edelete.setBackground(Color.BLACK);
	}

}
