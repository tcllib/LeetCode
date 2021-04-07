package algorithm.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntTest {

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("IV", 4),
                Arguments.of("IX", 9),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }

    @ParameterizedTest
    @MethodSource("input")
    void romanToInt(String s, int result) {
        RomanToInt romanToInt = new RomanToInt();
        assertEquals(result, romanToInt.romanToInt(s));
    }

    @Test
    void name() {
        int i = 10 % 50;
        System.out.println(i);
    }
}
