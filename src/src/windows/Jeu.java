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

public class Jeu {

	private JFrame frame;
	private JTable table;
	public static final String UN = "  1";
	public static final String ZERO = "  0";
	public static final String VIDE = "";
	public static final int T = 8;
	private Pile moves = new Pile();
	private PileInt row = new PileInt();
	private PileInt col = new PileInt();
	
	private static JRadioButton B11 = new JRadioButton("");
	private static JRadioButton B12 = new JRadioButton("");
	private static JRadioButton B13 = new JRadioButton("");
	private static JRadioButton B14 = new JRadioButton("");
	private static JRadioButton B15 = new JRadioButton("");
	private static JRadioButton B16 = new JRadioButton("");
	private static JRadioButton B17 = new JRadioButton("");
	private static JRadioButton B18 = new JRadioButton("");
	
	private static JRadioButton B21 = new JRadioButton("");
	private static JRadioButton B22 = new JRadioButton("");
	private static JRadioButton B23 = new JRadioButton("");
	private static JRadioButton B24 = new JRadioButton("");
	private static JRadioButton B25 = new JRadioButton("");
	private static JRadioButton B26 = new JRadioButton("");
	private static JRadioButton B27 = new JRadioButton("");
	private static JRadioButton B28 = new JRadioButton("");

	private static JRadioButton B31 = new JRadioButton("");
	private static JRadioButton B32 = new JRadioButton("");
	private static JRadioButton B33 = new JRadioButton("");
	private static JRadioButton B34 = new JRadioButton("");
	private static JRadioButton B35 = new JRadioButton("");
	private static JRadioButton B36 = new JRadioButton("");
	private static JRadioButton B37 = new JRadioButton("");
	private static JRadioButton B38 = new JRadioButton("");
	
	private static JRadioButton B41 = new JRadioButton("");
	private static JRadioButton B42 = new JRadioButton("");
	private static JRadioButton B43 = new JRadioButton("");
	private static JRadioButton B44 = new JRadioButton("");
	private static JRadioButton B45 = new JRadioButton("");
	private static JRadioButton B46 = new JRadioButton("");
	private static JRadioButton B47 = new JRadioButton("");
	private static JRadioButton B48 = new JRadioButton("");
	
	private static JRadioButton B51 = new JRadioButton("");
	private static JRadioButton B52 = new JRadioButton("");
	private static JRadioButton B53 = new JRadioButton("");
	private static JRadioButton B54 = new JRadioButton("");
	private static JRadioButton B55 = new JRadioButton("");
	private static JRadioButton B56 = new JRadioButton("");
	private static JRadioButton B57 = new JRadioButton("");
	private static JRadioButton B58 = new JRadioButton("");
	
	private static JRadioButton B61 = new JRadioButton("");
	private static JRadioButton B62 = new JRadioButton("");
	private static JRadioButton B63 = new JRadioButton("");
	private static JRadioButton B64 = new JRadioButton("");
	private static JRadioButton B65 = new JRadioButton("");
	private static JRadioButton B66 = new JRadioButton("");
	private static JRadioButton B67 = new JRadioButton("");
	private static JRadioButton B68 = new JRadioButton("");
	
	private static JRadioButton B71 = new JRadioButton("");
	private static JRadioButton B72 = new JRadioButton("");
	private static JRadioButton B73 = new JRadioButton("");
	private static JRadioButton B74 = new JRadioButton("");
	private static JRadioButton B75 = new JRadioButton("");
	private static JRadioButton B76 = new JRadioButton("");
	private static JRadioButton B77 = new JRadioButton("");
	private static JRadioButton B78 = new JRadioButton("");
	
