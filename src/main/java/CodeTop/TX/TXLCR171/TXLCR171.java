package CodeTop.TX.TXLCR171;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode one = headA;
        ListNode two = headB;
        boolean done = false;
        while (one != null && two != null) {
            if (one == two) {
                return one;
            }

            if (one.next == null && done) {
                return null;
            }

            if (one.next == null) {
                one = headB;
                done = true;
            } else {
                one = one.next;
            }

            if (two.next == null) {
                two = headA;
            } else {
                two = two.next;
            }
        }
        return null;
    }
}

public class TXLCR171 {
}
