package LeetCode.Middle.LeetCode382;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    private List<Integer> list;
    private int size;
    private Random random;

    public Solution(ListNode head) {
        list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        random = new Random();
        size = list.size();
    }

    public int getRandom() {
        return list.get(random.nextInt(size));
    }
}

public class LeetCode382 {
}
