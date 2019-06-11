package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortListTest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(null, null),
                         Arguments.of(ListNode.build(new int[]{-1,5,3,4,0}), ListNode.build(new int[]{-1,0,3,4,5})),
                         Arguments.of(ListNode.build(new int[]{4,2,1,3}), ListNode.build(new int[]{1,2,3,4})),
                         Arguments.of(ListNode.build(new int[]{1,2,3}), ListNode.build(new int[]{1,2,3})),
                         Arguments.of(ListNode.build(new int[]{1,1,1}), ListNode.build(new int[]{1,1,1})),
                         Arguments.of(ListNode.build(new int[]{1}), ListNode.build(new int[]{1})));
    }

    @ParameterizedTest
    @MethodSource("input")
    void insertionSortList(ListNode list, ListNode result) {
        InsertionSortList insertionSortList = new InsertionSortList();
        assertEquals(result, insertionSortList.insertionSortList(list));
    }
}