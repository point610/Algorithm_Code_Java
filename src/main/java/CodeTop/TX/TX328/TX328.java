package CodeTop.TX.TX328;

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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode point = head.next.next;
        ListNode jjj = head;
        ListNode jjjhaed = new ListNode(0, jjj);
        ListNode ooo = head.next;
        ListNode ooohaed = new ListNode(0, ooo);
        ooo.next = null;
        jjj.next = null;

        int index = 1;
        while (point != null) {
            if (index % 2 == 0) {
                ooo.next = point;
                ooo = ooo.next;
                point = point.next;
                ooo.next = null;
            } else {
                jjj.next = point;
                jjj = jjj.next;
                point = point.next;
                jjj.next = null;
            }
            index++;
        }
        jjj.next = ooohaed.next;

        return jjjhaed.next;
    }
}

public class TX328 {
}
