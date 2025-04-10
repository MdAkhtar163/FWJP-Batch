package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class EmployeeLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeLogin frame = new EmployeeLogin();
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
	public EmployeeLogin() {
		setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		setBackground(Color.GREEN);
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\CORE JAVA\\Core_Java_Pattern\\JavaSwing\\src\\java_swing\\Bg.png"));
		setTitle("Employee Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.CYAN, Color.CYAN, Color.BLUE));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\CORE JAVA\\Core_Java_Pattern\\JavaSwing\\src\\java_swing\\Emp.png"));
		lblNewLabel.setBounds(184, 11, 150, 152);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter User Id");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(102, 174, 120, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(102, 232, 120, 47);
		contentPane.add(lblNewLabel_1_1);
		
		JTextField userid = new JTextField("");
		userid.setHorizontalAlignment(SwingConstants.CENTER);
		userid.setFont(new Font("Tahoma", Font.BOLD, 14));
		userid.setBounds(287, 174, 120, 47);
		contentPane.add(userid);
		
		JPasswordField pass = new JPasswordField("");
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setFont(new Font("Tahoma", Font.BOLD, 14));
		pass.setBounds(287, 232, 120, 47);
		contentPane.add(pass);
		
		JButton reset = new JButton("Reset");
		reset.setBackground(Color.RED);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				userid.setText("");
				pass.setText("");
			}
		});
		reset.setHorizontalAlignment(SwingConstants.CENTER);
		reset.setFont(new Font("Tahoma", Font.BOLD, 14));
		reset.setBounds(337, 304, 120, 47);
		contentPane.add(reset);
		
		JButton login = new JButton("Login");
		login.setBackground(Color.GREEN);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String uid = userid.getText();
				String passwd = new String(pass.getPassword());
				
				EmployeeData ed=new EmployeeData();
				
				boolean status=false;
				for(int i=0;i<ed.userid.length;i++)
				{
					if(uid.equalsIgnoreCase(ed.userid[i]) && passwd.equals(ed.passwords[i]))
					{
						//JOptionPane.showMessageDialog(getParent(), "Login Successful");
						//status=true;
						//break;
						EmployeePortal ep = new EmployeePortal();
						ep.setVisible(true);
						setVisible(false);
						break;
					}
					if(!status)
					{
						JOptionPane.showMessageDialog(getParent(), "User Id and Password Incorrect!!!");
					}
				}
			}
		});
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setFont(new Font("Tahoma", Font.BOLD, 14));
		login.setBounds(75, 304, 120, 47);
		contentPane.add(login);
	}
}
