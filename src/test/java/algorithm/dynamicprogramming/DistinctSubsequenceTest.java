package algorithm.dynamicprogramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DistinctSubsequenceTest {


    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of("rabbbit", "rabbit", 3),
                         Arguments.of("aabbdcac", "abc", 8));
    }

    @ParameterizedTest
    @MethodSource("input")
    void name(String s, String t, int result) {
        DistinctSubsequence distinctSubsequence = new DistinctSubsequence();
        assertEquals(result, distinctSubsequence.numDistinct(s, t));
    }
}