package sortcomparable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<PriorityTask> ptasks = new ArrayList<PriorityTask>();

        testData(ptasks);

        Collections.sort(ptasks);

        print(ptasks);

    }

    private static void print(List<PriorityTask> ptasks) {
        for (PriorityTask _task : ptasks) {
            System.out.println(_task.toString());
        }
    }

    private static void testData(List<PriorityTask> ptasks) {
        for (int i = 0; i < 50; i++) {
            PriorityTask task = new PriorityTask(i, true, LocalDate.now(), LocalDateTime.now());
            if ((i % 2) == 0)
                task = new PriorityTask(i, true, LocalDate.of(2019, 12, 31), LocalDateTime.now());

            ptasks.add(task);
        }
        PriorityTask task = new PriorityTask(50, false, LocalDate.now(), LocalDateTime.now());
        ptasks.add(task);
    }

}
