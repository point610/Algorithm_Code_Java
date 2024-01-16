package CodeTop.HW.HW1090;

import java.util.*;

/**
 * @ClassName HW1090
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 16:44
 * @Version 1.0
 */
class Solution {
    private class Node {
        int value;

        int lable;

        public Node(int value, int lable) {
            this.value = value;
            this.lable = lable;
        }
    }

    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {

        Map<Integer, Integer> shuliang = new HashMap<>();

        List<Node> nodes = new ArrayList<>();
        int size = values.length;
        for (int i = 0; i < size; i++) {
            nodes.add(new Node(values[i], labels[i]));
        }

        Collections.sort(nodes, (o1, o2) -> {
            return o2.value - o1.value;
        });
        int sum = 0;
        for (Node node : nodes) {
            if (numWanted == 0) {
                break;
            }
            if (!shuliang.containsKey(node.lable)) {
                shuliang.put(node.lable, 1);
                sum += node.value;
                numWanted--;
                continue;
            }
            if (shuliang.get(node.lable) == useLimit) {
                continue;
            }
            sum += node.value;
            shuliang.put(node.lable, shuliang.get(node.lable) + 1);
            numWanted--;
        }
        return sum;
    }
}

public class HW1090 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestValsFromLabels(new int[]{2, 6, 1, 2, 6}, new int[]{2, 2, 2, 1, 1}, 1, 1));
        System.out.println(solution.largestValsFromLabels(new int[]{5, 4, 3, 2, 1}, new int[]{1, 3, 3, 3, 2}, 3, 2));
        System.out.println(solution.largestValsFromLabels(new int[]{5, 4, 3, 2, 1}, new int[]{1, 1, 2, 2, 3}, 3, 1));
        System.out.println(solution.largestValsFromLabels(new int[]{9, 8, 8, 7, 6}, new int[]{0, 0, 0, 1, 1}, 3, 1));
    }
}
