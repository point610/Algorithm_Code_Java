package CodeTop.HW.HW445;

import java.math.BigInteger;

/**
 * @ClassName HW445
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 21:52
 * @Version 1.0
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String ss = String.valueOf(new BigInteger(getnumber(l1)).add(new BigInteger(getnumber(l2))));
        ListNode head = new ListNode();
        ListNode point = head;

        for (Character cc : ss.toCharArray()) {
            point.next = new ListNode(cc - '0');
            point = point.next;
        }
        return head.next;


    }

    private String getnumber(ListNode node) {
        if (node == null) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.val);
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
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

public class HW445 {
}
