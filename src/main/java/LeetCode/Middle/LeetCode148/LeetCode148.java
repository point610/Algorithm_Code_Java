package LeetCode.Middle.LeetCode148;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName LeetCode148
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 11:37
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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            list.add(temp.val);
            size++;
            temp = temp.next;
        }
        list.sort(Comparator.naturalOrder());
        temp = head;
        for (int i = 0; i < size; i++) {
            temp.val = list.get(i);
            temp = temp.next;
        }
        return head;
    }
}

public class LeetCode148 {
}
