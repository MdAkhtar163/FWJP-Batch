package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JRadioButton;
import java.awt.Choice;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	private JPasswordField textField_2;
	private JTextArea textField_4;
	private JTextField textField_6;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Reg.jpg"));
		setOpacity(5.0f);
		setBackground(new Color(0, 0, 255));
		setTitle("New Account Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 255, 0), new Color(135, 206, 250)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Account Register");
		lblNewLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(109, 11, 165, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :-");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(23, 94, 134, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email Address :-");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(23, 133, 165, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Create Password :-");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(23, 172, 201, 28);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Confirm Password :-");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(23, 206, 226, 28);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gender :-");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(23, 238, 121, 28);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Address :-");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(23, 270, 121, 28);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_7 = new JLabel("State :- ");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_7.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblNewLabel_1_7.setBounds(23, 300, 121, 28);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Country :-");
		lblNewLabel_1_4_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblNewLabel_1_4_2.setBounds(23, 326, 121, 28);
		contentPane.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("Phone no :-");
		lblNewLabel_1_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_5_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		lblNewLabel_1_5_2.setBounds(23, 358, 137, 28);
		contentPane.add(lblNewLabel_1_5_2);
		
		JTextField lblNewLabel_2 = new JTextField("");
		lblNewLabel_2.setBounds(272, 98, 134, 28);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField("");
		textField.setBounds(272, 137, 134, 28);
		contentPane.add(textField);
		
		textField_1 = new JPasswordField("");
		textField_1.setBounds(272, 172, 134, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JPasswordField("");
		textField_2.setBounds(272, 211, 134, 28);
		contentPane.add(textField_2);
		
		textField_4 = new JTextArea("");
		textField_4.setBounds(272, 276, 134, 28);
		contentPane.add(textField_4);
		
		textField_6 = new JTextField("");
		textField_6.setBounds(272, 362, 134, 28);
		contentPane.add(textField_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(272, 245, 59, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 14));
		rdbtnFemale.setBounds(333, 245, 73, 23);
		contentPane.add(rdbtnFemale);
		
		Choice choice = new Choice();
		choice.setBounds(272, 308, 134, 28);
		contentPane.add(choice);
		
		textField_3 = new JTextField("");
		textField_3.setBounds(272, 334, 134, 28);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		buttonGroup.add(btnNewButton);
		btnNewButton.setBounds(33, 404, 134, 28);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(259, 401, 134, 28);
		contentPane.add(btnClear);
	}
}
