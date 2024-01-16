package CodeTop.HW.HW24;

import java.util.List;

/**
 * @ClassName HW24
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 22:03
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
    public ListNode swapPairs(ListNode head) {
        ListNode point = head;

        while (point != null && point.next != null) {
            int temp = point.val;
            point.val = point.next.val;
            point.next.val = temp;

            point = point.next;
            if (point != null) {
                point = point.next;
            }
        }
        return head;
    }
}

public class HW24 {
}
