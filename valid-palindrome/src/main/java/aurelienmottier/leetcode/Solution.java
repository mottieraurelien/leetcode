package aurelienmottier.leetcode;

public class Solution {

    public boolean isPalindrome(String s) {

        int begIndex = 0;
        int endIndex = s.length() - 1;

        while (begIndex < endIndex) {

            final char begChar = s.charAt(begIndex);
            if(!Character.isLetterOrDigit(begChar)) {
                begIndex++;
                continue;
            }

            final char endChar = s.charAt(endIndex);
            if(!Character.isLetterOrDigit(endChar)) {
                endIndex--;
                continue;
            }

            if (Character.toString(begChar).equalsIgnoreCase(Character.toString(endChar))){
                begIndex++;
                endIndex--;
            }

            else return false;

        }

        return true;

    }

}