package CodeTop.TX.TX206;

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
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode point = head;
        ListNode pre = null;
        ListNode post = head.next;

        while (post != null) {
            point.next = pre;

            pre = point;
            point = post;
            post = post.next;

        }
        point.next = pre;

        return point;
    }
}

public class TX206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode point = head;
        for (int i = 2; i <= 5; i++) {
            ListNode temp = new ListNode(i);
            point.next = temp;
            point = point.next;
        }

        Solution solution = new Solution();
        solution.reverseList(head);
    }
}
