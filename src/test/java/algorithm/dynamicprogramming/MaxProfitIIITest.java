package algorithm.dynamicprogramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitIIITest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(new int[]{1,4,2}, 3),
                         Arguments.of(new int[]{6,1,3,2,4,7}, 7));
    }

    @ParameterizedTest
    @MethodSource("input")
    void maxProfit(int[] prices, int results) {
        MaxProfitIII maxProfitIII = new MaxProfitIII();
        assertEquals(results, maxProfitIII.maxProfit(prices));
    }
}