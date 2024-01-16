package LeetCode.Easy.LCR142;


/**
 * @ClassName LCR142
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 21:12
 * @Version 1.0
 */

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
    public ListNode trainningPlan(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode point = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                point.next = new ListNode(l1.val);
                point = point.next;
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                point.next = new ListNode(l2.val);
                point = point.next;
                l2 = l2.next;
            } else {
                point.next = new ListNode(l1.val);
                point = point.next;
                l1 = l1.next;
                point.next = new ListNode(l2.val);
                point = point.next;
                l2 = l2.next;
            }
        }
        while (l1 != null ) {

                point.next = new ListNode(l1.val);
                point = point.next;
                l1 = l1.next;

        }
        while ( l2 != null) {

                point.next = new ListNode(l2.val);
                point = point.next;
                l2 = l2.next;

        }

        return head.next;
    }
}

public class LCR142 {
}
