package LeetCode.Middle.LeetCode179;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName LeetCode179
 * @Description TODO
 * @Author point
 * @Date 2023/11/12 23:40
 * @Version 1.0
 */
class Solution {

    public String largestNumber(int[] nums) {
        int size = nums.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(String.valueOf(nums[i]));
        }
        Collections.sort(list, (o1, o2) -> {
            String one = o1 + o2;
            String two = o2 + o1;
            return two.compareTo(one);
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(list.get(i));
        }
        size = stringBuilder.length();
        for (int i = 0; i < size; i++) {
            if (stringBuilder.charAt(i)!='0'){
                return stringBuilder.toString();
            }
        }
return "0";
    }
}

public class LeetCode179 {
    public static void main(String[] args) {
        Solution solution = new
                Solution();
        solution.largestNumber(new int[]{3, 30, 34, 5, 9});
    }
}
