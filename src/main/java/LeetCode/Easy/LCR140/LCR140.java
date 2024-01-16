package LeetCode.Easy.LCR140;

/**
 * @ClassName LCR140
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 21:22
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
    public ListNode trainingPlan(ListNode head, int cnt) {
        ListNode point = head;
        int size = 0;
        while (point != null) {
            size++;
            point = point.next;
        }

        for (int i = 0; i < size - cnt; i++) {
            head = head.next;
        }


        return head;
    }
}

public class LCR140 {
}
