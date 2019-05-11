package algorithm.dynamicprogramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WildcardMatchingTest {
    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of("adceb", "*a*b", true),
                         Arguments.of("aab", "c*a*b", false));
    }

    @ParameterizedTest
    @MethodSource("input")
    void name(String s, String p, boolean result) {
        WildcardMatching wildcardMatching = new WildcardMatching();
        assertEquals(result, wildcardMatching.isMatch(s, p));
    }
}