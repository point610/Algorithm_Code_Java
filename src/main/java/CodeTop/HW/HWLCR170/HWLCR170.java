package CodeTop.HW.HWLCR170;

class Solution {
    int[] recode;
    int[] temp;

    public int reversePairs(int[] record) {
        this.recode = record;
        this.temp = new int[record.length];

        return merge(0, record.length - 1);

    }

    private int merge(int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = (left + right) / 2;
        int res = merge(left, mid) + merge(mid + 1, right);

        // 处理temp
        for (int i = left; i <= right; i++) {
            temp[i] = recode[i];
        }

        // 赋值新的
        int one = left;
        int two = mid + 1;
        for (int i = left; i <= right; i++) {
            if (one == mid + 1) {
                recode[i] = temp[two++];
                continue;
            }

            if (two == right + 1 || temp[one] <= temp[two]) {
                recode[i] = temp[one++];
            } else {
                recode[i] = temp[two++];
                res += (mid - one + 1);
            }
        }

        return res;
    }
}

public class HWLCR170 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reversePairs(new int[]{9, 7, 5, 4, 6}));
    }
}
