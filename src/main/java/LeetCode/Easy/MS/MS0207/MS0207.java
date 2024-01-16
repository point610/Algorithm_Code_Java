package LeetCode.Easy.MS.MS0207;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName MS0207
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 22:50
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
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}

public class MS0207 {
}
