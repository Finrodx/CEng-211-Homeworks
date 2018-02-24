/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

**/

package hw6.domain;

public interface ICustomerListAnalytics {

	public int getNumberOfFemaleCustomers();
	public int getNumberOfMaleCustomers();
	public int getNumberOfSeniorCustomers();
	public int getNumberOfAdultCustomers();
	public int getNumberOfYoungCustomers();
	public boolean add(Customer customer);
}
