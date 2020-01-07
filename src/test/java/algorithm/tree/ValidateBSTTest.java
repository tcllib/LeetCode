package algorithm.tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidateBSTTest {


    private static Stream<Arguments> getTestInputs() {
        return Stream.of(
                Arguments.of(TreeNode.build(new Integer[]{2,1,3}), true),
                Arguments.of(TreeNode.build(new Integer[]{5,1,4,null,null,3,6}), false),
                Arguments.of(TreeNode.build(new Integer[]{2,1,3}), true),
                Arguments.of(TreeNode.build(new Integer[]{2,1,3}), true)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestInputs")
    void isValidBST(TreeNode root, Boolean expectedValue) {
        ValidateBST validateBST = new ValidateBST();
        assertEquals(expectedValue, validateBST.isValidBST(root));
    }
}