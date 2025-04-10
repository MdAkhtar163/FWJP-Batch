package java_swing;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class RegistrationPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField email;
	private JTextField pass1;
	private JTextField pass2;
	private JTextField address;
	private JTextField country;
	private JTextField phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
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
	public RegistrationPage() {
		Data ob=new Data();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rajya\\OneDrive\\Desktop\\image\\bms\\images signup.jpeg"));
		lblNewLabel.setBounds(10, 88, 204, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Register YourSelf Here!! ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(224, 0, 452, 149);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(20, 103, 204, 47);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email I'd");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(20, 142, 204, 47);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Create Password");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(20, 186, 204, 47);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Confirm Password");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(10, 229, 204, 47);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(10, 274, 204, 47);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(10, 309, 204, 47);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("State");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setBounds(10, 414, 204, 38);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Country");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setBounds(10, 457, 204, 38);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Phone");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10.setBounds(10, 496, 204, 42);
		contentPane.add(lblNewLabel_10);
		
		name = new JTextField();
		name.setBounds(267, 103, 306, 31);
		contentPane.add(name);
		name.setColumns(10);
		
		email = new JTextField();
		email.setBounds(267, 145, 306, 31);
		contentPane.add(email);
		email.setColumns(10);
		
		pass1 = new JTextField();
		pass1.setBounds(267, 186, 307, 31);
		contentPane.add(pass1);
		pass1.setColumns(10);
		
		pass2 = new JTextField();
		pass2.setBounds(257, 237, 306, 31);
		contentPane.add(pass2);
		pass2.setColumns(10);
		
		JRadioButton rdbmale = new JRadioButton("Male");
		rdbmale.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbmale.setBounds(257, 282, 75, 31);
		contentPane.add(rdbmale);
		
		JRadioButton rdbfemale = new JRadioButton("Female");
		rdbfemale.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbfemale.setBounds(356, 282, 117, 31);
		contentPane.add(rdbfemale);
		
		address = new JTextField();
		address.setBounds(255, 321, 308, 30);
		contentPane.add(address);
		address.setColumns(10);
		
		JComboBox city1 = new JComboBox(ob.getCitiesList());
		city1.setEnabled(false);
		city1.setBounds(257, 373, 306, 31);
		contentPane.add(city1);
		
		JComboBox state1 = new JComboBox(ob.state);
		state1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
//				get state name
				String state= (String) state1.getSelectedItem();
				System.out.println("Selected State : "+state);
//				get city list
				String[] cityList = ob.getCityList(state);
				System.out.println("Length : "+cityList.length);
				city1.setModel(new DefaultComboBoxModel<>(cityList));
				city1.setEnabled(true);
			}
		});
		state1.setBounds(257, 421, 306, 31);
		contentPane.add(state1);
		
		country = new JTextField();
		country.setBounds(257, 457, 306, 31);
		contentPane.add(country);
		country.setColumns(10);
		
		phone = new JTextField();
		phone.setBounds(257, 496, 306, 31);
		contentPane.add(phone);
		phone.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(257, 549, 111, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				name.setText("");
				email.setText("");
				pass1.setText("");
				pass2.setText("");
//				rdbmale.;
//				rdbfemale.
				address.setText("");
//				state.?
				country.setText("");
				phone.setText("");
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(378, 548, 93, 49);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(483, 549, 93, 49);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_8_1 = new JLabel("City");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8_1.setBounds(10, 366, 204, 38);
		contentPane.add(lblNewLabel_8_1);
		
		
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}