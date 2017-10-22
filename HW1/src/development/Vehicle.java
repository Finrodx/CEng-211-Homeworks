
/**
 * 
 * 
 * @author Bora Özsoy - Salih Atacan Karagöz , 220201027-210201055
 *
 */

package development;
import java.time.LocalDate;




public class Vehicle {


	private VehicleType type;
	private String brand;
	private String owner;
	private int producedYear;
	private int horsePower;
	private double accidentPenalty;
	private int currentYear;
	private int vehicleAge;



	public Vehicle(String owner, String brand, int producedYear, int horsePower,
			double accidentPenalty, VehicleType type) {

		setType(type);
		setBrand(brand);
		setOwner(owner);
		setProducedYear(producedYear);
		setHorsePower(horsePower);
		LocalDate localDate = LocalDate.now();
		currentYear = localDate.getYear();
		setVehicleAge();
		setAccidentPenalty(accidentPenalty);

	}








	@Override
	public String toString() {
		return "Vehicle [owner=" + owner + ", brand=" + brand + ", producedyear=" + producedYear + ", housepower=" + horsePower + ", accidentpenalty=" + accidentPenalty + ", type=" + type + "]";
	}








	public VehicleType getType() {

		return type;
	}


	public void setType(VehicleType type) {

		if(type == null) {
			this.type = VehicleType.CAR;



		}
		else {
			this.type = type;
		}
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {

		if(brand == null) {
			this.brand = "NO BRAND GIVEN";
		}else {
			this.brand = brand;

		}
	}




	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		if(owner==null ) {
			this.owner = "NO NAME GIVEN";
		}
		else {
			this.owner = owner;
		}
	}


	public int getProducedYear() {
		return producedYear;
	}


	public void setProducedYear(int producedYear) {

		if(producedYear <= 0) {
			this.producedYear = 2017;
		}
		else if(producedYear != (int)producedYear) {
			this.producedYear = 2017;
		}
		else {

			this.producedYear = producedYear;
		}
	}


	public int getHorsePower() {
		return horsePower;
	}


	public void setHorsePower(int horsePower) {
		if(horsePower > 0) {

			this.horsePower = horsePower;
		}


	}


	public double getAccidentpenalty() {
		return accidentPenalty;
	}


	public void setAccidentPenalty(double accidentPenalty) {

		if(accidentPenalty < 0) {
			this.accidentPenalty = 1.0;

		}
		else if(accidentPenalty != (double)accidentPenalty) {
			this.accidentPenalty = 0.25;
		}
		else {
			this.accidentPenalty = accidentPenalty;


		}


	}

	public double getAccidentPenalty() {
		return accidentPenalty;
	}




	public int getVehicleAge() {
		return vehicleAge;
	}


	public void setVehicleAge() {
		vehicleAge = currentYear - producedYear;
	}




}
