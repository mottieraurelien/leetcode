package aurelienmottier.leetcode;

class Solution {

    public ListNode mergeTwoLists(ListNode firstList, ListNode secondList) {

        ListNode reference = new ListNode();
        ListNode root = reference;

        while (firstList != null || secondList != null) {

            final ListNode node;

            if (firstList != null && secondList != null && firstList.val <= secondList.val) {
                node = new ListNode(firstList.val);
                firstList = firstList.next;

            } else if (firstList != null && secondList != null) {
                node = new ListNode(secondList.val);
                secondList = secondList.next;

            } else if (firstList != null) {
                node = new ListNode(firstList.val);
                firstList = firstList.next;

            } else {
                node = new ListNode(secondList.val);
                secondList = secondList.next;

            }

            reference.next = reference = node;

        }

        return root.next;

    }

}