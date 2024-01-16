package LeetCode.Easy.LeetCode989;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode989
 * @Description TODO
 * @Author point
 * @Date 2023/8/15 23:24
 * @Version 1.0
 */
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();

        List<Integer> kk = new ArrayList<>();
        while (k != 0) {
            kk.add(k % 10);
            k /= 10;
        }
        List<Integer> nn = new ArrayList<>();
        int size = num.length;
        for (int i = size - 1; i >= 0; i--) {
            nn.add(num[i]);
        }

        // 开始加法
        int in = 0;
        int kkSize = kk.size();
        int nnSize = nn.size();
        int kkIndex = 0;
        int nnIndex = 0;
        while (kkIndex < kkSize && nnIndex < nnSize) {
            res.add((kk.get(kkIndex) + in + nn.get(nnIndex)) % 10);
            in = (kk.get(kkIndex) + in + nn.get(nnIndex)) / 10;

            kkIndex++;
            nnIndex++;
        }
        while (kkIndex < kkSize) {
            res.add((kk.get(kkIndex) + in) % 10);
            in = (kk.get(kkIndex) + in) / 10;

            kkIndex++;
        }
        while (nnIndex < nnSize) {
            res.add((in + nn.get(nnIndex)) % 10);
            in = (in + nn.get(nnIndex)) / 10;

            nnIndex++;
        }
        if (in > 0) {
            res.add(1);
        }

        // 旋转
        size = res.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = res.get(i);
            res.set(i, res.get(size - 1 - i));
            res.set(size - 1 - i, temp);
        }

        return res;
    }
}

public class LeetCode989 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.addToArrayForm(new int[]{2, 1, 5}, 806);
    }
}
