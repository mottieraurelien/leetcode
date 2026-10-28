package aurelienmottier.leetcode;

class Solution {

    public int maxProfit(int[] prices) {

        int bestResultSoFar = 0;

        int lastIndex = prices.length - 1;

        int min = 10000;
        int max = prices[lastIndex];

        for (int i = lastIndex - 1;i >= 0; i--) {

            int price = prices[i];

            if (max - price > bestResultSoFar) {
                bestResultSoFar = max - price;
                continue;
            }

            if (price < min) min = price;

            if (price > max) max = price;

        }

        return bestResultSoFar;

    }

}