/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

**/

package hw6.domain;

import java.util.ArrayList;

public class CustomerListAnalyticsImpl implements ICustomerListAnalytics {

	private int numberOfFemaleCustomers = 0;
	private int numberOfMaleCustomers = 0;
	private int numberOfSeniorCustomers = 0;
	private int numberOfAdultCustomers = 0;
	private int numberOfYoungCustomers = 0;
	private ArrayList<Customer> buyers = new ArrayList<Customer>();

	public int getNumberOfFemaleCustomers() {
		return numberOfFemaleCustomers;
	}
	public int getNumberOfMaleCustomers() {
		return numberOfMaleCustomers;
	}
	public int getNumberOfSeniorCustomers() {
		return numberOfSeniorCustomers;
	}
	public int getNumberOfAdultCustomers() {
		return numberOfAdultCustomers;
	}
	public int getNumberOfYoungCustomers() {
		return numberOfYoungCustomers;
	}


	public boolean add(Customer customer) {
		if (customer == null) {
			return false;
		}

		buyers.add(customer);
		if (customer.getGender() == 'f' || customer.getGender() == 'F') {
			numberOfFemaleCustomers++;

		}
		else {

			numberOfMaleCustomers++;
		}
		if (customer.getType()=="Adult") {
			numberOfAdultCustomers++;

		}
		else if (customer.getType() == "Senior") {
			numberOfSeniorCustomers++;

		}
		else {
			numberOfYoungCustomers++;
		}

		return true;

	}
	@Override
	public String toString() {
		return "CustomerListImpl [buyers=" + buyers + "]";
	}
	


}
