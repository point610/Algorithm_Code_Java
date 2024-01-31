package CodeTop.HW.HW503;

import java.util.*;

class Solution {
    private class Node {
        int value;
        int index;
        int bignext = -1;

    }

    public int[] nextGreaterElements(int[] nums) {
        Stack<Node> stack = new Stack<>();
        int size = nums.length;
        int[] aaa = new int[size + size];
        for (int i = 0; i < (size + size); i++) {
            aaa[i] = nums[i % size];
        }
        nums = aaa;

        List<Node> list = new ArrayList<>();
        for (int i = 0; i < (size + size); i++) {
            Node temp = new Node();
            temp.value = nums[i];
            temp.index = i;
            if (stack.isEmpty()) {
                stack.add(temp);
            } else {
                while (true) {
                    if (stack.isEmpty()) {
                        stack.add(temp);
                        break;
                    }
                    Node peek = stack.peek();
                    if (peek.value < temp.value) {
                        peek.bignext = temp.value;
                        stack.pop();
                        list.add(peek);
                    } else {
                        stack.add(temp);
                        break;
                    }
                }
            }
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        Collections.sort(list, Comparator.comparingInt(o -> o.index));

        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = list.get(i).bignext;
        }
        return res;
    }
}

public class HW503 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.nextGreaterElements(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(solution.nextGreaterElements(new int[]{1, 2, 3, 4, 3})));
    }
}
