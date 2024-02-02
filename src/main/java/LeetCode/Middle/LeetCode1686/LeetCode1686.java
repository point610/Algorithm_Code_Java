package LeetCode.Middle.LeetCode1686;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    private class Node {
        int a;
        int b;
        int sum;

        public Node(int a, int b) {
            this.a = a;
            this.b = b;
            this.sum = a + b;
        }
    }

    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        List<Node> list = new ArrayList<>();

        int size = aliceValues.length;
        for (int i = 0; i < size; i++) {
            list.add(new Node(aliceValues[i], bobValues[i]));
        }
        Collections.sort(list, (o1, o2) -> o2.sum - o1.sum);
        int asum = 0;        int bsum = 0;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                asum += list.get(i).a;
            } else {
                bsum += list.get(i).b;
            }
        }
        return Integer.compare(asum, bsum);
    }
}

public class LeetCode1686 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.stoneGameVI(new int[]{1, 3}, new int[]{2, 1}));
        System.out.println(solution.stoneGameVI(new int[]{1, 2}, new int[]{3, 1}));
        System.out.println(solution.stoneGameVI(new int[]{2, 4, 3}, new int[]{1, 6, 7}));
    }
}
