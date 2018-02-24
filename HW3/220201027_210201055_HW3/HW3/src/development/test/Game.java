
/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

 */


package development.test;

import java.util.ArrayList;
import java.util.Random;




public class Game {


	private Grid grid;


	public Game(Grid grid) {

		this.grid = grid;	
	}



	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}



	@Override
	public String toString() {
		return "Game [grid=" + grid + "]";
	}

	static Random rand = new Random();		
	static int gridSize = rand.nextInt(4) + 3;
	static int randExitLoc =rand.nextInt(gridSize);


	public void createGrid() { //first creates edges then checks given rules

		ArrayList<Cell> cellList = new ArrayList<>();
		ArrayList<Row> rowList = new ArrayList<>();
		ArrayList<Grid> gridList = new ArrayList<>();

		int i = 0;
		boolean flag = false;



		while (gridSize != rowList.size()) {


			int j = 0;
			while (gridSize != cellList.size() ) {
				Cell cell1 = new Cell(CellComponents.getRandomCellComponents(),CellComponents.getRandomCellComponents(),CellComponents.getRandomCellComponents(),CellComponents.getRandomCellComponents());

				//created a random cell

				if ((cell1.getUp() == CellComponents.EXIT  || cell1.getDown()== CellComponents.EXIT  || cell1.getRight()== CellComponents.EXIT  || cell1.getLeft()== CellComponents.EXIT )) {
					flag = true;

					//checked if created cell has EXIT
				}

				if (flag == true) {
					continue;
				}

				else {
					// changes edges of the grid to wall 
					if (i == 0) {
						cell1.setLeft(CellComponents.WALL);	
					}
					else if(i == randExitLoc) {

						cell1.setLeft(CellComponents.EXIT);					}
				}
				if (i == gridSize-1) {
					cell1.setRight(CellComponents.WALL);
				}
				if (j==0) {
					cell1.setUp(CellComponents.WALL);
				}
				if (j == gridSize-1) {
					cell1.setDown(CellComponents.WALL);
				}

				if (cell1.getUp() == CellComponents.APERTURE  || cell1.getDown()== CellComponents.APERTURE  || cell1.getRight()== CellComponents.APERTURE  || cell1.getLeft()== CellComponents.APERTURE ) {
					//cheks if cell has at least 1 aperture
					cellList.add(cell1);
					j++;

				}

			}
			rowList.add(cell1);
			i++;

		}
		for (int x = 0; x<gridSize-1; x++) {	//checks if two cells aperture is adjecent makes necassary changements
			for(int y=0; y<gridSize-1; y++) {

				if(rowlist.get(x).get(y).getRight().equals(CellComponents.APERTURE)) {

					rowlist.get(x).get(y+1).setLeft(CellComponents.APERTURE);

				}
				else {
					rowlist.get(x).get(y+1).setLeft(CellComponents.WALL);
				}
				if(rowlist.get(x).get(y).getDown().equals(CellComponents.APERTURE)) {
					rowlist.get(x+1).get(y).setUp(CellComponents.APERTURE);
				}
				else {
					rowlist.get(x+1).get(y).setUp(CellComponents.WALL);
				}
			}
		}



	}



	public static boolean play(Movement move, Player player) {	// checks if player can move or hits to wall 
		boolean flag = true;									//if player can move changes players current location
		if(move.equals(Movement.UP)) {
			if(player.getCurrentCell().getUp().equals(CellComponents.WALL)) {
				flag = false;
			}
			else {
				flag = true;
				//player.setCurrentRow();
			}

		}
		if(move.equals(Movement.DOWN)) {
			if(player.getCurrentCell().getDown().equals(CellComponents.WALL)) {
				flag = false;
			}
			else {
				//player.setCurrentRow();
				flag = true;
			}
			if(move.equals(Movement.RIGHT)) {
				if(player.getCurrentCell().getRight().equals(CellComponents.WALL)) {
					flag = false;
				}
				else {
					//player.setCurrentCell();
					flag = true;
				}
				if(move.equals(Movement.LEFT)) {
					if(player.getCurrentCell().getLeft().equals(CellComponents.WALL)) {
						flag = false;
					}
					else {
						//player.setCurrentCell();
						flag = true;
					}


				}
			}
		}
		return flag; 
	}
}





