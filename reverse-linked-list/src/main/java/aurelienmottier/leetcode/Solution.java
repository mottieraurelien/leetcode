package aurelienmottier.leetcode;

class Solution {

    public ListNode reverseList(ListNode head) {

        if (head == null) return null;

        ListNode reference = head;
        ListNode tail = new ListNode(reference.val);

        while(reference.next != null){
            tail = new ListNode(reference.next.val, tail);
            reference = reference.next;
        }

        return tail;

    }

}