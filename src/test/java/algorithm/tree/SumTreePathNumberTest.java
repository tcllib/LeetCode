package algorithm.tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTreePathNumberTest {
    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(null, 0),
                Arguments.of(TreeNode.build(new Integer[]{1,2,3}), 25),
                Arguments.of(TreeNode.build(new Integer[]{4,9,0,5,1}), 1026)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void name(TreeNode root, int result) {
        SumTreePathNumber sumTreePathNumber = new SumTreePathNumber();
        assertEquals(result, sumTreePathNumber.sumNumbers(root));
    }
}
