package CodeTop.TX.TXLCR141;

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
    public ListNode trainningPlan(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode point = head;
        ListNode pre = null;
        while (point != null) {
            ListNode temp = point.next;

            point.next = pre;

            pre = point;
            point = temp;
        }
        return pre;
    }
}

public class TXLCR141 {
}
