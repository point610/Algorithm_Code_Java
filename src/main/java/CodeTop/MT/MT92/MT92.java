package CodeTop.MT.MT92;

import java.util.ArrayList;
import java.util.Collections;
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right || head == null || head.next == null) {
            return head;
        }

        int size = 0;
        ListNode point = head;
        while (point != null) {
            size++;
            point = point.next;
        }
        point = head;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            if (left <= i && i <= right) {
                list.add(point.val);
            }
            point = point.next;
        }
        point = head;
        Collections.reverse(list);
        for (int i = 1; i <= size; i++) {
            if (left <= i && i <= right) {
                point.val = list.get(i - left);
            }
            point = point.next;
        }
        return head;
    }
}
public class MT92 {
}
