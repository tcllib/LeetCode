package algorithm;

import java.util.Arrays;

/**
 * [621] Task Scheduler
 * Solution from https://blog.csdn.net/Koala_Tree/article/details/78498586
 */
public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];

        for(char task: tasks) {
            map[task - 'A'] ++;
        }

        Arrays.sort(map);

        return Math.max(tasks.length, (map[25] - 1) * (n + 1) + getNumOfMax(map));
    }

    private int getNumOfMax(int[] sortedTasksCount) {
        int i = 1;
        while(sortedTasksCount[25] == sortedTasksCount[25 - i]) {
            i++;
        }

        return i;
    }
}
