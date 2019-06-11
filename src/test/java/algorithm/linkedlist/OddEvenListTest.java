package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenListTest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(ListNode.build(new int[]{}),
                                      ListNode.build(new int[]{})),
                         Arguments.of(ListNode.build(new int[]{1,2,3,4}),
                                      ListNode.build(new int[]{1,3,2,4})),
                         Arguments.of(ListNode.build(new int[]{1,2,3,4,5}),
                                      ListNode.build(new int[]{1,3,5,2,4})));
    }

    @ParameterizedTest
    @MethodSource("input")
    void oddEvenList(ListNode input, ListNode result) {
        OddEvenList oddEvenList = new OddEvenList();
        assertEquals(result, oddEvenList.oddEvenList(input));
    }
}