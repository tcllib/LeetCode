package algorithm.dynamicprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ClimbStairsTest {

    @ParameterizedTest
    @MethodSource("getTestsInput")
    void climbStairs(int n, int result) {
        ClimbStairs climbStairs = new ClimbStairs();
        assertEquals(result, climbStairs.climbStairs(n));
    }


    public static Stream<Arguments> getTestsInput() {
        return Stream.of(Arguments.of(1, 1),
                         Arguments.of(2, 2),
                         Arguments.of(4, 5));
    }
}