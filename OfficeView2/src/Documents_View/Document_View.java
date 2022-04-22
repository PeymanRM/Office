package Documents_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Document_View {

	private JFrame frame;
	private JTextField textField;
	private JTable table_Document_View;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Document_View window = new Document_View();
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
	public Document_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 0, 102));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("     VIEW");
		lblNewLabel_9.setBounds(956, 29, 1904, 139);
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("DOCUMENTS");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(534, 0, 703, 197);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(240, 260, 392, 299);
		frame.getContentPane().add(panel);
		
		JLabel Search = new JLabel("Search Id");
		Search.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Search.setBounds(39, 78, 79, 23);
		panel.add(Search);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(30, 112, 220, 29);
		panel.add(textField);
		
		JButton button_Select = new JButton("Select");
		button_Select.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_Select.setBounds(293, 245, 89, 39);
		panel.add(button_Select);
		
		JButton button_Clear4 = new JButton("Clear");
		button_Clear4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_Clear4.setBounds(10, 245, 89, 39);
		panel.add(button_Clear4);
		
		JButton button_Edit = new JButton("Edit");
		button_Edit.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		button_Edit.setBackground(Color.WHITE);
		button_Edit.setBounds(149, 848, 170, 109);
		frame.getContentPane().add(button_Edit);
		
		JButton button_Vhome = new JButton("Home");
		button_Vhome.setBounds(870, 933, 125, 66);
		frame.getContentPane().add(button_Vhome);
		
		JButton button_Delete = new JButton("Delete");
		button_Delete.setForeground(new Color(0, 51, 102));
		button_Delete.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		button_Delete.setBackground(SystemColor.menu);
		button_Delete.setBounds(1461, 848, 170, 109);
		frame.getContentPane().add(button_Delete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(679, 186, 817, 619);
		frame.getContentPane().add(scrollPane);
		
		table_Document_View = new JTable();
		scrollPane.setViewportView(table_Document_View);
		frame.setBounds(100, 100, 1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
