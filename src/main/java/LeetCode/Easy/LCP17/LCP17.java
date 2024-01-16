package LeetCode.Easy.LCP17;

/**
 * @ClassName LCP17
 * @Description TODO
 * @Author point
 * @Date 2023/9/21 22:36
 * @Version 1.0
 */
class Solution {
    public int calculate(String s) {
        int x = 1;
        int y = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            switch (s.charAt(i)) {
                case 'A': {
                    x = 2 * x + y;
                    break;
                }
                case 'B': {
                    y = 2 * y + x;
                    break;
                }
            }
        }
        return x + y;
    }
}

public class LCP17 {
}
