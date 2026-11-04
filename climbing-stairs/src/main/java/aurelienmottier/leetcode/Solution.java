package aurelienmottier.leetcode;

class Solution {

    public int climbStairs(int n) {

        if (n < 3) return n;

        int previous = 1;
        int result = 2;

        for(int i = 0; i < n-2; i++){
            int previousResult = result;
            result += previous;
            previous = previousResult;
        }

        return result;

    }

}