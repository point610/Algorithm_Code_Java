package LeetCode.Middle.LeetCode147;

/**
 * @ClassName LeetCode147
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 12:01
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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = head;
        while (temp.next != null) {
            int min = temp.val;
            ListNode minPoint = temp;
            ListNode point = temp;
            // 找min值
            while (point != null) {
                if (point.val <= min) {
                    min = point.val;
                    minPoint = point;
                }
                point = point.next;
            }
            int t = temp.val;
            temp.val = minPoint.val;
            minPoint.val = t;
            temp = temp.next;
        }
        return head;
    }
}

public class LeetCode147 {
}
