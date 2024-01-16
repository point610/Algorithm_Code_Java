package LeetCode.Easy.MS.MS0202;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MS0202
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 22:43
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
    public int kthToLast(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.get(list.size() - k);
    }
}

public class MS0202 {
}
