package aurelienmottier.leetcode;

public class ListNode {

    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public final boolean equals(final Object other) {
        if (!(other instanceof ListNode anotherListNode)) return false;
        if (anotherListNode.next != null) return anotherListNode.next.equals(this.next);
        return this.val == anotherListNode.val;
    }

}