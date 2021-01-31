import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private Map<Integer, Integer[]> allTests= new HashMap();

    @BeforeEach
    void setUp() {
        Integer[] nums1, nums2, nums3;
        Integer target1, target2, target3;
        nums1 = new Integer[]{2, 7, 11, 15};
        target1 = 9;
        nums2 = new Integer[]{3, 2, 4};
        target2 = 6;
        nums3 = new Integer[]{3, 3};
        target3 = 6;

        allTests.put(target1, nums1);
        allTests.put(target2, nums2);
        allTests.put(target3, nums3);
    }

    @Test
    void twoSumHashMap() {
        TwoSum twoSum = new TwoSum();
        for (Map.Entry<Integer, Integer[]> entry: allTests.entrySet()){
            Integer target = entry.getKey();
            Integer[] nums = entry.getValue();
            assertArrayEquals(twoSum.twoSumNaive(nums, target), twoSum.twoSumHashMap(nums, target));
        }
    }
}