package windows;

public class PileInt {
	
	private static final int TM = 1000;
	private int[] table;


	public PileInt() {
		this.table = new int[TM];
		for(int col = 0 ; col < this.table.length ; col++) {
			this.table[col] = -1;
		}
	}

	public void resetPile() {
		for(int col = 0 ; col < this.table.length ; col++) {
			this.table[col] = -1;
		}
	}

	public int countNull() {
		int[] cmpt = {0};
		for(int col = 0 ; col < this.table.length ; col++) {
			if (this.table[col] == -1) {
				cmpt[0]++;
			}
		}
		return cmpt[0];
	}

	public boolean isEmpty() {
		if (this.countItem() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int countItem() {
		int[] cmpt = {0};
		for(int col = 0 ; col < this.table.length ; col++) {
			if (this.table[col] != -1) {
				cmpt[0]++;
			}
		}
		return cmpt[0];
	}

	public void push(int value) {
		if (this.countNull() > 0) {
			this.table[this.countItem()] = value;
		} else {
			this.popFirst();
			for(int col = 0 ; col < this.table.length-1 ; col++) {
				this.table[col] = this.table[col+1];
			}
			System.out.println(this.countItem());
			this.table[this.countItem()-1] = value;
		}
	}

	public void popFirst() {
		if (!this.isEmpty()) {
			this.table[0] = -1;
		}

	}

	public void popLast() {
		if (this.countNull() > 0) {
			this.table[this.countItem()-1] = -1;
		}

	}

	public int getLast() {
		return this.table[this.countItem()-1];
	}



}


