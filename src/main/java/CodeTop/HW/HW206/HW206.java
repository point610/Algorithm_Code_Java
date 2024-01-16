package CodeTop.HW.HW206;

import java.util.List;

/**
 * @ClassName HW206
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 15:03
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
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return head;
        }
        ListNode res = new ListNode();
        res.next = head;
        ListNode point = head.next;
        while (point != null) {
            head.next = point.next;
            point.next = res.next;
            res.next = point;

            point = head.next;

        }
        return res.next;
    }
}

public class HW206 {
}
