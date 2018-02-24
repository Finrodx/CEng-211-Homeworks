package domain;

import java.util.Date;

public class Hobby implements Activities {
	private Frequency frequency;
	private Status status;
	
	public Hobby(Frequency frequency, Status status) {
		super();
		this.frequency = frequency;
		this.status = status;
	}


	public Frequency getFrequency() {
		return frequency;
	}




	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}




	public Status getStatus() {
		return status;
	}




	public void setStatus(Status status) {
		this.status = status;
	}


	public int repeatCount(Date startDate, Date endDate, Frequency frequency) {
		long difference = Math.abs(startDate.getTime() - endDate.getTime());
		long days = difference / (24 * 60 * 60 * 1000);
		if (frequency == Frequency.DAILY ) {
			int count = Math.toIntExact(days);
			return count;
		}
		else if (frequency == Frequency.WEEKLY) {
			int intDays = Math.toIntExact(days);
			int count = intDays / 7;
			return count;
		}
		else if (frequency == Frequency.MONTHLY) {
			int intDays = Math.toIntExact(days);
			int count = intDays / 30;
			return count;
		}
		return 0;	
	}
	
}
