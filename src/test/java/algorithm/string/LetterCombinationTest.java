package algorithm.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class LetterCombinationTest {

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of("23", List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
        );
    }

    @ParameterizedTest
    @MethodSource("input")
    void name(String input, List<String> output) {
        LetterCombination letterCombination = new LetterCombination();
        assertThat(letterCombination.letterCombinations(input), containsInAnyOrder(output));
    }
}
