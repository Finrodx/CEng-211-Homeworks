package q3;

public class DailyPerformanceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Truck truck1 = new Truck(2500, 1489);
		Truck truck2 = new Truck(275, 1200);
		Truck truck3 = new Truck(555, 899);
		
		Company comp = new Company();
		comp.addTruck(truck1);
		comp.addTruck(truck2);
		comp.addTruck(truck3);

		comp.dailyPerformance();
		
	}

}
