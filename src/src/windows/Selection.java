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

public class Selection {

	private JFrame frame;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selection window = new Selection();
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
	public Selection() {
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
		
		JButton jouer = new JButton("Grille 6x6");
		jouer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jouer.setBounds(57, 377, 444, 125);
		frame.getContentPane().add(jouer);
		
		JButton btnNewButton_1 = new JButton("Grille 8x8");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(679, 372, 444, 134);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton jouer_1 = new JButton("Retour");
		jouer_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		jouer_1.setBounds(476, 603, 238, 45);
		frame.getContentPane().add(jouer_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jeu r = new Jeu();
				r.main(null);
				frame.dispose();
			}
		});
		
		jouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jeu6 r = new Jeu6();
				r.main(null);
				frame.dispose();
			}
		});
		
		jouer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu r = new Menu();
				r.main(null);
				frame.dispose();
			}
		});
		
		

	}
}
