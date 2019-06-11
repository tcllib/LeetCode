package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDuplicatesIITest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(null, null),
                         Arguments.of(ListNode.build(new int[]{1}), ListNode.build(new int[]{1})),
                         Arguments.of(ListNode.build(new int[]{1,2,3}), ListNode.build(new int[]{1,2,3})),
                         Arguments.of(ListNode.build(new int[]{1,2,3,3,4,4,5}), ListNode.build(new int[]{1,2,3,4,5})));
    }

    @ParameterizedTest
    @MethodSource("input")
    void deleteDuplicates(ListNode list, ListNode result) {
        DeleteDuplicatesII deleteDuplicatesII = new DeleteDuplicatesII();
        assertEquals(result, deleteDuplicatesII.deleteDuplicates(list));
    }
}