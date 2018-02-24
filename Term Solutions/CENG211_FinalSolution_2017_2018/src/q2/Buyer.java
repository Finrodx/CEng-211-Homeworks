package q2;

public class Buyer {

	String name, ageCategory;
	int workingStatus;
	char gender;
	
	public Buyer(String name, int age, int workingStatus, char gender) throws IllegalBuyerException {
		setName(name);
		setAgeCategory(age);
		setWorkingStatus(workingStatus);
		setGender(gender);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) throws IllegalBuyerException {
		if (name.length() <= 30)
			this.name = name;
		else
			throw new IllegalBuyerException("Name cannot be longer than 30");
	}

	public String getAgeCategory() {
		return ageCategory;
	}

	private void setAgeCategory(int age) throws IllegalBuyerException {
		if (age < 18)
			throw new IllegalBuyerException("Age must be between 18 and 89");
		if (age > 89)
			throw new IllegalBuyerException("Age must be between 18 and 89");
		if (age > 18 && age < 30)
			ageCategory = "young";
		if (age > 29 && age < 65)
			ageCategory = "adult";
		if (age > 64 && age < 90)
			ageCategory = "senior";
	}

	public int getWorkingStatus() {
		return workingStatus;
	}

	private void setWorkingStatus(int workingStatus) throws IllegalBuyerException {
		if (workingStatus < 1 && workingStatus > 3)
			throw new IllegalBuyerException("Working Status must be either 1, 2, or 3");
		else this.workingStatus = workingStatus;
	}

	public char getGender() {
		return gender;
	}

	private void setGender(char gender) throws IllegalBuyerException {
		if (gender == 'F' || gender == 'M')
			this.gender = gender;
		else
			throw new IllegalBuyerException("Gender must be either F or M");
	}
	
	@Override
	public String toString() {
		return name;
	}
}
