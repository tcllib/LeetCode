package algorithm.tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeLevelOrderTraversalTest {

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(TreeNode.build(new Integer[]{3,9,20,null,null,15,7}),
                             Arrays.asList(
                                     Arrays.asList(3),
                                     Arrays.asList(9,20),
                                     Arrays.asList(15, 7)
                             )),
                Arguments.of(null, new ArrayList<List<Integer>>())
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void levelOrder(TreeNode root, List<List<Integer>> result) {
        BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        assertList(result, binaryTreeLevelOrderTraversal.levelOrderWithQueue(root));
    }

    private void assertList(List<List<Integer>> expected, List<List<Integer>> actual) {
        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(0), actual.get(0));
        }
    }
}