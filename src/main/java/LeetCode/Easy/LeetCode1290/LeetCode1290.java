package LeetCode.Easy.LeetCode1290;

/**
 * @ClassName LeetCode1290
 * @Description TODO
 * @Author point
 * @Date 2023/9/13 11:33
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
    public int getDecimalValue(ListNode head) {
        int res = 0;
        while (head != null) {
            res <<= 1;
            res += head.val;
            head = head.next;
        }
        return res;
    }
}

public class LeetCode1290 {
}
