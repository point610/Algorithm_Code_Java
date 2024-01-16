package LeetCode.Easy.LeetCode1566;

/**
 * @ClassName LeetCode1566
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 0:13
 * @Version 1.0
 */
class Solution {
    boolean has(int[] arr, int m, int k, int[] model, int startindex) {
        int currentindex = startindex;
        for (int i = 0; i < k; i++) {
            if (currentindex >= arr.length) {
                return false;
            }

            if (is(arr, model, currentindex)) {
                currentindex += m;
            } else {
                return false;
            }
        }
        return true;
    }

    boolean is(int[] arr, int[] model, int startindex) {
        if ((startindex + model.length) > arr.length) {
            return false;
        }

        for (int i = startindex, j = 0; i < startindex + model.length; j++, i++) {
            if (arr[i] != model[j]) {
                return false;
            }
        }
        return true;
    }

    public boolean containsPattern(int[] arr, int m, int k) {
        int size = arr.length;
        for (int i = 0; i < size - m * k+1; i++) {
            int[] model = new int[m];
            for (int j = 0; j < m; j++) {
                model[j] = arr[i + j];
            }

            if (has(arr, m, k, model, i)) {
                return true;
            }

        }

        return false;
    }
}

public class LeetCode1566 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.containsPattern(new int[]{2, 2}, 1, 2);
    }
}
