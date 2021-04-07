package algorithm.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntToRomanTest {
    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(9, "IX"),
                Arguments.of(58, "LVIII")
        );
    }

    @ParameterizedTest
    @MethodSource("input")
    void name(int num, String result) {
        IntToRoman intToRoman = new IntToRoman();
        assertEquals(result, intToRoman.intToRoman(num));
    }
}
