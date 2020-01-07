package algorithm.tree;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KthSamllestBSTTest {

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(TreeNode.build(new Integer[] {3,1,4,null,2}), 1, 1),
                Arguments.of(TreeNode.build(new Integer[] {5,3,6,2,4,null,null,1}), 3, 3),
                Arguments.of(TreeNode.build(new Integer[] {5}), 1, 5),
                Arguments.of(TreeNode.build(new Integer[] {1,null,2}), 2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("input")
    void kthSmallest(TreeNode root, int k, int kthSmallest) {
        KthSamllestBST kthSamllestBST = new KthSamllestBST();
        assertEquals(kthSmallest, kthSamllestBST.kthSmallest(root, k));
    }
}