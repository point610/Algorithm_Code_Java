package CodeTop.MT.MT143;

import java.util.List;
import java.util.TreeMap;

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
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }
        int size = 0;
        ListNode point = head;
        while (point != null) {
            size++;
            point = point.next;
        }
        if (size <= 2) {
            return;
        }

        ListNode one = head;
        for (int i = 1; i < size / 2; i++) {
            one = one.next;
        }
        ListNode two = reverse(one.next);
        one.next = null;
        one = head;

        int index = 0;
        while (one != null && two != null) {
            if (index % 2 == 0) {
                ListNode temp = one.next;
                one.next = two;
                one = temp;
            } else {
                ListNode temp = two.next;
                two.next = one;
                two = temp;
            }

            index++;
        }


    }

    private ListNode reverse(ListNode one) {
        ListNode pre = one;
        ListNode point = one.next;
        pre.next = null;
        while (point != null) {
            ListNode temp = point.next;
            point.next = pre;
            pre = point;

            point = temp;
        }
        return pre;
    }
}

public class MT143 {
}
