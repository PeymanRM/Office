package EmpeloyeeView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Empeloyee_Delete {

	private JFrame frame;
	private JTextField text_Delete;

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
		
		JDesktopPane Empeloyee_Delete = new JDesktopPane();
		Empeloyee_Delete.setBackground(Color.LIGHT_GRAY);
		Empeloyee_Delete.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(Empeloyee_Delete);
		
		JLabel lblNewLabel = new JLabel("Delete");
		lblNewLabel.setBounds(10, 11, 46, 14);
		Empeloyee_Delete.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(10, 52, 46, 14);
		Empeloyee_Delete.add(lblNewLabel_1);
		
		text_Delete = new JTextField();
		text_Delete.setBounds(112, 49, 86, 20);
		Empeloyee_Delete.add(text_Delete);
		text_Delete.setColumns(10);
		
		JButton button_Delete = new JButton("Delete");
		button_Delete.setBounds(195, 168, 89, 23);
		Empeloyee_Delete.add(button_Delete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(10, 168, 89, 23);
		Empeloyee_Delete.add(btnClear);
	}
}
