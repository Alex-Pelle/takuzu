package windows;


public class Pile {
	
	private static final int TM = 1000;
	private Object[] table;

	public Pile() {
		this.table = new Object[TM];
		for(int col = 0 ; col < this.table.length ; col++) {
			this.table[col] = null;
		}
	}
	
	public void resetPile() {
		for(int col = 0 ; col < this.table.length ; col++) {
			this.table[col] = null;
		}
	}
	
	public int countNull() {
		int[] cmpt = {0};
		for(int col = 0 ; col < this.table.length ; col++) {
			if (this.table[col] == null) {
				cmpt[0]++;
			}
		}
		return cmpt[0];
	}
	
	public int countItem() {
		int[] cmpt = {0};
		for(int col = 0 ; col < this.table.length ; col++) {
			if (this.table[col] != null) {
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
	
	public void push(Object obj) {
		if (this.countNull() != 0) {
			this.table[this.countItem()] = obj;
			System.out.println(this.countItem());
		} else {
			this.popFirst();
			for(int col = 0 ; col < this.table.length-1 ; col++) {
				this.table[col] = this.table[col+1];
			}
			
			System.out.println(this.countItem());
			this.table[this.countItem()-1] = obj;
		}
	}
	
	public void popFirst() {
		if (!this.isEmpty()) {
			this.table[0] = null;
		}
		
	}
	
	
	public void popLast() {
		if (this.countNull() > 0) {
			this.table[this.countItem()-1] = null;
		}
		System.out.println(this.countItem());
		
	}
	
	public Object getLast() {
		System.out.println(this.countItem());
		return this.table[this.countItem()-1];
		
	}
	

}
