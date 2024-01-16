package CodeTop.HW.HW83;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName HW83
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 15:12
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode point = head;
        while (point.next != null) {
            if (set.contains(point.next.val)) {
                point.next = point.next.next;
            } else {
                set.add(point.next.val);
                point = point.next;
            }
        }
        return head;

    }
}

public class HW83 {
}
