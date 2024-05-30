package LeetCode.Middle.LeetCode904;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        int left = 0;
        int right = 0;


        while (right < fruits.length) {

            // 移动右指针
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            right++;

            // 判断窗口内水果种类
            while (map.size() > 2) {
                // 移动左指针
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            max = Math.max(max, right - left);
        }

        return max;
    }
}

public class LeetCode904 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.totalFruit(new int[]{0, 1, 2, 2}));
        System.out.println(solution.totalFruit(new int[]{1, 2, 1}));
        System.out.println(solution.totalFruit(new int[]{1, 2, 3, 2, 2}));
        System.out.println(solution.totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
    }
}
