package sortguavalambda;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PriorityTask {
		
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
		
}
