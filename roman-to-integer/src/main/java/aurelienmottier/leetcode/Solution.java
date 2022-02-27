package aurelienmottier.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<Character, Integer> VALUE_BY_NUMERAL;

    static {
        VALUE_BY_NUMERAL = new HashMap<>();
        VALUE_BY_NUMERAL.put('I', 1);
        VALUE_BY_NUMERAL.put('V', 5);
        VALUE_BY_NUMERAL.put('X', 10);
        VALUE_BY_NUMERAL.put('L', 50);
        VALUE_BY_NUMERAL.put('C', 100);
        VALUE_BY_NUMERAL.put('D', 500);
        VALUE_BY_NUMERAL.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        int previousValue = 0;
        for (final char numeral : s.toCharArray()) {
            int value = VALUE_BY_NUMERAL.get(numeral);
            if (value > previousValue) value -= previousValue * 2;
            result += previousValue = value;
        }
        return result;
    }

}