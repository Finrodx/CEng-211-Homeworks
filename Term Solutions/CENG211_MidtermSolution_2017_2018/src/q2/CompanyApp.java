package q2;

public class CompanyApp {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Mark", EmployeeType.INTERN, 35, 5, 25);
		Employee employee2 = new Employee("John", EmployeeType.STAFF, 50, 30, 120);
		
		Company company =  new Company();
		company.addEmployee(employee1);
		company.addEmployee(employee2);
				
		System.out.println("Total salary: "+company.calculateAllSalaries());
		
	}

}
