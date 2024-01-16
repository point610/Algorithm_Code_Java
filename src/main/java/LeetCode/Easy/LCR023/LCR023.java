package LeetCode.Easy.LCR023;

/**
 * @ClassName LCR023
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 21:41
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null) {
            ListNode point = headB;
            while (point != null) {
                if (point == headA) {
                    return point;
                }
                point = point.next;
            }
            headA = headA.next;
        }
        return null;
    }
}

public class LCR023 {
}
