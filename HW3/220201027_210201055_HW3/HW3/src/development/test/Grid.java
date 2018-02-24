
/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

*/


package development.test;

//holds rowslist
import java.util.ArrayList;
import java.util.Random;

public class Grid {

	private ArrayList<Row> rows;

	public Grid(ArrayList<Row> rows) {
		super();
		this.rows = rows;
	}

	public ArrayList<Row> getRows() {
		return rows;
	}

	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}


	public int getGridSize() {
		return rows.size();
	}

	public void add(Row row) {
		rows.add(row);

	}

	@Override
	public String toString() {
		return "Grid [rows=" + rows + "]";
	}




}










