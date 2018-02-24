/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

**/

package hw6.domain.customer;

import hw6.domain.Adult;
import hw6.domain.Customer;
import hw6.domain.Senior;
import hw6.domain.Young;

public class CustomerCreatorWithExceptions extends Customer {
	
	
	public CustomerCreatorWithExceptions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerCreatorWithExceptions(int age, char gender, String name) {
		super(age, gender, name);
		// TODO Auto-generated constructor stub
	}

	public Customer createCustomer(int age, char gender, String name) throws IllegalArgumentException {
		
		 if( age < 18 || age > 79) {
		        throw new IllegalArgumentException("Invalid Age Parameter");
		        
		}
		 else {
			 if( gender != 'f' && gender != 'm' && gender != 'F' && gender != 'M' ) {
				 throw new IllegalArgumentException("Invalid Gender Parameter");
				 
			 }
			 else {
				 
				 if(name == null || name.length()>20) {
					 throw new IllegalArgumentException("Invalid Name Parameter! Name can not be null or longer than 20 char");
				 }
				 else {
					 if (age >18 && age<30) {
						 Young young = new Young(age,gender,name);
						return young;
						}
						else if(age>30 && age<60) {
							Adult adult = new Adult(age,gender,name);
							return adult;
						}
						else {
							Senior senior = new Senior(age,gender,name);
							return senior;
						}

				 }
			 }
		 }
	
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
}