package LeetCode.Middle.LeetCode92;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode92
 * @Description TODO
 * @Author point
 * @Date 2023/10/27 23:54
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> list = new ArrayList<>();
        ListNode point =head;
        while (point != null) {
            list.add(point.val);
            point = point.next;
        }
        left--;
        right--;
        for (int i = left, j = right; i < j; i++, j--) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        int index=0;
        point = head;
        while (point != null) {
            point.val = list.get(index);
            index++;
            point = point.next;
        }
return head;
    }
}

public class LeetCode92 {
}
