package algorithm.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class ParenthesesStringTest {

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(2, List.of("(())", "()()"))
        );
    }

    @ParameterizedTest
    @MethodSource("input")
    void name(int input, List<String> output) {
        ParenthesesString parenthesesString = new ParenthesesString();
        assertThat(parenthesesString.generateParenthesis(input), containsInAnyOrder(output));
    }
}
