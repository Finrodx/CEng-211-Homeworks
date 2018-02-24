/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

**/

package hw6.domain;

public class Adult extends Customer {

	public Adult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adult(int age, char gender, String name) {
		super(age, gender, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Adult [super=" + super.toString() + "]";
	}
	
	
}
