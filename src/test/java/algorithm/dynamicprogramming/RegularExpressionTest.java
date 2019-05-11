package algorithm.dynamicprogramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionTest {

    private static Stream<Arguments> getInput() {
        return Stream.of(Arguments.of("aa", "a*", true),
                         Arguments.of("aa", "a", false),
                         Arguments.of("aab", "c*a*b", true));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void isMatch(String text, String pattern, boolean result) {
        RegularExpression regularExpression = new RegularExpression();
        assertEquals(result, regularExpression.isMatch(text, pattern));
    }
}