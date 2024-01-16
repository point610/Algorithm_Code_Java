package LeetCode.Middle.LeetCode143;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode143
 * @Description TODO
 * @Author point
 * @Date 2023/11/11 22:54
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
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode point = head;
        List<ListNode> list = new ArrayList<>();
        while (point != null) {
            list.add(point);
            point = point.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            list.get(left).next = list.get(right);
            left++;

            list.get(right).next = list.get(left);
            right--;
        }
        list.get(left).next = null;

    }
}

public class LeetCode143 {
}
