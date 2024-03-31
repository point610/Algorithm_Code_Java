package temp.tx.tx2;

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public boolean[] canSorted(ListNode[] lists) {
        int size = lists.length;
        boolean[] res = new boolean[size];
        for (int i = 0; i < size; i++) {
            res[i] = can(lists[i]);
        }
        return res;
    }

    private boolean can(ListNode node) {
        if (node == null || node.next == null) {
            return true;
        }
        int sum = 0;
        int head = node.val;
        while (node.next != null) {
            if (node.val > node.next.val) {
                sum++;
            }
            node = node.next;
        }
        int end = node.val;

        if (sum > 1) {
            return false;
        }
        if (sum == 0) {
            return true;
        }
        return (head > end);
    }
}






















