package LeetCode.Easy.MS.MS0201;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName MS0201
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 22:37
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
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head==null){
            return head;
        }
        ListNode point = head;
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        while (point.next != null) {
            if (set.contains(point.next.val)) {
                point.next = point.next.next;
            } else {
                point = point.next;
                set.add(point.val);
            }
        }
        return head;
    }
}

public class MS0201 {
}
