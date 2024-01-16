package LeetCode.Middle.LeetCode82;

/**
 * @ClassName LeetCode82
 * @Description TODO
 * @Author point
 * @Date 2023/10/27 22:36
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
    public ListNode deleteDuplicates(ListNode head) {
        int[] list = new int[201];
        while (head != null) {
            list[head.val + 100]++;
            head = head.next;
        }
        ListNode listNode = new ListNode();
        ListNode point = listNode;
        for (int i = 0; i <= 200; i++) {
            if (list[i] == 1) {
                point.next = new ListNode(i-100);
                point = point.next;
            }
        }
        return listNode.next;


    }
}

public class LeetCode82 {
}
