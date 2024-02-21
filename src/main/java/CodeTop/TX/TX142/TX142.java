package CodeTop.TX.TX142;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != slow) {
            slow = slow.next;
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
        }

        fast = head;
        while (true) {
            if (fast == slow) {
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
    }
}

public class TX142 {
}
