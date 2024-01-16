package LeetCode.Easy.LeetCode2678;

/**
 * @ClassName LeetCode2678
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 13:00
 * @Version 1.0
 */
class Solution {
    public int countSeniors(String[] details) {
        int sum = 0;
        int size = details.length;
        for (int i = 0; i < size; i++) {
            if (Integer.parseInt(details[i].substring(11,13)) > 60) {
                sum++;
            }

        }
        return sum;
    }
}

public class LeetCode2678 {
}
