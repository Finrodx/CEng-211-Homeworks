/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055
*/
package Domain;

public abstract class Nutrition {
	private String name;
	private int calorie;
	private NutritionType type;
	
	public Nutrition(String name, int calorie, NutritionType type) {
		super();
		this.name = name;
		this.calorie = calorie;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public NutritionType getType() {
		return type;
	}

	public void setType(NutritionType type) {
		this.type = type;
	}
	
	
}
