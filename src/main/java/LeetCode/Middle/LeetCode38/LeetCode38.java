package LeetCode.Middle.LeetCode38;

/**
 * @ClassName LeetCode38
 * @Description TODO
 * @Author point
 * @Date 2023/10/22 23:33
 * @Version 1.0
 */
class Solution {

    String getres(String n) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = n.length();
        int tsize = 1;
        char current = n.charAt(0);
        for (int i = 1; i < size; i++) {
            if (current == n.charAt(i)) {
                tsize++;
            } else {
                stringBuilder.append(tsize);
                stringBuilder.append(current);

                current = n.charAt(i);
                tsize = 1;
            }
        }
        stringBuilder.append(tsize);
        stringBuilder.append(current);

        return stringBuilder.toString();
    }

    public String countAndSay(int n) {

        String res = "1";
        for (int i = 1; i < n; i++) {
            res = getres(res);
        }
        return res;
    }
}

public class LeetCode38 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(4));
    }
}
