
/**
 * 
 * 
 * @author Bora Özsoy - Salih Atacan Karagöz , 220201027-210201055
 *
 */


//test case accidentpenalty is not camelcase test case typo.


package development;

public class Calculation {



	public Calculation() {


	}

	public double accidentPenaltyCalculation(Vehicle vehicle) {
		double accidentPenalty = 0;

		double aDivideB = vehicle.getAccidentPenalty();



		if(aDivideB<0) {

			aDivideB = 1.0;
		}


		switch (vehicle.getType()) {

		case BUS:
			if (vehicle.getVehicleAge()<5) {
				accidentPenalty=aDivideB*400;


			}
			else {
				accidentPenalty=aDivideB*200;
			}

			break;	

		case CAR:

			if (vehicle.getVehicleAge()<3) {
				accidentPenalty=aDivideB*200;
			}
			else {
				accidentPenalty=aDivideB*100;
			}

			break;
		case MOTORCYCLE:

			if (vehicle.getVehicleAge()<1) {
				accidentPenalty=aDivideB*100;
			}
			else {
				accidentPenalty=aDivideB*50;
			}

			break;
		default :
			break;
		}
		return accidentPenalty;
	}

	public double calculate(Vehicle vehicle, Company company) {
		double insuranceCost=0;
		double accidentPenalty = accidentPenaltyCalculation(vehicle);



		switch(vehicle.getType()) {


		case CAR:

			insuranceCost=1000/(Math.pow(2, vehicle.getVehicleAge()))*company.getWeightX();

			insuranceCost=insuranceCost+(vehicle.getHorsePower()*10*company.getWeightY());
			insuranceCost=insuranceCost+(accidentPenalty*company.getWeightZ());


			break;

		case BUS:
			insuranceCost=2000/(Math.pow(2,vehicle.getVehicleAge()))*company.getWeightX();
			insuranceCost=insuranceCost+(vehicle.getHorsePower()*10*company.getWeightY());
			insuranceCost=insuranceCost+(accidentPenalty*company.getWeightZ());

			if(vehicle.getOwner().equals("Optimus Prime")){



			}
			break;



		case MOTORCYCLE:

			insuranceCost=500/(Math.pow(2,vehicle.getVehicleAge()))*company.getWeightX();
			insuranceCost=insuranceCost+(vehicle.getHorsePower()*3*company.getWeightY());
			insuranceCost=insuranceCost+(accidentPenalty*company.getWeightZ());


			break;

		}

		return insuranceCost;
	}

}
