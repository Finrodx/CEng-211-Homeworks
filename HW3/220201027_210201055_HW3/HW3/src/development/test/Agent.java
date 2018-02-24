
/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

*/


package development.test;



public class Agent {	//how agent moves when maze starts

	private Player player;
	private Grid grid;
	//basicly agent goes upwards until it hits a wall. then goes downwards while looking for a left aperture.
	//then goes downwards while looking for a left aperture. if there is an aperture goes left. And repeats
	//if goes into a deadend goes back
	public Agent(Player player, Grid grid) {
		super();
		this.player = player;
		this.grid = grid;
	}


	public boolean agentMove() {	
		while(!player.getCurrentCell().getLeft().equals(CellComponents.EXIT)) {

			if(Game.play(Movement.UP, player)==true) {

				Game.play(Movement.UP, player);	

			}
			else if(Game.play(Movement.LEFT, player)==true) {
				Game.play(Movement.LEFT, player);

			}
			else {
				while(Game.play(Movement.DOWN, player)) {

					if(Game.play(Movement.LEFT, player)==true) {

						Game.play(Movement.LEFT, player);
						break;
					}	
					else {
						if(Game.play(Movement.DOWN, player)==true) {
							Game.play(Movement.DOWN, player);
						}
						else {
							Game.play(Movement.RIGHT, player);
						}
					}

					
				}
			}
		}
		
		return true;

	}


}
