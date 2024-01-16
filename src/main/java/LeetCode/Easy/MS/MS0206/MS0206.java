package LeetCode.Easy.MS.MS0206;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MS0206
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 22:48
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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            if (!list.get(i).equals(list.get(size - i - 1))) {
                return false;
            }
        }return true;
    }
}

public class MS0206 {
}
