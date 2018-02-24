package q2;

import java.util.ArrayList;

public class BuyerArrayList implements BuyerList {

	private ArrayList<Buyer> buyerArrayList;
	
	public BuyerArrayList() {
		buyerArrayList = new ArrayList<Buyer>();
	}
	
	public void addBuyer(Buyer buyer) {
		buyerArrayList.add(buyer);
	}
	
	public void removeBuyer(Buyer buyer) {
		buyerArrayList.remove(buyer);
	}
	
	public int numberOfBuyers(char gender) {
		int count = 0;
		for(Buyer buyer: buyerArrayList) {
			if (buyer.getGender() == gender)
				count = count +1;
		}
		return count;
	}
	
	public int numberOfBuyers(int workingStatus) {
		int count = 0;
		for(Buyer buyer: buyerArrayList) {
			if (buyer.getWorkingStatus() == workingStatus)
				count = count +1;
		}
		return count;
	}
	
	public int numberOfBuyers(String ageCategory) {
		int count = 0;
		for(Buyer buyer: buyerArrayList) {
			if (buyer.getAgeCategory() == ageCategory)
				count = count +1;
		}		
		return count;
	}

	
}
