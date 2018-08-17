package sortguavacomparator;

import java.util.Comparator;

import com.google.common.collect.ComparisonChain;

public class Sortby implements Comparator<PriorityTask> {

	@Override
	public int compare(PriorityTask p1, PriorityTask p2) {
		return ComparisonChain.start().compareTrueFirst(p1.isMustGo(), p2.isMustGo())
		   .compare(p1.getDeadLineDate(), p2.getDeadLineDate())
		   .compare(p1.getStartDateTime(), p2.getStartDateTime())
		   .result();
	}

}
