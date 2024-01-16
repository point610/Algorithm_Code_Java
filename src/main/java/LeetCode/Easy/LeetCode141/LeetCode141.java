package LeetCode.Easy.LeetCode141;

/**
 * @ClassName LeetCode141
 * @Description TODO
 * @Author point
 * @Date 2023/7/29 19:27
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
        ListNode temp = head;

        for (int i = 0; i < 10000; i++) {
            if (temp.next != null) {
                temp = temp.next;
            } else {
                return false;
            }
        }
        ListNode point = temp.next;
        for (int i = 0; i < 10000; i++) {
            if (temp != point) {
                point = point.next;
            } else {
                return true;
            }
        }
        return false;
    }
}

public class LeetCode141 {
}
