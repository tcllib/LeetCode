package algorithm.hashtable;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(new int[]{1,3,5,6}, 7, new int[]{0, 3}));
    }

    @ParameterizedTest
    @MethodSource("input")
    void name(int[] nums, int target, int[] result) {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(result, twoSum.twoSum(nums, target));
    }
}