package windows;

import java.util.Random;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;


public class Takuzu6 {

	private JTable table;
	public static final String UN = "    X";
	public static final String ZERO = "    O";
	public static final String VIDE = "";
	public static final int T = 6;
	
	

	
	public Takuzu6(JTable table) {
		this.table = table;
		for(int i = 0 ; i < T ; i++) {
			for(int j = 0 ; j < T ; j++) {
				this.table.setValueAt(VIDE, j, i);
			}
		} 
	}
	
	public DefaultTableModel getTableModel() {
		return (DefaultTableModel)this.table.getModel();
	}
	
	
	
	public void copy(JTable tak) {
		this.table = tak;
	}

	/**
	 * 
	 * @param min
	 * @param max
	 * @return donne un nombre aléatoire compris entre le paramètre min et max
	 */
	
	private static int getRNIR(int min, int max) {

		if (min >= max) {
			throw new ArithmeticException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	public void resetGrille() {
		for(int i = 0 ; i < T ; i++) {
			for(int j = 0 ; j < T ; j++) {
				this.table.setValueAt(VIDE, j, i);
			}
		} 
	}
	
	public void resetLine(int row) {
		for(int j = 0 ; j < T ; j++) {
			this.table.setValueAt(VIDE, row, j);
		}
	}
	
	public void resetColumn(int column) {
		for(int j = 0 ; j < T ; j++) {
			this.table.setValueAt(VIDE, j, column);
		}
	}
	
	public void setValue(int row , int column, int value) {
		switch (value) {
			case 0 :
				this.table.setValueAt(VIDE, row, column);
				break;
			case 1 : 
				this.table.setValueAt(ZERO, row, column);
				break;
			case 2 :
				this.table.setValueAt(UN, row, column);
				break;
			default : 
				break;
		}
			
	}
	
	public void setValueString(int row , int column, String value) {
		
			if (value == VIDE) {
				this.table.setValueAt(VIDE, row, column);
			}	
			if (value == ZERO) {
				this.table.setValueAt(ZERO, row, column);
			}	
			if (value == UN) {
				this.table.setValueAt(UN, row, column);
			}
	}
	
	public void setInverse(int row , int column , String value) {
		switch (value) {
			case UN : 
				this.table.setValueAt(ZERO, row, column);
				break;
			case ZERO : 
				this.table.setValueAt(UN, row, column);
				break;
			default : 
				break;
		}
	}
	
	public int countLine(int row, String value) {
		int[] cmpt = {0};
		for(int col = 0 ; col < T ; col++) {
			if (this.table.getValueAt(row, col)==value) {
				cmpt[0]++;
			}
		}
		return cmpt[0];
	}
	
	public int countColumn(int column, String value) {
		int[] cmpt = {0};
		for(int row = 0 ; row < T ; row++) {
			if (this.table.getValueAt(row, column)==value) {
				cmpt[0]++;
			}
		}
		return cmpt[0];
	}
	
	public boolean isTripleLine(int row , int column) {
		if (column < T-2) {
			if(this.table.getValueAt(row, column) == this.table.getValueAt(row, column+1) && 
					this.table.getValueAt(row, column+1) == this.table.getValueAt(row, column+2)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}	
	}
	
	public boolean isTripleLineLoop(int row) {
		for(int column = 0; column < T;) {
			if (column < T-2) {
				if(this.table.getValueAt(row, column) == this.table.getValueAt(row, column+1) && 
						this.table.getValueAt(row, column+1) == this.table.getValueAt(row, column+2)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}	
		}
		return false;
	}
	
	
	
	public boolean isTripleColLoop(int column) {
		for(int row = 0; row < T;) {
			if (row < T-2) {
				if(this.table.getValueAt(row, column) == this.table.getValueAt(row+1, column) && 
						this.table.getValueAt(row+1, column) == this.table.getValueAt(row+2, column)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}	
		}
		return false;
	}
	
	
	public boolean isTripleCol(int row , int column) {
		if (row < T-2) {
			if(this.table.getValueAt(row, column) == this.table.getValueAt(row+1, column) && 
					this.table.getValueAt(row+1, column) == this.table.getValueAt(row+2, column)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	public boolean isDoubleLine(int row , int column) {
		if (column > 1) {
			if(this.table.getValueAt(row, column-1) == this.table.getValueAt(row, column-2)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	public boolean isDoubleCol(int row , int column) {
		if (row > 1 && row < T) {
			if(this.table.getValueAt(row, column) == this.table.getValueAt(row-1, column) &&
					this.table.getValueAt(row, column) != VIDE &&
					this.table.getValueAt(row-1, column) != VIDE) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	public void fillSandwichLine(int row , int column) {
		if (this.isTripleLine(row, column)) {
			this.setInverse(row, column+1, (String)this.table.getValueAt(row, column));
		}
	}
	
	public void fillSandwichCol(int row , int column) {
		if (this.isTripleCol(row, column)) {
			this.setInverse(row+1, column, (String)this.table.getValueAt(row, column));
		}
	}
	
	public void fillDoubleLine(int row , int column) {
		if (this.isTripleLine(row, column)) {
			this.setInverse(row, column+2, (String)this.table.getValueAt(row, column));
		}
	}
	
	public void fillDoubleCol(int row , int column) {
		if (this.isTripleCol(row, column)) {
			this.setInverse(row+2, column, (String)this.table.getValueAt(row, column));
		}
	}
	
	public void fillLine(int row) {
		if (this.countLine(row, UN)!=this.countLine(row, ZERO)) {
			
			int[] cmpt = {0,0};
			if (this.countLine(row, ZERO) >= T/2) {
				while (cmpt[0] < T/2) {
					if (this.table.getValueAt(row, cmpt[1])==ZERO) {
						cmpt[0]++;
					}
					cmpt[1]++;
					System.out.println(cmpt[1]);
				}
				if (cmpt[1]<T) {
					for(int y = cmpt[1];y<T;y++) {
						this.setInverse(row, y, ZERO);
					}
				}	
			} else if (this.countLine(row, UN) >= T/2) {
				while (cmpt[0] < T/2) {
					if (this.table.getValueAt(row, cmpt[1])==UN) {
						cmpt[0]++;
					}
					cmpt[1]++;
				}
				if(cmpt[1]<T) {
					for(int y = cmpt[1];y<T;y++) {
						this.setInverse(row, y, UN);
					}
				}
			}
		}
	}
	
	public void fillColumn(int column) {
		if (this.countColumn(column, UN)!=this.countColumn(column, ZERO)) {
			int[] cmpt = {0,0};
			if (this.countColumn(column, ZERO) >= T/2) {
				while (cmpt[0] < T/2) {
					if (this.table.getValueAt(cmpt[1], column)==ZERO) {
						cmpt[0]++;
					}
					cmpt[1]++;
				}
				if (cmpt[1]<T) {
					for(int y = cmpt[1];y<T;y++) {
						this.setInverse(y, column, UN);
					}
				}	
			} else if (this.countColumn(column, UN) >= T/2) {
				while (cmpt[0] < T/2) {
					if (this.table.getValueAt(cmpt[1], column)==UN) {
						cmpt[0]++;
					}
					cmpt[1]++;
				}
				if(cmpt[1]<T) {
					for(int y = cmpt[1];y<T;y++) {
						this.setInverse(y, column, ZERO);
					}
				}
			}
		}
	}
	
	public boolean isLineEqual(int row1, int row2) {
		int column = 0;
		if (row1 == row2) {
			return false;
		} else {
			
			while (this.table.getValueAt(row1, column)==this.table.getValueAt(row2, column) && column<T-1) {
				column++;
			}
			if (this.table.getValueAt(row1, column)==this.table.getValueAt(row2, column)) {	
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean isColEqual(int column1, int column2) {
		int row = 0;
		if (column1 == column2) {
			return false;
		} else {
			while (this.table.getValueAt(row, column1)==this.table.getValueAt(row, column2) && row<T-1) {
				row++;
			}
			if (this.table.getValueAt(row, column1)==this.table.getValueAt(row, column2)) {
				return true;
			} else {
				return false;
			}
		}
		
	}
	
	public boolean searchEqualLine() {
		for(int row1 = 0 ; row1<T ; row1++) {
			for(int row2 = 0 ; row2<T ; row2++) {
				if (this.isLineEqual(row1, row2)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean searchEqualCol() {
		for(int col1 = 0 ; col1<T ; col1++) {
			for(int col2 = 0 ; col2<T ; col2++) {
				if (this.isColEqual(col1, col2)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isBalancedLine() {
		int row = 0;
		while (this.countLine(row, UN) == this.countLine(row, ZERO) && row < T-1) {
			row++;
		}
		if (this.countLine(row, UN) == this.countLine(row, ZERO)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getValue(int row , int column) {
		return (String)this.table.getValueAt(row, column);
	}
	
	public boolean isBalancedCol() {
		int column = 0;
		while (this.countColumn(column, UN) == this.countColumn(column, ZERO) && column < T-1) {
			column++;
		}
		if (this.countColumn(column, UN) == this.countColumn(column, ZERO)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkTripleLine() {
		for(int column = 0; column < T ; column++) {
			for(int row = 0; row < T ; row++) {
				if (this.isTripleLine(row, column)) {
					return true;
				}
			}	
		}
		return false;
	}
	public boolean checkTripleSingleLine(int row) {
		for(int column = 0; column < T ; column++) {
			if (this.isTripleLine(row, column)) {
				return true;
			}	
		}
		return false;
	}
	
	public boolean checkTripleCol() {
		for(int column = 0; column < T ; column++) {
			for(int row = 0; row < T ; row++) {
				if (this.isTripleCol(row, column)) {
					return true;
				}
			}	
		}
		return false;
	}
	public boolean checkTripleSingleCol(int column) {
		for(int row = 0; row < T ; row++) {
			if (this.isTripleCol(row, column)) {
				return true;
			}	
		}
		return false;
	}
	
	public boolean isHorizontalCorrect() {
		if (!this.checkTripleLine() && !this.searchEqualLine() && this.isBalancedLine()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isVerticalCorrect() {
		if (!this.checkTripleCol() && !this.searchEqualCol() && this.isBalancedCol()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isCellEmpty(int row , int column) {
		if (this.table.getValueAt(row, column)== VIDE) {
			return true;
		} else {
			return false;
		}
	}
	
	public void switchLine(int row, int col) {
		String c = this.getValue(row, col);
		this.setValueString(row, col, this.getValue(row, col-1));
		this.setValueString(row, col-1, c);
	}
	
	public void switchCol(int row, int col) {
		String c = this.getValue(row, col);
		this.setValueString(row, col, this.getValue(row-1, col));
		this.setValueString(row-1, col, c);
	}
	
	public void genLine(int row) {
		do {
			for(int column = 0; column<T ; column++) {
				if (this.isCellEmpty(row, column)) {
					if (this.isDoubleCol(row, column)) {
						this.setInverse(row, column, (String)this.table.getValueAt(row-1, column));
					}else {
						this.setValue(row, column, getRNIR(1,2));
					}
				}
				
			}
			this.fillLine(row);
			
			for(int row1 = 0 ; row1<T ; row1++) {
				for(int row2 = 0 ; row2<T ; row2++) {
					if (this.isLineEqual(row1, row2)) {
						this.resetLine(row2);
						this.genLine(row2);
					}
				}
			}
		} while (!this.isBalancedLine() || this.checkTripleSingleLine(row) || this.searchEqualLine());
	}
	
	public void genCase(int row, int column) {
		
		
		if (this.isCellEmpty(row, column)) {
			
			if (this.isDoubleLine(row, column)) {
				this.setInverse(row, column, this.getValue(row, column-1));
			} else {
				System.out.println(this.countLine(row, UN));
				System.out.println(this.countLine(row, ZERO));
				if (this.countLine(row, UN) == 4) {
					this.setValueString(row, column, ZERO);
				} else if (this.countLine(row, ZERO) == 4) {
					this.setValueString(row, column, UN);
				} else {
					if (this.countLine(row, VIDE) == T/2 & this.countLine(row, UN) == 3) {
						this.setValueString(row, column, ZERO);
					} else if (this.countLine(row, VIDE) == T/2 & this.countLine(row, ZERO) == 3) {
						this.setValueString(row, column, UN);
					} else {
						this.setValue(row, column, getRNIR(1,2));
					}
					
				}
			}
		}
		if (this.isDoubleCol(row, column) && row < T-1 && this.isCellEmpty(row+1, column)) {
			this.setInverse(row+1, column, this.getValue(row, column));
		}
	}

	public void genGrille() {
		do {
			this.resetGrille();
			for(int row = 0; row<T ; row++) { 
				for(int col = 0; col<T ; col++) {
					this.genCase(row, col);
					
				}
			}
		} while (!this.isVerticalCorrect() || !this.isHorizontalCorrect());				
	}
	
	public void randomAffichage(Takuzu6 tak) {
		this.resetGrille();
		tak.genGrilleFromFile();
		for(int row = 0; row<T ; row++) { 
			for(int col = 0; col<T ; col++) {
				if (getRNIR(0,1) == getRNIR(0,2)) {
					this.setValueString(row, col, tak.getValue(row, col));
				} else {
					this.setValueString(row, col, VIDE);
				}
			}
		}
		
	}
	
	public boolean comparaisonLine(int row) {
		if (this.isTripleLineLoop(row) || this.countLine(row, UN) > T/2 || this.countLine(row, ZERO) > T/2) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean comparaisonCol(int col) {
		if (this.isTripleColLoop(col) || this.countLine(col, UN) > T/2 || this.countLine(col, ZERO) > T/2) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isGrillComplète() {
		for (int row = 0 ; row < T ; row++) {
			for (int col = 0 ; col < T; col++) {
				if (this.getValue(row, col)==VIDE) {
					return false;
				}
			}
		}
		return true;
	}
	
	public void help(Takuzu6 tak) {
		boolean sortie = true;
		while (sortie) {
			int row = getRNIR(0,T-1);
			int col = getRNIR(0,T-1);
			if (this.getValue(row, col) == VIDE) {
				this.setValueString(row, col, tak.getValue(row, col));
				sortie = false;
			}
		}	
	}
	
	public boolean checkAll() {
		if (this.isGrillComplète()) {
			for (int row = 0 ; row < T ; row++) {
				for (int col = 0 ; col < T; col++) {
					if (this.isTripleColLoop(col) || 
							this.isTripleLineLoop(row) ||
							this.countColumn(col, UN)>T/2 ||
							this.countColumn(col, ZERO)>T/2 ||
							this.countLine(row, UN)>T/2 ||
							this.countLine(row, ZERO)>T/2 ||
							this.searchEqualLine() ||
							this.searchEqualCol()) {
						return false;
					}
				} 
			}
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean compGrille(Takuzu6 tak) {
		for (int row = 0 ; row < T ; row++) {
			for (int col = 0 ; col < T; col++) {
				if(this.table.getValueAt(row, col)!=tak.table.getValueAt(row, col)) {
					return false;
				}
			} 
		}
		return true;
	}
	
	@Override
	public String toString() {
		this.genGrille();
		String s = "";
		for(int row = 0 ; row < T ; row++) {
			for(int col = 0 ; col < T ; col++) {
				if (this.getValue(row, col)==ZERO) {
					s += '0';
				} else {
					s += '1';
				}
			}
		}
		return s;
	}
	
public void genGrilleFromFile() {
		
		int i;
	    String line = new String();
	    int random = getRNIR(1,2214);

	    try {
	      //lire le fichier file.txt
	      FileReader file = new FileReader("./src/Takuzu_lib/takliste6.txt");
	      BufferedReader buffer = new BufferedReader(file);
	    
	      // parcourir le fichier
	      for (i = 1; i < random+1; i++) {
	        // Si le numéro de la ligne = 5 récupérer la ligne
	        if (i == random)
	          line = buffer.readLine();
	        else
	          buffer.readLine();
	      }
	      int y = 0;
		    for(int row = 0 ; row < T ; row++) {
				for(int col = 0 ; col < T ; col++) {
					if (line.charAt(y) == '0') {
						this.setValueString(row, col, ZERO);
					} else {
						this.setValueString(row, col, UN);
					}
					y++;
				}
			}
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	
	
	
	
}



