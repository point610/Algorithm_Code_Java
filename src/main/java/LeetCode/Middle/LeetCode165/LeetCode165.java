package LeetCode.Middle.LeetCode165;

/**
 * @ClassName LeetCode165
 * @Description TODO
 * @Author point
 * @Date 2023/11/12 22:37
 * @Version 1.0
 */
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] one = version1.split("\\.");
        String[] two = version2.split("\\.");
        if (one.length == two.length) {
            int size = one.length;
            for (int i = 0; i < size; i++) {
                int t1 = Integer.parseInt(one[i]);
                int t2 = Integer.parseInt(two[i]);
                if (t1 == t2) {
                    continue;
                } else {
                    return Integer.compare(t1, t2);
                }
            }
            return 0;
        } else if (one.length > two.length) {
            int size = two.length;
            int i;
            for (i = 0; i < size; i++) {
                int t1 = Integer.parseInt(one[i]);
                int t2 = Integer.parseInt(two[i]);
                if (t1 == t2) {
                    continue;
                } else {
                    return Integer.compare(t1, t2);
                }
            }
            for (; i < one.length; i++) {
                if (Integer.parseInt(one[i]) != 0) {
                    return 1;
                }
            }
            return 0;

        } else {
            int size = one.length;
            int i;
            for (i = 0; i < size; i++) {
                int t1 = Integer.parseInt(one[i]);
                int t2 = Integer.parseInt(two[i]);
                if (t1 == t2) {
                    continue;
                } else {
                    return Integer.compare(t1, t2);
                }
            }
            for (; i < two.length; i++) {
                if (Integer.parseInt(two[i]) != 0) {
                    return -1;
                }
            }
            return 0;

        }
    }
}

public class LeetCode165 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.compareVersion("0.1", "1.1"));
    }
}
