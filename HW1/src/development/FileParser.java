
/**
 * 
 * 
 * @author Bora Özsoy - Salih Atacan Karagöz , 220201027-210201055
 *
 */

package development;

import java.io.*;
import java.util.*;


public class FileParser {


	private ArrayList<Vehicle> vehicleList;

	public FileParser() {
		vehicleList = new ArrayList<Vehicle>();
	}


	public ArrayList<Vehicle> readFile() throws Exception {


		Scanner readFile = new Scanner(new File("vehicles.dat"));

		while (readFile.hasNextLine()) {

			String line = readFile.nextLine();

			StringTokenizer StLine = new StringTokenizer(line, ",");

			String name = StLine.nextToken().trim();

			String brandName = StLine.nextToken().trim();

			int year = Integer.parseInt(StLine.nextToken().trim());

			int horsePower = Integer.parseInt(StLine.nextToken().trim());

			double accidentalPenalty = Double.parseDouble(StLine.nextToken().trim());

			VehicleType type = VehicleType.valueOf(StLine.nextToken().trim().toUpperCase());

			Vehicle vehicle = new Vehicle(name,brandName,year,horsePower,accidentalPenalty,type);

			vehicleList.add(vehicle);

		}

		readFile.close();

		return vehicleList;

	}
}
