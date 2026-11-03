package aurelienmottier.leetcode;

import java.util.Deque;
import java.util.LinkedList;

class Solution {

    // Can you solve this by filling nums1 from back to front to avoid overwriting unprocessed elements?
    // Suggestions: Simplify the complex conditional logic and remove the auxiliary deque for cleaner code.
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int currentIndexArrayTwo = 0;

        final Deque<Integer> pendingForPlacement = new LinkedList<>();

        for (int i = 0; i < nums1.length; i++) {

            boolean queueing = !pendingForPlacement.isEmpty();

            // Collects all the values to compare:
            final int currentFirstArrayValue = i < m ? nums1[i] : Integer.MAX_VALUE;
            final int currentPendingValue =  queueing ? pendingForPlacement.getFirst() : Integer.MAX_VALUE;
            final int currentSecondArrayValue = currentIndexArrayTwo < n ? nums2[currentIndexArrayTwo] : Integer.MAX_VALUE;

            // Determines which one is the lowest:
            final int lowestAmongAll = Math.min(Math.min(currentFirstArrayValue, currentPendingValue), currentSecondArrayValue);

            // If the lowest is the one seating at the current index, then we don't touch it and keep iterating over the first array:
            if (lowestAmongAll == currentFirstArrayValue) {
                if (i >= m && queueing) nums1[i] = pendingForPlacement.removeFirst();
                continue;
            }

            // If the lowest is the one from the second array, then we need to back up the existing value (if non-zero):
            if (lowestAmongAll == currentSecondArrayValue) {
                if (i < m) pendingForPlacement.addLast(currentFirstArrayValue);
                nums1[i] = currentSecondArrayValue;
                currentIndexArrayTwo++;
                continue;
            }

            // If the lowest is the one that got queued, then we need to back up the existing value (if non-zero):
            if (i < m) pendingForPlacement.addLast(currentFirstArrayValue);
            nums1[i] = pendingForPlacement.removeFirst();

        }

    }

}