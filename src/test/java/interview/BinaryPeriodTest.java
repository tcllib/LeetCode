package interview;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryPeriodTest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(6, 21325));
    }

    @ParameterizedTest
    @MethodSource("input")
    void solution(int result, int input) {
        BinaryPeriod binaryPeriod = new BinaryPeriod();
        assertEquals(result, binaryPeriod.solution(input));
    }
}