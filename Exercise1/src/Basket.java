import java.util.ArrayList;

public class Basket {

	
		private ArrayList<Fruit> fruitBasket;

		
		public Basket() {
			
			fruitBasket = new ArrayList<Fruit>();
		
		}		
			
			
		
		public void addFruit(Fruit fruit) {
			
			fruitBasket.add(fruit);
			
			
		}
		
		
		public void removeFruit(Fruit fruit) {
			if(fruitBasket.contains(fruit)) {
			
				fruitBasket.remove(fruit);
			}
			
			
		}
		
		
		public int calculateTotalCalorie(Fruit fruit) {
			int total = 0 ;
			for(Fruit fruits : fruitBasket) {
				
				
				total += fruits.getColarieValue();
				
				
			}
			
			return total;
		}
		

		public int getNumberOfFruits() {
			
			return fruitBasket.size();
		
		
		
		}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
}
		
		
		