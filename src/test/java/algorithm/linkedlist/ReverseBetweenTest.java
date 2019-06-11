package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseBetweenTest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(ListNode.build(new int[]{}), 0, 0, null),
                         Arguments.of(ListNode.build(new int[]{1,2,3,4,5}), 2, 4, ListNode.build(new int[]{1,4,3,2,5})),
                         Arguments.of(ListNode.build(new int[]{1,2,3,4,5}), 1, 5, ListNode.build(new int[]{5,4,3,2,1})),
                         Arguments.of(ListNode.build(new int[]{1,2,3,4,5}), 1, 1, ListNode.build(new int[]{1,2,3,4,5})));
    }

    @ParameterizedTest
    @MethodSource("input")
    void reverseBetween(ListNode list, int m, int n, ListNode result) {
        ReverseBetween reverseBetween = new ReverseBetween();
        assertEquals(result, reverseBetween.reverseBetween(list, m, n));
    }
}