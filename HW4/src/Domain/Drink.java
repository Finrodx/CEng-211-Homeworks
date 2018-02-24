/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055
*/
package Domain;

public class Drink extends Nutrition {

	private int unit;

	public Drink(String name, int calorie, NutritionType type, int unit) {
		super(name, calorie, type);
		this.unit = unit;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	
	
}
