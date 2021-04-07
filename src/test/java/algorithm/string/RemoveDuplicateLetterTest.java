package algorithm.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicateLetterTest {
    private static Stream<Arguments> test() {
        return Stream.of(
//                Arguments.of("bcabc", "abc"),
//                Arguments.of("cbacdcbc", "acdb"),
                Arguments.of("bbcaac", "bac")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void name(String input, String output) {
        RemoveDuplicateLetter removeDuplicateLetter = new RemoveDuplicateLetter();
        assertEquals(output, removeDuplicateLetter.removeDuplicateLetters(input));
    }
}
