package LeetCode.Easy.LCR136;

/**
 * @ClassName LCR136
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 11:32
 * @Version 1.0
 */

class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode point = head;
        if (head.val == val) {
            return head.next;
        }
        while (point.next != null && point.next.val != val) {
            point = point.next;
        }
        if (point.next!=null){
            point.next = point.next.next;
        }
        return head;
    }
}

public class LCR136 {
}
