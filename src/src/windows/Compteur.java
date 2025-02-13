package windows;

public class Compteur {
	
	public static final int TM = 65;
	private int[] compteur;

	public Compteur() {
		this.compteur = new int[TM];
		for(int i = 0 ; i != this.compteur.length ; i++) {
			this.compteur[i] = 0;
		}
	}
	
	public void reset() {
		for(int i = 0 ; i != this.compteur.length ; i++) {
			this.compteur[i] = 0;
		}
	}
	
	public int getValueAt(int ligne) {
		return this.compteur[ligne];
	}
	
	public void setValueAt(int ligne , int value) {
		this.compteur[ligne] = value;
	}
	
	public void incrValueAt(int ligne) {
		this.compteur[ligne]++;
	}
	
	public void decrValueAt(int ligne) {
		this.compteur[ligne]--;
	}

}
