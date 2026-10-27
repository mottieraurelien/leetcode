package aurelienmottier.leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Solution {

    private static final Map<Character, Character> OPENINGS = new HashMap<>();
    static {
        OPENINGS.put('(', ')');
        OPENINGS.put('{', '}');
        OPENINGS.put('[', ']');
    }

    public boolean isValid(final String sentence) {

        final Deque<Character> remainedOpened = new LinkedList<>();

        for(final Character current : sentence.toCharArray()){

            final Character corresponding = OPENINGS.get(current);

            if(corresponding != null) {
                remainedOpened.addFirst(corresponding);
                continue;
            }

            if(remainedOpened.isEmpty()) return false;

            final Character expected = remainedOpened.poll();
            if(current != expected) return false;

        }

        return remainedOpened.isEmpty();

    }

}