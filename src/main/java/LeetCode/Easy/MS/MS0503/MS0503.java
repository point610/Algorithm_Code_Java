package LeetCode.Easy.MS.MS0503;

/**
 * @ClassName MS0503
 * @Description TODO
 * @Author point
 * @Date 2023/10/11 23:36
 * @Version 1.0
 */
class Solution {
    int getonenumber(String s, int index) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.replace(index, index + 1, "1");
        int size = stringBuilder.length();
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (stringBuilder.charAt(i) == '1') {
                int times = 0;
                while (i < size && stringBuilder.charAt(i) == '1') {
                    i++;
                    times++;
                }
                max = Math.max(max, times);
            }
        }
        return max;
    }

    public int reverseBits(int num) {
        if (num==-1){
            return 32;
        }
        String s = Integer.toBinaryString(num);
        if (!s.contains("0")) {
            return s.length()+1;
        }
        int max = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '0') {
                max = Math.max(max, getonenumber(s, i));
            }
        }
        return max;
    }
}

public class MS0503 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseBits(2147483647);
    }
}
