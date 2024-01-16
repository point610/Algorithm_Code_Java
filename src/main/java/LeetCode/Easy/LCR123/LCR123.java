package LeetCode.Easy.LCR123;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LCR123
 * @Description TODO
 * @Author point
 * @Date 2023/10/8 23:36
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
    public int[] reverseBookList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = list.get(size - 1 - i);
        }
        return arr;
    }
}

public class LCR123 {
}
