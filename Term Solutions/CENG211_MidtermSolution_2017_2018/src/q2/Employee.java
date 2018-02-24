package q2;

public class Employee {

	private String name;
	private EmployeeType type;
	private int hours;
	private int overtime;
	private double salary;
	private int sale;

	public Employee( String name, EmployeeType type, int hours, int overtime, int sale) {

		setName(name);
		setType(type);
		setHours(hours);
		setOvertime(overtime);
		setSalary(salary);
		setSale(sale);
		calculateSalary();

	}


	public int getSale() {
		return sale;
	}


	public void setSale(int sale) {
		this.sale = sale;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public EmployeeType getType() {
		return type;
	}


	public void setType(EmployeeType type) {
		this.type = type;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public int getOvertime() {
		return overtime;
	}


	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calculateSalary() {

		switch(type) {
		case STAFF:
			salary = calculateSalaryHelper(35,17.5,50,100);
			break;

		case PART_TIME:
			salary = calculateSalaryHelper(20,10,70,100);
			break;

		case INTERN:
			salary = calculateSalaryHelper(5,2.5,30,10);
			break;
		}
		return salary;
	}
	
	private double calculateSalaryHelper(int wage, double overtimeWage, int saleLimit, int promotion) {

		double result = 0 ;
		result += this.hours*wage + this.overtime*overtimeWage;
		if(this.sale >= saleLimit)
			result += promotion;
		return result;
	}

}
