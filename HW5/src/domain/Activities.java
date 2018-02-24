package domain;

import java.util.Date;

public interface Activities {
	public int repeatCount(Date startDate, Date endDate, Frequency frequency);
}
