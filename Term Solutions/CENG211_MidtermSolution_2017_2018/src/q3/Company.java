package q3;

import java.util.ArrayList;

public class Company {
	
	private ArrayList<Truck> truckFleet;
	
	public Company() {
		truckFleet = new ArrayList<>();
	}

	public ArrayList<Truck> getTruckFleet() {
		return truckFleet;
	}

	public void setTruckFleet(ArrayList<Truck> truckFleet) {
		this.truckFleet = truckFleet;
	}
	
	public void addTruck(Truck truck) {
		if(truck == null)
			System.out.println("Couldn't add Truck");
		else
			truckFleet.add(truck);
	}
	
	public double calculateTotalWeight() {
		double totalWeight = 0;
		
		for(Truck truck : truckFleet) {
			totalWeight += truck.getKilograms();
		}
		
		return totalWeight;
	}
	
	public double calculateTotalDistance() {
		double totalDistance = 0;
		
		for(Truck truck : truckFleet) {
			totalDistance += truck.getKilometers();
		}
		
		return totalDistance;
	}
	
	public double calculateTotalPrice() {
		double totalPrice = 0;
		
		for(Truck truck : truckFleet) {
			totalPrice += truck.calculatePrice();
		}
		
		return totalPrice;
	}
	
	public void dailyPerformance() {
		System.out.println("Total Weight Carried: "+calculateTotalWeight());
		System.out.println("Total Traveled Distance: "+calculateTotalDistance());
		System.out.println("Total Amount Charged: "+calculateTotalPrice());
	}

}
