/*

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055


*/
package DataAccesLayer;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import Domain.Drink;
import Domain.Food;
import Domain.Nutrition;
import Domain.NutritionType;

public class DataAccessLayer {
	
	ArrayList<Nutrition> nutritionList = new ArrayList<Nutrition>();
	ArrayList<String> data = new ArrayList<String>();
	
	public void readFile() throws Exception{
	
		Scanner readFile = new Scanner(new File("nutrition.dat"));
		
		while (readFile.hasNextLine()) {
			
			String line = readFile.nextLine();

			StringTokenizer StLine = new StringTokenizer(line, ",");

			String name = StLine.nextToken().trim();
			
			data.add(name);
			
			int unit = Integer.parseInt(StLine.nextToken().trim());
			
			data.add(Integer.toString(unit));
			
			int calorie = Integer.parseInt(StLine.nextToken().trim());
			
			data.add(Integer.toString(calorie));
			
			NutritionType type = NutritionType.valueOf(StLine.nextToken().trim());
			
			String foodOrDrink = StLine.nextToken().trim();
			
			if (foodOrDrink == "Food") {
				Food food = new Food(name, calorie, type, unit);
				nutritionList.add(food);
			}
			else if (foodOrDrink == "Drink") {
				Drink drink = new Drink(name, calorie, type, unit);
				nutritionList.add(drink);
			}
			else 
				break;			
		}		
		readFile.close();				
	}
	
	public ArrayList<Nutrition> getNutritions() throws Exception{
		
		readFile();
		return nutritionList;	
		
	}
	
	public ArrayList<String> getData() throws Exception{
		readFile();
		return data;
	}
	
}
