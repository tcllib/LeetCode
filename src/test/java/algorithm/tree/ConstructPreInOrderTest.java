package algorithm.tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructPreInOrderTest {

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(null, null, null),
                Arguments.of(new int[]{}, new int[]{}, null),
                Arguments.of(new int[]{1}, new int[]{1}, TreeNode.build(new Integer[] {1})),
                Arguments.of(new int[]{1,2,3}, new int[]{2,1,3}, TreeNode.build(new Integer[] {1,2,3})),
                Arguments.of(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7}, TreeNode.build(new Integer[] {3,9,20,null,null,15,7}))
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void buildTree(int[] pre, int[] in, TreeNode result) {
        ConstructPreInOrder constructPreInOrder = new ConstructPreInOrder();
        assertEquals(result, constructPreInOrder.buildTree(pre, in));
    }
}