package LeetCode.Easy.MS.MS0203;

/**
 * @ClassName MS0203
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 22:45
 * @Version 1.0
 */

class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public void deleteNode(ListNode node) {

        while (node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val=node.next.val;
        node.next = null;
    }
}

public class MS0203 {
}
