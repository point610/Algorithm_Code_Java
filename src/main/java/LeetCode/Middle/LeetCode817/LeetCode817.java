package LeetCode.Middle.LeetCode817;

import java.util.*;

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
    public int numComponents(ListNode head, int[] nums) {
        Map<Integer, Integer> value2index = new HashMap<>();
        ListNode point = head;
        ListNode ending = head;
        int index = 0;
        while (point != null) {
            value2index.put(point.val, index);

            ending = point;
            point = point.next;

            index++;
        }

        ending.next = new ListNode(1000000);
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return value2index.get(o1) - value2index.get(o2);
            }
        });

        int res = 0;
        point = head;
        index = 0;
        while (point != null) {
            if (index < list.size() && list.get(index) != point.val) {
                res++;
            } else {
                index++;
            }
            point = point.next;
            if (point == null) {
                break;
            }
        }
        return res;

    }
}

public class LeetCode817 {
}















