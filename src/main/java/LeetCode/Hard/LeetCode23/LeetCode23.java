package LeetCode.Hard.LeetCode23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName LeetCode23
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 0:48
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
    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return lists[0];
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                res.add(temp.val);
                temp = temp.next;
            }
        }
        res.sort(Comparator.naturalOrder());
        int resSize = res.size();
        ListNode head = new ListNode();
        ListNode point = head;
        for (int i = 0; i < resSize; i++) {
            point.next = new ListNode(res.get(i));
            point = point.next;
        }

        return head.next;
    }
}

public class LeetCode23 {
}
