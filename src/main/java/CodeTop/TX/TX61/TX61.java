package CodeTop.TX.TX61;

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int size = 1;
        ListNode point = head;
        while (point.next != null) {
            size++;
            point = point.next;
        }

        int step = size - k % size;
        if (k % size == 0 || step == 0) {
            return head;
        }
        ListNode mid = head;
        for (int i = 0; i < step - 1; i++) {
            mid = mid.next;
        }
        ListNode newHead = mid.next;
        mid.next = null;

        point.next = head;
        return newHead;
    }
}

public class TX61 {
}
