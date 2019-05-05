package algorithm;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaxSlidingWindowTest {

    private static Stream<Arguments> getTestInputs() {
        return Stream.of(Arguments.of(new int[]{7, 2, 4}, 2, new int[]{7,4}),
                         Arguments.of(new int[]{7, 7, 7}, 2, new int[]{7,7}));
    }

    @ParameterizedTest
    @MethodSource("getTestInputs")
    void maxSlidingWindow(int[] nums, int k, int[] results) {
        MaxSlidingWindow maxSlidingWindow = new MaxSlidingWindow();

        assertArrayEquals(results, maxSlidingWindow.maxSlidingWindow(nums, k));
    }
    
    
}