package algorithm.tree;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(null, true),
                Arguments.of(TreeNode.build(new Integer[] {1,2,2,3,4,3,4}), false),
                Arguments.of(TreeNode.build(new Integer[] {1,2,2,3,4,4,3}), true),
                Arguments.of(TreeNode.build(new Integer[] {1,2,2,null,3,null,3}), false)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void isSymmetric(TreeNode tree, boolean result) {
        SymmetricTree symmetricTree = new SymmetricTree();
        assertEquals(result, symmetricTree.isSymmetric(tree));
    }
}