package q1;

public class Sequence {

	public Sequence() {
		
	}
	
	public boolean sequenceChecker(int startingPoint, int checkPoint) {
		
		while(startingPoint<checkPoint) {
			startingPoint = 5 * startingPoint + 3;
		}
		
		return startingPoint==checkPoint;
	}
	
}
