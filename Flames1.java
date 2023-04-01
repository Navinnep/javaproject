package mini;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Flames1 extends JFrame {

	private static JPanel contentPane;
	private static JTextField crushin;
	private static JTextField namein;
	private  static JTextField result;
	
	static String res;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flames1 frame = new Flames1();
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
	public Flames1() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 438);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		//crushname input
		crushin = new JTextField();
		crushin.setToolTipText("");
		crushin.setBackground(new Color(255, 255, 0));
		crushin.setBounds(150, 154, 368, 39);
		crushin.setText("\t");
		crushin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		crushin.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(crushin);
		crushin.setColumns(10);
		// name input
		
		namein = new JTextField();
		namein.setBackground(new Color(255, 255, 0));
		namein.setBounds(150, 76, 368, 39);
		namein.setText("\t");
		namein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		namein.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(namein);
		namein.setColumns(10);
		
		JButton checkbtn = new JButton("CHECK");
		checkbtn.setBackground(new Color(255, 255, 255));
		checkbtn.setBounds(67, 236, 162, 39);
		checkbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//check
				String word1=namein.getText();
				String word2=crushin.getText();
				
					
				
				StringBuilder sb1 = new StringBuilder(word1.toLowerCase());
			    StringBuilder sb2 = new StringBuilder(word2.toLowerCase());
			    
			    for (int i = 0; i < sb1.length(); i++) {
			        for (int j = 0; j < sb2.length(); j++) {
			            if (sb1.charAt(i) == sb2.charAt(j)) {
			                sb1.deleteCharAt(i);
			                sb2.deleteCharAt(j);
			                i--;
			                break;
			            }
			        }
			    }
			    int count = sb1.length() + sb2.length();
			    String flames="flames";
			     while (flames.length() > 1) 
			        {
			            int index = count % flames.length();
			           
			            String first = flames.substring(0, index);
			          
			            String second = flames.substring(index+1 );
			     
			            flames = first + second;
			       
			        }
			         res = "";
			        switch (flames.charAt(0)) 
			        {
			            case 'f':
			                res = "Friends";
			                break;
			            case 'l':
			                res = "Lovers";
			                break;
			            case 'a':
			                res = "Affection";
			                break;
			            case 'm':
			                res = "Marriage";
			                break;
			            case 'e':
			                res = "Enemies";
			                break;
			            case 's':
			                res = "Siblings";
			                break;
			        }
			        result.setText(res); 
				
				
					
				}
			        
			        
			
			
		});
		checkbtn.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		contentPane.add(checkbtn);
		
		JLabel flames = new JLabel("      FLAMES");
		flames.setBounds(188, 10, 175, 31);
		flames.setFont(new Font("Arial", Font.BOLD, 24));
		contentPane.add(flames);
		
		JLabel name = new JLabel("  YOUR NAME");
		name.setBounds(10, 69, 144, 53);
		name.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(name);
		
		JLabel crushname = new JLabel("     CRUSH NAME\r\n");
		crushname.setBounds(0, 149, 144, 49);
		crushname.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(crushname);
		
		result = new JTextField();
		result.setBounds(70, 326, 413, 65);
		result.setText("\t");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				//flames
				
			}
		});
		result.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(result);
		result.setColumns(10);
		
		JButton resetbtn = new JButton("RESET");
		resetbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				// RESET 
				result.setText(""); 
				namein.setText("");
		        crushin.setText("");
				
			}
		});
		resetbtn.setFont(new Font("Arial", Font.BOLD, 14));
		resetbtn.setBackground(new Color(255, 255, 255));
		resetbtn.setBounds(332, 238, 151, 37);
		contentPane.add(resetbtn);
	}
}
