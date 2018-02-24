
/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

*/

package development.test;

import java.util.Random;

public enum CellComponents {
	
	WALL, EXIT, APERTURE;
	
	
	public static CellComponents getRandomCellComponents() {   //method for creating a random cell component
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
	
}
