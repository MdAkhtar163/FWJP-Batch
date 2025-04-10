package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employee_product extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_product frame = new Employee_product();
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
	public Employee_product() {
		setTitle("Product Status");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\CORE JAVA\\Core_Java_Pattern\\JavaSwing\\src\\java_swing\\1667062096769.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 255, 255), 8, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(158, 10, 208, 56);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Product Status");
		lblNewLabel.setBackground(new Color(148, 0, 211));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 107, 514, 297);
		contentPane.add(scrollPane);
		
		String headings[] = {"Product Id","Product Name","Quantity","Total Sales"};
		EmployeeData1 ed = new EmployeeData1();
		String data[][] = new String [ed.products.length][4];
		
		for (int r=0;r<data.length;r++) 
		{
			int c=0;
			data[r][c] = ed.products[r][c++];
			data[r][c] = ed.products[r][c++];
			data[r][c] = ed.products[r][c++];
			
			int sum=0;
			for(int i=0;i<ed.sales[r].length;i++)
			{
				sum+=ed.sales[r][c];
			}
			data[r][c] = ""+sum;
		}
		for(int r=0;r<data.length;r++)
		{
			for(int c=0;c<data[r].length;c++)
				System.out.println(data[r][c]+"\t");
			System.out.println();
		}
		table = new JTable(data,headings);
		table.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		table.setGridColor(new Color(0, 255, 255));
		table.setFont(new Font("Times New Roman", Font.BOLD, 15));
		table.getTableHeader().setBackground(new Color(11,43,88));
		table.getTableHeader().setBackground(new Color(255,255,255));
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.setIntercellSpacing(new Dimension (6,6));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeePortal ep = new EmployeePortal();
				ep.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 255, 255), new Color(0, 0, 128), new Color(128, 0, 0)));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\akhta\\OneDrive\\Desktop\\Untitled.png"));
		btnNewButton.setBounds(10, 10, 100, 60);
		contentPane.add(btnNewButton);
	}
}