	private static JRadioButton B81 = new JRadioButton("");
	private static JRadioButton B82 = new JRadioButton("");
	private static JRadioButton B83 = new JRadioButton("");
	private static JRadioButton B84 = new JRadioButton("");
	private static JRadioButton B85 = new JRadioButton("");
	private static JRadioButton B86 = new JRadioButton("");
	private static JRadioButton B87 = new JRadioButton("");
	private static JRadioButton B88 = new JRadioButton("");
	private final JTextField txtPartieGagne = new JTextField();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jeu window = new Jeu();
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
	public Jeu() {
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
		JLabel lblNewLabel = new JLabel("Partie Gagnée");
		lblNewLabel.setVisible(false);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 99));
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(224, 226, 671, 217);
		frame.getContentPane().add(lblNewLabel);
		table = new JTable();
		table.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		table.setEnabled(false);
		table.setFont(new Font("Tahoma", Font.BOLD, 60));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBounds(10, 11, 1155, 600);
		table.setRowHeight(75);
		
		JButton help = new JButton("Help");
		help.setEnabled(false);
		help.setFont(new Font("Tahoma", Font.PLAIN, 20));
		help.setBounds(308, 618, 268, 33);
		frame.getContentPane().add(help);
		
		
		
		JTable tComp = new JTable();
		tComp.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
				},
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
		
		JTable tReset = new JTable();
		tReset.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
				},
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
			B11.setVerticalAlignment(SwingConstants.TOP);
		
			B11.setVisible(false);
			B12.setVerticalAlignment(SwingConstants.TOP);
		
			B12.setVisible(false);
			B13.setVerticalAlignment(SwingConstants.TOP);
		
			B13.setVisible(false);
			B14.setVerticalAlignment(SwingConstants.TOP);
		
			B14.setVisible(false);
			B15.setVerticalAlignment(SwingConstants.TOP);
		
			B15.setVisible(false);
			B16.setVerticalAlignment(SwingConstants.TOP);
		
			B16.setVisible(false);
			B17.setVerticalAlignment(SwingConstants.TOP);
		
			B17.setVisible(false);
			B18.setVerticalAlignment(SwingConstants.TOP);
		
			B18.setVisible(false);
			B21.setVerticalAlignment(SwingConstants.TOP);
		
		
			B21.setVisible(false);
			B22.setVerticalAlignment(SwingConstants.TOP);
		
			B22.setVisible(false);
			B23.setVerticalAlignment(SwingConstants.TOP);
		
			B23.setVisible(false);
			B24.setVerticalAlignment(SwingConstants.TOP);
		
			B24.setVisible(false);
			B25.setVerticalAlignment(SwingConstants.TOP);
		
			B25.setVisible(false);
			B26.setVerticalAlignment(SwingConstants.TOP);
		
			B26.setVisible(false);
			B27.setVerticalAlignment(SwingConstants.TOP);
		
			B27.setVisible(false);
			B28.setVerticalAlignment(SwingConstants.TOP);
		
			B28.setVisible(false);
			B31.setVerticalAlignment(SwingConstants.TOP);
		
		
			B31.setVisible(false);
			B32.setVerticalAlignment(SwingConstants.TOP);
		
			B32.setVisible(false);
			B33.setVerticalAlignment(SwingConstants.TOP);
		
			B33.setVisible(false);
			B34.setVerticalAlignment(SwingConstants.TOP);
		
			B34.setVisible(false);
			B35.setVerticalAlignment(SwingConstants.TOP);
		
			B35.setVisible(false);
			B36.setVerticalAlignment(SwingConstants.TOP);
		
			B36.setVisible(false);
			B37.setVerticalAlignment(SwingConstants.TOP);
		
			B37.setVisible(false);
			B38.setVerticalAlignment(SwingConstants.TOP);
		
			B38.setVisible(false);
			B41.setVerticalAlignment(SwingConstants.TOP);
		
		
			B41.setVisible(false);
			B42.setVerticalAlignment(SwingConstants.TOP);
		
			B42.setVisible(false);
			B43.setVerticalAlignment(SwingConstants.TOP);
		
			B43.setVisible(false);
			B44.setVerticalAlignment(SwingConstants.TOP);
		
			B44.setVisible(false);
			B45.setVerticalAlignment(SwingConstants.TOP);
		
			B45.setVisible(false);
			B46.setVerticalAlignment(SwingConstants.TOP);
		
			B46.setVisible(false);
			B47.setVerticalAlignment(SwingConstants.TOP);
		
			B47.setVisible(false);
			B48.setVerticalAlignment(SwingConstants.TOP);
		
			B48.setVisible(false);
			B51.setVerticalAlignment(SwingConstants.TOP);
		
		
			B51.setVisible(false);
			B52.setVerticalAlignment(SwingConstants.TOP);
		
			B52.setVisible(false);
			B53.setVerticalAlignment(SwingConstants.TOP);
		
			B53.setVisible(false);
			B54.setVerticalAlignment(SwingConstants.TOP);
		
			B54.setVisible(false);
			B55.setVerticalAlignment(SwingConstants.TOP);
		
			B55.setVisible(false);
			B56.setVerticalAlignment(SwingConstants.TOP);
		
			B56.setVisible(false);
			B57.setVerticalAlignment(SwingConstants.TOP);
		
			B57.setVisible(false);
			B58.setVerticalAlignment(SwingConstants.TOP);
		
			B58.setVisible(false);
			B61.setVerticalAlignment(SwingConstants.TOP);
		
		
			B61.setVisible(false);
			B62.setVerticalAlignment(SwingConstants.TOP);
		
			B62.setVisible(false);
			B63.setVerticalAlignment(SwingConstants.TOP);
		
			B63.setVisible(false);
			B64.setVerticalAlignment(SwingConstants.TOP);
		
			B64.setVisible(false);
			B65.setVerticalAlignment(SwingConstants.TOP);
		
			B65.setVisible(false);
			B66.setVerticalAlignment(SwingConstants.TOP);
		
			B66.setVisible(false);
			B67.setVerticalAlignment(SwingConstants.TOP);
		
			B67.setVisible(false);
			B68.setVerticalAlignment(SwingConstants.TOP);
		
			B68.setVisible(false);
			B71.setVerticalAlignment(SwingConstants.TOP);
		
		
			B71.setVisible(false);
			B72.setVerticalAlignment(SwingConstants.TOP);
		
			B72.setVisible(false);
			B73.setVerticalAlignment(SwingConstants.TOP);
		
			B73.setVisible(false);
			B74.setVerticalAlignment(SwingConstants.TOP);
		
			B74.setVisible(false);
			B75.setVerticalAlignment(SwingConstants.TOP);
		
			B75.setVisible(false);
			B76.setVerticalAlignment(SwingConstants.TOP);
		
			B76.setVisible(false);
			B77.setVerticalAlignment(SwingConstants.TOP);
		
			B77.setVisible(false);
			B78.setVerticalAlignment(SwingConstants.TOP);
		
			B78.setVisible(false);
			B81.setVerticalAlignment(SwingConstants.TOP);
		
		
			B81.setVisible(false);
			B82.setVerticalAlignment(SwingConstants.TOP);
		
			B82.setVisible(false);
			B83.setVerticalAlignment(SwingConstants.TOP);
		
			B83.setVisible(false);
			B84.setVerticalAlignment(SwingConstants.TOP);
		
			B84.setVisible(false);
			B85.setVerticalAlignment(SwingConstants.TOP);
		
			B85.setVisible(false);
			B86.setVerticalAlignment(SwingConstants.TOP);
		
			B86.setVisible(false);
			B87.setVerticalAlignment(SwingConstants.TOP);
		
			B87.setVisible(false);
			B88.setVerticalAlignment(SwingConstants.TOP);
		
			B88.setVisible(false);
		
		
		
		
		
		Compteur cmpt = new Compteur();
		Takuzu grille = new Takuzu(tComp);
		Takuzu gAff = new Takuzu(table);
		
		
		
		JButton annuler = new JButton("Annuler");
		annuler.setFont(new Font("Tahoma", Font.PLAIN, 20));
		annuler.setEnabled(false);
		annuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!moves.isEmpty()) {
					table.setValueAt(moves.getLast(), row.getLast(), col.getLast());
					moves.popLast();
					row.popLast();
					col.popLast();
				}
			}
		});
		annuler.setBounds(10, 618, 279, 34);
		frame.getContentPane().add(annuler);
		
		JButton reset = new JButton("Reset");
		reset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		reset.setEnabled(false);
		reset.setBounds(10, 663, 569, 33);
		frame.getContentPane().add(reset);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				moves.resetPile();
				row.resetPile();
				col.resetPile();
				cmpt.reset();
				if (B11.isVisible()) {
					gAff.setValueString(0,0,VIDE);
				}
				if (B12.isVisible()) {
					gAff.setValueString(0,1,VIDE);
				}
				if (B13.isVisible()) {
					gAff.setValueString(0,2,VIDE);
				}
				if (B14.isVisible()) {
					gAff.setValueString(0,3,VIDE);
				}
				if (B15.isVisible()) {
					gAff.setValueString(0,4,VIDE);
				}
				if (B16.isVisible()) {
					gAff.setValueString(0,5,VIDE);
				}
				if (B17.isVisible()) {
					gAff.setValueString(0,6,VIDE);
				}
				if (B18.isVisible()) {
					gAff.setValueString(0,7,VIDE);
				}
				
				if (B21.isVisible()) {
					gAff.setValueString(1,0,VIDE);
				}
				if (B22.isVisible()) {
					gAff.setValueString(1,1,VIDE);
				}
				if (B23.isVisible()) {
					gAff.setValueString(1,2,VIDE);
				}
				if (B24.isVisible()) {
					gAff.setValueString(1,3,VIDE);
				}
				if (B25.isVisible()) {
					gAff.setValueString(1,4,VIDE);
				}
				if (B26.isVisible()) {
					gAff.setValueString(1,5,VIDE);
				}
				if (B27.isVisible()) {
					gAff.setValueString(1,6,VIDE);
				}
				if (B28.isVisible()) {
					gAff.setValueString(1,7,VIDE);
				}
				
				if (B31.isVisible()) {
					gAff.setValueString(2,0,VIDE);
				}
				if (B32.isVisible()) {
					gAff.setValueString(2,1,VIDE);
				}
				if (B33.isVisible()) {
					gAff.setValueString(2,2,VIDE);
				}
				if (B34.isVisible()) {
					gAff.setValueString(2,3,VIDE);
				}
				if (B35.isVisible()) {
					gAff.setValueString(2,4,VIDE);
				}
				if (B36.isVisible()) {
					gAff.setValueString(2,5,VIDE);
				}
				if (B37.isVisible()) {
					gAff.setValueString(2,6,VIDE);
				}
				if (B38.isVisible()) {
					gAff.setValueString(2,7,VIDE);
				}
				
				if (B41.isVisible()) {
					gAff.setValueString(3,0,VIDE);
				}
				if (B42.isVisible()) {
					gAff.setValueString(3,1,VIDE);
				}
				if (B43.isVisible()) {
					gAff.setValueString(3,2,VIDE);
				}
				if (B44.isVisible()) {
					gAff.setValueString(3,3,VIDE);
				}
				if (B45.isVisible()) {
					gAff.setValueString(3,4,VIDE);
				}
				if (B46.isVisible()) {
					gAff.setValueString(3,5,VIDE);
				}
				if (B47.isVisible()) {
					gAff.setValueString(3,6,VIDE);
				}
				if (B48.isVisible()) {
					gAff.setValueString(3,7,VIDE);
				}
				
				if (B51.isVisible()) {
					gAff.setValueString(4,0,VIDE);
				}
				if (B52.isVisible()) {
					gAff.setValueString(4,1,VIDE);
				}
				if (B53.isVisible()) {
					gAff.setValueString(4,2,VIDE);
				}
				if (B54.isVisible()) {
					gAff.setValueString(4,3,VIDE);
				}
				if (B55.isVisible()) {
					gAff.setValueString(4,4,VIDE);
				}
				if (B56.isVisible()) {
					gAff.setValueString(4,5,VIDE);
				}
				if (B57.isVisible()) {
					gAff.setValueString(4,6,VIDE);
				}
				if (B58.isVisible()) {
					gAff.setValueString(4,7,VIDE);
				}
			
				if (B61.isVisible()) {
					gAff.setValueString(5,0,VIDE);
				}
				if (B62.isVisible()) {
					gAff.setValueString(5,1,VIDE);
				}
				if (B63.isVisible()) {
					gAff.setValueString(5,2,VIDE);
				}
				if (B64.isVisible()) {
					gAff.setValueString(5,3,VIDE);
				}
				if (B65.isVisible()) {
					gAff.setValueString(5,4,VIDE);
				}
				if (B66.isVisible()) {
					gAff.setValueString(5,5,VIDE);
				}
				if (B67.isVisible()) {
					gAff.setValueString(5,6,VIDE);
				}
				if (B68.isVisible()) {
					gAff.setValueString(5,7,VIDE);
				}
				
				if (B71.isVisible()) {
					gAff.setValueString(6,0,VIDE);
				}
				if (B72.isVisible()) {
					gAff.setValueString(6,1,VIDE);
				}
				if (B73.isVisible()) {
					gAff.setValueString(6,2,VIDE);
				}
				if (B74.isVisible()) {
					gAff.setValueString(6,3,VIDE);
				}
				if (B75.isVisible()) {
					gAff.setValueString(6,4,VIDE);
				}
				if (B76.isVisible()) {
					gAff.setValueString(6,5,VIDE);
				}
				if (B77.isVisible()) {
					gAff.setValueString(6,6,VIDE);
				}
				if (B78.isVisible()) {
					gAff.setValueString(6,7,VIDE);
				}
				
				if (B81.isVisible()) {
					gAff.setValueString(7,0,VIDE);
				}
				if (B82.isVisible()) {
					gAff.setValueString(7,1,VIDE);
				}
				if (B83.isVisible()) {
					gAff.setValueString(7,2,VIDE);
				}
				if (B84.isVisible()) {
					gAff.setValueString(7,3,VIDE);
				}
				if (B85.isVisible()) {
					gAff.setValueString(7,4,VIDE);
				}
				if (B86.isVisible()) {
					gAff.setValueString(7,5,VIDE);
				}
				if (B87.isVisible()) {
					gAff.setValueString(7,6,VIDE);
				}
				if (B88.isVisible()) {
					gAff.setValueString(7,7,VIDE);
				}
				
			}});
		
		help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gAff.help(grille);
				cmpt.incrValueAt(64);
				if (cmpt.getValueAt(64) == 3) {
					help.setEnabled(false);
				}
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					help.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
					table.setVisible(false);
				}
			}
		});
		
		JButton generer = new JButton("Générer");
		generer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		generer.setBounds(592, 618, 575, 33);
		frame.getContentPane().add(generer);
		generer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gAff.randomAffichage(grille);
				
				
				reset.setEnabled(true);
				annuler.setEnabled(true);
				help.setEnabled(true);
				moves.resetPile();
				row.resetPile();
				col.resetPile();
				cmpt.reset();
				lblNewLabel.setVisible(false);
				table.setVisible(true);
				
				B11.setVisible(false);

				B12.setVisible(false);

				B13.setVisible(false);

				B14.setVisible(false);

				B15.setVisible(false);

				B16.setVisible(false);

				B17.setVisible(false);

				B18.setVisible(false);


				B21.setVisible(false);

				B22.setVisible(false);

				B23.setVisible(false);

				B24.setVisible(false);

				B25.setVisible(false);

				B26.setVisible(false);

				B27.setVisible(false);

				B28.setVisible(false);


				B31.setVisible(false);

				B32.setVisible(false);

				B33.setVisible(false);

				B34.setVisible(false);

				B35.setVisible(false);

				B36.setVisible(false);

				B37.setVisible(false);

				B38.setVisible(false);


				B41.setVisible(false);

				B42.setVisible(false);

				B43.setVisible(false);

				B44.setVisible(false);

				B45.setVisible(false);

				B46.setVisible(false);

				B47.setVisible(false);

				B48.setVisible(false);


				B51.setVisible(false);

				B52.setVisible(false);

				B53.setVisible(false);

				B54.setVisible(false);

				B55.setVisible(false);

				B56.setVisible(false);

				B57.setVisible(false);

				B58.setVisible(false);


				B61.setVisible(false);

				B62.setVisible(false);

				B63.setVisible(false);

				B64.setVisible(false);

				B65.setVisible(false);

				B66.setVisible(false);

				B67.setVisible(false);

				B68.setVisible(false);


				B71.setVisible(false);

				B72.setVisible(false);

				B73.setVisible(false);

				B74.setVisible(false);

				B75.setVisible(false);

				B76.setVisible(false);

				B77.setVisible(false);

				B78.setVisible(false);


				B81.setVisible(false);

				B82.setVisible(false);

				B83.setVisible(false);

				B84.setVisible(false);

				B85.setVisible(false);

				B86.setVisible(false);

				B87.setVisible(false);

				B88.setVisible(false);
		
				if (gAff.getValue(0, 0) == VIDE) {
					B11.setVisible(true);
				}
				if (gAff.getValue(0, 1) == VIDE) {
					B12.setVisible(true);
				}
				if (gAff.getValue(0, 2) == VIDE) {
					B13.setVisible(true);
				}
				if (gAff.getValue(0, 3) == VIDE) {
					B14.setVisible(true);
				}
				if (gAff.getValue(0, 4) == VIDE) {
					B15.setVisible(true);
				}
				if (gAff.getValue(0, 5) == VIDE) {
					B16.setVisible(true);
				}
				if (gAff.getValue(0, 6) == VIDE) {
					B17.setVisible(true);
				}
				if (gAff.getValue(0, 7) == VIDE) {
					B18.setVisible(true);
				}
				
				if (gAff.getValue(1, 0) == VIDE) {
					B21.setVisible(true);
				}
				if (gAff.getValue(1, 1) == VIDE) {
					B22.setVisible(true);
				}
				if (gAff.getValue(1, 2) == VIDE) {
					B23.setVisible(true);
				}
				if (gAff.getValue(1, 3) == VIDE) {
					B24.setVisible(true);
				}
				if (gAff.getValue(1, 4) == VIDE) {
					B25.setVisible(true);
				}
				if (gAff.getValue(1, 5) == VIDE) {
					B26.setVisible(true);
				}
				if (gAff.getValue(1, 6) == VIDE) {
					B27.setVisible(true);
				}
				if (gAff.getValue(1, 7) == VIDE) {
					B28.setVisible(true);
				}
				
				if (gAff.getValue(2, 0) == VIDE) {
					B31.setVisible(true);
				}
				if (gAff.getValue(2, 1) == VIDE) {
					B32.setVisible(true);
				}
				if (gAff.getValue(2, 2) == VIDE) {
					B33.setVisible(true);
				}
				if (gAff.getValue(2, 3) == VIDE) {
					B34.setVisible(true);
				}
				if (gAff.getValue(2, 4) == VIDE) {
					B35.setVisible(true);
				}
				if (gAff.getValue(2, 5) == VIDE) {
					B36.setVisible(true);
				}
				if (gAff.getValue(2, 6) == VIDE) {
					B37.setVisible(true);
				}
				if (gAff.getValue(2, 7) == VIDE) {
					B38.setVisible(true);
				}
				
				if (gAff.getValue(3, 0) == VIDE) {
					B41.setVisible(true);
				}
				if (gAff.getValue(3, 1) == VIDE) {
					B42.setVisible(true);
				}
				if (gAff.getValue(3, 2) == VIDE) {
					B43.setVisible(true);
				}
				if (gAff.getValue(3, 3) == VIDE) {
					B44.setVisible(true);
				}
				if (gAff.getValue(3, 4) == VIDE) {
					B45.setVisible(true);
				}
				if (gAff.getValue(3, 5) == VIDE) {
					B46.setVisible(true);
				}
				if (gAff.getValue(3, 6) == VIDE) {
					B47.setVisible(true);
				}
				if (gAff.getValue(3, 7) == VIDE) {
					B48.setVisible(true);
				}
				
				if (gAff.getValue(4, 0) == VIDE) {
					B51.setVisible(true);
				}
				if (gAff.getValue(4, 1) == VIDE) {
					B52.setVisible(true);
				}
				if (gAff.getValue(4, 2) == VIDE) {
					B53.setVisible(true);
				}
				if (gAff.getValue(4, 3) == VIDE) {
					B54.setVisible(true);
				}
				if (gAff.getValue(4, 4) == VIDE) {
					B55.setVisible(true);
				}
				if (gAff.getValue(4, 5) == VIDE) {
					B56.setVisible(true);
				}
				if (gAff.getValue(4, 6) == VIDE) {
					B57.setVisible(true);
				}
				if (gAff.getValue(4, 7) == VIDE) {
					B58.setVisible(true);
				}
				
				if (gAff.getValue(5, 0) == VIDE) {
					B61.setVisible(true);
				}
				if (gAff.getValue(5, 1) == VIDE) {
					B62.setVisible(true);
				}
				if (gAff.getValue(5, 2) == VIDE) {
					B63.setVisible(true);
				}
				if (gAff.getValue(5, 3) == VIDE) {
					B64.setVisible(true);
				}
				if (gAff.getValue(5, 4) == VIDE) {
					B65.setVisible(true);
				}
				if (gAff.getValue(5, 5) == VIDE) {
					B66.setVisible(true);
				}
				if (gAff.getValue(5, 6) == VIDE) {
					B67.setVisible(true);
				}
				if (gAff.getValue(5, 7) == VIDE) {
					B68.setVisible(true);
				}
				
				if (gAff.getValue(6, 0) == VIDE) {
					B71.setVisible(true);
				}
				if (gAff.getValue(6, 1) == VIDE) {
					B72.setVisible(true);
				}
				if (gAff.getValue(6, 2) == VIDE) {
					B73.setVisible(true);
				}
				if (gAff.getValue(6, 3) == VIDE) {
					B74.setVisible(true);
				}
				if (gAff.getValue(6, 4) == VIDE) {
					B75.setVisible(true);
				}
				if (gAff.getValue(6, 5) == VIDE) {
					B76.setVisible(true);
				}
				if (gAff.getValue(6, 6) == VIDE) {
					B77.setVisible(true);
				}
				if (gAff.getValue(6, 7) == VIDE) {
					B78.setVisible(true);
				}
				
				if (gAff.getValue(7, 0) == VIDE) {
					B81.setVisible(true);
				}
				if (gAff.getValue(7, 1) == VIDE) {
					B82.setVisible(true);
				}
				if (gAff.getValue(7, 2) == VIDE) {
					B83.setVisible(true);
				}
				if (gAff.getValue(7, 3) == VIDE) {
					B84.setVisible(true);
				}
				if (gAff.getValue(7, 4) == VIDE) {
					B85.setVisible(true);
				}
				if (gAff.getValue(7, 5) == VIDE) {
					B86.setVisible(true);
				}
				if (gAff.getValue(7, 6) == VIDE) {
					B87.setVisible(true);
				}
				if (gAff.getValue(7, 7) == VIDE) {
					B88.setVisible(true);
				}
				
			}});
		
		
		
		B11.setRolloverSelectedIcon(null);
		B11.setRolloverIcon(null);
		B11.setDisabledSelectedIcon(null);
		B11.setDisabledIcon(null);
		B11.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B11.setPressedIcon(null);
		B11.setSelectedIcon(null);
		B11.setOpaque(false);
		B11.setBounds(10, 12, 143, 75);
		frame.getContentPane().add(B11);
		B11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(0);
				if (cmpt.getValueAt(0)>=3) {
					cmpt.setValueAt(0, 0);
				}
				
				moves.push(gAff.getValue(0, 0));
				row.push(0);
				col.push(0);
				gAff.setValue(0, 0, cmpt.getValueAt(0));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					help.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
					table.setVisible(false);
				}
				
				
			}});
		B12.setRolloverSelectedIcon(null);
		B12.setRolloverIcon(null);
		B12.setDisabledSelectedIcon(null);
		B12.setDisabledIcon(null);
		B12.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B12.setPressedIcon(null);
		B12.setSelectedIcon(null);
		B12.setOpaque(false);
		B12.setBounds(153, 11, 143, 75);
		B12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(1);
				if (cmpt.getValueAt(1)>=3) {
					cmpt.setValueAt(1, 0);
				}
				moves.push(gAff.getValue(0, 1));
				row.push(0);
				col.push(1);
				gAff.setValue(0, 1, cmpt.getValueAt(1));
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
					
				
				
			}});
		frame.getContentPane().add(B12);
		B13.setRolloverSelectedIcon(null);
		B13.setRolloverIcon(null);
		B13.setDisabledSelectedIcon(null);
		B13.setDisabledIcon(null);
		B13.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B13.setPressedIcon(null);
		B13.setSelectedIcon(null);
		B13.setOpaque(false);
		B13.setBounds(301, 11, 143, 75);
		B13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(2);
				if (cmpt.getValueAt(2)>=3) {
					cmpt.setValueAt(2, 0);
				}
				moves.push(gAff.getValue(0, 2));
				row.push(0);
				col.push(2);
				gAff.setValue(0, 2, cmpt.getValueAt(02));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					help.setEnabled(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
					table.setVisible(false);
				}
				
					
				
			}});
		frame.getContentPane().add(B13);
		B14.setRolloverSelectedIcon(null);
		B14.setRolloverIcon(null);
		B14.setDisabledSelectedIcon(null);
		B14.setDisabledIcon(null);
		B14.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B14.setPressedIcon(null);
		B14.setSelectedIcon(null);
		B14.setOpaque(false);
		B14.setBounds(448, 11, 143, 72);
		B14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(3);
				if (cmpt.getValueAt(3)>=3) {
					cmpt.setValueAt(3, 0);
				}
				moves.push(gAff.getValue(0, 3));
				row.push(0);
				col.push(3);
				gAff.setValue(0, 3, cmpt.getValueAt(03));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
					help.setEnabled(false);
				}	
				
					
				
			}});
		frame.getContentPane().add(B14);
		B15.setRolloverSelectedIcon(null);
		B15.setRolloverIcon(null);
		B15.setDisabledSelectedIcon(null);
		B15.setDisabledIcon(null);
		B15.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B15.setPressedIcon(null);
		B15.setSelectedIcon(null);
		B15.setOpaque(false);
		B15.setBounds(592, 11, 143, 75);
		B15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(4);
				if (cmpt.getValueAt(4)>=3) {
					cmpt.setValueAt(4, 0);
				}
				moves.push(gAff.getValue(0, 4));
				row.push(0);
				col.push(4);
				gAff.setValue(0, 4, cmpt.getValueAt(04));
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					help.setEnabled(false);
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
					
				
			}});
		frame.getContentPane().add(B15);
		B16.setRolloverSelectedIcon(null);
		B16.setRolloverIcon(null);
		B16.setDisabledSelectedIcon(null);
		B16.setDisabledIcon(null);
		B16.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B16.setPressedIcon(null);
		B16.setSelectedIcon(null);
		B16.setOpaque(false);
		B16.setBounds(739, 11,143, 75);
		B16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(5);
				if (cmpt.getValueAt(5)>=3) {
					cmpt.setValueAt(5, 0);
				}
				moves.push(gAff.getValue(0, 5));
				row.push(0);
				col.push(5);
				gAff.setValue(0, 5, cmpt.getValueAt(05));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					help.setEnabled(false);
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		frame.getContentPane().add(B16);
		B17.setRolloverSelectedIcon(null);
		B17.setRolloverIcon(null);
		B17.setDisabledSelectedIcon(null);
		B17.setDisabledIcon(null);
		B17.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B17.setPressedIcon(null);
		B17.setSelectedIcon(null);
		B17.setOpaque(false);
		B17.setBounds(879, 12, 143, 75);
		B17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(6);
				if (cmpt.getValueAt(6)>=3) {
					cmpt.setValueAt(6, 0);
				}
				moves.push(gAff.getValue(0, 6));
				row.push(0);
				col.push(6);
				gAff.setValue(0, 6, cmpt.getValueAt(06));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					help.setEnabled(false);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		frame.getContentPane().add(B17);
		B18.setRolloverSelectedIcon(null);
		B18.setRolloverIcon(null);
		B18.setDisabledSelectedIcon(null);
		B18.setDisabledIcon(null);
		B18.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B18.setPressedIcon(null);
		B18.setSelectedIcon(null);
		B18.setOpaque(false);
		B18.setBounds(1024, 12, 143, 75);
		B18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(7);
				if (cmpt.getValueAt(7)>=3) {
					cmpt.setValueAt(7, 0);
				}
				moves.push(gAff.getValue(0, 7));
				row.push(0);
				col.push(7);
				gAff.setValue(0, 7, cmpt.getValueAt(07));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					help.setEnabled(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
					table.setVisible(false);
				}	
				
					
				
			}});
		frame.getContentPane().add(B18);
		B21.setRolloverSelectedIcon(null);
		B21.setRolloverIcon(null);
		B21.setDisabledSelectedIcon(null);
		B21.setDisabledIcon(null);
		B21.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B21.setPressedIcon(null);
		B21.setSelectedIcon(null);
		B21.setOpaque(false);
		B21.setBounds(6, 86, 147, 75);
		frame.getContentPane().add(B21);
		B22.setRolloverSelectedIcon(null);
		B22.setRolloverIcon(null);
		B22.setDisabledSelectedIcon(null);
		B22.setDisabledIcon(null);
		B22.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B22.setPressedIcon(null);
		B22.setSelectedIcon(null);
		B22.setOpaque(false);
		B22.setBounds(153, 86, 143, 75);
		frame.getContentPane().add(B22);
		B23.setRolloverSelectedIcon(null);
		B23.setRolloverIcon(null);
		B23.setDisabledSelectedIcon(null);
		B23.setDisabledIcon(null);
		B23.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B23.setPressedIcon(null);
		B23.setSelectedIcon(null);
		B23.setOpaque(false);
		B23.setBounds(301, 86, 143, 75);
		frame.getContentPane().add(B23);
		B24.setRolloverSelectedIcon(null);
		B24.setRolloverIcon(null);
		B24.setDisabledSelectedIcon(null);
		B24.setDisabledIcon(null);
		B24.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B24.setPressedIcon(null);
		B24.setSelectedIcon(null);
		B24.setOpaque(false);
		B24.setBounds(448, 86, 142, 75);
		frame.getContentPane().add(B24);
		B25.setRolloverSelectedIcon(null);
		B25.setRolloverIcon(null);
		B25.setDisabledSelectedIcon(null);
		B25.setDisabledIcon(null);
		B25.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B25.setPressedIcon(null);
		B25.setSelectedIcon(null);
		B25.setOpaque(false);
		B25.setBounds(587, 86, 143, 75);
		frame.getContentPane().add(B25);
		B26.setRolloverSelectedIcon(null);
		B26.setRolloverIcon(null);
		B26.setDisabledSelectedIcon(null);
		B26.setDisabledIcon(null);
		B26.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B26.setPressedIcon(null);
		B26.setSelectedIcon(null);
		B26.setOpaque(false);
		B26.setBounds(732, 86, 142, 75);
		frame.getContentPane().add(B26);
		B27.setRolloverSelectedIcon(null);
		B27.setRolloverIcon(null);
		B27.setDisabledSelectedIcon(null);
		B27.setDisabledIcon(null);
		B27.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B27.setPressedIcon(null);
		B27.setSelectedIcon(null);
		B27.setOpaque(false);
		B27.setBounds(876, 86,146, 75);
		frame.getContentPane().add(B27);
		B28.setRolloverSelectedIcon(null);
		B28.setRolloverIcon(null);
		B28.setDisabledSelectedIcon(null);
		B28.setDisabledIcon(null);
		B28.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B28.setPressedIcon(null);
		B28.setSelectedIcon(null);
		B28.setOpaque(false);
		B28.setBounds(1024, 86, 143, 75);
		frame.getContentPane().add(B28);
		B31.setRolloverSelectedIcon(null);
		B31.setRolloverIcon(null);
		B31.setDisabledSelectedIcon(null);
		B31.setDisabledIcon(null);
		B31.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B31.setPressedIcon(null);
		B31.setSelectedIcon(null);
		B31.setOpaque(false);
		B31.setBounds(0, 160, 143, 75);
		frame.getContentPane().add(B31);
		B32.setRolloverSelectedIcon(null);
		B32.setRolloverIcon(null);
		B32.setDisabledSelectedIcon(null);
		B32.setDisabledIcon(null);
		B32.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B32.setPressedIcon(null);
		B32.setSelectedIcon(null);
		B32.setOpaque(false);
		B32.setBounds(147, 160, 143, 75);
		frame.getContentPane().add(B32);
		B33.setRolloverSelectedIcon(null);
		B33.setRolloverIcon(null);
		B33.setDisabledSelectedIcon(null);
		B33.setDisabledIcon(null);
		B33.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B33.setPressedIcon(null);
		B33.setSelectedIcon(null);
		B33.setOpaque(false);
		B33.setBounds(295, 160,143, 75);
		frame.getContentPane().add(B33);
		B34.setRolloverSelectedIcon(null);
		B34.setRolloverIcon(null);
		B34.setDisabledSelectedIcon(null);
		B34.setDisabledIcon(null);
		B34.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B34.setPressedIcon(null);
		B34.setSelectedIcon(null);
		B34.setOpaque(false);
		B34.setBounds(442, 160, 143, 75);
		frame.getContentPane().add(B34);
		B35.setRolloverSelectedIcon(null);
		B35.setRolloverIcon(null);
		B35.setDisabledSelectedIcon(null);
		B35.setDisabledIcon(null);
		B35.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B35.setPressedIcon(null);
		B35.setSelectedIcon(null);
		B35.setOpaque(false);
		B35.setBounds(586, 160, 143, 75);
		frame.getContentPane().add(B35);
		B36.setRolloverSelectedIcon(null);
		B36.setRolloverIcon(null);
		B36.setDisabledSelectedIcon(null);
		B36.setDisabledIcon(null);
		B36.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B36.setPressedIcon(null);
		B36.setSelectedIcon(null);
		B36.setOpaque(false);
		B36.setBounds(733, 160, 143, 75);
		frame.getContentPane().add(B36);
		B37.setRolloverSelectedIcon(null);
		B37.setRolloverIcon(null);
		B37.setDisabledSelectedIcon(null);
		B37.setDisabledIcon(null);
		B37.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B37.setPressedIcon(null);
		B37.setSelectedIcon(null);
		B37.setOpaque(false);
		B37.setBounds(881, 160, 143, 75);
		frame.getContentPane().add(B37);
		B38.setRolloverSelectedIcon(null);
		B38.setRolloverIcon(null);
		B38.setDisabledSelectedIcon(null);
		B38.setDisabledIcon(null);
		B38.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B38.setPressedIcon(null);
		B38.setSelectedIcon(null);
		B38.setOpaque(false);
		B38.setBounds(1024, 164, 143, 75);
		frame.getContentPane().add(B38);
		B41.setRolloverSelectedIcon(null);
		B41.setRolloverIcon(null);
		B41.setDisabledSelectedIcon(null);
		B41.setDisabledIcon(null);
		B41.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B41.setPressedIcon(null);
		B41.setSelectedIcon(null);
		B41.setOpaque(false);
		B41.setBounds(10, 238, 143, 75);
		frame.getContentPane().add(B41);
		B42.setRolloverSelectedIcon(null);
		B42.setRolloverIcon(null);
		B42.setDisabledSelectedIcon(null);
		B42.setDisabledIcon(null);
		B42.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B42.setPressedIcon(null);
		B42.setSelectedIcon(null);
		B42.setOpaque(false);
		B42.setBounds(157, 238, 143, 75);
		frame.getContentPane().add(B42);
		B43.setRolloverSelectedIcon(null);
		B43.setRolloverIcon(null);
		B43.setDisabledSelectedIcon(null);
		B43.setDisabledIcon(null);
		B43.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B43.setPressedIcon(null);
		B43.setSelectedIcon(null);
		B43.setOpaque(false);
		B43.setBounds(301, 238, 143, 75);
		frame.getContentPane().add(B43);
		B44.setRolloverSelectedIcon(null);
		B44.setRolloverIcon(null);
		B44.setDisabledSelectedIcon(null);
		B44.setDisabledIcon(null);
		B44.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B44.setPressedIcon(null);
		B44.setSelectedIcon(null);
		B44.setOpaque(false);
		B44.setBounds(442, 238, 143, 75);
		frame.getContentPane().add(B44);
		B45.setRolloverSelectedIcon(null);
		B45.setRolloverIcon(null);
		B45.setDisabledSelectedIcon(null);
		B45.setDisabledIcon(null);
		B45.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B45.setPressedIcon(null);
		B45.setSelectedIcon(null);
		B45.setOpaque(false);
		B45.setBounds(587, 238,143, 75);
		frame.getContentPane().add(B45);
		B46.setRolloverSelectedIcon(null);
		B46.setRolloverIcon(null);
		B46.setDisabledSelectedIcon(null);
		B46.setDisabledIcon(null);
		B46.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B46.setPressedIcon(null);
		B46.setSelectedIcon(null);
		B46.setOpaque(false);
		B46.setBounds(732, 238, 143, 75);
		frame.getContentPane().add(B46);
		B47.setRolloverSelectedIcon(null);
		B47.setRolloverIcon(null);
		B47.setDisabledSelectedIcon(null);
		B47.setDisabledIcon(null);
		B47.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B47.setPressedIcon(null);
		B47.setSelectedIcon(null);
		B47.setOpaque(false);
		B47.setBounds(876, 238, 147, 75);
		frame.getContentPane().add(B47);
		B48.setRolloverSelectedIcon(null);
		B48.setRolloverIcon(null);
		B48.setDisabledSelectedIcon(null);
		B48.setDisabledIcon(null);
		B48.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B48.setPressedIcon(null);
		B48.setSelectedIcon(null);
		B48.setOpaque(false);
		B48.setBounds(1024, 238, 143, 75);
		frame.getContentPane().add(B48);
		B51.setRolloverSelectedIcon(null);
		B51.setRolloverIcon(null);
		B51.setDisabledSelectedIcon(null);
		B51.setDisabledIcon(null);
		B51.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B51.setPressedIcon(null);
		B51.setSelectedIcon(null);
		B51.setOpaque(false);
		B51.setBounds(10, 310, 143, 75);
		frame.getContentPane().add(B51);
		B52.setRolloverSelectedIcon(null);
		B52.setRolloverIcon(null);
		B52.setDisabledSelectedIcon(null);
		B52.setDisabledIcon(null);
		B52.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B52.setPressedIcon(null);
		B52.setSelectedIcon(null);
		B52.setOpaque(false);
		B52.setBounds(157, 310, 143, 75);
		frame.getContentPane().add(B52);
		B53.setRolloverSelectedIcon(null);
		B53.setRolloverIcon(null);
		B53.setDisabledSelectedIcon(null);
		B53.setDisabledIcon(null);
		B53.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B53.setPressedIcon(null);
		B53.setSelectedIcon(null);
		B53.setOpaque(false);
		B53.setBounds(301, 310, 143, 75);
		frame.getContentPane().add(B53);
		B54.setRolloverSelectedIcon(null);
		B54.setRolloverIcon(null);
		B54.setDisabledSelectedIcon(null);
		B54.setDisabledIcon(null);
		B54.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B54.setPressedIcon(null);
		B54.setSelectedIcon(null);
		B54.setOpaque(false);
		B54.setBounds(442, 310, 143, 75);
		frame.getContentPane().add(B54);
		B55.setRolloverSelectedIcon(null);
		B55.setRolloverIcon(null);
		B55.setDisabledSelectedIcon(null);
		B55.setDisabledIcon(null);
		B55.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B55.setPressedIcon(null);
		B55.setSelectedIcon(null);
		B55.setOpaque(false);
		B55.setBounds(587, 310,143, 75);
		frame.getContentPane().add(B55);
		B56.setRolloverSelectedIcon(null);
		B56.setRolloverIcon(null);
		B56.setDisabledSelectedIcon(null);
		B56.setDisabledIcon(null);
		B56.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B56.setPressedIcon(null);
		B56.setSelectedIcon(null);
		B56.setOpaque(false);
		B56.setBounds(732, 310, 143, 75);
		frame.getContentPane().add(B56);
		B57.setRolloverSelectedIcon(null);
		B57.setRolloverIcon(null);
		B57.setDisabledSelectedIcon(null);
		B57.setDisabledIcon(null);
		B57.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B57.setPressedIcon(null);
		B57.setSelectedIcon(null);
		B57.setOpaque(false);
		B57.setBounds(876, 310, 143, 75);
		frame.getContentPane().add(B57);
		B58.setRolloverSelectedIcon(null);
		B58.setRolloverIcon(null);
		B58.setDisabledSelectedIcon(null);
		B58.setDisabledIcon(null);
		B58.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B58.setPressedIcon(null);
		B58.setSelectedIcon(null);
		B58.setOpaque(false);
		B58.setBounds(1024, 310, 143, 75);
		frame.getContentPane().add(B58);
		B61.setRolloverSelectedIcon(null);
		B61.setRolloverIcon(null);
		B61.setDisabledSelectedIcon(null);
		B61.setDisabledIcon(null);
		B61.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B61.setPressedIcon(null);
		B61.setSelectedIcon(null);
		B61.setOpaque(false);
		B61.setBounds(10, 388, 143, 75);
		frame.getContentPane().add(B61);
		B62.setRolloverSelectedIcon(null);
		B62.setRolloverIcon(null);
		B62.setDisabledSelectedIcon(null);
		B62.setDisabledIcon(null);
		B62.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B62.setPressedIcon(null);
		B62.setSelectedIcon(null);
		B62.setOpaque(false);
		B62.setBounds(157, 388, 143, 75);
		frame.getContentPane().add(B62);
		B63.setRolloverSelectedIcon(null);
		B63.setRolloverIcon(null);
		B63.setDisabledSelectedIcon(null);
		B63.setDisabledIcon(null);
		B63.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B63.setPressedIcon(null);
		B63.setSelectedIcon(null);
		B63.setOpaque(false);
		B63.setBounds(301, 388, 143, 75);
		frame.getContentPane().add(B63);
		B64.setRolloverSelectedIcon(null);
		B64.setRolloverIcon(null);
		B64.setDisabledSelectedIcon(null);
		B64.setDisabledIcon(null);
		B64.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B64.setPressedIcon(null);
		B64.setSelectedIcon(null);
		B64.setOpaque(false);
		B64.setBounds(442, 388, 143, 75);
		frame.getContentPane().add(B64);
		B65.setRolloverSelectedIcon(null);
		B65.setRolloverIcon(null);
		B65.setDisabledSelectedIcon(null);
		B65.setDisabledIcon(null);
		B65.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B65.setPressedIcon(null);
		B65.setSelectedIcon(null);
		B65.setOpaque(false);
		B65.setBounds(587, 388, 143, 75);
		frame.getContentPane().add(B65);
		B66.setRolloverSelectedIcon(null);
		B66.setRolloverIcon(null);
		B66.setDisabledSelectedIcon(null);
		B66.setDisabledIcon(null);
		B66.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B66.setPressedIcon(null);
		B66.setSelectedIcon(null);
		B66.setOpaque(false);
		B66.setBounds(732, 388,143, 75);
		frame.getContentPane().add(B66);
		B67.setRolloverSelectedIcon(null);
		B67.setRolloverIcon(null);
		B67.setDisabledSelectedIcon(null);
		B67.setDisabledIcon(null);
		B67.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B67.setPressedIcon(null);
		B67.setSelectedIcon(null);
		B67.setOpaque(false);
		B67.setBounds(876, 388, 143, 75);
		frame.getContentPane().add(B67);
		B68.setRolloverSelectedIcon(null);
		B68.setRolloverIcon(null);
		B68.setDisabledSelectedIcon(null);
		B68.setDisabledIcon(null);
		B68.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B68.setPressedIcon(null);
		B68.setSelectedIcon(null);
		B68.setOpaque(false);
		B68.setBounds(1024, 388, 143, 75);
		frame.getContentPane().add(B68);
		B71.setRolloverSelectedIcon(null);
		B71.setRolloverIcon(null);
		B71.setDisabledSelectedIcon(null);
		B71.setDisabledIcon(null);
		B71.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B71.setPressedIcon(null);
		B71.setSelectedIcon(null);
		B71.setOpaque(false);
		B71.setBounds(10, 461, 143, 75);
		frame.getContentPane().add(B71);
		B72.setRolloverSelectedIcon(null);
		B72.setRolloverIcon(null);
		B72.setDisabledSelectedIcon(null);
		B72.setDisabledIcon(null);
		B72.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B72.setPressedIcon(null);
		B72.setSelectedIcon(null);
		B72.setOpaque(false);
		B72.setBounds(157, 461, 143, 75);
		frame.getContentPane().add(B72);
		B73.setRolloverSelectedIcon(null);
		B73.setRolloverIcon(null);
		B73.setDisabledSelectedIcon(null);
		B73.setDisabledIcon(null);
		B73.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B73.setPressedIcon(null);
		B73.setSelectedIcon(null);
		B73.setOpaque(false);
		B73.setBounds(301, 461, 143, 75);
		frame.getContentPane().add(B73);
		B74.setRolloverSelectedIcon(null);
		B74.setRolloverIcon(null);
		B74.setDisabledSelectedIcon(null);
		B74.setDisabledIcon(null);
		B74.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B74.setPressedIcon(null);
		B74.setSelectedIcon(null);
		B74.setOpaque(false);
		B74.setBounds(442, 461,143, 75);
		frame.getContentPane().add(B74);
		B75.setRolloverSelectedIcon(null);
		B75.setRolloverIcon(null);
		B75.setDisabledSelectedIcon(null);
		B75.setDisabledIcon(null);
		B75.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B75.setPressedIcon(null);
		B75.setSelectedIcon(null);
		B75.setOpaque(false);
		B75.setBounds(587, 461, 143, 75);
		frame.getContentPane().add(B75);
		B76.setRolloverSelectedIcon(null);
		B76.setRolloverIcon(null);
		B76.setDisabledSelectedIcon(null);
		B76.setDisabledIcon(null);
		B76.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B76.setPressedIcon(null);
		B76.setSelectedIcon(null);
		B76.setOpaque(false);
		B76.setBounds(732, 461, 143, 75);
		frame.getContentPane().add(B76);
		B77.setRolloverSelectedIcon(null);
		B77.setRolloverIcon(null);
		B77.setDisabledSelectedIcon(null);
		B77.setDisabledIcon(null);
		B77.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B77.setPressedIcon(null);
		B77.setSelectedIcon(null);
		B77.setOpaque(false);
		B77.setBounds(876, 461, 143, 75);
		frame.getContentPane().add(B77);
		B78.setRolloverSelectedIcon(null);
		B78.setRolloverIcon(null);
		B78.setDisabledSelectedIcon(null);
		B78.setDisabledIcon(null);
		B78.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B78.setPressedIcon(null);
		B78.setSelectedIcon(null);
		B78.setOpaque(false);
		B78.setBounds(1024, 461,143, 75);
		frame.getContentPane().add(B78);
		B81.setRolloverSelectedIcon(null);
		B81.setRolloverIcon(null);
		B81.setDisabledSelectedIcon(null);
		B81.setDisabledIcon(null);
		B81.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B81.setPressedIcon(null);
		B81.setSelectedIcon(null);
		B81.setOpaque(false);
		B81.setBounds(10, 536, 143, 75);
		frame.getContentPane().add(B81);
		B82.setRolloverSelectedIcon(null);
		B82.setRolloverIcon(null);
		B82.setDisabledSelectedIcon(null);
		B82.setDisabledIcon(null);
		B82.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B82.setPressedIcon(null);
		B82.setSelectedIcon(null);
		B82.setOpaque(false);
		B82.setBounds(157, 536, 143, 75);
		frame.getContentPane().add(B82);
		B83.setRolloverSelectedIcon(null);
		B83.setRolloverIcon(null);
		B83.setDisabledSelectedIcon(null);
		B83.setDisabledIcon(null);
		B83.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B83.setPressedIcon(null);
		B83.setSelectedIcon(null);
		B83.setOpaque(false);
		B83.setBounds(301, 536, 143, 75);
		frame.getContentPane().add(B83);
		B84.setRolloverSelectedIcon(null);
		B84.setRolloverIcon(null);
		B84.setDisabledSelectedIcon(null);
		B84.setDisabledIcon(null);
		B84.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B84.setPressedIcon(null);
		B84.setSelectedIcon(null);
		B84.setOpaque(false);
		B84.setBounds(442, 536, 143, 75);
		frame.getContentPane().add(B84);
		B85.setRolloverSelectedIcon(null);
		B85.setRolloverIcon(null);
		B85.setDisabledSelectedIcon(null);
		B85.setDisabledIcon(null);
		B85.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B85.setPressedIcon(null);
		B85.setSelectedIcon(null);
		B85.setOpaque(false);
		B85.setBounds(587, 536, 143, 75);
		frame.getContentPane().add(B85);
		B86.setRolloverSelectedIcon(null);
		B86.setRolloverIcon(null);
		B86.setDisabledSelectedIcon(null);
		B86.setDisabledIcon(null);
		B86.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B86.setPressedIcon(null);
		B86.setSelectedIcon(null);
		B86.setOpaque(false);
		B86.setBounds(732, 536, 143, 75);
		frame.getContentPane().add(B86);
		B87.setRolloverSelectedIcon(null);
		B87.setRolloverIcon(null);
		B87.setDisabledSelectedIcon(null);
		B87.setDisabledIcon(null);
		B87.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B87.setPressedIcon(null);
		B87.setSelectedIcon(null);
		B87.setOpaque(false);
		B87.setBounds(876, 536, 143, 75);
		frame.getContentPane().add(B87);
		B88.setRolloverSelectedIcon(null);
		B88.setRolloverIcon(null);
		B88.setDisabledSelectedIcon(null);
		B88.setDisabledIcon(null);
		B88.setIcon(new ImageIcon("C:\\Users\\Alex\\Desktop\\Jeux\\Autres\\dés.ico"));
		B88.setPressedIcon(null);
		B88.setSelectedIcon(null);
		B88.setOpaque(false);
		B88.setBounds(1024, 536, 143, 75);
		frame.getContentPane().add(B88);
		
		B21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(8);
				if (cmpt.getValueAt(8)>=3) {
					cmpt.setValueAt(8, 0);
				}
				moves.push(gAff.getValue(1, 0));
				row.push(1);
				col.push(0);
				gAff.setValue(1, 0, cmpt.getValueAt(8));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					help.setEnabled(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
					table.setVisible(false);
				}
					
				
					
				
				
			}});
		B22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(9);
				if (cmpt.getValueAt(9)>=3) {
					cmpt.setValueAt(9, 0);
				}
				moves.push(gAff.getValue(1, 1));
				row.push(1);
				col.push(1);
				gAff.setValue(1, 1, cmpt.getValueAt(9));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					help.setEnabled(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
					table.setVisible(false);
				}
					
				
				
			}});
		B23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(10);
				if (cmpt.getValueAt(10)>=3) {
					cmpt.setValueAt(10, 0);
				}
				moves.push(gAff.getValue(1, 2));
				row.push(1);
				col.push(2);
				gAff.setValue(1, 2, cmpt.getValueAt(10));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					help.setEnabled(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
					table.setVisible(false);
				}	
				
					
				
			}});
		B24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(11);
				if (cmpt.getValueAt(11)>=3) {
					cmpt.setValueAt(11, 0);
				}
				moves.push(gAff.getValue(1, 3));
				row.push(1);
				col.push(3);
				gAff.setValue(1, 3, cmpt.getValueAt(11));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					help.setEnabled(false);
					B88.setVisible(false);
				}
					
				
				
			}});
		B25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(12);
				if (cmpt.getValueAt(12)>=3) {
					cmpt.setValueAt(12, 0);
				}
				moves.push(gAff.getValue(1, 4));
				row.push(1);
				col.push(4);
				gAff.setValue(1, 4, cmpt.getValueAt(12));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					help.setEnabled(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(13);
				if (cmpt.getValueAt(13)>=3) {
					cmpt.setValueAt(13, 0);
				}
				moves.push(gAff.getValue(1, 5));
				row.push(1);
				col.push(5);
				gAff.setValue(1, 5, cmpt.getValueAt(13));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					help.setEnabled(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(14);
				if (cmpt.getValueAt(14)>=3) {
					cmpt.setValueAt(14, 0);
				}
				moves.push(gAff.getValue(1, 6));
				row.push(1);
				col.push(6);
				gAff.setValue(1, 6, cmpt.getValueAt(14));
				
					
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					help.setEnabled(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
			}});
		B28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(15);
				if (cmpt.getValueAt(15)>=3) {
					cmpt.setValueAt(15, 0);
				}
				moves.push(gAff.getValue(1, 7));
				row.push(1);
				col.push(7);
				gAff.setValue(1, 7, cmpt.getValueAt(15));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					help.setEnabled(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		
		B31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(16);
				if (cmpt.getValueAt(16)>=3) {
					cmpt.setValueAt(16, 0);
				}
				moves.push(gAff.getValue(2, 0));
				row.push(2);
				col.push(0);
				gAff.setValue(2, 0, cmpt.getValueAt(16));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					help.setEnabled(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
					
				
			}});
		B32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(17);
				if (cmpt.getValueAt(17)>=3) {
					cmpt.setValueAt(17, 0);
				}
				moves.push(gAff.getValue(2, 1));
				row.push(2);
				col.push(1);
				gAff.setValue(2, 1, cmpt.getValueAt(17));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					help.setEnabled(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
			}});
		B33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(18);
				if (cmpt.getValueAt(18)>=3) {
					cmpt.setValueAt(18, 0);
				}
				moves.push(gAff.getValue(2, 2));
				row.push(2);
				col.push(2);
				gAff.setValue(2, 2, cmpt.getValueAt(18));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					help.setEnabled(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(19);
				if (cmpt.getValueAt(19)>=3) {
					cmpt.setValueAt(19, 0);
				}
				moves.push(gAff.getValue(2, 3));
				row.push(2);
				col.push(3);
				gAff.setValue(2, 3, cmpt.getValueAt(19));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					help.setEnabled(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		
		B35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(20);
				if (cmpt.getValueAt(20)>=3) {
					cmpt.setValueAt(20, 0);
				}
				moves.push(gAff.getValue(2, 4));
				row.push(2);
				col.push(4);
				gAff.setValue(2, 4, cmpt.getValueAt(20));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					help.setEnabled(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(21);
				if (cmpt.getValueAt(21)>=3) {
					cmpt.setValueAt(21, 0);
				}
				moves.push(gAff.getValue(2, 5));
				row.push(2);
				col.push(5);
				gAff.setValue(2, 5, cmpt.getValueAt(21));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					help.setEnabled(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
					help.setEnabled(false);
				}	
				
					
				
			}});
		B37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(22);
				if (cmpt.getValueAt(22)>=3) {
					cmpt.setValueAt(22, 0);
				}
				moves.push(gAff.getValue(2, 6));
				row.push(2);
				col.push(6);
				gAff.setValue(2, 6, cmpt.getValueAt(22));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					help.setEnabled(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(23);
				if (cmpt.getValueAt(23)>=3) {
					cmpt.setValueAt(23, 0);
				}
				moves.push(gAff.getValue(2, 7));
				row.push(2);
				col.push(7);
				gAff.setValue(2, 7, cmpt.getValueAt(23));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					help.setEnabled(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
				
			}});
		
		B41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(24);
				if (cmpt.getValueAt(24)>=3) {
					cmpt.setValueAt(24, 0);
				}
				moves.push(gAff.getValue(3, 0));
				row.push(3);
				col.push(0);
				gAff.setValue(3, 0, cmpt.getValueAt(24));
				
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					help.setEnabled(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(25);
				if (cmpt.getValueAt(25)>=3) {
					cmpt.setValueAt(25, 0);
				}
				moves.push(gAff.getValue(3, 1));
				row.push(3);
				col.push(1);
				gAff.setValue(3, 1, cmpt.getValueAt(25));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					help.setEnabled(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(26);
				if (cmpt.getValueAt(26)>=3) {
					cmpt.setValueAt(26, 0);
				}
				moves.push(gAff.getValue(3, 2));
				row.push(3);
				col.push(2);
				gAff.setValue(3, 2, cmpt.getValueAt(26));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					help.setEnabled(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(27);
				if (cmpt.getValueAt(27)>=3) {
					cmpt.setValueAt(27, 0);
				}
				moves.push(gAff.getValue(3, 3));
				row.push(3);
				col.push(3);
				gAff.setValue(3, 3, cmpt.getValueAt(27));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					help.setEnabled(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(28);
				if (cmpt.getValueAt(28)>=3) {
					cmpt.setValueAt(28, 0);
				}
				moves.push(gAff.getValue(3, 4));
				row.push(3);
				col.push(4);
				gAff.setValue(3, 4, cmpt.getValueAt(28));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					help.setEnabled(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(29);
				if (cmpt.getValueAt(29)>=3) {
					cmpt.setValueAt(29, 0);
				}
				moves.push(gAff.getValue(3, 5));
				row.push(3);
				col.push(5);
				gAff.setValue(3, 5, cmpt.getValueAt(29));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					help.setEnabled(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					help.setEnabled(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(30);
				if (cmpt.getValueAt(30)>=3) {
					cmpt.setValueAt(30, 0);
				}
				moves.push(gAff.getValue(3, 6));
				row.push(3);
				col.push(6);
				gAff.setValue(3, 6, cmpt.getValueAt(30));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					help.setEnabled(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(31);
				if (cmpt.getValueAt(31)>=3) {
					cmpt.setValueAt(31, 0);
				}
				moves.push(gAff.getValue(3,7));
				row.push(3);
				col.push(7);
				gAff.setValue(3, 7, cmpt.getValueAt(31));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					help.setEnabled(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		
		B51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(32);
				if (cmpt.getValueAt(32)>=3) {
					cmpt.setValueAt(32, 0);
				}
				moves.push(gAff.getValue(4, 0));
				row.push(4);
				col.push(0);
				gAff.setValue(4, 0, cmpt.getValueAt(32));
				
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					help.setEnabled(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(33);
				if (cmpt.getValueAt(33)>=3) {
					cmpt.setValueAt(33, 0);
				}
				moves.push(gAff.getValue(4, 1));
				row.push(4);
				col.push(1);
				gAff.setValue(4, 1, cmpt.getValueAt(33));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					help.setEnabled(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(34);
				if (cmpt.getValueAt(34)>=3) {
					cmpt.setValueAt(34, 0);
				}
				moves.push(gAff.getValue(4, 2));
				row.push(4);
				col.push(2);
				gAff.setValue(4, 2, cmpt.getValueAt(34));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					help.setEnabled(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(35);
				if (cmpt.getValueAt(35)>=3) {
					cmpt.setValueAt(35, 0);
				}
				moves.push(gAff.getValue(4, 3));
				row.push(4);
				col.push(3);
				gAff.setValue(4, 3, cmpt.getValueAt(35));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					help.setEnabled(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(36);
				if (cmpt.getValueAt(36)>=3) {
					cmpt.setValueAt(36, 0);
				}
				moves.push(gAff.getValue(4, 4));
				row.push(4);
				col.push(4);
				gAff.setValue(4, 4, cmpt.getValueAt(36));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					help.setEnabled(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(37);
				if (cmpt.getValueAt(37)>=3) {
					cmpt.setValueAt(37, 0);
				}
				moves.push(gAff.getValue(4, 5));
				row.push(4);
				col.push(5);
				gAff.setValue(4, 5, cmpt.getValueAt(37));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					help.setEnabled(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(38);
				if (cmpt.getValueAt(38)>=3) {
					cmpt.setValueAt(38, 0);
				}
				moves.push(gAff.getValue(4, 6));
				row.push(4);
				col.push(6);
				gAff.setValue(4, 6, cmpt.getValueAt(38));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					help.setEnabled(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(39);
				if (cmpt.getValueAt(39)>=3) {
					cmpt.setValueAt(39, 0);
				}
				moves.push(gAff.getValue(4, 7));
				row.push(4);
				col.push(7);
				gAff.setValue(4, 7, cmpt.getValueAt(39));
				
					
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					help.setEnabled(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
			}});
		
		B61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(40);
				if (cmpt.getValueAt(40)>=3) {
					cmpt.setValueAt(40, 0);
				}
				moves.push(gAff.getValue(5, 0));
				row.push(5);
				col.push(0);
				gAff.setValue(5, 0, cmpt.getValueAt(40));
				
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					help.setEnabled(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(41);
				if (cmpt.getValueAt(41)>=3) {
					cmpt.setValueAt(41, 0);
				}
				moves.push(gAff.getValue(5, 1));
				row.push(5);
				col.push(1);
				gAff.setValue(5, 1, cmpt.getValueAt(41));
				
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					help.setEnabled(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(42);
				if (cmpt.getValueAt(42)>=3) {
					cmpt.setValueAt(42, 0);
				}
				moves.push(gAff.getValue(5, 2));
				row.push(5);
				col.push(2);
				gAff.setValue(5, 2, cmpt.getValueAt(42));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					help.setEnabled(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(43);
				if (cmpt.getValueAt(43)>=3) {
					cmpt.setValueAt(43, 0);
				}
				moves.push(gAff.getValue(5, 3));
				row.push(5);
				col.push(3);
				gAff.setValue(5, 3, cmpt.getValueAt(43));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					help.setEnabled(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B65.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(44);
				if (cmpt.getValueAt(44)>=3) {
					cmpt.setValueAt(44, 0);
				}
				moves.push(gAff.getValue(5, 4));
				row.push(5);
				col.push(4);
				gAff.setValue(5, 4, cmpt.getValueAt(44));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					help.setEnabled(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
			
			}});
		B66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(45);
				if (cmpt.getValueAt(45)>=3) {
					cmpt.setValueAt(45, 0);
				}
				moves.push(gAff.getValue(5, 5));
				row.push(5);
				col.push(5);
				gAff.setValue(5, 5, cmpt.getValueAt(45));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					help.setEnabled(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B67.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(46);
				if (cmpt.getValueAt(46)>=3) {
					cmpt.setValueAt(46, 0);
				}
				moves.push(gAff.getValue(5, 6));
				row.push(5);
				col.push(6);
				gAff.setValue(5, 6, cmpt.getValueAt(46));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					help.setEnabled(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B68.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(47);
				if (cmpt.getValueAt(47)>=3) {
					cmpt.setValueAt(47, 0);
				}
				moves.push(gAff.getValue(5, 7));
				row.push(5);
				col.push(7);
				gAff.setValue(5, 7, cmpt.getValueAt(47));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					help.setEnabled(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
				
				
			}});
		
		B71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(48);
				if (cmpt.getValueAt(48)>=3) {
					cmpt.setValueAt(48, 0);
				}
				moves.push(gAff.getValue(6, 0));
				row.push(6);
				col.push(0);
				gAff.setValue(6, 0, cmpt.getValueAt(48));
				
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					help.setEnabled(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					help.setEnabled(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B72.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(49);
				if (cmpt.getValueAt(49)>=3) {
					cmpt.setValueAt(49, 0);
				}
				moves.push(gAff.getValue(6, 1));
				row.push(6);
				col.push(1);
				gAff.setValue(6, 1, cmpt.getValueAt(49));
				
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					help.setEnabled(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B73.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(50);
				if (cmpt.getValueAt(50)>=3) {
					cmpt.setValueAt(50, 0);
				}
				moves.push(gAff.getValue(6, 2));
				row.push(6);
				col.push(2);
				gAff.setValue(6, 2, cmpt.getValueAt(50));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					help.setEnabled(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B74.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(51);
				if (cmpt.getValueAt(51)>=3) {
					cmpt.setValueAt(51, 0);
				}
				moves.push(gAff.getValue(6, 3));
				row.push(6);
				col.push(3);
				gAff.setValue(6, 3, cmpt.getValueAt(51));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					help.setEnabled(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B75.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(52);
				if (cmpt.getValueAt(52)>=3) {
					cmpt.setValueAt(52, 0);
				}
				moves.push(gAff.getValue(6, 4));
				row.push(6);
				col.push(4);
				gAff.setValue(6, 4, cmpt.getValueAt(52));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					help.setEnabled(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
			}});
		B76.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(53);
				if (cmpt.getValueAt(53)>=3) {
					cmpt.setValueAt(53, 0);
				}
				moves.push(gAff.getValue(6, 5));
				row.push(6);
				col.push(5);
				gAff.setValue(6, 5, cmpt.getValueAt(53));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					help.setEnabled(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
			}});
		B77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(54);
				if (cmpt.getValueAt(54)>=3) {
					cmpt.setValueAt(54, 0);
				}
				moves.push(gAff.getValue(6, 6));
				row.push(6);
				col.push(6);
				gAff.setValue(6, 6, cmpt.getValueAt(54));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					help.setEnabled(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
			}});
		B78.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(55);
				if (cmpt.getValueAt(55)>=3) {
					cmpt.setValueAt(55, 0);
				}
				moves.push(gAff.getValue(6, 7));
				row.push(6);
				col.push(7);
				gAff.setValue(6, 7, cmpt.getValueAt(55));
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					help.setEnabled(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
				
			}});
		
		B81.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(56);
				if (cmpt.getValueAt(56)>=3) {
					cmpt.setValueAt(56, 0);
				}
				moves.push(gAff.getValue(7, 0));
				row.push(7);
				col.push(0);
				gAff.setValue(7, 0, cmpt.getValueAt(56));
				
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					help.setEnabled(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B82.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(57);
				if (cmpt.getValueAt(57)>=3) {
					cmpt.setValueAt(57, 0);
				}
				moves.push(gAff.getValue(7, 1));
				row.push(7);
				col.push(1);
				gAff.setValue(7, 1, cmpt.getValueAt(57));
				
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					help.setEnabled(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
					
				
			}});
		B83.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(58);
				if (cmpt.getValueAt(58)>=3) {
					cmpt.setValueAt(58, 0);
				}
				moves.push(gAff.getValue(7, 2));
				row.push(7);
				col.push(2);
				gAff.setValue(7, 2, cmpt.getValueAt(58));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					help.setEnabled(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B84.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(59);
				if (cmpt.getValueAt(59)>=3) {
					cmpt.setValueAt(59, 0);
				}
				moves.push(gAff.getValue(7, 3));
				row.push(7);
				col.push(3);
				gAff.setValue(7, 3, cmpt.getValueAt(59));
				
					
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					help.setEnabled(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
			}});
		B85.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(60);
				if (cmpt.getValueAt(60)>=3) {
					cmpt.setValueAt(60, 0);
				}
				moves.push(gAff.getValue(7, 4));
				row.push(7);
				col.push(4);
				gAff.setValue(7, 4, cmpt.getValueAt(60));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					help.setEnabled(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B86.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(61);
				if (cmpt.getValueAt(61)>=3) {
					cmpt.setValueAt(61, 0);
				}
				moves.push(gAff.getValue(7, 5));
				row.push(7);
				col.push(5);
				gAff.setValue(7, 5, cmpt.getValueAt(61));
				
					
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					help.setEnabled(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
				
			}});
		B87.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(62);
				if (cmpt.getValueAt(62)>=3) {
					cmpt.setValueAt(62, 0);
				}
				moves.push(gAff.getValue(7, 6));
				row.push(7);
				col.push(6);
				gAff.setValue(7, 6, cmpt.getValueAt(62));
				
					
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					help.setEnabled(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}
					
				
			}});
		B88.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpt.incrValueAt(63);
				if (cmpt.getValueAt(63)>=3) {
					cmpt.setValueAt(63, 0);
				}
				moves.push(gAff.getValue(7, 7));
				row.push(7);
				col.push(7);
				gAff.setValue(7, 7, cmpt.getValueAt(63));
				
					
				
				if (gAff.compGrille(grille) || gAff.checkAll()) {
					lblNewLabel.setVisible(true);
					reset.setEnabled(false);
					annuler.setEnabled(false);
					table.setVisible(false);
					B11.setVisible(false);
					B12.setVisible(false);
					B13.setVisible(false);
					B14.setVisible(false);
					B15.setVisible(false);
					B16.setVisible(false);
					B17.setVisible(false);
					B18.setVisible(false);
					B21.setVisible(false);
					B22.setVisible(false);
					B23.setVisible(false);
					B24.setVisible(false);
					B25.setVisible(false);
					B26.setVisible(false);
					B27.setVisible(false);
					B28.setVisible(false);
					B31.setVisible(false);
					B32.setVisible(false);
					B33.setVisible(false);
					B34.setVisible(false);
					help.setEnabled(false);
					B35.setVisible(false);
					B36.setVisible(false);
					B37.setVisible(false);
					B38.setVisible(false);
					B41.setVisible(false);
					B42.setVisible(false);
					B43.setVisible(false);
					B44.setVisible(false);
					B45.setVisible(false);
					B46.setVisible(false);
					B47.setVisible(false);
					B48.setVisible(false);
					B51.setVisible(false);
					B52.setVisible(false);
					B53.setVisible(false);
					B54.setVisible(false);
					B55.setVisible(false);
					B56.setVisible(false);
					B57.setVisible(false);
					B58.setVisible(false);
					B61.setVisible(false);
					B62.setVisible(false);
					B63.setVisible(false);
					B64.setVisible(false);
					B65.setVisible(false);
					B66.setVisible(false);
					B67.setVisible(false);
					B68.setVisible(false);
					B71.setVisible(false);
					B72.setVisible(false);
					B73.setVisible(false);
					B74.setVisible(false);
					B75.setVisible(false);
					B76.setVisible(false);
					B77.setVisible(false);
					B78.setVisible(false);
					B81.setVisible(false);
					B82.setVisible(false);
					B83.setVisible(false);
					B84.setVisible(false);
					B85.setVisible(false);
					B86.setVisible(false);
					B87.setVisible(false);
					B88.setVisible(false);
				}	
				
			}});
		
		
		frame.getContentPane().add(table);
		
		JButton Quitter = new JButton("Quitter");
		Quitter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Quitter.setBounds(589, 663, 578, 33);
		frame.getContentPane().add(Quitter);
		
		Quitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Selection r = new Selection();
				r.main(null);
				frame.dispose();
			}
		});
		
		
	
		
		
		
		
		
	}
}
