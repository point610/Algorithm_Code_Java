package CodeTop.HW.HW239;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    private class Node {
        int value;
        int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Node> lll = new LinkedList<>();
        int size = nums.length;
        int[] aaa = new int[size - k + 1];
        for (int i = 0; i < size; i++) {
            if (lll.isEmpty()) {
                lll.add(new Node(nums[i], i));
            } else {
                Node current = new Node(nums[i], i);
                Node last = lll.getLast();

                if (lll.getFirst().index + k <= i) {
                    lll.removeFirst();
                }

                while (!lll.isEmpty() && last.value <= current.value) {
                    lll.removeLast();
                    if (lll.isEmpty()) {
                        break;
                    } else {
                        last = lll.getLast();
                    }
                }
                lll.add(current);
            }

            if (i - k + 1 >= 0) {
                aaa[i - k + 1] = lll.getFirst().value;
            }
        }
        return aaa;
    }
}

public class HW239 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.maxSlidingWindow(new int[]{1, -1}, 1)));
        System.out.println(Arrays.toString(solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
        System.out.println(Arrays.toString(solution.maxSlidingWindow(new int[]{1}, 1)));
    }
}
