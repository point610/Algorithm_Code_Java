package CodeTop.HW.HW131;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    private List<List<String>> list;
    private boolean[][] huiwen;
    private int size;
    private String s;

    private void DFS(int col, List<String> temp) {
        if (col == size) {
            list.add(new LinkedList<>(temp));
            return;
        }

        boolean[] bbb = huiwen[col];
        for (int i = col; i < size; i++) {
            if (bbb[i]) {
                temp.add(s.substring(col, i + 1));
                DFS(i + 1, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        this.s = s;
        list = new LinkedList<>();
        size = s.length();
        huiwen = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(huiwen[i], true);
        }
        for (int i = size - 1; i >= 0; i--) {
            for (int j = i + 1; j < size; j++) {
                huiwen[i][j] = (s.charAt(i) == s.charAt(j)) && huiwen[i + 1][j - 1];
            }
        }

        DFS(0,new LinkedList<>());
        return list;
    }
}

public class HW131 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.partition("aab"));
        System.out.println(solution.partition("a"));
    }
}
