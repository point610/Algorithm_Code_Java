package CodeTop.HW.HW650;

class Solution {
    int min;

    private void DFS(int count, int n, int times, int copy) {
        if (count == n) {
            min = Math.min(min, times);
            return;
        }
        if (times >= n || count > n) {
            return;
        }

        // 使用DFS需要对分支进行裁剪
        //Copy All
        if (copy != count) {
            DFS(count, n, times + 1, count);
        }
        //Paste
        if (copy != 0) {
            DFS(count + copy, n, times + 1, copy);
        }

    }

    public int minSteps(int n) {
        if (n == 1) {
            return 0;
        }
        min = Integer.MAX_VALUE;
        DFS(1, n, 0, 0);

        return min;
    }
}

public class HW650 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minSteps(3));
        System.out.println(solution.minSteps(1));
        System.out.println(solution.minSteps(28));
        System.out.println(solution.minSteps(29));
        System.out.println(solution.minSteps(111));
    }
}
