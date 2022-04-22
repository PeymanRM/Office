package Department_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Department_View {

	private JFrame frame;
	private JTextField text_D_Search;
	private JTable table_Departman_View;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Department_View window = new Department_View();
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
	public Department_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 0, 102));
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_9_1 = new JLabel("DEPARTMENTS");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(483, 11, 691, 178);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9 = new JLabel("VIEW");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9.setBounds(1139, 11, 444, 178);
		frame.getContentPane().add(lblNewLabel_9);
		
		JButton button_D_Delete = new JButton("Delete");
		button_D_Delete.setForeground(new Color(0, 51, 102));
		button_D_Delete.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		button_D_Delete.setBackground(SystemColor.menu);
		button_D_Delete.setBounds(1461, 848, 170, 109);
		frame.getContentPane().add(button_D_Delete);
		
		JButton button_D_home = new JButton("Home");
		button_D_home.setBounds(870, 933, 125, 66);
		frame.getContentPane().add(button_D_home);
		
		JButton button_D_Edit = new JButton("Edit");
		button_D_Edit.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		button_D_Edit.setBackground(Color.WHITE);
		button_D_Edit.setBounds(149, 848, 170, 109);
		frame.getContentPane().add(button_D_Edit);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(204, 246, 382, 299);
		frame.getContentPane().add(panel);
		
		JLabel Search = new JLabel("Search Id");
		Search.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Search.setBounds(24, 48, 89, 26);
		panel.add(Search);
		
		text_D_Search = new JTextField();
		text_D_Search.setColumns(10);
		text_D_Search.setBounds(24, 85, 220, 29);
		panel.add(text_D_Search);
		
		JButton button_DV_Select = new JButton("Select");
		button_DV_Select.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_DV_Select.setBounds(283, 208, 89, 39);
		panel.add(button_DV_Select);
		
		JButton button_DV_Clear = new JButton("Clear");
		button_DV_Clear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_DV_Clear.setBounds(10, 208, 89, 39);
		panel.add(button_DV_Clear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(679, 186, 817, 619);
		frame.getContentPane().add(scrollPane);
		
		table_Departman_View = new JTable();
		scrollPane.setViewportView(table_Departman_View);
	}

}
