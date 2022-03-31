package EmpeloymentViews;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Empeloyment_Delete {

	private JFrame frame;
	private JTextField text_Empeloymentdelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyment_Delete window = new Empeloyment_Delete();
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
	public Empeloyment_Delete() {
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
		
		JPanel panel_Empeloyment_delete = new JPanel();
		panel_Empeloyment_delete.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(panel_Empeloyment_delete);
		panel_Empeloyment_delete.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(0, 0, 1920, 1080);
		panel_Empeloyment_delete.add(desktopPane);
		
		JLabel lblIdForDelete = new JLabel("Id ");
		lblIdForDelete.setBounds(10, 85, 159, 14);
		desktopPane.add(lblIdForDelete);
		
		text_Empeloymentdelete = new JTextField();
		text_Empeloymentdelete.setColumns(10);
		text_Empeloymentdelete.setBounds(131, 82, 122, 20);
		desktopPane.add(text_Empeloymentdelete);
		
		JButton bottun_Empelomentdelete = new JButton("Delete");
		bottun_Empelomentdelete.setBounds(164, 252, 89, 23);
		desktopPane.add(bottun_Empelomentdelete);
		
		JButton button_Clear4 = new JButton("Clear");
		button_Clear4.setBounds(10, 252, 89, 23);
		desktopPane.add(button_Clear4);
		
		JLabel lblNewLabel = new JLabel("Delete");
		lblNewLabel.setBounds(10, 11, 275, 14);
		desktopPane.add(lblNewLabel);
	}

}
