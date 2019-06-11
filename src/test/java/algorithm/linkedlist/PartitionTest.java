package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PartitionTest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(ListNode.build(new int[]{1,2,3,4}), 1, ListNode.build(new int[]{1,2,3,4})),
                         Arguments.of(ListNode.build(new int[]{1,2,3,4}), 4, ListNode.build(new int[]{1,2,3,4})),
                         Arguments.of(ListNode.build(new int[]{1,4,3,2,5,2}), 3, ListNode.build(new int[]{1,2,2,4,3,5})));
    }

    @ParameterizedTest
    @MethodSource("input")
    void partition(ListNode list, int x, ListNode result) {
        Partition partition = new Partition();
        assertEquals(result, partition.partition(list, x));
    }
}