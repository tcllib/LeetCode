package algorithm.string;

import org.junit.jupiter.api.Test;

import java.util.List;

class ThreeSumTest {
    @Test
    void name() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> lists = threeSum.threeSum(new int[] {-1,0,1,2,-1,-4});
        System.out.println(lists);
    }
}
