package LeetCode.Easy.LeetCode762;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode762
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 16:37
 * @Version 1.0
 */
class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(11);
        hashSet.add(13);
        hashSet.add(17);
        hashSet.add(19);
        hashSet.add(23);
        int res = 0;
        for (int i = left; i <= right; i++) {
            if (hashSet.contains(oneNumber(Integer.toBinaryString(i)))) {
                res++;
            }
        }
        return res;
    }

    int oneNumber(String s) {
        int size = s.length();
        int res = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '1') {
                res++;
            }
        }
        return res;
    }
}

public class LeetCode762 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean sign = true;
            for (int j = 2; j < Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    sign = false;
                    break;
                }
            }
            if (sign) {
                System.out.println("hashSet.add(" + i + ");");
            }
        }
    }
}
