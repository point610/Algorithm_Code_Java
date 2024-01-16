package LeetCode.Easy.LeetCode1374;

/**
 * @ClassName LeetCode1374
 * @Description TODO
 * @Author point
 * @Date 2023/9/18 21:51
 * @Version 1.0
 */
class Solution {
    static String getTwo(int n) {
        if (n == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            res.append('b');
        }
        return String.valueOf(res.append('c'));
    }

    public String generateTheString(int n) {

        if (n % 2 == 0) {
            return getTwo(n);
        }
        return 'a' + getTwo(n - 1);

    }
}

public class LeetCode1374 {
}
