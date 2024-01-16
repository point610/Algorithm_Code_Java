package CodeTop.HW.HW19;

import javax.swing.tree.TreeNode;

/**
 * @ClassName HW19
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 22:45
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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode point = head;
        while (point != null) {
            point = point.next;
            size++;
        }

        ListNode lll = new ListNode(0, head);
        point = lll;

        for (int i = 0; i < size - n; i++) {
            point = point.next;
        }
        point.next = point.next.next;
        return lll.next;
    }
}

public class HW19 {
}
