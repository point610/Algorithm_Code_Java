package LeetCode.Easy.LeetCode2138;

/**
 * @ClassName LeetCode2138
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 11:51
 * @Version 1.0
 */
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size = s.length();
        if (size % k != 0) {
            int times = k - size % k;
            String temp = "";
            for (int i = 0; i < times; i++) {
                temp += fill;
            }
            s = s + temp;
        }
        size = s.length();
        int index = 0;
        String[] res = new String[size / k];
        for (int i = 0; i < size; i += k) {
            res[index++] = s.substring(i, i + k);
        }
        return res;
    }
}

public class LeetCode2138 {
}
