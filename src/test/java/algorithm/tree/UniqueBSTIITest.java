package algorithm.tree;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UniqueBSTIITest {

    private static Stream<Arguments> input() {
        return Stream.of(
//                Arguments.of(0, List.of()),
//                Arguments.of(1, List.of(new TreeNode(1))),
//                Arguments.of(2, List.of(TreeNode.build(new Integer[] {1,null,2}),
//                                        TreeNode.build(new Integer[] {2,1}))),
                Arguments.of(4, List.of(TreeNode.build(new Integer[] {1,null,2,null,3}),
                                        TreeNode.build(new Integer[] {1,null,3,2}),
                                        TreeNode.build(new Integer[] {2,1,3}),
                                        TreeNode.build(new Integer[] {3,1,null,null,2}),
                                        TreeNode.build(new Integer[] {3,2,null,1})))
        );
    }

    @ParameterizedTest
    @MethodSource("input")
    void generateTrees(int n, List<TreeNode> expectedList) {
        UniqueBSTII uniqueBSTII = new UniqueBSTII();
        List<TreeNode> treeNodes = uniqueBSTII.generateTrees(n);
//        assertArrayEquals(expectedList.toArray(), uniqueBSTII.generateTreesRecur(n).toArray());
        assertArrayEquals(expectedList.toArray(), treeNodes.toArray());
    }

    @Test
    void should_get_right_most() {
        UniqueBSTII uniqueBSTII = new UniqueBSTII();
//        assertEquals(new TreeNode(3), uniqueBSTII.getRightMostNode(TreeNode.build(new Integer[]{1, null, 2, null, 3})));
        assertEquals(new TreeNode(3), uniqueBSTII.getRightMostNode(TreeNode.build(new Integer[]{1,null,3,2})));
    }
}