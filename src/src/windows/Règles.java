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
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class Règles {

	private JFrame frame;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Règles window = new Règles();
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
	public Règles() {
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
		
		JButton retour = new JButton("Retour");
		retour.setFont(new Font("Tahoma", Font.PLAIN, 30));
		retour.setBounds(372, 554, 444, 54);
		frame.getContentPane().add(retour);
		
		JTextPane txtpnLeButDu = new JTextPane();
		txtpnLeButDu.setEditable(false);
		txtpnLeButDu.setBackground(UIManager.getColor("Button.background"));
		txtpnLeButDu.setFont(new Font("Tahoma", Font.PLAIN, 31));
		txtpnLeButDu.setText("Le but du jeu est simple : compléter la grille avec les croix et les ronds\r\n\r\n\r\nRègles du jeu : \r\n\t1- Il ne peut y avoir plus de deux caractères identiques côtes à côtes\r\n\t2- Il ne peut y avoir deux lignes identiques ou deux colonnes identiques\r\n\t3- Sur une ligne ou une colonne, il y a autant de X que de O");
		txtpnLeButDu.setBounds(55, 186, 1067, 281);
		frame.getContentPane().add(txtpnLeButDu);
		
		retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.main(null);
				frame.dispose();
			}
		});

	}
}
