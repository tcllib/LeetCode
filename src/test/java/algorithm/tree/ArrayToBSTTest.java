package algorithm.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToBSTTest {

    @Test
    void name(int[] input, TreeNode result) {
        ArrayToBST arrayToBST = new ArrayToBST();
        assertEquals(result, arrayToBST.sortedArrayToBST(input));
    }
}
