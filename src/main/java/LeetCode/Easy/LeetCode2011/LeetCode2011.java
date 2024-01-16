package LeetCode.Easy.LeetCode2011;

/**
 * @ClassName LeetCode2011
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 1:13
 * @Version 1.0
 */
class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int sum = 0;
        int size = operations.length;
        for (int i = 0; i < size; i++) {
            switch (operations[i]) {
                case "++X":
                case "X++": {
                    sum++;
                    break;
                }
                case "--X":
                case "X--": {
                    sum--;
                    break;
                }
            }
        }
        return sum;

    }
}

public class LeetCode2011 {
}
