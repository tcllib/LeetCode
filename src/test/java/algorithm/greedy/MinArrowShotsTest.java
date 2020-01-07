package algorithm.greedy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinArrowShotsTest {

    private static Stream<Arguments> input() {
        return Stream.of(
            Arguments.of(new int[][]{{2,4}, {1,4}, {1,5}, {3,6}, {7,10}}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("input")
    void findMinArrowShots(int[][] input, int result) {
        MinArrowShots minArrowShots = new MinArrowShots();
        assertEquals(result, minArrowShots.findMinArrowShots(input));
    }
}