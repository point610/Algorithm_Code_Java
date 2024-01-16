package CodeTop.HW.HW92;

import java.util.List;

/**
 * @ClassName HW92
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 19:28
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode res = new ListNode(0, head);
        ListNode point = res;
        for (int i = 0; i < left - 1; i++) {
            point = point.next;
        }
        ListNode rrr = point.next;
        for (int i = left; i < right; i++) {
            ListNode temp = rrr.next;
            rrr.next = temp.next;
            temp.next = point.next;
            point.next = temp;
        }
        return res.next;
    }
}

public class HW92 {
}
