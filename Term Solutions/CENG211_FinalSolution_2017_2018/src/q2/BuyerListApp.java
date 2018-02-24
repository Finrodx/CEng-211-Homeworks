package q2;

public class BuyerListApp {

	public static void main(String[] args) {
		BuyerArrayList buyerList = new BuyerArrayList();

		try {
			Buyer buyer = new Buyer("Ali",20,2,'M');
			buyerList.addBuyer(buyer);
			System.out.println("Buyer " + buyer.toString() + " is created");
		} catch (IllegalBuyerException e) {
			System.out.println("Buyer cannot be created because " + e.getMessage());
		}
		
		try {
			Buyer buyer = new Buyer("Ayse",35,1,'F');
			buyerList.addBuyer(buyer);
			System.out.println("Buyer " + buyer.toString() + " is created");
		} catch (IllegalBuyerException e) {
			System.out.println("Buyer cannot be created because " + e.getMessage());
		}

		try {
			Buyer buyer = new Buyer("Fatma",70,3,'F');
			buyerList.addBuyer(buyer);
			System.out.println("Buyer " + buyer.toString() + " is created");
		} catch (IllegalBuyerException e) {
			System.out.println("Buyer cannot be created because " + e.getMessage());
		}

		try {
			Buyer buyer = new Buyer("Veli",40,1,'M');
			buyerList.addBuyer(buyer);
			System.out.println("Buyer " + buyer.toString() + " is created");
		} catch (IllegalBuyerException e) {
			System.out.println("Buyer cannot be created because " + e.getMessage());
		}

		try {
			Buyer buyer = new Buyer("Ahmet",45,1,'M');
			buyerList.addBuyer(buyer);
			System.out.println("Buyer " + buyer.toString() + " is created");
		} catch (IllegalBuyerException e) {
			System.out.println("Buyer cannot be created because " + e.getMessage());
		}

		try {
			Buyer buyer = new Buyer("?",90,1,'M');
			buyerList.addBuyer(buyer);
			System.out.println("Buyer " + buyer.toString() + " is created");
		} catch (IllegalBuyerException e) {
			System.out.println("Buyer cannot be created because " + e.getMessage());
		}

		System.out.println("Number of Female Buyers is " + buyerList.numberOfBuyers('F'));
		System.out.println("Number of Male Buyers is " + buyerList.numberOfBuyers('M'));
		
		System.out.println("Number of Young Buyers is " + buyerList.numberOfBuyers("young"));
		System.out.println("Number of Adult Buyers is " + buyerList.numberOfBuyers("adult"));
		System.out.println("Number of Senior Buyers is " + buyerList.numberOfBuyers("senior"));

		System.out.println("Number of Worker Buyers is " + buyerList.numberOfBuyers(1));
		System.out.println("Number of Student Buyers is " + buyerList.numberOfBuyers(2));
		System.out.println("Number of Non-worker Buyers is " + buyerList.numberOfBuyers(3));
	}

}
