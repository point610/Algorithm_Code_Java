package LeetCode.Easy.MS.MS0106;

/**
 * @ClassName MS0106
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 19:52
 * @Version 1.0
 */
class Solution {
    public String compressString(String S) {
        String res = getStr(S);
        if (res.length() >= S.length()) {
            return S;
        } else {
            return res;
        }
    }

    private String getStr(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char current = s.charAt(i);
            int times = 0;
            while (i < size && s.charAt(i) == current) {
                times++;
                i++;
            }
            stringBuilder.append(current);
            stringBuilder.append(String.valueOf(times));
            i--;
        }
        return stringBuilder.toString();

    }
}

public class MS0106 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.compressString("abbccd"));
    }
}
