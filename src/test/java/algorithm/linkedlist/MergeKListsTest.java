package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeKListsTest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(new ListNode[]{}, null),
                         Arguments.of(new ListNode[]{null}, null),
                         Arguments.of(new ListNode[]{ListNode.build(new int[]{1, 4, 5}),
                                 ListNode.build(new int[]{1,3,4}),
                                 ListNode.build(new int[]{2,6})}, ListNode.build(new int[]{1,1,2,3,4,4,5,6})));
    }

    @ParameterizedTest
    @MethodSource("input")
    void mergeKLists(ListNode[] lists, ListNode result) {
        MergeKLists mergeKLists = new MergeKLists();
        assertEquals(result, mergeKLists.mergeKLists(lists));
    }
}