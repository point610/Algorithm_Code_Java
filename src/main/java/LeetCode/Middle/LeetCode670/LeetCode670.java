package LeetCode.Middle.LeetCode670;

import java.util.Arrays;

class Solution {
    public int maximumSwap(int num) {

        String ss = String.valueOf(num);
        char[] charArray = ss.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0, j = charArray.length - 1; i < charArray.length / 2; i++, j--) {
            swap(charArray, i, j);
        }

        int index = -1;
        for (int i = 0; i < ss.length(); i++) {
            if (charArray[i] != ss.charAt(i)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return num;
        }

        // 找到最左的最大值
        int one = index;
        int two = index;
        int max = ss.charAt(index) - '0';
        for (int i = index + 1; i < ss.length(); i++) {
            int current = ss.charAt(i) - '0';
            if (current >= max) {
                max = current;
                two = i;
            }
        }
        char[] res = ss.toCharArray();
        swap(res, one, two);

        return Integer.parseInt(new String(res));
    }

    private void swap(char[] cc, int one, int two) {
        char temp = cc[one];
        cc[one] = cc[two];
        cc[two] = temp;
    }
}

public class LeetCode670 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumSwap(10909091));
        System.out.println(solution.maximumSwap(2736));
        System.out.println(solution.maximumSwap(9973));
    }
}








