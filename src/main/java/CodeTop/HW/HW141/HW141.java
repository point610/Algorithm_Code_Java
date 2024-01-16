package CodeTop.HW.HW141;


/**
 * @ClassName HW141
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 16:07
 * @Version 1.0
 */
class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow;
        ListNode fast;
        try {
            slow = head.next;
            fast = head.next.next;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

public class HW141 {
}
