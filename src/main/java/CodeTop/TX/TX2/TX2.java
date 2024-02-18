package CodeTop.TX.TX2;


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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode one = l1;
        ListNode two = l2;
        int upper = 0;
        ListNode head = new ListNode();
        ListNode point = head;

        while (one != null && two != null) {
            int sum = upper + one.val + two.val;
            ListNode node = new ListNode(sum % 10);
            upper = sum / 10;

            point.next = node;
            point = point.next;

            one = one.next;
            two = two.next;
        }

        while (one != null) {
            int sum = upper + one.val;
            ListNode node = new ListNode(sum % 10);
            upper = sum / 10;

            point.next = node;
            point = point.next;

            one = one.next;
        }

        while (two != null) {
            int sum = upper + two.val;
            ListNode node = new ListNode(sum % 10);
            upper = sum / 10;

            point.next = node;
            point = point.next;

            two = two.next;
        }
        if (upper == 1) {
            point.next = new ListNode(1);
        }

        return head.next;
    }
}

public class TX2 {
}
