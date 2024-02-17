package CodeTop.TX.TX237;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public void deleteNode(ListNode node) {

        ListNode point = node.next;
        while (point.next != null) {
            node.val = point.val;
            node = node.next;
            point = point.next;
        }
        node.val = point.val;
        node.next = null;
    }
}

public class TX237 {
}
