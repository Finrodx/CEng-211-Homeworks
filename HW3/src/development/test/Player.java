
/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

*/

package development.test;

public class Player {
		
	//records player's location	
		private Cell currentCell;
		private Row currentRow;
		
		
		
		public Player(Row currentRow, Cell currentCell) {
			super();
			this.currentCell = currentCell;
			this.currentRow = currentRow;
			
		}



		@Override
		public String toString() {
			return "Player [currentCell=" + currentCell + ", currentRow=" + currentRow + "]";
		}



		public Cell getCurrentCell() {
			return currentCell;
		}



		public void setCurrentCell(Cell currentCell) {
			this.currentCell = currentCell;
		}



		public Row getCurrentRow() {
			return currentRow;
		}



		public void setCurrentRow(Row currentRow) {
			this.currentRow = currentRow;
		}
	
		
		





		
}
