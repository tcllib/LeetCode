package algorithm.greedy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContentChildrenTest {

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}, 0),
                Arguments.of(null, null, 0),
                Arguments.of(new int[]{1,2,3}, new int[]{1,2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void name(int[] children, int[] cookies, int result) {
        ContentChildren contentChildren = new ContentChildren();
        assertEquals(result, contentChildren.findContentChildren(children, cookies));
    }
}