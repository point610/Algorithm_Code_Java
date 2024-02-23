package CodeTop.TX.TX82;

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

        ListNode res = new ListNode(0, head);
        ListNode pre = res;
        ListNode point = head;

        boolean same = false;

        while (point.next != null) {
            if (point.val == point.next.val) {
                point.next = point.next.next;
                same = true;
            } else {
                point = point.next;
                if (same) {
                    pre.next = pre.next.next;
                }else {
                    pre = pre.next;
                }
                same = false;
            }
        }
        if (same){
            pre.next = pre.next.next;
        }

        return res.next;
    }
}

public class TX82 {
}
