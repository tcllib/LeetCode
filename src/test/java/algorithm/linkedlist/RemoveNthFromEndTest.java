package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthFromEndTest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(ListNode.build(new int[] {1,2,3,4,5}), 2, ListNode.build(new int[]{1,2,3,5})),
                         Arguments.of(ListNode.build(new int[] {1}), 1, null));
    }

    @ParameterizedTest
    @MethodSource("input")
    void removeNthFromEnd(ListNode node, int n, ListNode result) {
        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
        assertEquals(result, removeNthFromEnd.removeNthFromEnd(node, n));
    }
}