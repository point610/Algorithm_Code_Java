package CodeTop.HW.HW436;

import java.util.*;

class Solution {
    private class Node {
        int ll;
        int rr;
        int value = -1;
        int index;

        public Node(int ll, int rr) {
            this.ll = ll;
            this.rr = rr;
        }
    }

    public int[] findRightInterval(int[][] intervals) {
        Map<Integer, Node> map = new HashMap<>();
        List<Node> list = new ArrayList<>();
        int index = 0;
        for (int[] iii : intervals) {
            Node temp = new Node(iii[0], iii[1]);
            temp.index = index;
            list.add(temp);
            map.put(index++, temp);
        }
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.rr == o2.ll) {
                    return o1.ll - o2.ll;
                }
                return o1.rr - o2.ll;
            }
        });

        int size = list.size();
        for (int i = 0; i < size; i++) {
            Node one = list.get(i);

            int tempindex = i;
            while (tempindex < size) {
                Node two = list.get(tempindex);
                if (one.rr <= two.ll) {
                    one.value = two.index;
                    break;
                }
                tempindex++;
            }
        }

        int[] ll = new int[size];

        for (int i = 0; i < size; i++) {
            ll[i] = map.get(i).value;
        }

        return ll;
    }
}

public class HW436 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findRightInterval(new int[][]{{3, 4}, {2, 3}, {1, 2}})));
        System.out.println(Arrays.toString(solution.findRightInterval(new int[][]{{1, 4}, {2, 3}, {3, 4}})));
        System.out.println(Arrays.toString(solution.findRightInterval(new int[][]{{1, 2}})));
        System.out.println(Arrays.toString(solution.findRightInterval(new int[][]{{1, 1}, {3, 4}})));
        System.out.println(Arrays.toString(solution.findRightInterval(new int[][]{{1, 12}, {2, 9}, {3, 10}, {13, 14}, {15, 16}, {16, 17}})));
    }
}
