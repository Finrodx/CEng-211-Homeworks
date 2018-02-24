/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055
*/

package Domain;
import java.util.ArrayList;

public abstract class Meal {
	private int totalCalorie;
	private ArrayList<Nutrition> nutritions; 
	private ArrayList<NutritionType> nutritionTypes;
	
	public Meal(ArrayList<Nutrition> nutritions, ArrayList<NutritionType> nutritionTypes) {
		super();
		this.nutritions = nutritions;
		this.nutritionTypes = nutritionTypes;
	}

	public int getTotalCalorie() {
		return totalCalorie;
	}

	public void setTotalCalorie(int totalCalorie) {
		this.totalCalorie = totalCalorie;
	}

	public ArrayList<Nutrition> getNutritions() {
		return nutritions;
	}

	public void setNutritions(ArrayList<Nutrition> nutritions) {
		this.nutritions = nutritions;
	}

	public ArrayList<NutritionType> getNutritionTypes() {
		return nutritionTypes;
	}

	public void setNutritionTypes(ArrayList<NutritionType> nutritionTypes) {
		this.nutritionTypes = nutritionTypes;
	}
	
	
	public int computeTotalCalorie() {
		int totalCalorie = 0;
		for(int i = 0; i < nutritions.size(); i++ ) {
			totalCalorie = totalCalorie + nutritions.get(i).getCalorie();
			
		}
		return totalCalorie;
		
	}
			
	
}
