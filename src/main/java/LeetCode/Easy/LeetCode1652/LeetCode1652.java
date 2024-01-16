package LeetCode.Easy.LeetCode1652;

/**
 * @ClassName LeetCode1652
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 13:24
 * @Version 1.0
 */
class Solution {
    public int[] decrypt(int[] code, int k) {
        if (k == 0) {
            int size = code.length;
            for (int i = 0; i < size; i++) {
                code[i] = 0;
            }
            return code;
        } else if (k > 0) {
            int sum = 0;
            int size = code.length;
            int[] res = new int[size];

            for (int i = 1; i <= k; i++) {
                int index = i % size;
                sum += code[index];
            }
            int left = 1;
            int right = (k + 1) % size;
            for (int i = 0; i < size; i++) {
                res[i] = sum;
                // change sum
                sum -= code[left];
                sum += code[right];
                left = (left + 1) % size;
                right = (right + 1) % size;
            }
            return res;

        } else {
            k = -k;
            int sum = 0;
            int size = code.length;
            int[] res = new int[size];

            int index = (size - 1) % size;
            for (int i = 1; i <= k; i++) {
                sum += code[index];
                index = (index - 1 + size) % size;
            }

            int left = (size - k + size) % size;
            int right =0;
            for (int i = 0; i < size; i++) {
                res[i] = sum;
                // change sum
                sum -= code[left];
                sum += code[right];
                left = (left + 1) % size;
                right = (right + 1) % size;
            }
            return res;
        }
    }
}

public class LeetCode1652 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.decrypt(new int[]{2, 4, 9, 3}, -2);
    }
}
