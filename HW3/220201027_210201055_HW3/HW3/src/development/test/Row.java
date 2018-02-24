
/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

*/

package development.test;

//holds cells list which are in same line
import java.util.ArrayList;

public class Row {
	
	private ArrayList<Cell> cells;

	public Row(ArrayList<Cell> cells) {
		super();
		this.cells = cells;
	}

	public ArrayList<Cell> getCells() {
		return cells;
	}

	public void setCells(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	public int getRowSize() {
		return cells.size();
	}
	
	
	@Override
	public String toString() {
		return "Row [cells=" + cells + "]";
	}

	public void add(Cell cell) {
		cells.add(cell);
		
	}

	
}
