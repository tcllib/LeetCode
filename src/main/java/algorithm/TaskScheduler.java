package algorithm;

import java.util.Arrays;

public class TaskScheduler {
    public static void main(String[] args) {
        System.out
                .println(leastInterval(new char[]{'A', 'A', 'A', 'A', 'B', 'B', 'B', 'E', 'E', 'F', 'F', 'G', 'G', 'H', 'H'}, 3));
    }

    public static int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];

        for(char task: tasks) {
            map[task - 'A'] ++;
        }

        Arrays.sort(map);

        return Math.max(tasks.length, (map[25] - 1) * (n + 1) + getNumOfMax(map));
    }

    public static int getNumOfMax(int[] sortedTasksCount) {
        int i = 1;
        while(sortedTasksCount[25] == sortedTasksCount[25 - i]) {
            i++;
        }

        return i;
    }
}
