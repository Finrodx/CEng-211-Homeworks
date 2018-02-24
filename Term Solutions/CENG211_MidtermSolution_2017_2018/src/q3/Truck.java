package q3;

public class Truck {
	
	private double kilometers;
	private double kilograms;

	private final int kmCharge = 200; 
	private final int kgCharge = 300;
	
	public Truck(double km, double kg) {
		// TODO Auto-generated constructor stub
		setKilometers(km);
		setKilograms(kg);
	}
	
	public double getKilometers() {
		return kilometers;
	}
	
	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}
	
	public double getKilograms() {
		return kilograms;
	}
	
	public void setKilograms(double kilograms) {
		this.kilograms = kilograms;
	}
	
	public double calculatePrice() {
	
		int perKG = (int) (kilograms/1000);
		int perKM = (int) (kilometers/100);
		
		double price = (perKG*kgCharge) + (perKM*kmCharge);
		
		return price;
	}
	
	

}
