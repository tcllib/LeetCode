package algorithm;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskSchedulerTest {
    private static Stream<Arguments> getTestInputs() {
        return Stream.of(Arguments.of(new char[]{'A', 'A', 'A', 'A', 'B', 'B', 'B', 'E', 'E', 'F', 'F', 'G', 'G', 'H', 'H'},
                                      3,
                                      15),
                         Arguments.of(new char[]{'A', 'A', 'A', 'A', 'B', 'B', 'B', 'E', 'E', 'F', 'F'},
                                      3,
                                      13));
    }

    @ParameterizedTest
    @MethodSource("getTestInputs")
    void leastInterval(char[] tasks, int interval, int result) {
        TaskScheduler taskScheduler = new TaskScheduler();
        assertEquals(result, taskScheduler.leastInterval(tasks, interval));
    }
}