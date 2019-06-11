package algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SwapPairsTest {

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(ListNode.build(new int[] {1,2,3}), ListNode.build(new int[] {2,1,3})),
                         Arguments.of(ListNode.build(new int[] {1,2,3,4}), ListNode.build(new int[] {2,1,4,3})));
    }

    @ParameterizedTest
    @MethodSource("input")
    void swapPairs(ListNode list, ListNode result) {
        SwapPairs swapPairs = new SwapPairs();
        assertEquals(result, swapPairs.swapPairs(list));
    }
}