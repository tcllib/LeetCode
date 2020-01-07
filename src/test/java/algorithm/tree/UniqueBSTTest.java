package algorithm.tree;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UniqueBSTTest {

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("input")
    void numTrees(int n, int expectedNum) {
        UniqueBST uniqueBST = new UniqueBST();
        assertEquals(expectedNum, uniqueBST.numTrees(n));
    }
}