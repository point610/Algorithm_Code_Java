package temp.xp.xp3;

import java.util.*;


public class Solution {

    public String reverses(String original_str) {
        String[] split = original_str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            stringBuilder.append(get(split[i]));
            if (i != split.length - 1) {
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }

    public String get(String one) {
        char[] cc = one.toCharArray();
        int left = 0;
        int right = cc.length - 1;

        while (left < right) {
            while (left < right && !Character.isLowerCase(cc[left])) {
                left++;
            }
            while (left < right && !Character.isLowerCase(cc[right])) {
                right--;
            }
            if (left == right) {
                break;
            }
            swap(cc, left, right);
            left++;
            right--;
        }
        return new String(cc);
    }

    public void swap(char[] cc, int one, int two) {
        char temp = cc[one];
        cc[one] = cc[two];
        cc[two] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverses("Shopee is Our family 123"));
        System.out.println(solution.reverses("1e3r"));
    }
}













