package aurelienmottier.leetcode;

class Solution {

    public int search(int[] nums, int target) {

        int first = 0;
        int last = nums.length - 1;

        while(first <= last){

            int half = first + ((last - first) / 2);
            final int value = nums[half];

            if (target == value) return half;

            if (value < target) first = ++half;
            else last = --half;

        }

        return -1;

    }

}