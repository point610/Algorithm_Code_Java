package temp.xp.xp1;

import java.util.*;


class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}


public class Solution {
    public ListNode Rotate(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        int size = 0;
        ListNode point = head;
        while (point != null) {
            size++;
            point = point.next;
        }
        k = k % size;

        ListNode one = head;
        ListNode two = head;

        for (int i = 0; i < k; i++) {
            one = one.next;
        }
        while (one.next != null) {
            one = one.next;
            two = two.next;
        }
        one.next = head;

        ListNode res = two.next;

        two.next = null;
        return res;
    }
}



























