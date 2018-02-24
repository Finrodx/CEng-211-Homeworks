package q2;

import java.util.ArrayList;

public class Company {

	private  ArrayList<Employee> employeeList;
	
	public Company() {		
		this.employeeList = new ArrayList<Employee>();
	}

	public Company(ArrayList<Employee> employeeList) {		
		this.employeeList = new ArrayList<Employee>(employeeList);
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public double calculateAllSalaries() {		
		double result = 0;
		
		for(Employee employee: employeeList)
			result += employee.getSalary();
		return result;
	}
}
