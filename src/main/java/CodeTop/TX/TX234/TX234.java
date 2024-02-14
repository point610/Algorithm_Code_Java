package CodeTop.TX.TX234;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode one = getslowpoint(head);
        ListNode two = reverse(one.next);

        while (two != null) {
            if (two.val != head.val) {
                return false;
            }
            two = two.next;
            head = head.next;
        }
        return true;

    }

    private ListNode reverse(ListNode temp) {
        ListNode pre = null;
        ListNode current = temp;
        while (current != null) {
            ListNode ttt = current.next;

            current.next = pre;

            pre = current;
            current = ttt;
        }
        return pre;
    }

    private ListNode getslowpoint(ListNode temp) {

        ListNode slow = temp;
        ListNode fast = temp;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

public class TX234 {
}
