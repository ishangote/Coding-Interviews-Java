import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public Integer[] twoSumNaive(Integer[] nums, Integer target){
        Integer[] res = new Integer[2];
        for (Integer i = 0; i < nums.length - 1; i++){
            for (Integer j = i + 1; j < nums.length; j++){

                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }

    public Integer[] twoSumHashMap(Integer[] nums, Integer target){

        Map<Integer, Integer> numsMap;
        numsMap = new HashMap<>();
        Integer[] res = new Integer[2];

        for (Integer idx = 0; idx < nums.length; idx++){
            if (numsMap.containsKey(nums[idx])){
                res[0] = numsMap.get(nums[idx]);
                res[1] = idx;
                return res;
            } else {
                numsMap.put(target - nums[idx], idx);
            }
        }
        return null;
    }
}