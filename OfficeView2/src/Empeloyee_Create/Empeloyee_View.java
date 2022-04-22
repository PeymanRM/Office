package Empeloyee_Create;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class Empeloyee_View {

	private JFrame frame;
	private JTextField text_Search_Id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empeloyee_View window = new Empeloyee_View();
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
	public Empeloyee_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(220, 220, 220));
		frame.getContentPane().setBackground(new Color(51, 0, 102));
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_Edit = new JButton("Edit");
		button_Edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_Edit.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		button_Edit.setBackground(Color.WHITE);
		button_Edit.setBounds(149, 848, 170, 109);
		frame.getContentPane().add(button_Edit);
		
		JLabel lblNewLabel_9 = new JLabel("     VIEW");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9.setBounds(978, 0, 513, 197);
		frame.getContentPane().add(lblNewLabel_9);
		
		JButton button_Delete = new JButton("Delete");
		button_Delete.setForeground(new Color(0, 51, 102));
		button_Delete.setBackground(new Color(240, 240, 240));
		button_Delete.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		button_Delete.setBounds(1416, 848, 170, 109);
		frame.getContentPane().add(button_Delete);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(240, 260, 404, 259);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Search = new JLabel("Search Id");
		Search.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Search.setForeground(new Color(0, 0, 0));
		Search.setBackground(SystemColor.textHighlightText);
		Search.setBounds(30, 36, 89, 28);
		panel.add(Search);
		
		text_Search_Id = new JTextField();
		text_Search_Id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Search_Id.setBounds(30, 75, 220, 29);
		panel.add(text_Search_Id);
		text_Search_Id.setColumns(10);
		
		JButton button_Select = new JButton("Select");
		button_Select.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_Select.setBounds(305, 203, 89, 39);
		panel.add(button_Select);
		
		JButton button_Clear = new JButton("Clear");
		button_Clear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_Clear.setBounds(30, 203, 89, 39);
		panel.add(button_Clear);
		
		JButton button_Vhome = new JButton("Home");
		button_Vhome.setBounds(870, 936, 125, 66);
		frame.getContentPane().add(button_Vhome);
		
		JLabel lblNewLabel_9_1 = new JLabel("EMPELOYEES");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Segoe Print", Font.BOLD, 78));
		lblNewLabel_9_1.setBounds(527, 0, 703, 197);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(679, 186, 817, 619);
		frame.getContentPane().add(scrollPane);
	}
}
