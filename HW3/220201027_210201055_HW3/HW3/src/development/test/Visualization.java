/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

*/


package development.test;



import java.util.ArrayList;


public class Visualization { //

	private Player player;
	private Grid grid;

	//draws the grid map shows agent's and exit's location


	public Visualization(Player player, Grid grid) {
		super();
		this.player = player;
		this.grid = grid;
	}


	public String graph(Player player, Grid grid) {


		int size = Game.gridSize;
		int exit = Game.randExitLoc;

		for(int i = 0; i<size; i++) {
			for(int j =0; j<size; j++) {

				if(i==exit && j==0) {
					System.out.println("E");
				}
				else if(j == indexOf(player.getCurrentCell()) && i == indexOf(player.getCurrentRow){

					System.out.println(", A");
				}
				else {
					System.out.println(", S");
				}
			}
			System.out.println("\n");
		}




		return null;



	}


}
