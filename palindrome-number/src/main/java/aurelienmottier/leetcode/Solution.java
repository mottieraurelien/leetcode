package aurelienmottier.leetcode;

public class Solution {

    public boolean isPalindrome(int x) {

        // A negative number cannot be palindrome :
        if (x < 0) return false;

        // A number with 2 figures is a palindrome if it can be divided by 11 (11, 22, ..) :
        if (x >= 10 && x <= 99) return x % 11 == 0;

        // Starting from 3 figures, we must compare each "side" until reaching the middle :
        final String number = "" + x;
        final int length = number.length();
        int leftIndex = 0;
        int rightIndex = length - 1;
        for (int i = 1; i <= length / 2; i++) {
            if (number.charAt(leftIndex) != number.charAt(rightIndex)) return false;
            leftIndex++;
            rightIndex--;
        }
        return true;

    }

}