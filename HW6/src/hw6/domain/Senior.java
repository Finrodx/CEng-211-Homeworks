/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

**/

package hw6.domain;

public class Senior extends Customer {

	public Senior() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Senior(int age, char gender, String name) {
		super(age, gender, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Senior [super=" + super.toString() + "]";
	}
	
	
}
