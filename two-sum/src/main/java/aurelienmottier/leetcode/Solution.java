package aurelienmottier.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * Time complexity : O(n)
     */
    public int[] twoSum(int[] nums, int target) {

        if (nums.length == 2 && nums[0] + nums[1] == target)
            return new int[]{0, 1};

        final Map<Integer, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            final int number = nums[i];
            final Integer existing = valueToIndex.get(target - number);
            if (existing != null) return new int[]{existing, i};
            valueToIndex.put(number, i);
        }

        return new int[0];

    }

}