/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055
*/
package Domain;
import java.util.ArrayList;

public class Breakfast extends Meal{

	public Breakfast(ArrayList<Nutrition> nutritions, ArrayList<NutritionType> nutritionTypes) {
		super(nutritions, nutritionTypes);
		
	}
	
	//Eleman eklenmiyor listeye
	public int computeTotalCalorie() {
		return super.getTotalCalorie();
				
	}
	

}
