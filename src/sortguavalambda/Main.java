package sortguavalambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ComparisonChain;

public class Main {

	public static void main(String[] args) {

		List<PriorityTask> ptasks = new ArrayList<PriorityTask>();
		
		testData(ptasks);
		
		ptasks.sort((p1, p2) -> ComparisonChain.start().compareTrueFirst(p1.isMustGo(), p2.isMustGo())
				   .compare(p1.getDeadLineDate(), p2.getDeadLineDate())
				   .compare(p1.getStartDateTime(), p2.getStartDateTime())
				   .result());
		
		print(ptasks);
		
	}

	private static void print(List<PriorityTask> ptasks) {
		for (PriorityTask _task: ptasks) {
			System.out.println(_task.toString());
		}
	}

	private static void testData(List<PriorityTask> ptasks) {
		for (int i = 0; i < 50; i++) {
			PriorityTask task = new PriorityTask(i, true, LocalDate.now(), LocalDateTime.now());
			if ((i % 2) == 0 )
				task = new PriorityTask(i, true, LocalDate.of(2019, 12, 31), LocalDateTime.now());
			
			ptasks.add(task);
		}
		PriorityTask task = new PriorityTask(50, false, LocalDate.now(), LocalDateTime.now());
		ptasks.add(task);
	}

}