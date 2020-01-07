package algorithm.tree;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthTest {

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(TreeNode.build(null), 0),
                Arguments.of(TreeNode.build(new Integer[]{3, 9, 20, null, null, 15, 7}), 3)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void maxDepth(TreeNode root, int result) {
        MaxDepth maxDepth = new MaxDepth();
        assertEquals(result, maxDepth.maxDepth(root));
    }
}