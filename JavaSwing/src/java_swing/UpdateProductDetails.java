package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;

public class UpdateProductDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField qty1;
	private JTextField sp1;
	private JTextField mqty1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateProductDetails frame = new UpdateProductDetails("101",1);
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
	public UpdateProductDetails(String pid, int row) {
		setBackground(new Color(128, 128, 128));
		setForeground(UIManager.getColor("TextField.selectionBackground"));
		setOpacity(10.0f);
		setTitle("Update Product Details");
		setFont(new Font("Bodoni MT", Font.PLAIN, 18));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Product Details");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(65, 105, 225), new Color(0, 255, 127)));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setBounds(190, 23, 265, 56);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, UIManager.getColor("TextArea.selectionBackground"), UIManager.getColor("TextArea.selectionBackground"), UIManager.getColor("TextArea.foreground"), UIManager.getColor("TextField.background")));
		panel.setBackground(new Color(253, 245, 230));
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.setBounds(10, 90, 564, 410);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Product Id");
		lblNewLabel_1.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(46, 72, 142, 36);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField(pid);
		textField.setFont(new Font("Castellar", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(0, 255, 255));
		textField.setEditable(false);
		textField.setBounds(336, 71, 183, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Product Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(46, 119, 142, 36);
		panel.add(lblNewLabel_1_1);
		
		EmployeeData1 ed = new EmployeeData1();
		
		textField_1 = new JTextField(""+ed.products[row][1]);
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Castellar", Font.BOLD, 18));
		textField_1.setBackground(new Color(0, 255, 255));
		textField_1.setColumns(10);
		textField_1.setBounds(336, 118, 183, 36);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Quantity");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(46, 166, 142, 36);
		panel.add(lblNewLabel_1_1_1);
		
		qty1 = new JTextField(""+ed.products[row][2]);
		qty1.setToolTipText("Exiting Quantity");
		qty1.setHorizontalAlignment(SwingConstants.CENTER);
		qty1.setFont(new Font("Castellar", Font.BOLD, 18));
		qty1.setColumns(10);
		qty1.setBackground(Color.CYAN);
		qty1.setBounds(336, 165, 87, 36);
		panel.add(qty1);
		
		JSpinner qty2 = new JSpinner();
		qty2.setFont(new Font("Castellar", Font.BOLD, 11));
		qty2.setBounds(432, 165, 87, 36);
		panel.add(qty2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Sales Price");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(46, 214, 142, 36);
		panel.add(lblNewLabel_1_1_1_1);
		
		sp1 = new JTextField(""+ed.products[row][3]);
		sp1.setToolTipText("Exiting Sales Price");
		sp1.setHorizontalAlignment(SwingConstants.CENTER);
		sp1.setFont(new Font("Castellar", Font.BOLD, 18));
		sp1.setColumns(10);
		sp1.setBackground(Color.CYAN);
		sp1.setBounds(336, 213, 87, 36);
		panel.add(sp1);
		
		JSpinner sp2 = new JSpinner();
		sp2.setFont(new Font("Castellar", Font.BOLD, 11));
		sp2.setBounds(432, 213, 87, 36);
		panel.add(sp2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Minimum Quantity");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblNewLabel_1_1_1_2.setBounds(33, 264, 183, 36);
		panel.add(lblNewLabel_1_1_1_2);
		
		mqty1 = new JTextField(""+ed.products[row][4]);
		mqty1.setToolTipText("Exiting Quantity");
		mqty1.setHorizontalAlignment(SwingConstants.CENTER);
		mqty1.setFont(new Font("Castellar", Font.BOLD, 18));
		mqty1.setColumns(10);
		mqty1.setBackground(Color.CYAN);
		mqty1.setBounds(336, 261, 87, 36);
		panel.add(mqty1);
		
		JSpinner mqty2 = new JSpinner();
		mqty2.setFont(new Font("Castellar", Font.BOLD, 11));
		mqty2.setBounds(432, 261, 87, 36);
		panel.add(mqty2);
		
		JButton btnNewButton_1 = new JButton("Update Product");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer uqty2 = (Integer) qty2.getValue();
				System.out.println("Quentity : "+uqty2);
				
				int uqty1 = Integer.parseInt(qty1.getText());
				
				Integer usp2 = (Integer) sp2.getValue();
				System.out.println("Quentity : "+usp2);
				
				float usp1 = Float.parseFloat(sp1.getText());
				
				Integer umqty2 = (Integer) mqty2.getValue();
				System.out.println("Quentity : "+umqty2);
				
				int umqty1 = Integer.parseInt(mqty1.getText());
				System.out.println("Quentity : "+umqty1);
				
				if(uqty2 !=0) ed.products[row][2]=""+(uqty1+uqty2);
				if(usp2 !=0) ed.products[row][3]=""+usp2;
				if(umqty2 !=0) ed.products[row][4]=""+(umqty1+umqty2);
				
				JOptionPane.showMessageDialog(getParent(), "Product Updated Successfully!!");
			}
		});
		btnNewButton_1.setFont(new Font("Castellar", Font.BOLD, 14));
		btnNewButton_1.setBounds(79, 335, 183, 36);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Cancel");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("Castellar", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(295, 335, 183, 36);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeePortal ep = new EmployeePortal();
				ep.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\akhta\\OneDrive\\Desktop\\Untitled.png"));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 255, 255), new Color(0, 0, 128), new Color(128, 0, 0)));
		btnNewButton.setBounds(42, 23, 100, 60);
		contentPane.add(btnNewButton);
	}
}
