package sortcomparable;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PriorityTask implements Comparable<PriorityTask> {

	private int id;
	private boolean mustGo;
	private LocalDate deadLineDate;
	private LocalDateTime startDateTime;

	public PriorityTask(int id, boolean mustGo, LocalDate deadLineDate, LocalDateTime startDateTime) {
		super();
		this.id = id;
		this.mustGo = mustGo;
		this.deadLineDate = deadLineDate;
		this.startDateTime = startDateTime;
	}

	public int getId() {
		return id;
	}

	public boolean isMustGo() {
		return mustGo;
	}

	public LocalDate getDeadLineDate() {
		return deadLineDate;
	}

	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	@Override
	public String toString() {
		return "PriorityTask [id=" + id + ", mustGo=" + mustGo + ", deadLineDate=" + deadLineDate + ", startDateTime="
				+ startDateTime + "]";
	}

	@Override
	public int compareTo(PriorityTask o) {
		
		int result = 0;
		int mustGoCompareValue;
		int deadLineDateCompareValue;
		int startDateTimeCompareValue;
		
		Boolean flag = o.mustGo;
		mustGoCompareValue = flag.compareTo(this.mustGo);
		deadLineDateCompareValue = o.deadLineDate.compareTo(this.deadLineDate);
		startDateTimeCompareValue = o.startDateTime.compareTo(this.startDateTime);

		// if all three sort values are the same return 0
		if (mustGoCompareValue == 0 && deadLineDateCompareValue == 0 && startDateTimeCompareValue == 0)
			return 0;

		// we have at least one difference in the three sort values check further
		if (mustGoCompareValue == 0 && deadLineDateCompareValue == 0) {
			if (startDateTimeCompareValue != 0) {
				if (startDateTimeCompareValue > 0)
					result = -1;
				else
					result = 1;
			return result;
			}
		}
		
		// startDateTimeCompareValue is the same check the other two values
		if (mustGoCompareValue == 0) {
			if (deadLineDateCompareValue != 0) {
				if (deadLineDateCompareValue > 0)
					result = 1;
				else
					result = -1;
			return result;
			}
		}
		
		// deadLineDateCompareValue is the same check the last remaining value
		if (mustGoCompareValue != 0) {
			if (mustGoCompareValue != 0) {
				if (mustGoCompareValue > 0)
					result = 1;
				else
					result = -1;
			return result;
			}
		}

		return result;
	}

}
