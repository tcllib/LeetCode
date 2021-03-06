package algorithm.dynamicprogramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitIITest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(new int[] {7,1,5,3,6,4}, 7));
    }

    @ParameterizedTest
    @MethodSource("input")
    void maxProfit(int[] prices, int result) {
        MaxProfitII maxProfitII = new MaxProfitII();
        assertEquals(result, maxProfitII.maxProfit(prices));
    }
}