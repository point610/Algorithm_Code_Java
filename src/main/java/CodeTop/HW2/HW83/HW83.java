package CodeTop.HW2.HW83;

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
        ListNode point = head;
        while (point != null && point.next != null) {
            if (point.val == point.next.val) {
                point.next = point.next.next;
            } else {
                point = point.next;
            }
        }
        return head;
    }
}

public class HW83 {
}
