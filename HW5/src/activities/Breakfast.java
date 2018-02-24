package activities;

import domain.Frequency;
import domain.Mandatory;
import domain.Status;

public class Breakfast extends Mandatory {
	
	public Breakfast(Frequency frequency, Status status) {
		super(frequency, status);
		super.setFrequency(frequency);
		super.setStatus(status);
	}

}
	