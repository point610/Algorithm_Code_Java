package LeetCode.Easy.LCR141;

/**
 * @ClassName LCR141
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 21:26
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
    public ListNode trainningPlan(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode listNode = new ListNode();
        listNode.next = new ListNode(head.val);
        head = head.next;
        while (head != null) {
            ListNode temp = new ListNode(head.val, listNode.next);
            head = head.next;
            listNode.next = temp;
        }
        return listNode.next;
    }
}

public class LCR141 {
}
