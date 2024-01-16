package CodeTop.HW.HW881;

import java.util.Arrays;

/**
 * @ClassName HW881
 * @Description TODO
 * @Author point
 * @Date 2023/12/31 15:12
 * @Version 1.0
 */
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int all = 0;

        while (left <= right) {
            int temp = people[left] + people[right];
            if (temp <= limit) {
                left++;
            }
            right--;
            all++;
        }

        return all;

    }
}

public class HW881 {
}
