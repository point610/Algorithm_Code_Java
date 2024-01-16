package LeetCode.Easy.LeetCode2269;

/**
 * @ClassName LeetCode.Easy.LeetCode2269
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 0:12
 * @Version 1.0
 */
    class Solution {
        public int divisorSubstrings(int num, int k) {
            String str = String.valueOf(num);
            int sum = 0;
            int size = str.length();
            for (int i = 0; i < size - k + 1; i++) {
                int temp = Integer.parseInt(str.substring(i, i + k));
                if (temp==0){
                    continue;
                }
                if (num % temp == 0) {
                    sum++;
                }
            }
            return sum;

        }
    }

public class LeetCode2269 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.divisorSubstrings(240, 2));
    }
}
