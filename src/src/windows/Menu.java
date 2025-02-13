package windows;
import java.util.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.DebugGraphics;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.border.EtchedBorder;

public class Menu {

	private JFrame frame;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(50, 50, 1189, 741);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Takuzu = new JLabel("Takuzu");
		Takuzu.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		Takuzu.setHorizontalAlignment(SwingConstants.CENTER);
		Takuzu.setBounds(10, 0, 1157, 175);
		frame.getContentPane().add(Takuzu);
		
		JButton jouer = new JButton("Jouer");
		jouer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jouer.setBounds(373, 425, 444, 54);
		frame.getContentPane().add(jouer);
		
		JButton btnNewButton_1 = new JButton("Règles");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(373, 512, 444, 54);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton Quitter = new JButton("Quitter");
		Quitter.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Quitter.setBounds(373, 602, 444, 54);
		frame.getContentPane().add(Quitter);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Règles r = new Règles();
				r.main(null);
				frame.dispose();
			}
		});
		
		jouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Selection r = new Selection();
				r.main(null);
				frame.dispose();
			}
		});
		
		Quitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		

	}
}
