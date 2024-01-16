package LeetCode.Easy.LeetCode1869;

/**
 * @ClassName LeetCode1869
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 11:06
 * @Version 1.0
 */
class Solution {
    int getmaxnumber(String s, char c) {

        int size = s.length();
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == c) {
                int temp = 0;
                while (i < size && s.charAt(i) == c) {
                    i++;
                    temp++;
                }
                max = Math.max(max, temp);
            }
        }
        return max;
    }

    public boolean checkZeroOnes(String s) {
        return getmaxnumber(s, '1') > getmaxnumber(s, '0');


    }

}

public class LeetCode1869 {
}
