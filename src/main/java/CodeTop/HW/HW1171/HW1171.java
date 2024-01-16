package CodeTop.HW.HW1171;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName HW1171
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 12:00
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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();

        ListNode prehead = new ListNode(0, head);
        int sum = 0;
        for (ListNode current = prehead; current != null; current = current.next) {
            sum += current.val;
            map.put(sum, current);
        }

        sum = 0;
        for (ListNode current = prehead; current != null; current = current.next) {
            sum += current.val;
            if (map.containsKey(sum)) {
                current.next = map.get(sum).next;
            }
        }
        return prehead.next;
    }
}

public class HW1171 {
}
