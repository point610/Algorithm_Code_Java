package LeetCode.Easy.LeetCode412;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode412
 * @Description TODO
 * @Author point
 * @Date 2023/7/16 22:54
 * @Version 1.0
 */
class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean three = i % 3 == 0;
            boolean five = i % 5 == 0;
            if (three && five) {
                res.add("FizzBuzz");
            } else if (three) {
                res.add("Fizz");
            } else if (five) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }

        }
        return res;
    }
}

public class LeetCode412 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> strings = solution.fizzBuzz(15);
        strings.forEach(s -> {
            System.out.println(s);
        });
    }
}
