package CodeTop.HW.HW2;

import java.math.BigInteger;
import java.util.List;

/**
 * @ClassName HW2
 * @Description TODO
 * @Author point
 * @Date 2023/12/26 12:03
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        BigInteger one = getnumber(l1);
        BigInteger two = getnumber(l2);
        String temp = new StringBuilder(one.add(two).toString()).reverse().toString();
        ListNode head = new ListNode();
        ListNode point = head;
        for (Character cc : temp.toCharArray()) {
            point.next = new ListNode(cc - '0');
            point = point.next;
        }
        return head.next;
    }

    private BigInteger getnumber(ListNode one) {
        StringBuilder stringBuilder = new StringBuilder();
        while (one != null) {
            stringBuilder.insert(0, one.val);
            one = one.next;
        }
        return new BigInteger(stringBuilder.toString());
    }
}

public class HW2 {
}
