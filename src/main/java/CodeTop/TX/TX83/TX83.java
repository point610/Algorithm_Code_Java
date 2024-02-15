package CodeTop.TX.TX83;

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
        if (head == null) {
            return head;
        }

        ListNode point = head;
        while (point.next != null) {
            if (point.next.val == point.val) {
                point.next = point.next.next;
            } else {
                point = point.next;
            }
        }

        return head;
    }
}

public class TX83 {
}
