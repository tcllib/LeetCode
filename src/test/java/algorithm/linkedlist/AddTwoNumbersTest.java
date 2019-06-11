package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(ListNode.build(new int[]{2,4,3}),
                                      ListNode.build(new int[]{5,6,4}),
                                      ListNode.build(new int[]{7,0,8})),
                         Arguments.of(ListNode.build(new int[]{5}),
                                      ListNode.build(new int[]{5}),
                                      ListNode.build(new int[]{0,1})));
    }

    @ParameterizedTest
    @MethodSource("input")
    void addTwoNumbers(ListNode l1, ListNode l2, ListNode result) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        assertEquals(result, addTwoNumbers.addTwoNumbers(l1, l2));
    }
}