package LeetCode.Middle.LeetCode593;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    private List<List<Integer>> list;

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

        list = new ArrayList<>();
        addlist(p1, p2, p3, p4);
        addlist(p2, p1, p3, p4);
        addlist(p3, p1, p4, p2);
        addlist(p4, p1, p2, p3);

        if (!list.get(0).get(0).equals(list.get(0).get(1)) || list.get(0).get(0) == 0) {
            return false;
        }

        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < 3; j++) {
                if (!list.get(i).get(j).equals(list.get(0).get(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    private void addlist(int[] p1, int[] p2, int[] p3, int[] p4) {
        List<Integer> temp = new ArrayList<>();
        temp.add(getdist(p1, p2));
        temp.add(getdist(p1, p3));
        temp.add(getdist(p1, p4));

        Collections.sort(temp);
        list.add(new ArrayList<>(temp));
    }

    private int getdist(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }
}

public class LeetCode593 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validSquare(new int[]{0, 0}, new int[]{5, 0}, new int[]{5, 4}, new int[]{0, 4}));
    }
}
