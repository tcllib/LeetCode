package algorithm.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordTest {
    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("the sky is blue", "blue is sky the")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void name(String input, String output) {
        ReverseWord reverseWord = new ReverseWord();
        assertEquals(output, reverseWord.reverseWords(input));
    }
}
