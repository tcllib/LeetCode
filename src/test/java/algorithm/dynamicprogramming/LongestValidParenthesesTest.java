package algorithm.dynamicprogramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of("()()()(", 6),
                         Arguments.of("()(()", 2),
                         Arguments.of(")()())", 4));
    }

    @ParameterizedTest
    @MethodSource("input")
    void longestValidParentheses(String s, int result) {
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        assertEquals(result, longestValidParentheses.longestValidParentheses(s));
    }
}