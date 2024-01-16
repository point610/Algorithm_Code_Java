package CodeTop.HW.HW21;

import java.util.List;

/**
 * @ClassName HW21
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 17:13
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode head = new ListNode();
        ListNode point = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                point.next = list1;
                list1 = list1.next;
                point = point.next;
                point.next = null;
            } else {
                point.next = list2;
                list2 = list2.next;
                point = point.next;
                point.next = null;
            }
        }
        if (list1 != null) {
            point.next = list1;
        }
        if (list2 != null) {
            point.next = list2;
        }


        return head.next;

    }
}

public class HW21 {
}
