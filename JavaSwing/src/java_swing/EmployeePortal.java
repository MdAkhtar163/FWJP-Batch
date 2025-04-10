package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeePortal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeePortal frame = new EmployeePortal();
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
	public EmployeePortal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 128), null, new Color(128, 0, 128), null));
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 634, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Portal");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel.setAutoscrolls(true);
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 0, 205));
		lblNewLabel.setBounds(190, 9, 254, 46);
		panel.add(lblNewLabel);
		
		JButton lblEmployeePortal = new JButton("View Product Status");
		lblEmployeePortal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee_product ps = new Employee_product();
				ps.setVisible(true);
				setVisible(false);
			}
		});
		lblEmployeePortal.setForeground(new Color(255, 255, 255));
		lblEmployeePortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeePortal.setFont(new Font("Ebrima", Font.BOLD, 20));
		lblEmployeePortal.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblEmployeePortal.setBackground(new Color(0, 0, 128));
		lblEmployeePortal.setAutoscrolls(true);
		lblEmployeePortal.setBounds(213, 103, 231, 46);
		panel.add(lblEmployeePortal);
		
		JButton lblUpdateInventory = new JButton("Update Inventory");
		lblUpdateInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pid = JOptionPane.showInputDialog("Enter Product Id :- ");
				
				EmployeeData1 ed = new EmployeeData1();
				
				boolean flag=false;
				for(int r=0;r<ed.products.length;r++)
				{
					if(ed.products[r][0].equals(pid))
					{
						UpdateProductDetails upd=new UpdateProductDetails(pid,r);
						flag=true;
						break;
					}
				}
				if(flag)
					JOptionPane.showMessageDialog(getParent(), "Invalid Product Id!!!");
			}
		});
		lblUpdateInventory.setForeground(new Color(255, 255, 255));
		lblUpdateInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateInventory.setFont(new Font("Ebrima", Font.BOLD, 20));
		lblUpdateInventory.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblUpdateInventory.setBackground(new Color(0, 0, 128));
		lblUpdateInventory.setAutoscrolls(true);
		lblUpdateInventory.setBounds(228, 160, 196, 46);
		panel.add(lblUpdateInventory);
		
		JButton lblNewLabel_1_1 = new JButton("Delete Product from Inventory");
		lblNewLabel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 128), null));
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Ebrima", Font.BOLD, 20));
		lblNewLabel_1_1.setBackground(new Color(0, 0, 128));
		lblNewLabel_1_1.setAutoscrolls(true);
		lblNewLabel_1_1.setBounds(148, 217, 343, 46);
		panel.add(lblNewLabel_1_1);
		
		JButton lblNewLabel_2_1 = new JButton("Add New Products");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Ebrima", Font.BOLD, 20));
		lblNewLabel_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_2_1.setBackground(new Color(0, 0, 128));
		lblNewLabel_2_1.setAutoscrolls(true);
		lblNewLabel_2_1.setBounds(228, 274, 196, 46);
		panel.add(lblNewLabel_2_1);
		
		JButton lblNewLabel_1_2 = new JButton("Filter By Price");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Ebrima", Font.BOLD, 20));
		lblNewLabel_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_2.setBackground(new Color(0, 0, 128));
		lblNewLabel_1_2.setAutoscrolls(true);
		lblNewLabel_1_2.setBounds(228, 331, 196, 46);
		panel.add(lblNewLabel_1_2);
		
		JButton lblNewLabel_2_2 = new JButton("Product Below Minimum Quantity");
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Ebrima", Font.BOLD, 20));
		lblNewLabel_2_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_2_2.setBackground(new Color(0, 0, 128));
		lblNewLabel_2_2.setAutoscrolls(true);
		lblNewLabel_2_2.setBounds(148, 388, 343, 46);
		panel.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\akhta\\OneDrive\\Desktop\\Log-out1.png"));
		btnNewButton.setBounds(510, 11, 110, 60);
		panel.add(btnNewButton);
	}
}
