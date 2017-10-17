/**
 * 
 * 
 * @author Bora Özsoy - Salih Atacan Karagöz , 220201027-210201055
 *
 */

public class Vehicle {
	
	public enum Type {CAR, BUS, MOTORCYCLE}
	
	private String brandAndModel;
	private String nameOfTheOwner;
	private int producedYear;
	private int horsePower;
	private double accidentPenalty;
	
	
	public String getBrandAndModel() {
		return brandAndModel;
	}
	
	public void setBrandAndModel(String brandAndModel) {
		this.brandAndModel = brandAndModel;
	}
	
	public String getNameOfTheOwner() {
		return nameOfTheOwner;
	}
	public void setNameOfTheOwner(String nameOfTheOwner) {
		this.nameOfTheOwner = nameOfTheOwner; 
	}
	public int getProducedYear() {
		return producedYear;
		}
	
	public void setProducedYear(int producedYear) {
		this.producedYear = producedYear;
	}

	public int getHorsePower() {
		return horsePower;
	}
	
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public double getAccidentPenalty() {
		return accidentPenalty;
	}
	
	public void setAccidentPenalty(double accidentPenalty) {
		this.accidentPenalty = accidentPenalty;
		
	}
	
}
