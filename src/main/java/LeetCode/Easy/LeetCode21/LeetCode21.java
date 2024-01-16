package LeetCode.Easy.LeetCode21;

/**
 * @ClassName LeetCode21
 * @Description TODO
 * @Author point
 * @Date 2023/8/5 1:01
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode one = list1;
        ListNode two = list2;
        ListNode res = new ListNode();
        ListNode resPoint = res;
        while (one != null && two != null) {
            if (one.val <= two.val) {
                resPoint.next = one;
                resPoint = resPoint.next;
                one = one.next;
            } else {
                resPoint.next = two;
                resPoint = resPoint.next;
                two = two.next;
            }
        }
        while (one != null) {
            resPoint.next = one;
            resPoint = resPoint.next;
            one = one.next;
        }
        while (two != null) {
            resPoint.next = two;
            resPoint = resPoint.next;
            two = two.next;
        }

        return res.next;
    }
}

public class LeetCode21 {
}
