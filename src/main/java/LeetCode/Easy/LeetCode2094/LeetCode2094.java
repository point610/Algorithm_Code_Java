package LeetCode.Easy.LeetCode2094;

import java.util.*;

/**
 * @ClassName LeetCode2094
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 18:45
 * @Version 1.0
 */
class Solution {
    Set<Integer> getnumber(int a, int b, int c) {
        Set<Integer> res = new HashSet<>();
        if (a % 2 == 0) {
            int one = b * 100 + c * 10 + a;
            int two = c * 100 + b * 10 + a;
            if (one >= 100) {
                res.add(one);
            }
            if (two >= 100) {
                res.add(two);
            }
        }
        if (b % 2 == 0) {
            int one = a * 100 + c * 10 + b;
            int two = c * 100 + a * 10 + b;
            if (one >= 100) {
                res.add(one);
            }
            if (two >= 100) {
                res.add(two);
            }
        }
        if (c % 2 == 0) {
            int one = b * 100 + a * 10 + c;
            int two = a * 100 + b * 10 + c;
            if (one >= 100) {
                res.add(one);
            }
            if (two >= 100) {
                res.add(two);
            }
        }
        return res;
    }

    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int size = digits.length;
        for (int i = 0; i < size - 2; i++) {

            for (int j = i + 1; j < size - 1; j++) {

                for (int k = j + 1; k < size; k++) {


                    // coding
                    set.addAll(getnumber(digits[i], digits[j], digits[k]));

                }

            }

        }
        int[] res = new int[set.size()];
        int index = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            res[index++] = iterator.next();
        }
        Arrays.sort(res);
        return res;
    }
}

public class LeetCode2094 {
}
