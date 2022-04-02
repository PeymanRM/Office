package Empeloyment_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Empeloyment_Delete {

	private JFrame Empeloyment_delete;
	private JTextField text_Empelo_Delete;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyment_Delete window = new Empeloyment_Delete();
					window.Empeloyment_delete.setVisible(true);
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
		Empeloyment_delete = new JFrame();
		Empeloyment_delete.getContentPane().setBackground(Color.LIGHT_GRAY);
		Empeloyment_delete.setBounds(100, 100, 1920, 1080);
		Empeloyment_delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Empeloyment_delete.getContentPane().setLayout(null);
		
		JDesktopPane Empeloyment_Delete = new JDesktopPane();
		Empeloyment_Delete.setBackground(Color.LIGHT_GRAY);
		Empeloyment_Delete.setBounds(0, 0, 1920, 1080);
		Empeloyment_delete.getContentPane().add(Empeloyment_Delete);
		
		JLabel lblNewLabel = new JLabel("Delete");
		lblNewLabel.setBounds(10, 11, 46, 14);
		Empeloyment_Delete.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(10, 52, 46, 14);
		Empeloyment_Delete.add(lblNewLabel_1);
		
		text_Empelo_Delete = new JTextField();
		text_Empelo_Delete.setColumns(10);
		text_Empelo_Delete.setBounds(112, 49, 86, 20);
		Empeloyment_Delete.add(text_Empelo_Delete);
		
		JButton button_Empelo_Delete = new JButton("Delete");
		button_Empelo_Delete.setBounds(195, 168, 89, 23);
		Empeloyment_Delete.add(button_Empelo_Delete);
		
		JButton button_Clear6 = new JButton("Clear");
		button_Clear6.setBounds(10, 168, 89, 23);
		Empeloyment_Delete.add(button_Clear6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(462, 11, 952, 560);
		Empeloyment_Delete.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(946, 11, -940, 549);
		panel.add(table);
	}
}
