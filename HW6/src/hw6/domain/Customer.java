/**

@author Bora OZSOY - Salih Atacan KARAGOZ, 220201027 - 210201055

**/

package hw6.domain;

public abstract class Customer {
	
	private String name;
	private int age;
	private char gender;
	private String type;
	
	
	public Customer() {
		super();
	}

	public Customer(int age, char gender, String name) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		setType(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(int age) {
		if (getAge()>18 && getAge()<30) {
			this.type="Young";
			}
		else if(getAge()>29 && getAge()<59) {
			this.type="Adult";
		}
		else {
			this.type="Senior";
		}
	}

	@Override
	public String toString() {
		return "Customer [age=" + age + ", gender=" + gender + ", name=" + name + ", type=" + type + "]";
	}
	
	
	
}
