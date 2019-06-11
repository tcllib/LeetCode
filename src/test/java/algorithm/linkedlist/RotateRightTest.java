package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RotateRightTest {
    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(ListNode.build(new int[] {1,2,3,4,5}), 2, ListNode.build(new int[] {4,5,1,2,3})),
                         Arguments.of(ListNode.build(new int[] {1,2}), 1, ListNode.build(new int[] {2,1})));
    }

    @ParameterizedTest
    @MethodSource("input")
    void name(ListNode head, int k, ListNode result) {
        RotateRight rotateRight = new RotateRight();
        assertEquals(result, rotateRight.rotateRight(head, k));
    }
}