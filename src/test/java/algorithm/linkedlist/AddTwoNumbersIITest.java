package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersIITest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(ListNode.build(new int[]{}),
                                      ListNode.build(new int[]{}),
                                      ListNode.build(new int[]{})),
                         Arguments.of(ListNode.build(new int[]{1}),
                                      ListNode.build(new int[]{9}),
                                      ListNode.build(new int[]{1,0})),
                         Arguments.of(ListNode.build(new int[]{1}),
                                      ListNode.build(new int[]{1}),
                                      ListNode.build(new int[]{2})),
                         Arguments.of(ListNode.build(new int[]{1,1,1}),
                                      ListNode.build(new int[]{9,9,9}),
                                      ListNode.build(new int[]{1,1,1,0})));
    }

    @ParameterizedTest
    @MethodSource("input")
    void addTwoNumbers(ListNode l1, ListNode l2, ListNode result) {
        AddTwoNumbersII addTwoNumbersII = new AddTwoNumbersII();
        assertEquals(result, addTwoNumbersII.addTwoNumbers(l1, l2));
    }
}