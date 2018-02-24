
/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

*/


package development.test;


public class Cell {		//class that holds cells basic operations and attributes
	
	private CellComponents left;
	private CellComponents right;
	private CellComponents up;
	private CellComponents down;
	

	public Cell(CellComponents left, CellComponents right, CellComponents up, CellComponents down) {

		setLeft(left);
		setRight(right);
		setUp(up);
		setDown(down);
	}

	

	@Override
	public String toString() {
		return "Cell [left=" + left + ", right=" + right + ", up=" + up + ", down=" + down + "]";
	}



	public CellComponents getLeft() {
		return left;
	}


	public void setLeft(CellComponents left) {
		if (left == null) {
			this.left = CellComponents.WALL;
		}
		else {
		this.left = left;
	}
	}

	public CellComponents getRight() {
		return right;
	}


	public void setRight(CellComponents right) {
		if (right == null) {
			this.right = CellComponents.WALL;
		}
		else {
		this.right = right;
	}
	}

	public CellComponents getUp() {
		return up;
	}


	public void setUp(CellComponents up) {
		if(up == null) {

		this.up = CellComponents.WALL;
	}
	else {
		this.up = up;
	}
	}


	public CellComponents getDown() {
		return down;
	}


	public void setDown(CellComponents down) {
		if (down == null) {
			this.down = CellComponents.WALL;
		}
		else {
		this.down = down;
	}}

	
	
	

	
	
	

	
	
}
