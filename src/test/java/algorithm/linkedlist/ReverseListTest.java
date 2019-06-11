package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(null, null),
                         Arguments.of(ListNode.build(new int[]{1,2,3,4}), ListNode.build(new int[]{4,3,2,1})),
                         Arguments.of(ListNode.build(new int[]{1,1,1,1}), ListNode.build(new int[]{1,1,1,1})));
    }

    @ParameterizedTest
    @MethodSource("input")
    void reverseList(ListNode list, ListNode result) {
        ReverseList reverseList = new ReverseList();
        assertEquals(result, reverseList.reverseList(list));
    }
}