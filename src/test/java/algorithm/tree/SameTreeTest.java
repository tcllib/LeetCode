package algorithm.tree;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    private static Stream<Arguments> test() {
        return Stream.of(Arguments.of(
                TreeNode.build(new Integer[] {1,2,3}), TreeNode.build(new Integer[] {1,2,3}), true
        ));
    }

    @ParameterizedTest
    @MethodSource("test")
    void isSameTree(TreeNode treeA, TreeNode treeB, boolean result) {
        SameTree sameTree = new SameTree();
        assertEquals(result, sameTree.isSameTree(treeA, treeB));
    }
}