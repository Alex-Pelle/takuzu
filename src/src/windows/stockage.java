package windows;

public class stockage {

	public stockage() {
		// TODO Auto-generated constructor stub
	}
	
	/*public int countLineZERO(int ligne) {
		int cmpt = 0;
		for(int i = 0 ; i != this.table.getColumnCount() ; i++) {
			if (this.table.getValueAt(ligne, i) == ZERO) {
				cmpt++;
			}
		}
		return cmpt;
		
	}
	
	public int countColZERO(int col) {
		int cmpt = 0;
		for(int i = 0 ; i != this.table.getRowCount() ; i++) {
			if (this.table.getValueAt(i , col) == ZERO) {
				cmpt++;
			}
		}
		return cmpt;
		
	}
	
	public int countLineUN(int ligne) {
		int cmpt = 0;
		for(int i = 0 ; i != this.table.getColumnCount() ; i++) {
			if (this.table.getValueAt(ligne, i) == UN) {
				cmpt++;
			}
		}
		System.out.println(cmpt+"ZERO");
		return cmpt;
		
	}
	
	public int countColUN(int col) {
		int cmpt = 0;
		for(int i = 0 ; i != this.table.getRowCount() ; i++) {
			if (this.table.getValueAt(i , col) == UN) {
				cmpt++;
			}
		}
		System.out.println(cmpt+"UN");
		return cmpt;
		
	}
	
	public int countVide() {
		int cmpt = 0;
		for (int i = 0 ; i != this.table.getColumnCount() ; i++) {
			for (int j = 0 ; j != this.table.getRowCount() ; j++) {
				if (this.table.getValueAt(j, i) == VIDE) {
					cmpt++;
				}
			}
		}
		System.out.println("count grille");
		return cmpt;
	}
	
	public int countLineVide(int ligne) {
		int cmpt = 0;
		for (int j = 0 ; j != this.table.getColumnCount() ; j++) {
			if (this.table.getValueAt(ligne, j) == VIDE) {
				cmpt++;
			}
		}
		return cmpt;
	}
	
	public int countColVide(int col) {
		int cmpt = 0;
		for (int j = 0 ; j != this.table.getRowCount() ; j++) {
			if (this.table.getValueAt(j, col) == VIDE) {
				cmpt++;
			}
		}
		return cmpt;
	}
	
	public boolean isLineEqual(int ligne1 , int ligne2) {
		if (ligne1 == ligne2) {
			return true;
		}
		for (int i = 0 ; i != this.table.getColumnCount() ; i++) {
			if (this.table.getValueAt(ligne1, i) != this.table.getValueAt(ligne2, i)) {
				System.out.println("line equal");
				return false;
			}
		}
		System.out.println("line inequal");
		return true;
	}
	
	public boolean isColEqual(int col1 , int col2) {
		if (col1 == col2) {
			return true;
		}
		for (int i = 0 ; i != this.table.getRowCount() ; i++) {
			if (this.table.getValueAt(i, col1) != this.table.getValueAt(i, col2)) {
				return false;
			}
		}
		return true;
		
	}
	
	public boolean isGrilleComplete() {
		if (this.countVide() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isLineComplete(int ligne) {
		if (this.countLineVide(ligne) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isColComplete(int col) {
		if (this.countColVide(col) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isDoubleLine(int ligne , int col) {
		if(col <= 1 || col >= 6 || ligne <= 1 || ligne >= 6) {
			System.out.println("is double line");
			return false;
			
		}
		if(this.table.getValueAt(ligne, col-1) == this.table.getValueAt(ligne, col-2) || 
				this.table.getValueAt(ligne, col+1) == this.table.getValueAt(ligne, col+2)) {
			System.out.println("is double line true");
			return true;
		} else {
			System.out.println("is double line false");
			return false;
		}
	}
	
	public boolean isDoubleCol(int ligne , int col) {
		if(ligne <= 1 || ligne >= 6 || col <= 1 || col >= 6) {
			System.out.println("is double col");
			return false;
		}
		if(this.table.getValueAt(ligne-1, col) == this.table.getValueAt(ligne-2, col) || 
				this.table.getValueAt(ligne+1, col) == this.table.getValueAt(ligne+2, col)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSandwichLine(int ligne , int col) {
		if(col == 0 || col == 7 || ligne == 0 || ligne == 7) {
			System.out.println("is sandwich line");
			return false;
		}
		if(this.table.getValueAt(ligne, col-1) == this.table.getValueAt(ligne, col+1)) {
			System.out.println("is sandwich line true");
			return true;
		} else {
			System.out.println("is sandwich line false");
			return false;
		}
	}
	
	public boolean isSandwichCol(int ligne , int col) {
		if(ligne == 0 || ligne == 7 || col == 0 || col == 7) {
			return false;
		}
		if(this.table.getValueAt(ligne-1, col) == this.table.getValueAt(ligne+1, col)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isCellEmpty(int ligne, int col) {
		if (this.table.getValueAt(ligne, col) == VIDE) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setValue(int ligne , int col , int cmpt) {
		if(cmpt == 0) {
			this.table.setValueAt(VIDE, ligne, col);
		} else if (cmpt == 1) {
			this.table.setValueAt(ZERO, ligne, col);
		} else {
			this.table.setValueAt(UN, ligne, col);
		}
	}
	
	public void setInverse(int ligne, int col, Object value) {
		if(value == ZERO) {
			System.out.println("set inverse un");
			this.table.setValueAt(UN, ligne, col);
		} else if (value == UN) {
			System.out.println("set inverse zero");
			this.table.setValueAt(ZERO, ligne, col); 
		} 
			
	}
	
	public void fillOpposeLine(int ligne) {
		if (this.countLineZERO(ligne)==this.table.getColumnCount()/2) {
			for(int i = 0; i != this.table.getColumnCount() ; i++) {
				if (this.table.getValueAt(ligne, i) == VIDE) {
					this.table.setValueAt(UN, ligne, i);
				}
			}
		} else if (this.countLineUN(ligne)==this.table.getColumnCount()/2) {
			for(int i = 0; i != this.table.getColumnCount() ; i++) {
				if (this.table.getValueAt(ligne, i) == VIDE) {
					this.table.setValueAt(ZERO, ligne, i);
				}
			}
		}
	}
	
	public void fillOpposeCol(int col) {
		if (this.countColZERO(col)==this.table.getRowCount()/2) {
			for(int i = 0; i != this.table.getRowCount() ; i++) {
				if (this.table.getValueAt(i, col) == VIDE) {
					this.table.setValueAt(UN, i, col);
				}
			}
		} else if (this.countColUN(col)==this.table.getRowCount()/2) {
			for(int i = 0; i != this.table.getRowCount() ; i++) {
				if (this.table.getValueAt(i, col) == VIDE) {
					this.table.setValueAt(ZERO, i, col);
				}
			}
		}
	}
	
	public void resetGrille() {
		for (int i = 0 ; i != this.table.getColumnCount() ; i++) {
			for (int j = 0 ; j != this.table.getRowCount() ; j++) {
				this.table.setValueAt(VIDE, j, i);
				System.out.println("reset grille");
			}
		}
	}
	
	public void resetLine(int ligne) {
		for (int j = 0 ; j != this.table.getColumnCount() ; j++) {
			this.table.setValueAt(VIDE, ligne, j);
			System.out.println("reset line");
		}
	}
	
	public void resetCol(int col) {
		for (int j = 0 ; j != this.table.getRowCount() ; j++) {
			this.table.setValueAt(VIDE, j, col);
			System.out.println("reset col");
		}
	}
	
	public boolean detectSandwich() {
		for(int i = 0 ; i != this.table.getColumnCount() ; i++) {
			for (int j = 0; j !=this.table.getRowCount() ; j++) {
				if (this.isSandwichCol(i, j)) {
					return true;
				}
				if (this.isSandwichLine(i, j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void modifSandwich() {
		do {
			for(int i = 0 ; i != this.table.getColumnCount() ; i++) {
				for (int j = 0; j !=this.table.getRowCount() ; j++) {
					if (this.isSandwichCol(i, j)) {
						this.setInverse(i, j, this.table.getValueAt(j-1, i));
					}
					if (this.isSandwichLine(i, j)) {
						this.setInverse(i, j, this.table.getValueAt(j, i-1));
					}
				}
			}
		} while (!this.detectSandwich());
	}
	
	public boolean detectDouble() {
		for(int i = 0 ; i != this.table.getColumnCount() ; i++) {
			for (int j = 0; j !=this.table.getRowCount() ; j++) {
				if (this.isDoubleCol(i, j)) {
					return true;
				}
				if (this.isDoubleLine(i, j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void modifDouble() {
		do {
			for(int i = 0 ; i != this.table.getColumnCount() ; i++) {
				for (int j = 0; j !=this.table.getRowCount() ; j++) {
					if (this.isDoubleCol(i, j)) {
						this.setInverse(i, j, this.table.getValueAt(j-1, i));
					}
					if (this.isDoubleLine(i, j)) {
						this.setInverse(i, j, this.table.getValueAt(j, i-1));
					}
				}
			}
		} while (!this.detectDouble());
	}
	
	public boolean detectCompl() {
		for(int i = 0 ; i != this.table.getColumnCount() ; i++) {
			for (int j = 0; j !=this.table.getRowCount() ; j++) {
				if (this.countColUN(j) == this.table.getRowCount()/2) {
					System.out.println("1");
					return true;
				}
				if (this.countColZERO(j) == this.table.getRowCount()/2) {
					System.out.println("2");
					return true;
				}
				if (this.countLineUN(i) == this.table.getColumnCount()/2) {
					System.out.println("3");
					return true;
				}
				if (this.countLineZERO(i) == this.table.getColumnCount()/2) {
					System.out.println("4");
					return true;
				}
			}
		}
		System.out.println("5");
		return false;
	}
	
	public void complLigne() {
		do {
			System.out.println("compligne");
			for(int i = 0 ; i != this.table.getColumnCount() ; i++) {
				for (int j = 0; j !=this.table.getRowCount() ; j++) {
					if (this.countColUN(j) == this.table.getRowCount()/2) {
						this.fillOpposeCol(j);
						System.out.println("1");
					}
					if (this.countColZERO(j) == this.table.getRowCount()/2) {
						this.fillOpposeCol(j);
						System.out.println("2");
					}
					if (this.countLineUN(i) == this.table.getColumnCount()/2) {
						this.fillOpposeLine(i);
						System.out.println("ici");
					}
					if (this.countLineZERO(i) == this.table.getColumnCount()/2) {
						this.fillOpposeLine(i);
						System.out.println("là");
					}
				}
			}
		} while (!this.detectCompl());
	}
	
	public void modif() {
		do {
			System.out.println("modif");
			this.complLigne();
			this.modifDouble();
			this.modifSandwich();
		} while (!this.detectSandwich() && !this.detectCompl() && !this.detectDouble());
	}
	
	
	
	public boolean verif() {
		if (!this.detectDouble() && !this.detectSandwich() && !this.detectCompl()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean searchEqual() {
		for(int i = 0 ; i != this.table.getColumnCount() ; i++) {
			for (int j = 0; j !=this.table.getRowCount() ; j++) {
				if (this.isLineEqual(i, j)) {
					return true;
				}
				if (this.isColEqual(i, j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void genLine(int Ligne) {
		for(int i = 0; i != this.table.getColumnCount() ; i++) {
			if (this.isCellEmpty(Ligne, i)) {
				System.out.println(this.isCellEmpty(Ligne, i));
				if (this.verif()) {
					System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
					this.setValue(Ligne, i, getRNIR(1,2));
					System.out.println("random -----------------------");
				} else {
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					if (this.countLineUN(Ligne) == 4 || this.countLineZERO(Ligne) == 4) {
						this.fillOpposeLine(Ligne);
					} else {
						if (this.detectDouble() && i > 2 && i < 6) {
							System.out.println("bite");
							this.setInverse(Ligne, i, this.table.getValueAt(Ligne, i-1));
						}
					}
				}
				
				//this.modif();
			}
		}
	}
	
	public void genGrille() {
		Takuzu annuler;
		this.resetGrille();
		this.genLine(0);
		/*for (int i = 0 ; i != this.table.getRowCount() ; i++) {
			System.out.println(i);
			annuler = new Takuzu(this.table);
			boolean sortie = true;
			do {
				System.out.println("gen grille");
				annuler.genLine(i);
				annuler.modif();
				if (!annuler.searchEqual()) {
					sortie = false;
					annuler.table = this.table;
					System.out.println("------------------------------------------------");
				} else {
					sortie = true;
					this.table = annuler.table;
					System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
				}
				
			} while (!sortie); 
		}
	}
		public boolean isLineFull(int row) {
		if (this.countLine(row, VIDE) == 0){
			return true;
		}
		return false;
	}
	
	public boolean isColumnFull(int column) {
		if (this.countCol(column, VIDE) == 0){
			return true;
		}
		return false;
	} */
	/*


	public void resetLigne(int row) {
		for (int column = 0 ; column < COL ; column++) {
			this.setValue(row, column, 0);
		}
	}
	
	public void resetColumn(int column) {
		for (int row = 0 ; row < COL ; row++) {
			this.setValue(row, column, 0);
		}
	}

	

	public int countLine(int row , Object value) {
		int[] compteur = {0};
			for(int i = 0 ; i < ROW ; i++) {
				if (this.table.getValueAt(row, i)==value) {
					compteur[0]++;
				}
			}
		return compteur[0];	
	}

	
	public int countCol(int col , Object value) {
		int[] compteur = {0};
		for(int i = 0 ; i < COL ; i++) {
			if (this.table.getValueAt(i, col)==value) {
				compteur[0]++;
			}
		}
		return compteur[0];
	}

	
	public boolean isLineFillable(int row) {
		if (this.countLine(row, UN) == MOITIE_ROW || 
				
				this.countLine(row, ZERO) == MOITIE_ROW) {
			return true;
		} 
		return false;
	}


	

	public void fillLine(int row) {
		if (this.countLine(row, UN) == MOITIE_COL) {
			int i = 0;
			while (!this.isLineFull(row) && i < COL) {
				if (this.isCellEmpty(row, i)) {
					this.setInverse(row, i, UN);
				}
				i++;
			}
				
		
		} else if (this.countLine(row, ZERO) == MOITIE_COL) {
			int i = 0;
			while (!this.isLineFull(row) && i < ROW) {
				if (this.isCellEmpty(row, i)) {
					this.setInverse(row, i, ZERO);
				}
				i++;
			}
		}
	}

	

	public void fillColumn(int column) {
		if (this.countCol(column, UN) == MOITIE_COL) {
			for(int i = 0 ; i < COL ; i++ ) {
				if (this.isCellEmpty(i, column)) {
					this.setInverse(i, column, UN);
				}
			}
		} else if (this.countCol(column, ZERO) == MOITIE_COL) {
			for(int i = 0 ; i < COL ; i++ ) {
				if (this.isCellEmpty(i, column)) {
					this.setInverse(i, column, ZERO);
				}
			}
		}
	}

	
	public void setValue(int row , int column , int entier) {
		if(entier == 0) {
			this.table.setValueAt(VIDE, row, column);
		} else if (entier == 1) {
			this.table.setValueAt(ZERO, row, column);
		} else {
			this.table.setValueAt(UN, row, column);
		}
	}
	

	public void setInverse(int row , int column , Object value) {
		if (value != VIDE) {
			if (value == ZERO) {
				this.table.setValueAt(UN, row, column);
			} else {
				this.table.setValueAt(ZERO, row, column);
			}
		}
	}


	public void sandwichVertical(int row , int column) {
		if (row > BORDURE_INF+1 && row < BORDURE_SUP-1) {
			if ((this.table.getValueAt(row-1, column) == this.table.getValueAt(row+1, column)) &&
					!this.detectVideColumnInRange(row, column, -1) &&
					!this.detectVideColumnInRange(row, column, 1)) {
				this.setInverse(row, column, this.table.getValueAt(row-1, column));
			}
		}
	}


	
	public boolean detectVideLineInRange(int row , int column,  int range) {
		if (this.table.getValueAt(row, column+range) == VIDE && row > BORDURE_INF+1 && row < BORDURE_SUP-1 && column > BORDURE_INF+1 && column < BORDURE_SUP-1) {
			return true;
		}
		return false;
	}

	

	public boolean detectVideColumnInRange(int row , int column,  int range) {
		if (this.table.getValueAt(row+range, column) == VIDE && row > BORDURE_INF+1 && row < BORDURE_SUP-1 && column > BORDURE_INF+1 && column < BORDURE_SUP-1) {
			return true;
		}
		return false;
	}



	public void sandwichHorizontal(int row , int column) {
		if (column > BORDURE_INF+1 && column < BORDURE_SUP-1) {
			if ((this.table.getValueAt(row, column-1) == this.table.getValueAt(row, column+1)) &&
					!this.detectVideLineInRange(row, column, 1) && !this.detectVideLineInRange(row, column, -1)) {
				this.setInverse(row, column, this.table.getValueAt(row, column-1));
			}
		}
	}

	

	public void doubleVertical(int row , int column) {
		if (row > BORDURE_INF+1 && row < BORDURE_SUP-1) {
			if ((this.table.getValueAt(row+1, column) == this.table.getValueAt(row+2, column)) &&
					this.detectVideColumnInRange(row, column, 1) &&
					this.detectVideColumnInRange(row, column, 2)) {
				this.setInverse(row, column, this.table.getValueAt(row+1, column));
			} else if ((this.table.getValueAt(row-1, column) == this.table.getValueAt(row-2, column))&&
					this.detectVideColumnInRange(row, column, -1) &&
					this.detectVideColumnInRange(row, column, -2)) {
				this.setInverse(row, column, this.table.getValueAt(row-1, column));
			}
		}
	}

	

	public void doubleHorizontal(int row , int column) {
		if (column > BORDURE_INF+1 && column < BORDURE_SUP-1) {
			if ((this.table.getValueAt(row, column+1) == this.table.getValueAt(row, column+2)) &&
					!this.detectVideLineInRange(row, column, 1) && !this.detectVideLineInRange(row, column, 2)) {
				this.setInverse(row, column, this.table.getValueAt(row, column+1));
			} else if ((this.table.getValueAt(row, column-1) == this.table.getValueAt(row, column-2)) &&
					!this.detectVideLineInRange(row, column, -1) && !this.detectVideLineInRange(row, column, -2)) {
				this.setInverse(row, column, this.table.getValueAt(row, column-1));
			}
		}

	}


	public boolean isSandwich(int row , int column) {
		if (row > BORDURE_INF+1 && row < BORDURE_SUP-1 && column > BORDURE_INF+1 && column < BORDURE_SUP-1) {
			if ((this.table.getValueAt(row-1, column) == this.table.getValueAt(row+1, column) && 
					!this.detectVideLineInRange(row, column, 1) &&
					!this.detectVideLineInRange(row, column, -1)) ||
					(this.table.getValueAt(row, column-1) == this.table.getValueAt(row, column+1) &&
					!this.detectVideColumnInRange(row, column, 1) &&
					!this.detectVideColumnInRange(row, column, -1))) {
				return true;
			}
		}


		return false;
	}


	public boolean isDouble(int row , int column) {

		if (row > BORDURE_INF+1 && row < BORDURE_SUP-1 && column > BORDURE_INF+1 && column < BORDURE_SUP-1) {
			System.out.println("ça bug là");
			if ((this.table.getValueAt(row-1, column) == this.table.getValueAt(row-2, column) &&
					!this.detectVideLineInRange(row, column, -1) &&
					!this.detectVideLineInRange(row, column, -2)) ||

					(this.table.getValueAt(row+1, column) == this.table.getValueAt(row+2, column) &&
					!this.detectVideLineInRange(row, column, 1) &&
					!this.detectVideLineInRange(row, column, 2)) ||

					(this.table.getValueAt(row, column-1) == this.table.getValueAt(row, column-2) &&
					!this.detectVideColumnInRange(row, column, -1) &&
					!this.detectVideColumnInRange(row, column, -2)) ||

					(this.table.getValueAt(row, column+1) == this.table.getValueAt(row, column+2) &&
					!this.detectVideColumnInRange(row, column, 1) &&
					!this.detectVideColumnInRange(row, column, 2))) {
				System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
				return true;
			}
		}


		return false;
	}



	public void fillDouble(int row , int column) {

		this.doubleHorizontal(row, column);
		this.doubleVertical(row, column);
	}




	

	public void fillSandwich(int row , int column) {

		this.sandwichHorizontal(row, column);
		this.sandwichVertical(row, column);
	}





	public void fillRowLine(int i) {
		this.fillColumn(i);
		this.fillLine(i);
	}



	
	public boolean isLineEqual(int row1 , int row2) {
		int[] column = {0};
		while (this.table.getValueAt(row1, column[0])==(this.table.getValueAt(row2, column[0])) && 
				column[0] < ROW-1) {
			column[0]++;
		}
		if (this.table.getValueAt(row1, column[0])==(this.table.getValueAt(row2, column[0]))) {
			return true;
		} else {
			return false;
		}
	}


	
	public boolean isColEqual(int column1 , int column2) {
		int row = 0;
		while (this.table.getValueAt(row, column1)==(this.table.getValueAt(row, column2)) && 
				row != COL ) {
			row++;
		}
		if (this.table.getValueAt(row, column1)==(this.table.getValueAt(row, column2))) {
			return true;
		} else {
			return false;
		}
	}

	public boolean searchEqual() {
		for(int value = 0 ; value != COL ; value++) {
			for (int value2 = 0 ; value2 != ROW ; value2++) {
				if (this.isColEqual(value, value2) || this.isLineEqual(value, value2)) {
					return true;
				}
			}
		}
		return false;
	}

	public void genLine(int row) {
		int column = 0;
		while (!this.isLineFull(row) && column < ROW) {	
			if (this.isLineFillable(row)) {
				for(int i = 0 ; i < ROW ; i++) {
					this.fillLine(row);
				}	
			} else {
				this.setValue(row, column, getRNIR(1,2));
				
				if (this.isDouble(row, column)) {
					this.fillDouble(row, column);
				}
				if (this.isSandwich(row, column)) {
					this.fillSandwich(row, column);
				}
			}
			column++;			
		}
	}
	
	




	public void genGrille() {
		this.resetGrille();
		for (int i = 0 ; i<ROW ; i++) {
			
			this.genLine(i);
		}
		
		for (int row1 = 0 ; row1<ROW ; row1++) {
			for (int row2 = 0 ; row2<ROW ; row2++) {
				if (this.isLineEqual(row1, row2) && row1 != row2) {
					this.resetLigne(row2);
					this.genLine(row2);
					row1 = 0;
					row2 = 0;
				}
			}
		}
		
		public void resetGrille() {
		for(int row = 0 ; row < ROW ; row++) {
			for (int column = 0 ; column < COL ; column++) {
				this.setValue(row, column, 0);
			}
		}
	}
	
	public boolean isCellEmpty(int row , int column) {
		if (this.table.getValueAt(row, column) == VIDE) {
			return true;
		}
		return false;
	}
	
	*/

}
