package LeetCode.Easy.LCR024;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LCR024
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 21:43
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
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new LinkedList<>();
        ListNode point = head;
        while (point != null) {
            list.add(point.val);
            point = point.next;
        }
        int index = list.size()-1;
        point = head;
        while (point != null) {
            point.val=list.get(index--);
            point = point.next;
        }
        return head;

    }
}

public class LCR024 {
}
