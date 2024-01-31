package CodeTop.HW.HW725;

import java.util.List;

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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode point = head.next;
        int size = 0;
        while (point != null) {
            size++;
            point = point.next;
        }
        point = head;
        ListNode[] lll = new ListNode[k];
        if (size <= k) {
            for (int i = 0; i < size; i++) {
                lll[i] = point;
                point = point.next;
                if (lll[i] != null) {
                    lll[i].next = null;
                }
            }
            return lll;
        }
        int step = size / k;
        int onetimes = size % k;
        for (int i = 0; i < k; i++) {
            lll[i] = point;
            int temp = step;
            if (onetimes > 0) {
                temp++;
                onetimes--;
            }
            for (int j = 0; j < temp - 1; j++) {
                point = point.next;
            }
            ListNode ttt = point;
            point = point.next;
            ttt.next = null;
        }

        return lll;
    }
}

public class HW725 {
    public static void main(String[] args) {

    }
}
